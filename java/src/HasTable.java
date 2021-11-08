import java.util.HashMap;

public class HasTable {
    public static void main(String[] args) {
        HashMap<Integer,String> jourDeLaSemaine=new HashMap<>();
        jourDeLaSemaine.put(1,"Lundi");
        jourDeLaSemaine.put(2, "Mardi");
        jourDeLaSemaine.put(3, "Mercredi");
        jourDeLaSemaine.put(4, "Jeudi");
        jourDeLaSemaine.put(5, "Vendredi");
        jourDeLaSemaine.put(6, "Samedi");
        jourDeLaSemaine.put(7, "Dimanche");

        System.out.println(jourDeLaSemaine.get(2));

        HashMap<String,Integer> agesDeMesAmis=new HashMap<>();
        agesDeMesAmis.put("Christian",29);
        agesDeMesAmis.put("Sara",26);
        agesDeMesAmis.put("Ryad",27);

        System.out.println(agesDeMesAmis);
        System.out.println(agesDeMesAmis.get("Ryad"));
        agesDeMesAmis.replace("Christian",30);
        System.out.println(agesDeMesAmis);
        agesDeMesAmis.remove("Christian");
        System.out.println(agesDeMesAmis);
    }
}
