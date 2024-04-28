package source.entities;
public class Client {
    private int id;
    private String nomComplet;
    private int telephone;
    private static int nbrClient;
    private final int N = 10;
    private int n;
    private Commande[] tabCommande = new Commande[N];
    public Client(){
        id = ++nbrClient;
    }
    public  Client(String nomComplet, int telephone){
        ++nbrClient;
        id = nbrClient;
        this.nomComplet = nomComplet;
        this.telephone = telephone;
    }
    public int getId() {
        return id;
    }
    public String getNomComplet() {
        return nomComplet;
    }
    public int getTelephone() {
        return telephone;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    public String toString(){
        return STR."Client : ID = \{id} Nom Complet = \{nomComplet} Telephone = \{telephone}";
    }
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Client other = (Client) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
