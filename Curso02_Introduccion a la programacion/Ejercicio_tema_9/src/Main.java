public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Arturo");
        cliente.setEdad(26);
        cliente.setTelefono(222143567);
        cliente.setCredito("Aprovado");

        System.out.println("Informacion del cliente:");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Ramon");
        trabajador.setEdad(32);
        trabajador.setTelefono(555432983);
        trabajador.setSueldo(15000);

        System.out.println("Informacion del trabajador");
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getSueldo());

    }
}

class Persona{
    String nombre;
    int edad;
    double telefono;

    public Persona(){
        System.out.println("Soy el constructor de Persona");
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setTelefono(double telefono){
        this.telefono = telefono;
    }
    public double getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    String credito;

    public Cliente(){
        System.out.println("Soy el constructor de Cliente");
    }

    public void setCredito(String credito){
        this.credito = credito;
    }
    public String getCredito(){
        return this.credito;
    }
}

class Trabajador extends Persona{
    int sueldo;

    public Trabajador(){
        System.out.println("Soy el contructor de Trabajador");
    }

    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public int getSueldo(){
        return this.sueldo;
    }
}