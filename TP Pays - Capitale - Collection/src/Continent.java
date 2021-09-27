import java.util.ArrayList;
/**
 * Classe Continent
 * @author ldatchi
 */
public class Continent {
	
	//Attributs
	/**
	 * Attributs de la classe Continent
	 */
    private String nom;
    ArrayList <Pays> lesPays;
    private int nbPays;

    //Constructeurs
  	/**
	* Constructeur par defaut
	*/
	public Continent() {
	      
	}
	/**
	 * Constructeur avec unNom et la collection
	 * @param unNom
	 */
    public Continent(String unNom) {
        this.nom = unNom;
        this.lesPays = new ArrayList <Pays>();
        this.nbPays = 0;
    }

    //Accesseurs
  	/**
  	 * Accesseurs de la classe Continent
  	 * Accesseur nom get et set
  	 */
  	public String getNom() {
  		return this.nom;
  	}
  	public void setNom(String unNom) {
  		this.nom = unNom;
  	}

    //Ajouter un continent
  	/**
  	 * Methode pour ajouter un pays avec unPays en parametre
  	 * @param unPays
  	 */
    public void ajouterPays(Pays unPays) {
        this.lesPays.add(unPays);
        this.nbPays = this.nbPays + 1;
    }

    //Supprimer un continent
    /**
     * methode pour supprimer un pays avec unPays en parametre
     * @param unPays
     */
    public void supprimerPays(Pays unPays) {
        this.lesPays.remove(unPays);
        this.nbPays = this.nbPays- 1;
    }
    
    public int rechercherPays(String nomPays) {
        boolean retour = false;
        int i = 0;
        while( i < lesPays.size() && !nomPays.equals(this.lesPays.get(i).getNom())) {
            i = i + 1;
        }
           if(i < lesPays.size()){
                retour = true;
            }
            else {
                retour = false;
            }
        return i;
    }
    
    //Afficher une continent dans le toString()
  	/**
  	 * Petite methode pour permettre d'afficher les villes dans le toString()
  	 * @return
  	 */
    public String afficherPays() {
        String chaine="";
        if(this.lesPays.size()!=0) {
            for(int i = 0; i < this.lesPays.size(); i++) {
                chaine = chaine + this.lesPays.get(i);
            }
        }
        else {
            chaine = "Vide";
        }
        return chaine;
    }
    
    //toString pour afficher les informations
  	/**
  	 * toString pour afficher le nom du continent, le nombre de pays
  	 */
    public String toString() {
        String resultat = "";
        if(this.nom!= null) {
            resultat += "------------------\nNom du continent : " + this.nom + "\n------------------";
        }				 
        if(this.nbPays != 0) {
            resultat += "\n\n~~~~~~~~~~~~~~~~\nNombre de pays : " + this.nbPays + "\n~~~~~~~~~~~~~~~~" + afficherPays();
        }					  

        return resultat;
    }
}