import java.util.ArrayList;
/**
 * Classe Pays
 * @author ldatchi
 */
public class Pays {

	//Attributs
	/**
	 * Attributs de la classe Pays
	 */
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private ArrayList <Ville> lesVilles;
	private static int compteurPays = 0;
	
	//Constructeurs
	/**
	 * Constructeur par défaut
	 */
	public Pays() {
		this.lesVilles = new ArrayList <Ville>();
	}
	/**
	 * Constructeur avec nom, langue, monnaie, capitale
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 * @param uneCapitale
	 */
	public Pays(String unNom, String uneLangue, String uneMonnaie, Capitale uneCapitale) {
		this.lesVilles = new ArrayList <Ville>();
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.saCapitale = uneCapitale;
		compteurPays = compteurPays +1;
	}
	/**
	 * Constructeur sans la capitale
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 */
	public Pays(String unNom, String uneLangue, String uneMonnaie) {
		this.lesVilles = new ArrayList <Ville>();
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		compteurPays = compteurPays +1;
	}
	
	//Accesseurs
	/**
	 * Accesseurs de la classe Pays
	 * Accesseur nom get et set
	 */
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public static int getCompteurPays() {
		return compteurPays;
	}
	
	/**
	 * Accesseur capitale get et set
	 * @return
	 */
	public Capitale getCapitale() {
		return this.saCapitale;
	}
	public void setCapitale(Capitale uneCapitale) {
		this.saCapitale = uneCapitale;
	}
	
	/**
	 * Accesseur capitale get et set
	 * @return
	 */
	public Capitale getLangue() {
		return this.saCapitale;
	}
	public void setLangue(String uneLangue) {
		this.langue = uneLangue;
	}
	
	public ArrayList<Ville> getListeVilles(){
		return this.lesVilles;
	}
	
	/**
	 * Methode pour ajouter une ville
	 * @param uneVille
	 */
	public void ajouterUneVille(Ville uneVille) {
		this.lesVilles.add(uneVille);
	}
	
	//Rechercher une Ville
	/**
	 * Méthode pour rechercher un ville avec unNom en tant que paramètre
	 * @param unNom
	 * @return
	 */
	public String rechercherUneVille(String unNom) {
		int index = 0;
		String result = "\nCette ville n'est pas présente.";
		while( index < lesVilles.size() && !unNom.equals(this.lesVilles.get(index).getNom())) {
			index = index + 1;
		}
		if (index < this.lesVilles.size()) {
			result = "\nVoici la ville recherché :" + unNom  + this.lesVilles.get(index).toString();
		}
		return result;
	}
	
	public int rechercheInt(String unNom) {
		int index = 0;
		int result = -1;
		while(index < this.lesVilles.size() && !this.lesVilles.get(index).getNom().equals(unNom)) {
			index = index + 1;
		}
		if (index < this.lesVilles.size()) {
			result = index;
		}
		return result;
	}
	
	/**
	 * Methode pour supprimer une ville
	 * @param indice
	 */
	public void supprimerUneVille(int indice) {
     	 this.lesVilles.remove(indice);
   }
	
	public void supprimer(Ville uneVille) {
		this.lesVilles.remove(uneVille);
	}
	
	public boolean supprimer(String unNom) {
		boolean rep = false;
		int index = this.rechercheInt(unNom);
		if (index != -1) {
			this.lesVilles.remove(index);
			rep = true;
		}
		return rep;
	}
	
	//toString pour afficher les informations
	/**
	 * toString pour afficher le pays, la langue, la monnaie, la capitale et enfin le nombre de villes
	 */
	public String toString() {
		String result = "\n\n{---PAYS---}";
		if(this.nom != null) {
			result += "\n|Nom : " + this.nom;
		}
		if(this.langue != null) {
			result += "\n|Langue : " + this.langue;
		}
		if(this.monnaie != null) {
			result += "\n|Monnaie : " + this.monnaie;
		}
		if (this.saCapitale != null) {
			result += "\n\n~CAPITALE~" + this.saCapitale.getNom() + "\n";
		}
		if (this.lesVilles != null) {
			for(Ville uneVille : this.lesVilles)
				result += "\n~VILLE~" + uneVille.toString();
		}
		return result;
	}
}