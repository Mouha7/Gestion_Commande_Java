package source;
import java.util.Scanner;
import source.entities.Client;
import source.entities.Commande;
import source.services.ClientService;
import source.services.CommandeService;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choix;
        ClientVue clientVue = new ClientVue();
        ClientService clientService = new ClientService();
        CommandeVue commandeVue = new CommandeVue();
        CommandeService commandeService = new CommandeService();
        do {
            switch (choix = menu()){
                case 1 -> {
                    Client client = clientVue.saisieClient(scanner);
                    clientService.addClient(client);
                }
                case 2 -> {
                    clientVue.listerClient(clientService.listerTabClient());
                }
                case 3 -> {
                    Client cl = clientService.findClient(clientVue.demanderNumero(scanner));
                    if ( cl == null ) {
                        System.out.println("Ce client n'existe pas");
                    } else {
                        Commande commande = commandeVue.saisieCommande(scanner);
                        commande.setClient(cl);
                        commandeService.enregistrerCommande(commande);
                    }
                }
                case 4 -> {
                    commandeVue.listerCommande(commandeService.listerCommande());
                }
            }
        } while (choix != 7);
        scanner.close();
    }
    public static int menu() {
        System.out.println("1- Ajouter un Client");
        System.out.println("2- Lister tous les clients");
        System.out.println("3- Enregistrer une commande pour un client");
        System.out.println("4- Lister toutes les Commandes");
        System.out.println("5- Enregistrer un Paiement");
        System.out.println("6- Lister les Commandes Par Etat");
        System.out.println("7- Quitter");
        return scanner.nextInt();
    }
}
