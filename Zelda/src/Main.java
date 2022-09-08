public class Main {
    public static void main(String[] args) {
        Commercants h1 = new Commercants("Link",100,200,1000);
        Sacoche s1 = new Sacoche(5,"bleu");
        Banane b1 = new Banane();
        Banane b2 = new Banane();
        Poisson p1 = new Poisson();

        s1.getContenu().add(b1);
        s1.getContenu().add(p1);

        h1.setSacoche(s1);

        Commercants h2 = new Commercants("Tico",200,250,2500);
        Sacoche s2 = new Sacoche(10,"jaune");
        Poisson p2 = new Poisson();
        Poisson p3 = new Poisson();
        Pomme po1 = new Pomme();
        Pomme po2 = new Pomme();

        s2.getContenu().add(p2);
        s2.getContenu().add(p3);
        s2.getContenu().add(po1);
        s2.getContenu().add(po2);

        h2.setSacoche(s2);

        h1.achat(h2,po1);
        h1.achat(h2,p2);

        h2.achat(h1,b1);
        h2.achat(h1,b2);

        System.out.println("Sacoche de link");
        for(Objets obj : h1.getSacoche().getContenu()) {
            System.out.println(obj.getNom());
        }
        System.out.println("Link a : "+h1.getSous()+ " rubis");

        System.out.println("Sacoche de tico");
        for(Objets obj : h2.getSacoche().getContenu()) {
            System.out.println(obj.getNom());
        }
        System.out.println("Tico a : "+h2.getSous()+ " rubis");

    }
}
