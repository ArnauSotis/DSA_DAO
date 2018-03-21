import java.lang.reflect.Field;

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

    public String update(Object theObject, int i) {
        StringBuffer consulta = new StringBuffer();
        consulta.append("UPDATE "+ theObject.getClass().getName()+ " SET ");
        for(Field field : theObject.getClass().getDeclaredFields())
        {
            consulta.append(theObject.getClass().getName());
            consulta.append(" = ");
            consulta.append("?");
            consulta.append(",");



        }
        consulta.setLength(consulta.length()-2);
        consulta.append(" WHERE id=" + i);
        consulta.append(",");
        return null;
    }

    public String delete(Class theClass, int id) {
        System.out.println("DELETE FROM "+theClass.getName()+" WHERE ID="+id);

        return null;
    }
}