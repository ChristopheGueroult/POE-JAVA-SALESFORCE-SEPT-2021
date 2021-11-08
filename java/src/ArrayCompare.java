public class ArrayCompare {
    public static void main(String[] args) {
        String[] noms={"Jean","Benjamin","Raphael","Jihanne","Zoro"};
        String[] noms2=noms;
        String[] noms3={"Jean","Benjamin","Raphael","Jihanne","Zoro"};

        System.out.println("Nom[0] : "+noms[0]);
        noms[0]="Christian";
        System.out.println("Nom2[0] : "+noms2[0]);
        noms2[1]="Bossard";
        System.out.println("Nom[1] : "+noms[1]);
        System.out.println("a=b : "+(noms==noms2));

        noms3[0]="Alain";
        System.out.println("\n\n");
        System.out.println("noms1[0] : "+noms[0]);
        System.out.println("noms2[0] : "+noms2[0]);
        System.out.println("noms3[0] : "+noms3[0]);
    }
}
