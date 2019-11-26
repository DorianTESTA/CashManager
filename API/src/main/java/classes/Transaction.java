package classes;

public class Transaction {
    private String compte;
    private float montant;

    public Transaction(String compte, float montant){
        this.compte = compte;
        this.montant = montant;
    }

    public Transaction(){}

    public String getCompte(){ return this.compte;}

    public float getMontant(){ return this.montant;}
}
