//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Client client = new Client(1000, 255, "courant");
        Scanner choix = new Scanner(System.in);

        System.out.println("\n$$$ DIGITAL BANK $$$\n");
        System.out.println("1. Client");
        System.out.println("2. Manager\n");

        System.out.println("Choisissez un nombre pour continuer...\n");
        int choixEntre = choix.nextInt();
        System.out.println("votre choix ... " + choixEntre);

        switch(choixEntre){
            case 1:
                System.out.println("Entrez votre numero de compte : ");
                Scanner numeroCompte = new Scanner(System.in);
                int numeroCompteEntre = numeroCompte.nextInt();

                System.out.println("1. Deposer un montant");
                System.out.println("2. Retirer un montant");

                Scanner choix2 = new Scanner(System.in);
                int choix2Entre = choix2.nextInt();

                if(manager.retrouverCompte(choix2Entre).recupererNumeroCompte() != choix2Entre){
                    System.out.println("numero ne correspend à auccun compte");
                } else{
                    System.out.println("choisissez votre prochaine action: ");
                    Scanner action = new Scanner(System.in);
                    switch(action.nextInt()){

                    }


                }


                }
        }
    }
