package algorithms;

import java.util.HashMap;
import java.util.Map;

public class HashMapCountLetters {
    public static void main(String[] args) {
        HashMap<String,Integer> occurences=new HashMap<>();
        String str="je suis dans une joie immence";
        String strNoDoubles="";
        String tb[]=str.split("");
        for(int i=0;i<tb.length;i++){
            if(occurences.get(tb[i])==null){
                occurences.put(tb[i],1);
                strNoDoubles +=tb[i];
            }else{
                occurences.put(tb[i],occurences.get(tb[i])+1);
            }
        }
        System.out.println("Occurences : "+occurences);
        System.out.println("Texte initial : "+str);
        System.out.println("Texte sans doublons : "+strNoDoubles);
    }
}
