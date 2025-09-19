//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Manager
        Manager manager = new Manager("Said", "Adel", "said@adel", 65, 06666666);
        //Client
        Client client = new Client("ahmad", "ahl", "ad@ffff0", 22, 066666, 1000,1000, "courant");
        //list client
        manager.ajouterCompte(client);

        //choix
            int choixEntre;
        do{
            System.out.println("\n$$$ DIGITAL BANK $$$\n");
            System.out.println("1. Client");
            System.out.println("2. Manager");
            System.out.println("0. Sortir du System\n");
            System.out.println("Choisissez un nombre pour continuer...\n");

            Scanner choix = new Scanner(System.in);
            choixEntre = choix.nextInt();

            System.out.println("Choisissez un nombre pour continuer...\n");

            System.out.println("votre choix ... " + choixEntre);

            switch(choixEntre){
                case 1:
                    System.out.println("Entrez votre numero de compte : ");
                    Scanner numeroCompte = new Scanner(System.in);
                    int numeroCompteEntre = numeroCompte.nextInt();

                    if(manager.retrouverCompte(numeroCompteEntre).recupererNumeroCompte() != numeroCompteEntre){
                        System.out.println("Bonjour !");
                        manager.retrouverCompte(numeroCompteEntre);

                    } else{
                        System.out.println("choisissez votre prochaine action: ");
                        System.out.println("1. Deposer un montant");
                        System.out.println("2. Retirer un montant");
                        System.out.println("3. Transférer un montant\n");

                        Scanner action = new Scanner(System.in);
                        int actionTaken = action.nextInt();
                        switch(actionTaken){
                            case 1:
                                System.out.println("Entrez le montant à déposer: ");
                                Scanner montantAdepoez = new Scanner(System.in);
                                client.deposer(montantAdepoez.nextDouble());
                                break;

                            case 2:
                                System.out.println("Entrez le montant à retirer: ");
                                Scanner montantRetire = new Scanner(System.in);
                                client.retirer(montantRetire.nextDouble());
                                break;

                            case 3:
                                System.out.println("Entrez votre numero de compte: ");
                                Scanner numComEmetteur = new Scanner(System.in);
                                System.out.println("Entrez le numero du compte destinataire: ");
                                Scanner numComDestinataire = new Scanner(System.in);
                                System.out.println("Entrez le montant à débiter: ");
                                Scanner montantDebite = new Scanner(System.in);

                                manager.transferer(numComEmetteur.nextInt(), numComDestinataire.nextInt(), montantDebite.nextDouble());

                            default:

                        }
                    }
                    break;

                case 2:
                    System.out.println("choisissez votre prochaine action: ");
                    System.out.println("1. Créer et ajouter compte");
                    System.out.println("2. Chercher un compte\n");

                    Scanner managerAction = new Scanner(System.in);
                    int managerActionTaken = managerAction.nextInt();
                    switch (managerActionTaken){
                        case 1:
                            System.out.println("Pour créer un compte entrez les informations suivantes: ");
                            System.out.println("Nom: ");
                            Scanner nom = new Scanner(System.in);
                            String nomTape = nom.nextLine();
                            System.out.println("Prénom: ");
                            Scanner prenom = new Scanner(System.in);
                            String prenomTape = prenom.nextLine();
                            System.out.println("Email: ");
                            Scanner email = new Scanner(System.in);
                            String emailTape = email.nextLine();
                            System.out.println("Age: ");
                            Scanner age = new Scanner(System.in);
                            int ageTape = prenom.nextInt();
                            System.out.println("Tel: ");
                            Scanner tel = new Scanner(System.in);
                            int telTape = tel.nextInt();
                            System.out.println("Numéro compte: ");
                            Scanner numero_compte = new Scanner(System.in);
                            int numero_compteTape = numero_compte.nextInt();
                            System.out.println("Type de compte: ");
                            Scanner typeCompte = new Scanner(System.in);
                            String typeCompteTape = typeCompte.nextLine();

                            String clientTape = prenomTape + prenomTape;

                            manager.ajouterCompte(new Client(nomTape, prenomTape, emailTape, ageTape, telTape, numero_compteTape, 0, typeCompteTape));

                            break;

                        case 2:
                            System.out.println("Entrez le numéro de compte que vous voulez récupérer: ");
                            Scanner numeroDeCompteArecupere = new Scanner(System.in);
                            System.out.println(manager.retrouverCompte(numeroDeCompteArecupere.nextInt()));
                    }
                }
            }while(choixEntre != 0);
        }
    }
