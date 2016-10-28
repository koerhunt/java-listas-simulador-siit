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
    public static void main(String[] args){
        
        try {
            //Creamos las materias
            Lista<Materias> todas= new Lista();
            Lista<Alumno> p=new Lista();
            Materias calD=new Materias("Cálculo diferencial","01",null,5);
            Materias prog=new Materias("Fundamentos de programación","02",null,5);
            Materias fInv=new Materias("Fundamentos de investigación","03",null,5);
            Materias eti=new Materias("Ética","04",null,5);
            Materias matD=new Materias("Matemáticas discretas","05",null,5);
            Materias adm=new Materias("Administración","06",null,5);

            todas.InsertarAlInicio(calD);
            todas.InsertarAlInicio(prog);
            todas.InsertarAlInicio(fInv);
            todas.InsertarAlInicio(eti);
            todas.InsertarAlInicio(matD);
            todas.InsertarAlInicio(adm);
            //Creamos los alumnos
            Alumno a = new Alumno("****1247", "Shkm", "knd", "", 3, 0, 0,todas);
            /*calD.getListaAlumnos().InsertarAlInicio(a);
            prog.listaAlumnos.InsertarAlInicio(a);
            fInv.listaAlumnos.InsertarAlInicio(a);
            eti.listaAlumnos.InsertarAlInicio(a);
            matD.listaAlumnos.InsertarAlInicio(a);
            adm.listaAlumnos.InsertarAlInicio(a);*/
            Alumno b = new Alumno("****1302", "Pedro", "Ibrahim", "", 3, 0, 0,todas);
            /*calD.listaAlumnos.InsertarAlInicio(b);
            prog.listaAlumnos.InsertarAlInicio(b);
            fInv.listaAlumnos.InsertarAlInicio(b);
            eti.listaAlumnos.InsertarAlInicio(b);
            matD.listaAlumnos.InsertarAlInicio(b);
            adm.listaAlumnos.InsertarAlInicio(b);*/
            
            //Lista de tipo Alumno
            
            Lista<Alumno> alumnos = new Lista();
            alumnos.InsertarAlInicio(a);
            alumnos.InsertarAlInicio(b);
            
            
            //Arreglo del nombre de los campos a imprimir de la lista
            String[] atributos_alumno = {"no_control","nombre"},atributos_materia={"nombre","clave"};
            
            alumnos.imprimirLista(atributos_alumno);
            b.getMaterias().imprimirLista(atributos_materia);
            
            //Lista de alumnos por materia
            //calD.listaAlumnos.imprimirLista(atributos_alumno);
            
        //Excepciones
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Siit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
