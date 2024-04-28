package source.services;
import source.entities.Commande;
public class CommandeService {
    private final int N = 10;
    private Commande[] tabCommande = new Commande[N];
    private int n;
    public void enregistrerCommande(Commande commande){
        if ( n < N ) {
            tabCommande[n++] = commande;
        }
    }
    public Commande[] listerCommande(){
        return tabCommande;
    }
}
