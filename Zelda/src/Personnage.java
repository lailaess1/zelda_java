public abstract class Personnage {
    private String nom;
    private int x;
    private int y;
    private int vitesse;

    public Personnage(String nom, int x, int y, int vitesse) {
        this.nom=nom;
        this.x=x;
        this.y=y;
        this.vitesse=vitesse;
    }

    public int getVitesse() {
        return this.vitesse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public abstract String saluer();
}
