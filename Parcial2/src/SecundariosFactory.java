import Usuarios.CEO;
import Usuarios.Empleado;

public class SecundariosFactory implements AbstractFactory{



    public Empleado crearEmpleado() {
        return new Empleado();
    }


    public CEO crearCEO() {
        return new CEO();
    }
}
