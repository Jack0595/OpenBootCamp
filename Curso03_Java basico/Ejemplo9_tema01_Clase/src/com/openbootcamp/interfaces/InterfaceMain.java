package com.openbootcamp.interfaces;
import com.openbootcamp.Coche;

public class InterfaceMain {
    public static void main(String[] args){
        CocheService service = new CocheServiceSportImpl();
        Coche coche = service.crearCocheDemo();

        CocheService service1 = new CocheServiceClassicImpl();
        Coche coche2 = service.crearCocheDemo();
    }
}
