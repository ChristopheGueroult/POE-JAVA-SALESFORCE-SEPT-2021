package corrections_tps;


import java.util.ArrayList;

class KitVoyage {
    private ArrayList<OptionVoyage> voyages;
    private String depart;
    private String destination;

    public KitVoyage(String unDepart, String uneDest){
        voyages = new ArrayList<OptionVoyage>();
        depart = unDepart;
        destination = uneDest;
    }

    public double prix(){
        double totOption = 0.0;
        for (OptionVoyage ov : voyages){
            totOption += ov.prix();
        }
        return totOption;
    }

    public void ajouterOption(OptionVoyage ov){
        if (ov == null){
            System.out.println("Pas d'ajout d'option");
        } else {
            voyages.add(ov);
        }
    }
    public void annuler(){
        voyages.clear();
    }

    public int getNbOptions(){
        return voyages.size();
    }

    public String toString(){
        String chaine;
        chaine = ("Voyage de " + depart + " à " + destination + ", avec pour options : \n");
        for (OptionVoyage ov : voyages){
            chaine += (" - " + ov + "\n");
        }
        chaine += ("Prix total : " + prix() + " €\n");
        return chaine;
    }
}

class OptionVoyage {
    private String nom;
    private double prix;

    public OptionVoyage(String unNom, double unPrix){
        nom = unNom;
        prix = unPrix;
    }

    public String getNom(){
        return nom;
    }
    public double prix(){
        return prix;
    };

    public String toString(){
        return (getNom() + " -> " + prix() + " €");
    }
}

class Sejour extends OptionVoyage{
    private int nbNuits;
    private double prixNuit;

    public Sejour(String unNom, double unPrix, int unNbNuits, double unPrixNuit){
        super(unNom, unPrix);
        nbNuits = unNbNuits;
        prixNuit = unPrixNuit;
    }

    public double prix(){
        return ((this.nbNuits * this.prixNuit) + super.prix());
    }
}

class Transport extends OptionVoyage{
    public final static double TARIF_LONG = 1500.0;
    public final static double TARIF_BASE = 200.0;
    private boolean trajetLong;

    public Transport(String unNom, double unPrix, boolean estLong){
        super(unNom, unPrix);
        trajetLong = estLong;
    }
    public Transport(String unNom, double unPrix){
        super(unNom, unPrix);
        trajetLong = false;
    }

    public double prix(){
        if (trajetLong){
            return (TARIF_LONG + super.prix());
        } else {
            return (TARIF_BASE + super.prix());
        }
    }
}

class Voyage {
    public static void main(String args[]) {

        // Premier test
        System.out.println("Test partie 1 : ");
        System.out.println("----------------");
        OptionVoyage option1 = new OptionVoyage("Séjour au camping", 40.0);
        System.out.println(option1.toString());

        OptionVoyage option2 = new OptionVoyage("Visite guidée : London by night" , 50.0);
        System.out.println(option2.toString());
        System.out.println();




        // Deuxième test
        System.out.println("Test partie 2 : ");
        System.out.println("----------------");

        Transport transp1 = new Transport("Trajet en car ", 50.0);
        System.out.println(transp1.toString());

        Transport transp2 = new Transport("Croisière", 1300.0);
        System.out.println(transp2.toString());

        Sejour sejour1 = new Sejour("Camping les flots bleus", 20.0, 10, 30.0);
        System.out.println(sejour1.toString());
        System.out.println();




        // Troisième test
        System.out.println("Test partie 3 : ");
        System.out.println("----------------");

        KitVoyage kit1 = new KitVoyage("Zurich", "Paris");
        kit1.ajouterOption(new Transport("Trajet en train", 50.0));
        kit1.ajouterOption(new Sejour("Hotel 3* : Les amandiers ", 40.0, 5, 100.0));
        System.out.println(kit1.toString());
        System.out.println();
        kit1.annuler();

        KitVoyage kit2 = new KitVoyage("Zurich", "New York");
        kit2.ajouterOption(new Transport("Trajet en avion", 50.0, true));
        kit2.ajouterOption(new Sejour("Hotel 4* : Ambassador Plazza  ", 100.0, 2, 250.0));
        System.out.println(kit2.toString());
        kit2.annuler();

        // FIN TEST 3
    }
}