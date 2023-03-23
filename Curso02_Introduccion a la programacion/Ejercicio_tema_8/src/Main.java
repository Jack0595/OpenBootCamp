public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(21);
        persona.setNombre("Salomon");
        persona.setTelefono(228735785);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private double telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(double telefono){
        this.telefono = telefono;
    }
    public double getTelefono(){
        return this.telefono;
    }
}