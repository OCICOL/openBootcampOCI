public class Main {
    public static void main(String[] args) {
         Cliente cliente = new Cliente();
         cliente.edad = 55;
         cliente.nombre = "OCI";
         cliente.telefono = 507507507;
         cliente.setCredito("SI");
         System.out.println("El cliente " + cliente.nombre + " tiene " + cliente.edad +
                            " anos," + " su telefono es " + cliente.telefono + " y " + cliente.getCredito() +
                            " tiene credito");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 55;
        trabajador.nombre = "OCI";
        trabajador.telefono = 507507507;
        trabajador.setSalario(1500.50);
        System.out.println("El trabajador " + trabajador.nombre + " tiene " + trabajador.edad +
                " anos," + " su telefono es " + trabajador.telefono + " y tiene un salario de " + trabajador.getSalario());
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    private String credito;

    public void setCredito(String credito) {
        this.credito = credito;
    }
    public String getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public Double getSalario() {
        return this.salario;
    }
}
