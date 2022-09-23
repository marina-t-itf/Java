package oop;

public class ContBancar {
    //program files = definim logica unui cont bancar

    //desktop files = definim logica unui cont bancar

    //oop = object oriented programming
    //poo = programare orientata pe obiecte
    //o clasa = este un tip nou, este definitia unui concept EX: clasa Car
    //un obiect = instanta unei clase EX: obiect de tip Car

    //fields = proprietati = atribute = variabilele EX: culoare, marca, model, consum, pret, esteOprita

    //metode - actiuni ce pot fi facute de obiecte = functii  EX: accelereaza(), franeaza(), deschideUsa(), vopsire()

    // proprietatile, fielfs
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;


    // constructor = are rolul de a impune date de start
    //ca si * din formulare, required fields

    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
    //metode

    public void interogareSold(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("-----------------------------------------");

    }
    public void activareCont(int pinUtilizator){
        //modifica activ in true doar daca pinul este corect
        if (pinUtilizator == this.pin) {
            this.activ = true;
        }else{
            System.out.println("PIN gresit");
        }


    }
    public void alimentareCont(double suma_depusa) {
        // a ce aveam in cont se mai adauga suma depusa
        this.sold = this.sold + suma_depusa;
        System.out.println("Depunere  cu succes suma " + suma_depusa + " Aveti in cont suma de " + this.sold);

    }
    public void plataCard(double suma_cheltuita){
        System.out.println("Buna " + this.titularCont);
        if (suma_cheltuita <= this.sold) {
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai " + this.sold);
        }else{
            System.out.println("Fonduri insuficiente!");
        }
    }
}
