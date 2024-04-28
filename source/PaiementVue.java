package source;
import source.entities.Commande;
import source.entities.Paiement;
import java.util.Scanner;
public class PaiementVue {
    public Paiement saisiePaiement(Scanner scanner, Commande commande){
        Paiement paie = new Paiement();
        scanner.nextLine();
        do {
            System.out.println("Montant du paiement:");
            paie.setMontant(scanner.nextDouble());
        } while (paie.getMontant() < 0 || paie.getMontant() > commande.getRest());
        return paie;
    }
}

