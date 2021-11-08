import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        var clavier=new Scanner(System.in);
        String monAdresseMail="christian@gmail.com";//0xeee
        String emailConnexion="christian@gmail.com";//0xeee
        System.out.println("Saisir une adresse email : ");
        String email3=clavier.nextLine();//0xaabc
        System.out.println(monAdresseMail==emailConnexion);//0xeee = 0xeee => true


//        Affiche avant d'ajouuter email3 dans le pool des littéraux
        System.out.println(email3==monAdresseMail);//0xaabc = 0xeee => false
        //email3.equals((monAdresseMail));//true

        //        Affiche avoir ajouté email3 dans le pool des littéraux
        email3= email3.intern();//0xeee
        System.out.println(email3==monAdresseMail);//0xeee = 0xeee => true

    }
}
