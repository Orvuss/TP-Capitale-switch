/**
 * Classe Capitale
 * @author ldatchi
 */
public class Capitale {
	
	//Attributs
	/**
	 * Attributs de la classe Capitale
	 */
	private String nom;
	private int nbHabitants;
	private float superficie;
	
	//Constructeurs
	/**
	 * Constructeur par défaut
	 */
	public Capitale() {
		
	}
	/**
	 * Constructeur avec unNom, unNbHabitants, uneSuperficie
	 * @param unNom
	 * @param unNbHabitants
	 * @param uneSuperficie
	 */
	public Capitale(String unNom, int unNbHabitants, float uneSuperficie) {
		this.nom = unNom;
		this.nbHabitants = unNbHabitants;
		this.superficie = uneSuperficie;
	}
	
	//Accesseurs
  	/**
  	 * Accesseurs de la classe Capitale
  	 * Accesseur nom get et set
  	 */
	public String getNom() {
		return this.nom;
	}
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
     * Accesseur nbHabitants get et set
     * @return
     */
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	public void setNbHabitants(int unNbHabitants) {
		this.nbHabitants = unNbHabitants;
	}
	
	/**
     * Accesseur superficie get et set
     * @return
     */
	public float getSuperficie() {
		return this.superficie;
	}
	public void setSuperficie(float uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	//toString pour afficher les informations
  	/**
  	 * toString pour afficher le nom, les habitants, la superficie
  	 */
	public String toString() {
        String resultat ="";
        if(this.nom != null) {
            resultat += "\nNom : " + this.nom;
        }
        if(this.nbHabitants != 0) {
            resultat += "\nHabitants : " + this.nbHabitants + " habitants";
        }
        if(this.superficie != 0) {
            resultat += "\nSuperficie : " + this.superficie + "km²";
        }
        return resultat;
    }
}