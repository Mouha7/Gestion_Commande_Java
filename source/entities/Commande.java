package source.entities;
import source.enums.Etat;
public class Commande {
    private int id;
    private double total;
    private double reste;
    private Etat etat;
    private Client client;
    private static int nbrCommande;
    private final int N = 10;
    private int n;
    private Paiement[] tabPaiement = new Paiement[N];
    public Commande(){
        id = ++nbrCommande;
        this.etat = Etat.IMPAYE;
    }
    public Commande(double Total){
        id = ++nbrCommande;
        this.etat = Etat.IMPAYE;
        reste = total;
    }
    public double getTotal(){
        return total;
    }
    public double getRest(){
        return reste;
    }
    public Client getClient(){
        return client;
    }
    public Etat getEtat(){
        return etat;
    }
    public Paiement[] Paiement(){
        return tabPaiement;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public void setReste(double reste){
        this.reste = reste;
    }
    public void setEtat(Etat etat){
        this.etat = etat;
    }
    public void setClient(Client client){
        this.client = client;
    }
    public String toString(){
        return STR."\nCommande : \nId = \{id} \nMontant = \{total} \nClient = \{client}";
    }
}
