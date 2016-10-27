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
            // TODO code application logic here
            
            //Creamos los alumnos
            Alumno a = new Alumno("****1247", "Shkm", "knd", "", 3, 0, 85);
            Alumno b = new Alumno("****1302", "Pedro", "Ibrahim", "", 3, 0, 85);
            
            //Lista de tipo Alumno
            Lista<Alumno> alumnos = new Lista();
            
            alumnos.crearOInsertar(a);
            alumnos.InsertarAlInicio(b);
            
            if(alumnos.existePoref("no_control", "15041247")){
                System.out.println("encontrado!");
            }else{
                System.out.println("no encontrado :v");
            }
            
            //Arreglo del nombre de los campos a imprimir de la lista
            String[] atributos_alumno = {"no_control","nombre"};
            
            alumnos.imprimirLista(atributos_alumno);
            
        //Excepciones
        } catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Siit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
