package source;
import source.entities.Commande;
import java.util.Scanner;

public class CommandeVue {
    public Commande saisieCommande(Scanner scanner){
        Commande com = new Commande();
        scanner.nextLine();
        System.out.println("Total de la commande:");
        com.setTotal(scanner.nextDouble());
        return com;
    }
    public void listerCommande(Commande[] tabCom){
        for (int i = 0; i < tabCom.length; i++){
            if (tabCom[i] != null){
                System.out.println(tabCom[i]);
            }
        }
    }
}