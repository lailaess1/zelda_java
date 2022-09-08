import java.util.ArrayList;

public class Sacoche {
    private int poids;
    private String couleur;
    private ArrayList<Objets> contenu;

    public Sacoche(int poids,String couleur) {
        this.poids=poids;
        this.couleur=couleur;
        this.contenu = new ArrayList<Objets>();
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public ArrayList<Objets> getContenu() {
        return contenu;
    }

    public void setContenu(ArrayList<Objets> contenu) {
        this.contenu = contenu;
    }
}
