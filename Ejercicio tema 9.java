public class Persona {
    private int edad;
    private String nombre;
    private String telefono;
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

public class Cliente extends Persona {
    private double credito;
    
    public double getCredito() {
        return credito;
    }
    
    public void setCredito(double credito) {
        this.credito = credito;
    }
}

public class Trabajador extends Persona {
    private double salario;
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(30);
        cliente.setNombre("Juan");
        cliente.setTelefono("555-1234");
        cliente.setCredito(5000.0);
        
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());
        
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(35);
        trabajador.setNombre("Pedro");
        trabajador.setTelefono("555-5678");
        trabajador.setSalario(2500.0);
        
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
