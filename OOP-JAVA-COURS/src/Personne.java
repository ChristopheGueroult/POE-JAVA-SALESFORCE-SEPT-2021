import java.util.Scanner;

class Personne {
    private String nom;
    private String prenom;
    private String pays;
    private boolean estMarie;
    private int nombreEnfants;

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public String getPays() {
        return pays;
    }

    public boolean estMarie() {
        return estMarie;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }


    public void setNom(String nom){
        this.nom=nom;
    }

    public void setPrenom(String prenom){
        this.prenom=prenom;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setEstMarie(boolean estMarie) {
        this.estMarie = estMarie;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public String nomComplet(){
        return prenom+" "+nom;
    }
}

class Main{
    public static void main(String[] args) {
        Personne moi=new Personne();
        Personne lui=new Personne();
        lui.setNom("Jean");
        moi.setNom("Lisangola");
        moi.setPrenom("Christian");
        moi.setPays("Citoyen du Monde");
        moi.setEstMarie(false);
        moi.setNombreEnfants(0);
        System.out.println("Nom : "+moi.getNom());
        System.out.println("Prenom : "+moi.getPrenom());
        System.out.println("Nom complet : "+moi.nomComplet());
        System.out.println("Pays : "+moi.getPays());
        System.out.println("Est married : "+(moi.estMarie()?"Oui":"Non"));
        System.out.println("Enfants : "+moi.getNombreEnfants());
    }
}
