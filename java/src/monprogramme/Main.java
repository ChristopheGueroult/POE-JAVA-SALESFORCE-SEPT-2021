package monprogramme;

public class Main {
    public static void main(String[] args) {
        double a=45;
        double b=45;
        double somme=EncartaMath.addition(a,b);
        String[] directions={"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] point=EncartaMath.point(directions);
        System.out.printf("Point : [%d,%d]",point[0],point[1]);
    }
}
