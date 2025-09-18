public class Client {
    private int numeroCompte;
    protected double solde;
    private String typeCompte;
    private String historiqueTransactions;

    public Client(int numeroCompte, double solde, String typeCompte) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.typeCompte = typeCompte;
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("montant déposé. " + montant);
    }

    public void retirer(double montant) {
        if (solde <= montant) {
            solde -= montant;
            System.out.println(montant + "retiré. Le nouveau solde est" + solde);
        } else {
            System.out.println("Balance Insuffisant");
        }
    }

    public void consulterSolde() {
        System.out.println("solde: " + solde);
    }

    public int recupererNumeroCompte() {
        return numeroCompte;
    }
}
