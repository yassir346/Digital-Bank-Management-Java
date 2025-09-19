import javax.management.remote.SubjectDelegationPermission;

public class Client extends Personne{
    private int numeroCompte;
    protected double solde = 0;
    private String typeCompte;
    private String historiqueTransactions;

    public Client(String nom, String prenom, String email, int age, int tel,int numeroCompte, double solde, String typeCompte) {
        super(nom, prenom, email, age, tel);
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.typeCompte = typeCompte;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numeroCompte=" + numeroCompte +
                ", solde=" + solde +
                ", typeCompte='" + typeCompte + '\'' +
                ", historiqueTransactions='" + historiqueTransactions + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", tel=" + tel +
                '}';
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
