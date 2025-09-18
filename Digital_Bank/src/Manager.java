import java.util.ArrayList;

public class Manager {
    private ArrayList<Client> clients = new ArrayList<>();

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
        System.out.println("Account not found");
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
