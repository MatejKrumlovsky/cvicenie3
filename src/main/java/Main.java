public class Main {
    public static void main(String[] args){
        Auto bmw = new Auto();
        bmw.pocetdveri = 10;

        if(bmw.pocetdveri > 4){
            System.out.print("velke auto");
        }
        else{
            System.out.print("male auto");
        }
    }

}
