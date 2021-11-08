import java.util.Scanner;

public class LigneColonneDiff {
    public static void main(String[] args) {
//        Tab multi lignes != colonnes
        int tab3[][]={
                {3,4,5,7,89},
                {3,4,5},
                {3,4}
        };

        System.out.println("\n\n");
        System.out.println("Ligne et colonnes !=");
        for(int i=0;i<tab3.length;i++){
            for(int j=0;j<tab3[i].length;j++){
                System.out.printf("tab3[%d][%d] : %d\n",i,j,tab3[i][j]);
            }
        }
    }
}
