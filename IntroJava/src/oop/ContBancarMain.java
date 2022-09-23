package oop;

public class ContBancarMain {
    public static void main(String[] args) {
       // desktop
        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar

        ContBancar cont1 = new ContBancar("Andy S", "RO001");
        ContBancar cont2 = new ContBancar("Crina S", "RO002");

//        //apelam metoda descrie
//       cont1.descriere();
//       cont2.descriere();
       //activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);


        cont1.alimentareCont(300.50);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);
        cont1.interogareSold();
        cont2.interogareSold();

        cont1.plataCard(100);
        cont2.plataCard(600);



    }

}
