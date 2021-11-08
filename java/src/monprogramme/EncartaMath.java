package monprogramme;

public class EncartaMath {
    static double addition(double nb1,double nb2){
        return nb1+nb2;
    }

    static double soutraction(double nb1,double nb2){
        return nb1-nb2;
    }

    static int[] point(String[] directions){
        int[] point=new int[2];
        point[0]=0;
        point[1]=0;
        for(int i=0;i<directions.length;i++){
            if(directions[i]=="gauche"){
                point[0] -=1;
            }
            if(directions[i]=="droite"){
                point[0] +=1;
            }

            if(directions[i]=="haut"){
                point[1] +=1;
            }
            if(directions[i]=="bas"){
                point[1] -=1;
            }
        }
        return point;
    }
}



