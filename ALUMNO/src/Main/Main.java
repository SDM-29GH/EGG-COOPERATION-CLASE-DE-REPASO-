package Main;

import Entidades.Alumno;
import Servicios.AlumnoServicios;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
       AlumnoServicios aServ = new AlumnoServicios();
       ArrayList<Alumno>lista = new ArrayList();
       aServ.crearListaAlumno();
       aServ.crearAlumno();
       aServ.buscarAlumno(lista);       
    }
    
}
