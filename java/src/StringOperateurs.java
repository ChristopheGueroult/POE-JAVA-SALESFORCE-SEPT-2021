public class StringOperateurs {
    public static void main(String[] args) {
        String email="christian.lisangola@gmail.com";

//        Trouver char à partie de l'index
        char lettreC=email.charAt(0);
        for(int i=0;i<email.length();i++){
            System.out.println(email.charAt(i));
        }

        System.out.println("Trouver l'index");
        //        Trouver l'index  à partie du char
        System.out.println(email.indexOf("@"));

        //Accès à un char qui n'existe pas
        System.out.println(email.indexOf("z"));


//        Remplacer des char
        String exemple = "abracadabra" ;
        String avecDesEtoiles = exemple.replace('a', '*') ;
        System.out.println(avecDesEtoiles);

        String moi=email.substring(0,9);//[0,9[
        System.out.println(moi);
    }
}
