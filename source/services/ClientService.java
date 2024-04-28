package source.services;
import source.entities.Client;
public class ClientService {
    private final int N = 10;
    private Client[] tabClient = new Client[N];
    private int n;
    public Client[] listerTabClient(){
        return tabClient;
    }
    public void addClient(Client cl){
        if (n < N) {
            tabClient[n++] = cl;
        }
    }
    public Client findClient(int numero){
        for (int i = 0; i < tabClient.length; i++){
            if (tabClient[i] != null){
                if (tabClient[i].getTelephone() == numero) {
                    return tabClient[i];
                }
            }
        }
        return null;
    }
}
