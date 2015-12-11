import java.util.Scanner;
class Exercice5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mois (1-12):");
        int mois = sc.nextInt();
        int jours = (mois==2) ? 28 : ((mois<8) ? ((mois%2==1) ? 31 : 30) : ((mois%2==1) ? 30 : 31));
        System.out.println("Ce mois contient " + jours + " jours.");
	}

}