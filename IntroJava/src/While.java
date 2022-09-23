public class While {
    public static void main(String[] args) {
        //while - loop = zona de cod care se repete atat timp cat o conditie este adevarata

        // problema: masina merge cat timp are benzina

        int litri_benzina = 10;
        while (litri_benzina > 0) {
            System.out.println("masina merge");
            litri_benzina = litri_benzina - 1;
            if (litri_benzina <= 3){
                System.out.println("atentie limita benzina");
            }
        }
        System.out.println("stop! nu mai avem benzina");
    }
}
