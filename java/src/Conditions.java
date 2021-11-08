import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
      int age=22;
      boolean peutVoter=age>=18;
      if(peutVoter){
          System.out.println("Peut voter");
      }else{
          System.out.println("Ne peut pas voter");
      }
    }
}
