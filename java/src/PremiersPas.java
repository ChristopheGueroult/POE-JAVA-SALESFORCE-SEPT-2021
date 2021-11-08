class PremiersPas{
    public static void main(String[] args){
        int age;
        int nombreEnfants=4;
        age=29;
        age=89;
        age=45;
        double poids;
        poids=12.8;

        char genre='m';
        boolean isMarried=false;
        String nom="Christian Lisangola";

        final double PI=3.14;

        var prenom="Christian";

        //print et println
        System.out.println("Vous vous appellez "+nom+" , et vous avez "+age+" ans");
        System.out.print("Vous avez "+nombreEnfants+" enfants");

      //printf
        System.out.printf("Vous vous appellez %s , et vous avez %d ans\n",nom,age);
        System.out.printf("Vous avez %d enfants\n",nombreEnfants);
        System.out.printf("Pesez %f kg\n",poids);
    }
}