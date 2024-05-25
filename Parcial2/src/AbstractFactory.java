import Usuarios.CEO;
import Usuarios.Empleado;
import Usuarios.Usuario;

public interface AbstractFactory {
     Empleado crearEmpleado();
     CEO crearCEO();


}
