public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();
        System.out.println(coche.sumaNumeros(2,3));
        System.out.println(coche.sumaNumeros((float)4.1, (float)2.2));
        coche.sumaNumeros(3.2, 2.1);
    }
}

class Vehiculo{
    public void diHola(){
        System.out.println("Hola!!");
    }
}

class Coche extends Vehiculo{
    public void diHola(){
        System.out.println("Soy un coche");
    }
    public int sumaNumeros(int a, int b){
        System.out.println("Soy el sumaNumero de Int");
        return a+b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Soy el sumaNumero de Float");
        return a + b * (float)9.0;
    }
    public void sumaNumeros(double param1, double param2){
        System.out.println("Soy el sumaNumero de Double");
        System.out.println("El resultado es: " + (param1 + param2));
    }

}