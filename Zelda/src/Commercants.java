public class Commercants extends Humains{
    public Commercants(String nom, int x, int y, int sous) {
        super(nom,x,y,sous);
    }

    public void achat(Humains humain,Objets obj) {
        this.setSous(this.getSous() - obj.getPrix());
        this.ajout(obj);

        humain.setSous(humain.getSous() + obj.getPrix());
        humain.retirer(obj);

    }
}
