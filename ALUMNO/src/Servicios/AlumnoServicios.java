package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoServicios {
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public void crearListaAlumno(){
        ArrayList<Alumno> listaAlum = new ArrayList();
        int opc;
        
        do {
            System.out.println("MENU");
            System.out.println("Ingrese la opción correcta");
            System.out.println("1-Agregar nuevo Alumno");
            System.out.println("2-Salir");
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    listaAlum.add(crearAlumno());
                    break;
                case 2:
                    System.out.println("Hasta luego.");
                default:
                    System.out.println("Ingrese opción correcta:");
            }
            
        } while (opc != 2);
        
    }
    
    public Alumno crearAlumno(){
        Alumno al = new Alumno();
        
        System.out.println("Ingrese el nombre del Alumno: ");
        al.setNombre(leer.next());
        System.out.println("Ingrese la primera nota: ");
        al.getListaNotas().add(leer.nextInt());
        System.out.println("Ingrese la segunda nota: ");
        al.getListaNotas().add(leer.nextInt());
        System.out.println("Ingrese la tercera nota: ");
        al.getListaNotas().add(leer.nextInt());

        return al;
    }
    
    public void buscarAlumno(ArrayList<Alumno>listaAlumnos){
        System.out.println("Ingrese el nombre del alumno buscado: ");
        String alumnoBuscar = leer.next();
        
        for (Alumno alumnito : listaAlumnos) {
            //busca si el nombre ingresado conside con el de lista
            if (alumnito.getNombre().equals(alumnoBuscar)) {
               notaFinal(alumnito); 
            }    
        }
    }
    
    public double notaFinal(Alumno al){
        int suma = 0;
        for (Integer nota : al.getListaNotas()) {
            suma = suma + nota;
        }
        
        return (suma / (al.getListaNotas().size()));
    }
}
