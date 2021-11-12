package corrections_tps;

import java.util.Calendar;
import java.util.ArrayList;


class Direction 
{
    public static void main(String[] args) {
        Ecole clbt = new Ecole();
        clbt.add(new EtudiantRegulier("Christian Lisangola", 2018, "SSC", 17));
        clbt.add(new EtudiantRegulier("Lionel Messi", 2016, "SSC", 15));
        clbt.add(new EtudiantEchange("Alexandro Del Pierro", 2017, "Informatique", "KTH"));
        clbt.add(new Enseignant("Lance Armstrong", 2015, "LMEP", 10000, "Physique"));
        clbt.add(new  Secretaire("Sophie Scribona", 2013, "LMT", 5000));
        clbt.afficherStatistiques();
        clbt.afficherCLBTiens();
    }

}

 /**
  * La direction
  */

class Ecole {
    private ArrayList<CLBTiens> gens;

    public Ecole() {
        gens = new ArrayList<CLBTiens>();
    }

    public void add(CLBTiens personne)
        {
            if (personne != null)
            {
                gens.add(personne);
            }
        }

    public void afficherStatistiques() {
        int anneeCourante = Calendar.getInstance().get(Calendar.YEAR);
        int nbAnneesTotal = 0;
        int nbEtudiants = 0;
        for (CLBTiens clbTien : gens) {
            nbAnneesTotal = nbAnneesTotal + (anneeCourante - clbTien.getAnnee());
            if (clbTien.estEtudiant()){
                ++nbEtudiants;
            }
        }
        System.out.println("Parmi les " + gens.size() + " CLBTiens, " +
                nbEtudiants + " sont des etudiants.");
        double moyen = nbAnneesTotal;
        moyen /= gens.size();
        System.out.println("Ils sont ici depuis en moyenne " + moyen + " ans");
    }



    public void afficherCLBTiens() {
        System.out.println("Liste des CLBTiens: ");
        for (CLBTiens clbTiens : gens)
            clbTiens.afficher();
    }
}


class CLBTiens {
    private String nom;
    private int annee;

    public CLBTiens(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
    }
    
   //Cette méthode affiche les caractéristiques générales d'un CLBTien
    public void afficher() {
        System.out.println("   Nom : " + getNom());
        System.out.println("   Annee : " + getAnnee());
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee() {
        return annee;
    }
    public boolean estEtudiant ()
        {
            return false;
        }

}

/**
  * Les étudiants
  */
class Etudiant extends CLBTiens {
    private String section;

    public Etudiant(String nom, int annee, String section) {
        super(nom, annee);
        this.section = section;
    }

    public void afficher() {
        super.afficher();
        System.out.println("   Section : " + getSection());
    }

    public String getSection() {
        return section;
    }

    public boolean estEtudiant()
        {
            return true;
        }
    
}

/**
  * Les étudiants régulier
  */
class EtudiantRegulier extends Etudiant {
    private double moyenne;

    public EtudiantRegulier(String nom, int annee, String section, double moyenne) {
        super(nom, annee, section);
        this.moyenne = moyenne;
    }

    public void afficher() {
        System.out.println("Etudiant regulier:");
        super.afficher();
        System.out.println("   Moyenne : " + moyenne);
    }
}

/**
  * Les étudiants  d'échange
  */
class EtudiantEchange extends Etudiant {
    private String uniOrigine;

    public EtudiantEchange(String nom, int annee, String section, String uniOrigine) {
        super(nom, annee, section);
        this.uniOrigine = uniOrigine;
    }

    public void afficher() {
        System.out.println("Etudiant d'echange:");
        super.afficher();
        System.out.println("   Uni d'origine : " + getUniOrigine());
    }

    public String getUniOrigine() {
        return uniOrigine;
    }
}

/**
  * Le personnel de l'CLBT
  */
class Personnel extends CLBTiens {
    private String labo;
    private int salaire;

    public Personnel(String nom, int annee, String labo, int salaire) {
        super(nom, annee);
        this.labo = labo;
        this.salaire = salaire;
    }

    public void afficher() {
        super.afficher();
        System.out.println("   Laboratoire : " + getLabo());
        System.out.println("   Salaire : " + getSalaire());
    }

    public String getLabo() {
        return labo;
    }

    public int getSalaire() {
        return salaire;
    }
}

class Enseignant extends Personnel {
    private String section;

    public Enseignant(String nom, int annee, String labo, int salaire, String section) {
        super(nom, annee, labo, salaire);
        this.section = section;
    }

    public void afficher() {
        System.out.println("Enseignant:");
        super.afficher();
        System.out.println("   Section d'enseignement : " + getSection());
    }

    public String getSection() {
        return section;
    }
}

class Secretaire extends Personnel {
    public Secretaire(String nom, int annee, String labo, int salaire) {
        super(nom, annee, labo, salaire);
    }

    public void afficher() {
        System.out.println("Secretaire:");
        super.afficher();
    }
}
