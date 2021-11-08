import java.util.Scanner;

class Personne {
    String nom;
    String prenom;
    String pays;
    boolean estMarie;
    int nombreEnfants;

    String nomComplet(){
        return prenom+" "+nom;
    }
}

class Main{
    public static void main(String[] args) {
        Personne moi=new Personne();
        moi.nom="Lisangola";
        moi.prenom="Christian";
        moi.pays="Citoyen du Monde";
        moi.estMarie=false;
        moi.nombreEnfants=0;
//        System.out.println("Nom : "+moi.nom);
//        System.out.println("Prenom : "+moi.prenom);
        System.out.println("Nom complet : "+moi.nomComplet());
        System.out.println("Pays : "+moi.pays);
        System.out.println("Est married : "+(moi.estMarie?"Oui":"Non"));
        System.out.println("Enfants : "+moi.nombreEnfants);
    }
}
