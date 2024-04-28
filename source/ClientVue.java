package source;
import source.entities.Client;
import java.util.Scanner;
public class ClientVue {
    public Client saisieClient(Scanner scanner){
        Client cl = new Client();
        scanner.nextLine();
        System.out.println("Nom complet du client:");
        cl.setNNomComplet(scanner.nextLine());
        System.out.println("Numéro du telephone:");
        cl.setTelephone(scanner.nextInt());
        return cl;
    }
    public void listerClient(Client[] tabCl){
        for (int i = 0; i < tabCl.length; i++){
            if (tabCl[i] != null){
                System.out.println(tabCl[i]);
            }
        }
    }
    public int demanderNumero(Scanner scanner){
        System.out.println("Numero:");
        return scanner.nextInt();
    }
}
