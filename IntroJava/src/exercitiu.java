public class exercitiu {
    public static void main(String[] args) {
        int [] numere = {3, 2, 3, 5, 3, 3};
        int n = 0;
        for (int numar : numere){
            if ( numar == 3){
                n = n +1;
            }
        }
        System.out.println(n);
    }
}
