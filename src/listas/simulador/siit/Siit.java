/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.simulador.siit;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shirokami 
 */
public class Siit { 

    /**
     * @param args the command line arguments
     */
    
    //Creamos las materias
    static Materia calD = new Materia("Cálculo diferencial","01",null,5);
    static Materia prog = new Materia("Fundamentos de programación","02",null,5);
    static Materia fInv = new Materia("Fundamentos de investigación","03",null,5);
    static Materia eti = new Materia("Ética","04",null,5);
    static Materia matD = new Materia("Matemáticas discretas","05",null,5);
    static Materia adm = new Materia("Administración","06",null,5);

    /*public static void main(String[] args){
        //Arreglo del nombre de los campos a imprimir de la lista
        String[] atributos_alumno = {"no_control","nombre"},atributos_materia={"nombre","clave"};
        
        //Creamos las materias
        Lista<Materia> todas_las_materias = new Lista();
        Lista<Alumno> todos_los_alumnos =new Lista();
        
        //las agregamos a la lista
        todas_las_materias.InsertarAlInicio(calD);
        todas_las_materias.InsertarAlInicio(prog);
        todas_las_materias.InsertarAlInicio(fInv);
        todas_las_materias.InsertarAlInicio(eti);
        todas_las_materias.InsertarAlInicio(matD);
        todas_las_materias.InsertarAlInicio(adm);
        
        //Creamos los alumnos
        Alumno a = new Alumno("****1247", "Shkm", "knd", "", 3, 0, 0);
        agregarMateriasDePrimerSemestre(a);
        Alumno b = new Alumno("****1302", "Pedro", "Ibrahim", "", 3, 0, 0);
        agregarMateriasDePrimerSemestre(b);
        
        //Agregamos los alumnos a la lista de alumnos general
        todos_los_alumnos.InsertarAlFinal(a);
        todos_los_alumnos.InsertarAlFinal(b);
        
        try {
            System.out.println("Lista de todos los alumnos en el sistema");
            todos_los_alumnos.imprimirLista(atributos_alumno);
            System.out.println("materias de alumno "+a.getNombre());
            a.getMaterias().imprimirLista(atributos_materia);
            System.out.println("materias de alumno "+b.getNombre());
            b.getMaterias().imprimirLista(atributos_materia);
            System.out.println("Lista de todas las materias en el sistema");
            todas_las_materias.imprimirLista(atributos_materia);
            
        //Excepciones
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Siit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }*/

    private static void agregarMateriasDePrimerSemestre(Alumno a) {
        //Al alumno se le agrega su materia
        a.agregarMateria(calD);
        a.agregarMateria(prog);
        a.agregarMateria(fInv);
        a.agregarMateria(eti);
        a.agregarMateria(matD);
        a.agregarMateria(adm);
        
        //a la lista de alumnos de la materia se le agrega el alumno
        calD.listaAlumnos.InsertarAlFinal(a);
        prog.listaAlumnos.InsertarAlFinal(a);
        fInv.listaAlumnos.InsertarAlFinal(a);
        eti.listaAlumnos.InsertarAlFinal(a);
        matD.listaAlumnos.InsertarAlFinal(a);
        adm.listaAlumnos.InsertarAlFinal(a);
    }
    
}
