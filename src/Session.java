public class Session {


    public Session() {
    }

    public void save(Object o) {

        String s="INSERT INTO TABLE "+ o.getClass().getName();
        System.out.println(" "+s);
    }

    public Object get(Class theClass, int id) {
      //  return "SELECT " + empleado.getNombre() + "," + empleado.getApellido() + "," + empleado.getSueldo() + " FROM Empleado WHERE id=" + empleado.getId();
        System.out.println( "SELECT * FROM " + theClass.getName() + " WHERE id="+ id);
        return null;
    }

    public String update(String sueldo) {
        //return "UPDATE Empleado SET sueldo=" + sueldo + " WHERE id= " + empleado.getId();
        return null;
    }

    public String delete() {
        //return "DELETE FROM Empleado WHERE id=" + empleado.getId();
        return null;
    }
}