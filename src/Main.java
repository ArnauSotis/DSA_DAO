public class Main {


    public static void main(String[] args) {
        Empleado empleado = new Empleado("Un nom", "un cognom2", "22","jjj");
        Session tabla = Factory.createSession();

        tabla.save(empleado);

        Departamento d = new Departamento();

        tabla.save(d);

        Empleado e2 = (Empleado)tabla.get(Empleado.class, 4);



}
}