package corrections_tps;

class Patient{
    private double masse;
    private double hauteur;

    public void init(double masse, double hauteur){
        if (masse > 0 && hauteur > 0 ){
            this.masse = masse;
            this.hauteur = hauteur;
        }
        else{
            this.masse = 0;
            this.hauteur = 0;
        }
    }

    public void afficher(){
        System.out.printf("Patient : %.1f kg pour %.1f m\n", masse, hauteur);
    }

    public double poids(){
        return masse;
    }

    public double taille(){
        return hauteur;
    }

    public double imc(){
        if (hauteur > 0){
            return masse / (hauteur * hauteur);
        }
        else{
            return 0;
        }
    }
}



class Imc {
    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.init(74.5, 1.75);
        patient.afficher();
        System.out.println("IMC : " + patient.imc());
        patient.init( -2.0, 4.5);
        patient.afficher();
    }
}