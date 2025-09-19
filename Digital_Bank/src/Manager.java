import java.util.ArrayList;

public class Manager extends Personne{

    private ArrayList<Client> clients = new ArrayList<>();

    public Manager(String nom, String prenom, String email, int age, int tel) {
        super(nom, prenom, email, age, tel);
    }

    public void ajouterCompte(Client client){
        clients.add(client);
        System.out.println("Compte crée avec numéro: " + client.recupererNumeroCompte());
    }

    public Client retrouverCompte(int numeroCompte){
        for(Client clt : clients){
            if(clt.recupererNumeroCompte() == (numeroCompte)){
                return clt;
            }
        }
        System.out.println("Compte n'est pas trouvé.");
        return null;
    }

    public void transferer(int numeroComEmetteur, int numeroComDestinataire, double montant){
        Client comEmetteur = retrouverCompte(numeroComEmetteur);
        Client comDstintaire = retrouverCompte(numeroComDestinataire);

        if(comEmetteur != null && comDstintaire != null){
            comEmetteur.retirer(montant);
            comDstintaire.deposer(montant);
            System.out.println("Transferré" + " de " + numeroComEmetteur + " vers le compte " + numeroComDestinataire);
        }
    }

}
