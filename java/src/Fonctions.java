import java.util.HashMap;
import java.util.Scanner;

public class Fonctions {
    static double calculSomme(double nombre1,double nombre2){
        return nombre1+nombre2;
    }

    static double calculSurfaceCercle(double rayon){
        return Math.pow(rayon,2)*Math.PI;
    }

    static double calculPermietreRectange(double longueur,double largeur){
        return calculSomme(longueur,largeur)*2;
    }

    static String capitalize(String chaine){
        for (int i = 0; i < chaine.length(); i++) {
            if ((i == 0)){
                chaine = chaine.substring(0,i) + chaine.substring(i,i+1).toUpperCase() +chaine.substring(i+1);
            }else {
                if (chaine.charAt(i-1) == ' '){
                    chaine = chaine.substring(0,i) + chaine.substring(i,i+1).toUpperCase() +chaine.substring(i+1);
                }
            }
        }
        return chaine;
    }

    static boolean isAnagrams(String phrase1,String phrase2) {
        //Effacement des espaces
        phrase1 = phrase1.replaceAll("\\s+", "");
        phrase2 = phrase2.replaceAll("\\s+", "");
        //création des deux Hashmaps
        HashMap<Character, Integer> occurences1 = new HashMap<>();
        HashMap<Character, Integer> occurences2 = new HashMap<>();
        // calcul occurences pour chaque character
        for (int i = 0; i < phrase1.length(); i++) {
            if (occurences1.get(phrase1.charAt(i)) == null) {
                occurences1.put(phrase1.charAt(i), 1);
            } else {
                occurences1.replace(phrase1.charAt(i), occurences1.get(phrase1.charAt(i)) + 1);
            }

        }
        for (int i = 0; i < phrase2.length(); i++) {
            if (occurences2.get(phrase2.charAt(i)) == null) {
                occurences2.put(phrase2.charAt(i), 1);
            } else {
                occurences2.replace(phrase2.charAt(i), occurences2.get(phrase2.charAt(i)) + 1);
            }

        }

        return occurences1.equals(occurences2);

    }

    static void direBonjour(String nom){
        System.out.println("Bonjour "+nom);
    }


    static int sommeTableau(int[] tableauEntier){
        int somme=0;
        for(int i=0;i<tableauEntier.length;i++){
            somme +=tableauEntier[i];
        }
        return somme;
    }

    static char[] createChars(String str){
        char[] lettres=new char[str.length()];
        for(int i=0;i<str.length();i++){
            lettres[i]=str.charAt(i);
        }
        return lettres;
    }

    static  void displayChars(char[] tb){
        for(int i=0;i<tb.length;i++){
            System.out.println(tb[i]);
        }
    }


    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in);
        System.out.println("Nombre 1 : ");
        double nb1=clavier.nextInt();
        System.out.println("Nombre 2 : ");
        double nb2=clavier.nextInt();

//        nombre1=nb1
//        nombre2=nb2
        double somme=calculSomme(nb1,nb2);
        System.out.printf("%f + %f = %f\n",nb1,nb2,somme);
        direBonjour("Benjamin");


        String str="je suis dans la joie";
        String strCapitalized=capitalize(str);
        System.out.println(strCapitalized);


        String testAnagram="papa";
        String testAnagram2="aapp";
        System.out.println(isAnagrams(testAnagram,testAnagram2));

        int[] nombres={2,3,4,5,6,7,8,9};
        System.out.println("Sommes des elements : "+sommeTableau(nombres));


        //Retouner un array des str
        String maChaine="maman j'ai raté l'avion";
        char[] tableaChar=createChars(maChaine);
        displayChars(tableaChar);
    }
}








