/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.simulador.siit;

/**
 *
 * @author Rodarte Fernández
 */
public class Materias extends Nodo{
     
    public String nombre,clave,cadena[];
    public Lista <Alumno> listaAlumnos;
    public int creditos;
    //public float promedio;

    public Materias(String nombre, String clave, String cadena[], int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.cadena = cadena;
        this.creditos = creditos;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String[] getCadena() {
        return cadena;
    }

    public void setCadena(String cadena[]) {
        this.cadena = cadena;
    }

    public Lista<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(Lista<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /*public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }*/
    
    
    
}
