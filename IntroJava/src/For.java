public class For {
    public static void main(String[] args) {
        //for - loop = str repetitiva
        //problema: printam 101 dalmatieni
        for (int i = 0; i <= 101; i++) {
            System.out.println("Dalmatianul cu nr: " + i);
        }
        // ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 2, 5};
        for (int i = 0; i < numere.length; i++) {
            System.out.println("elementul cu index " + i + " si valoarea " + numere[i]);
        }
        // for each - parcurge toate elementele din array si ajunge direct la valoare:
        for (int numar : numere) {

            System.out.println("numarul este: " + numar);
        }
        // parcurgerem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println("Culoarea actuala este " + culoare);
        }
        // suma numerelor din array
        int s = 0;
        for (int numar : numere) {
            s = s + numar;
            System.out.println(s);
        }
        System.out.println("valoare finala = " + s);
    }
}
