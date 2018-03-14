public class Empleado {

    private String nombre;
    private String apellido;
    private String sueldo;
    private String id;

    public Empleado(String nombre, String apellido, String sueldo,String id){
        this.nombre=nombre;
        this.apellido=apellido;
        this.sueldo=sueldo;
        this.id=id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

}
