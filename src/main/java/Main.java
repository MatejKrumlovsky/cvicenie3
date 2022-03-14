public class Main {
    public static void main(String[] args) {
        /*
        Auto bmw = new Auto();
        bmw.stavNadrze = 100;
        bmw.jazdi(300);
        System.out.print(bmw.stavNadrze);
         */
        int vek = ZKlavesnice.readInt("Zadaj vek ");
        System.out.println("vek z klavesnice " + vek);
        System.out.println("-----------------------------------");

        vek = KeyboardInput.readInt("Zadaj vek", 2);
        System.out.println("vek keyboardinput: "+vek);
    }

}
