import java.util.Scanner;

/**
 * Classe Main
 * @author ldatchi
 */
public class Main {
	
	private static Scanner clavier;
	
	public static void main(String[] args) {
		
		clavier = new Scanner(System.in);
		
		Continent unContinent = new Continent("Amérique du nord");
		 Pays unPays = null;
		 Ville uneVille = null;
		int choix;
		
		do {
			System.out.println("\n[--Ma carte--]\n");
	        System.out.println("1 - Ajouter un pays");
	        System.out.println("2 - Ajouter une ville");
	        System.out.println("3 - Afficher un continent");
	        System.out.println("4 - Quitter");
	        System.out.println("Entrez le nombre correspondant à votre choix : ");
			choix = clavier.nextInt();
			clavier.nextLine();
			switch(choix) {
			case 1:
				ajoutPays(unContinent, unPays);
				break;
			case 2:
				ajoutVille(unContinent);
				break;
			case 3:
				affichageContinent(unContinent);
				break;
			case 4:
				System.out.println("~~~~~~~~~~~~~~~" + "\nA la revoyure !\n" + "~~~~~~~~~~~~~~~");
				break;
			default:
				System.out.println("Indiquer un des 4 choix présent dans cette liste.");
				break;
			}
		 }while(choix != 4);
	}
	public static void ajoutPays(Continent unContinent, Pays desPays) {
		System.out.println("|Ajouter le nom du pays : ");
		String paysPays = clavier.nextLine();
		System.out.println("|Ajouter la langue du pays : ");
		String languePays = clavier.nextLine();
		System.out.println("|Ajouter la monnaie du pays : ");
		String monnaiePays = clavier.nextLine();
		System.out.println("|Ajouter le nom de la capitale :");
		String capitaleCapitale = clavier.nextLine();
		System.out.println("|Ajouter le nombre d'habitants de la capitale :");
		int nbHabitantCapitale = clavier.nextInt();
		System.out.println("|Ajouter la superficie de la capitale :");
		float superficieCapitale = clavier.nextInt();
		Capitale uneCapitale = new Capitale (capitaleCapitale, nbHabitantCapitale, superficieCapitale);
		unContinent.ajouterPays(desPays = new Pays(paysPays, languePays, monnaiePays, uneCapitale));
	}
	public static void ajoutVille(Continent unContinent) {
		System.out.println("Ajout de cette ville dans quel pays ? : ");
		String nomPays = clavier.nextLine();
		int i = unContinent.rechercherPays(nomPays);
		if(i != -1) {
			Pays unPays = unContinent.lesPays.get(i);
			System.out.println("Ajouter le nom de la ville : ");
			String nomVille = clavier.nextLine();
			System.out.println("Ajouter le nombre d'habitants de la ville : ");
			int nbHabitantVille = clavier.nextInt();
			System.out.println("|Ajouter la superficie de la ville :");
			int superficieVille = clavier.nextInt();
			Ville uneVille = new Ville(nomVille,nbHabitantVille,superficieVille);
			unPays.ajouterUneVille(uneVille);
		}
		else {
			System.out.println("ce pays n'existe pas.");
		}
	}
	public static void affichageContinent(Continent unContinent) {
		System.out.println(unContinent.toString());
	}
}