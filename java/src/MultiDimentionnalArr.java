import java.util.Scanner;

public class MultiDimentionnalArr {
    public static void main(String[] args) {
        int tabMulti[][]=new int[3][3];

        int matrice[][]={
                {1,2,3},//matrice[0][1] : 2
                {4,5,6},//matrice[1][2] : 6
                {7,8,9}//matrice[2][0] : 7
        };

        //Accès
        System.out.printf("matrice[0][1] : %d\n",matrice[0][1]);
        System.out.printf("matrice[1][2] : %d\n",matrice[1][2]);
        System.out.printf("matrice[2][0] : %d\n",matrice[2][0]);

//        Remplissage
        Scanner clavier=new Scanner(System.in);
        System.out.println("Remplissage");
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=clavier.nextInt();
            }
        }

        System.out.println("\n\n");

//        Affichage
        System.out.println("Affichage");
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j<matrice.length;j++){
                System.out.printf("matrice[%d][%d] : %d\n",i,j,matrice[i][j]);
            }
        }

    }
}
