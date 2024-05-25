import Usuarios.CEO;
import Usuarios.Empleado;

public class principalesFactory implements AbstractFactory{

    @Override
    public Empleado crearEmpleado() {
        return new Empleado();
    }

    @Override
    public CEO crearCEO() {
        return new CEO();
    }
}
