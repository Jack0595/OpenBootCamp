package com.openbootcamp;

public class Main {
    public static void main(String[] args){
        Coche coche = new Coche("rojo", "toyota", "2020", 1200.7, 3.15);
        coche.acelerar(30);
        System.out.println(coche);

        CocheElectrico coche4 = new CocheElectrico();
        coche4.acelerar(50);
        System.out.println(coche4);

        CocheElectrico coche2 = new CocheElectrico("Motor de 240v");
        System.out.println(coche2);

        CocheElectrico coche5 = new CocheElectrico("azul", "ford","vento", 1356.5, 4.6, "27 watts");
        System.out.println(coche5);

        CocheHibrido coche3 = new CocheHibrido("motor de hidrogeno");
        System.out.println(coche3);
    }
}