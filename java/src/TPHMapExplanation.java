import java.util.HashMap;

public class TPHMapExplanation {
    public static void main(String[] args) {
        /*
        *   {
        *       a:2,
        *       b:6,
        *       c:9
        *   }
        *
        * */
        String phrase="je suis dans une joie immence, parce que je suis développeur";
        HashMap<Character,Integer> occurences=new HashMap<>();

        for(int i=0;i<phrase.length();i++){
            char lettre=phrase.charAt(i);
//            occurences.putIfAbsent(letter,0);
//            occurences.replace(letter,occurences.get(letter)+1);
            if(occurences.get(lettre)==null){
                occurences.put(lettre,1);
            }else{
                occurences.replace(lettre,occurences.get(lettre)+1);
            }

        }
        System.out.println(occurences);
    }
}
