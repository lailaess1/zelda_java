public class Humains extends Personnage {
    private int sous;
    private Sacoche sacoche;
    public Humains(String nom, int x, int y, int sous) {
        super(nom, x, y, 5);
        this.sous=sous;
    }


    @Override
    public String saluer() {
        return "Bonjour";
    }

    public int getSous() {
        return sous;
    }

    public void setSous(int sous) {
        this.sous = sous;
    }

    public void ajout(Objets obj) {
        this.sacoche.getContenu().add(obj);
    }

    public void retirer(Objets obj) {
        this.sacoche.getContenu().remove(obj);
    }

    public Sacoche getSacoche() {
        return this.sacoche;
    }

    public void setSacoche(Sacoche sacoche) {
        this.sacoche=sacoche;
    }
}