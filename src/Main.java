public class Main {
    public static void main(String[] args) {
      Cliente cliente1 = new Cliente();
      cliente1.setNombre("JuanCarlos");
      cliente1.setEdad("64");
      cliente1.setTelefono("2345345");
      cliente1.setCredito(20000);

      System.out.println(cliente1.getNombre());
      System.out.println(cliente1.getEdad());
      System.out.println(cliente1.getTelefono());
      System.out.println(cliente1.getCredito());

      Trabajador trabajador1 = new Trabajador();
      trabajador1.setNombre("Apolinario");
      trabajador1.setEdad("23");
      trabajador1.setTelefono("0303456");
      trabajador1.setSalario(23000);

      System.out.println(trabajador1.getNombre());
      System.out.println(trabajador1.getEdad());
      System.out.println(trabajador1.getTelefono());
      System.out.println(trabajador1.getSalario());
    }

}
class Persona {
    private String nombre;
    private String edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEdad() {
        return edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
