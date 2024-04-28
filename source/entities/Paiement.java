package source.entities;
import source.entities.Commande;
public class Paiement {
    private int id;
    private double montant;
    private Commande commande;
    private static int nbrPaiement;
    public Paiement(){
        id = ++nbrPaiement;
    }
    public Paiement(double montant, Commande commande) {
        id = ++nbrPaiement;
        this.montant = montant;
        this.commande = commande;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getMontant() {
        return montant;
    }
    public void setMontant(double montant) {
        this.montant = montant;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
