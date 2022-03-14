public class Auto {
    int pocetkolies;
    int pocetdveri;
    public double kapacitaNadrze;
    public double stavNadrze;

    public void jazdi(double vzdialenost){
        stavNadrze = stavNadrze - vzdialenost * 0.2;
        if(stavNadrze < 0){
            stavNadrze = 0;

        }
    }
}
