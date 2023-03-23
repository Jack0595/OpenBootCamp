public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadPromedio);

        Coche coche2 = new Coche(2, 90);
        System.out.println(coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadPromedio);
    }
}

class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadPromedio;

    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor *Sin Nada*");
    }
    public Coche(int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el contructor *Con Parametros*");
    }
}