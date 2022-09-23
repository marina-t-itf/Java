public class Operatori {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        a = b; // suprascriere
        System.out.println(a != b);
        System.out.println(a == b);
        System.out.println(7>b && 8>b);
        System.out.println(7>b && 3>b);
        System.out.println(7>b || 8>b);
        System.out.println(!(7>b || 8>b));

    }
}
