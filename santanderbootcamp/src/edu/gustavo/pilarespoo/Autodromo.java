package edu.gustavo.pilarespoo;

public class Autodromo {
    public static void main(String[] args) {

        // abstracao
        Carro jeep = new Carro();
        jeep.ligar();
        jeep.setChassi("12123");


        //polimorfismo
        Moto z400 = new Moto();
        z400.setChassi("72927");
        z400.ligar();
    }

}
