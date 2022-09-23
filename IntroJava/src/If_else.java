import java.sql.SQLOutput;
import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
//        System.out.println("pornim radio");
//        boolean piesa_faina =false;
//
//        if (piesa_faina == true)
//        {
//            System.out.println("dau mai tare radioul");
//            System.out.println("incep sa fredonez piesa");
//        }
//
//        else
//
//        System.out.println("oprim radio");
//        int nr = 5;
//
//        if (nr%2 == 0) {
//            System.out.println("par");
//        }  else
//            {
//                System.out.println("impar");
//            }
//
////luam taste de la dastatura
//
        Scanner sc= new Scanner(System.in);
//        System.out.println("Introdu ora: ");
//
//        int ora = sc.nextInt();
//
//        if (ora < 0){
//            System.out.println("ora negativa");
//        }
//        else if (ora <= 11){
//            System.out.println("buna dimineata");
//        }
//        else if (ora <= 18){
//            System.out.println("buna ziua");
//        }
//        else if (ora <= 21){
//            System.out.println("buna seara");
//        }
//        else if (ora <= 24){
//            System.out.println("noapte buna");
//        }
//        else  {
//            System.out.println("ora invalida");
//        }
        // un switch se foloseste cand stim valorile posibile
        //include functia main
        System.out.println("alege optiunea: ");
        int optiunea = sc.nextInt();
        switch (optiunea){
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("RO");
                break;
            case 2:
                System.out.println("EN");
                break;
            default:
                System.out.println("optiune invalida");
        }

    }
}

