public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new Vehiculo();
        coche.setTipo("Couple");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);

        Vehiculo moto = new Vehiculo();
        moto.setTipo("Scotter");
        moto.setVelocidadMaxima(50);
        moto.setRapido(false);

        System.out.println(coche.getTipo());
        System.out.println(coche.getVelocidadMaxima());
        System.out.println(coche.isRapido());
        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());
    }
}

class Vehiculo{
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido(boolean rapido){
        this.rapido = rapido;
    }
    public  boolean isRapido(){
        return this.rapido;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public  String getTipo(){
        return this.tipo;
    }

}