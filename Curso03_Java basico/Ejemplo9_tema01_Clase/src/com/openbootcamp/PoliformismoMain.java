package com.openbootcamp;

public class PoliformismoMain {
    public static void main(String[] args){
        // sin poliformismo
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        // Con Poliformismo
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        //uso del comparador "instanceof" para determinar si un objeto pertenece a una determinada clase
        if(coche4 instanceof Coche){
            System.out.println("Coche");
        }
        if(coche4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }
        if(coche4 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }
    }
}
