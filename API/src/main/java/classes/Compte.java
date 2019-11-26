package classes;

public class Compte {
    private String numero;
    private float solde;
    private boolean bloque;

    public Compte() {}

    public String getNumero(){ return this.numero;}

    public float getSolde(){ return this.solde;}

    public void setSolde(float solde){this.solde = solde;}

    public Boolean getBloque(){ return this.bloque;}

}

