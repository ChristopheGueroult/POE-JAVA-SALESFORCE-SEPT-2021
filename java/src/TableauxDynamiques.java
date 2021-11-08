import java.util.ArrayList;
import java.util.Scanner;

public class TableauxDynamiques {
    public static void main(String[] args) {
        Integer a=23;
        int b=23;



        System.out.println("a==b : "+(a==b));
//        Declaration
        ArrayList<String> nomsEtudiants=new ArrayList<>();


//        Tester si le tableau est vide
        System.out.println("Is the list empty ? : "+nomsEtudiants.isEmpty());
        //Ajout + taille
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Christian");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Ryad");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Nicolas");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Jihane");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Salama");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        nomsEtudiants.add("Charlotte");
        System.out.println("Taille du tableau : "+nomsEtudiants.size());
        System.out.println("Is the list empty ? : "+nomsEtudiants.isEmpty());

//     Accès
        System.out.println("Mon nom : "+nomsEtudiants.get(0));
        nomsEtudiants.remove(0);
        System.out.println("Mon nom : "+nomsEtudiants.get(0));
        nomsEtudiants.set(0,"Ryad KH");
        System.out.println("Nom m-à-j : "+nomsEtudiants.get(0));

//        Vider le tableau
//        Avant
        System.out.println("Avant .clear() => Tableau vide ? "+nomsEtudiants.isEmpty());
        nomsEtudiants.clear();
        System.out.println("Après .clear()Tableau => vide ? "+nomsEtudiants.isEmpty());

        System.out.println("\n\n");
//        Itérations sur les array dynamqiues
        ArrayList<Integer> notesDuCoursDePhysique=new ArrayList<>();

//        Ajout des notes
//        notesDuCoursDePhysique.add(19);
//        notesDuCoursDePhysique.add(20);
//        notesDuCoursDePhysique.add(15);
//        notesDuCoursDePhysique.add(15);
        Scanner keyb=new Scanner(System.in);
        System.out.print("Combien de notes :");
        int nbreNotes=keyb.nextInt();

        for(int i=0;i<nbreNotes;i++){
            System.out.printf("Entrez la note numero %d : ",(i+1));
            int note= keyb.nextInt();
            notesDuCoursDePhysique.add(note);
        }
//        Affiche des notes
        for(int i=0;i<notesDuCoursDePhysique.size();i++){
            System.out.printf("Note numéro %d : %d\n",(i+1),notesDuCoursDePhysique.get(i));
        }
    }
}
