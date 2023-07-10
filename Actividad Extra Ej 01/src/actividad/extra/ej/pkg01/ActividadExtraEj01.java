package actividad.extra.ej.pkg01;

import Entidad.Vehiculo;
import Servicio.VehiculoServicio;

public class ActividadExtraEj01 {

    public static void main(String[] args) {
        VehiculoServicio vs = new VehiculoServicio();
        Vehiculo v = vs.crearVehiculo();
        
        System.out.println("calculo para moverse ");
        vs.moverse(v, vs.tiempo());
        
        System.out.println("Calculo de frenado");
        vs.frenar(v, vs.tiempo());
                
        
    }
    
}
