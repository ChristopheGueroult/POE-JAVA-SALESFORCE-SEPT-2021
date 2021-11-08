import java.util.Scanner;

public class Tableaux {
    public static void main(String[] args) {
        int tb[];
        int[] monTab;
        int scores[]={18,10,16};
        int notesPhysique[]=new int[4];
        System.out.println("Taille du tableau notes:"+notesPhysique.length);
        System.out.println("Taille du tableau scores :"+scores.length);

//        Accès via une boucle
        for(int i=0;i<scores.length;i++){
            System.out.printf("Score %d  : %d\n",(i+1),scores[i]);
        }

//        Ecriture via une boucle
        Scanner clavier=new Scanner(System.in);
        for(int i=0;i<notesPhysique.length;i++){
           if(i==0){
               System.out.printf("Entrez le %der : ",(i+1));
           }else{
               System.out.printf("Entrez le %dème : ",(i+1));
           }
           notesPhysique[i]=clavier.nextInt();
        }


        System.out.println("VOici les notes du cours de physique : ");
        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("%d ",notesPhysique[i]);
        }

        System.out.println();
//        Autre type de boucle
        System.out.println("Voici les notes du cours de physique(méthode 2) : ");
        for(int note:notesPhysique){
            System.out.printf("%d ",note);
        }

    }
}
