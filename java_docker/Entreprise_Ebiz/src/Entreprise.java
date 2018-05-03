public class Entreprise {
    private int id = 0;
    private String nom;

    public Entreprise(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public Entreprise(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
