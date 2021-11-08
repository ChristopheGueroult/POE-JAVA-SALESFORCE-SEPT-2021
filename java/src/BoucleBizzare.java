import java.util.ArrayList;
import java.util.Scanner;
class ArrayListLoops {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Combien de langage à entrez ?");
        int nbrLanguages = keyb.nextInt();
        ArrayList<String> programmingLanguages = new ArrayList<>();
        System.out.println("====");
//        keyb.nextLine();
        for (int i=0; i<nbrLanguages;i++){
            System.out.print("Enter a language: ");
//            programmingLanguages.add(keyb.next());
            programmingLanguages.add(keyb.nextLine());
        }

        System.out.println(programmingLanguages.toString());
    }
}
