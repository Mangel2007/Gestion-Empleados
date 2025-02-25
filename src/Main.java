import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String id;
    private String nombre;
    private String puesto;
    private String correo;
    private String telefono;
    private String fechaContratacion;

    public Empleado(String id, String nombre, String puesto, String correo, String telefono, String fechaContratacion) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID='" + id + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Puesto='" + puesto + '\'' +
                ", Correo='" + correo + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", Fecha de Contratación='" + fechaContratacion + '\'' +
                '}';
    }
}

class GestionEmpleados {
    private List<Empleado> empleados;

    public GestionEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void listarEmpleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestion = new GestionEmpleados();

        Empleado empleado1 = new Empleado("12345", "Sofía Pérez", "Gerente de RRHH", "sofia@empresa.com", "123-456-7890", "2023-01-15");
        Empleado empleado2 = new Empleado("67890", "Carlos Gómez", "Desarrollador", "carlos@empresa.com", "098-765-4321", "2022-05-10");

        gestion.agregarEmpleado(empleado1);
        gestion.agregarEmpleado(empleado2);

        System.out.println("Lista de empleados:");
        gestion.listarEmpleados();
    }
}
