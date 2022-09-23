public class functii {
    //functie = logica delimitata care poate fi refolosita
    // nu putem folosi spatii in nume
    // nu putem defini o functie in alta functie

    // o functie simpla care ne printeaza ceva pe ecran si nu returneaza nimic si nu are paramentri
    public static void printGreating() {
        System.out.println("Buna ziua! Bine ati venit!");
    }
    // o functie care saluta clientul in functie de numele lui
    // nu ne da niciun raspuns
    // are nevoie de parametrii
    public static void printGreatingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }
    // o functie care calculeaza media a 3 numere
    // ne da niciun raspuns - suma nr. va avea return
    // are nevoie de parametrii
    public static double mediaNr(double a, double b, double c) {
        double media = (a + b + c)/3;
        return media;
    }
    // o functie care ne da valoarea lui pi
    // ne da niciun raspuns
    // nu are nevoie de parametrii
    public static double piVal(){
        // constanta - variabia care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;

    }



    public static void main(String[] args) {
      // intra clientul 1
        printGreating(); // se apeleaza functia
        // intra clientul  2
        printGreating(); //CTRL + Clik pe f => ne duce la corpul f

        // apelam o functie cu parametrii oferind parametrii
        printGreatingByName("Sinpetrean", "Andy");
        printGreatingByName("Sinpetrean", "Crina");
        printGreatingByName("Sinpetrean", "Ares");

        System.out.println(mediaNr(3, 2, 5));
        double media1 = mediaNr(31213, 4567, 8970);
        double media2 = mediaNr(23, 67, 70);
        double media3 = mediaNr(33.23, 45.5, 89.7);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piVal());


    }
}
