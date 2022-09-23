import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        //map = o reprezentare de date in sistem cheie valoare
        // exemplu: gigel are nota 10, costel are nota 9
        Map<String,Integer> note_elevi = new HashMap<>();
        // adaugam elemente
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 7);
        note_elevi.put("Ana", 10);
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        // schimbam valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));

        System.out.println(note_elevi.size());
    }
}
