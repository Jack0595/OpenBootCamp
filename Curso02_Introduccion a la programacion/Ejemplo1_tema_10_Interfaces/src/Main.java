public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        ejecutarAcelerar(coche);
        ejecutarFrenar(coche);

        ejecutarAcelerar(moto);
        ejecutarFrenar(moto);
    }

    public static void ejecutarAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
    }
    public static void ejecutarFrenar(Vehiculo vehiculo){
        vehiculo.Frenar(20);
    }
}

interface Vehiculo{
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Coche() -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Coche() -> Frenar()");
    }
}

class Moto implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){
        System.out.println("Moto() -> Acelerar()");
    }
    public void Frenar(int cuantaVelocidad){
        System.out.println("Moto() -> Frenar");
    }
}