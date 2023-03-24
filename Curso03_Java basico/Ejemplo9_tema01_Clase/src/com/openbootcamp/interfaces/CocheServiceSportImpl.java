package com.openbootcamp.interfaces;

import com.openbootcamp.Coche;
import com.openbootcamp.CocheElectrico;

public class CocheServiceSportImpl implements CocheService{
    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche de carreras");
        return new CocheElectrico();
    }

    @Override
    public void CochedestruirCoche(Coche coche) {
        System.out.println("Destruyendo coche");
    }
}
