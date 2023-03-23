public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double numero1 = 3.1;
        double numero2 = 2.6;
        double numero3 = 7.1;
        double sumatoria = suma(numero1, numero2, numero3);
        System.out.println("La suma de los 3 numeros es :"+ sumatoria);

        Coche miCoche = new Coche();
        miCoche.puertas = 2;
        miCoche.aumentarPuertas();
        System.out.println("El num de puertas paso de :"+ (miCoche.puertas - 1) + " a: "+ miCoche.puertas);

    }
    static double suma(double num1, double num2, double num3){
        return (num1 + num2 + num3);
    }
}

class Coche {
    int puertas;

    public void aumentarPuertas(){
        puertas++;
    }
}