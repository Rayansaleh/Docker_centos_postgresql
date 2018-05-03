public class Salarie {

    private int id = 0;
    private String nom = "";
    private int id_ent = 0;

    public Salarie(int id, String nom, int id_ent){
        this.id = id;
        this.nom = nom;
        this.id_ent = id_ent;
    }

    public Salarie(){}

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

    public int getId_ent() {
        return id_ent;
    }

    public void setId_ent(int id_ent) {
        this.id_ent = id_ent;
    }
}
