import java.util.Scanner;

class Personne {
    private String nom;
    private String prenom;
    private String pays;
    private boolean estMarie;
    private int nombreEnfants;

    public Personne(String nom, String prenom, String pays, boolean estMarie, int nombreEnfants) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.estMarie = estMarie;
        this.nombreEnfants = nombreEnfants;
    }

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
        Personne moi=new Personne("Lisangola","Christian","Gondwana",false,28);
        Personne lui=new Personne("Bossard","Benjamin","Rep.Tcheque",false,2);
//        Personne lui=new Personne();
//        lui.setNom("jean");
//        moi.setNom("lisangola");
//        moi.setPrenom("Christian");
//        moi.setPays("Citoyen du Monde");
//        moi.setEstMarie(false);
//        moi.setNombreEnfants(0);
        moi.setNom("Bondjali");
        System.out.println("Nom : "+moi.getNom());
        System.out.println("Prenom : "+moi.getPrenom());
        System.out.println("Nom complet : "+moi.nomComplet());//Christian LISANGOLA
        System.out.println("Pays : "+moi.getPays());
        System.out.println("Est married : "+(moi.estMarie()?"Oui":"Non"));
        System.out.println("Enfants : "+moi.getNombreEnfants());
    }
}
