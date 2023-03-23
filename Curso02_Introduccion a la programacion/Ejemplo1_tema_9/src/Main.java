public class Main {
    public static void main(String[] args) {

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.velocidadMaxima = 14;
        cocheElectrico.matricula = "ABC 1234 GS";

        System.out.println(cocheElectrico.compruebaMatricula("XXXA"));
    }
}

class Vehiculo{
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula){
        if (matricula == "XXX"){
            return true;
        }
        return false;
    }
}

class Coche extends Vehiculo{

}
class CocheElectrico extends Coche{

}
