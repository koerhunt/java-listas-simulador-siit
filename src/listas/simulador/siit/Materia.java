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
public class Materia extends Nodo{
     
    public String nombre,clave;
    public int creditos;
    //public float promedio;
    
    public static final String [] ATRIBUTOS_MATERIA={"clave","nombre","creditos"};
    
    
    public Materia cadena;
    public Lista <Alumno> listaAlumnos;

    public Materia(String nombre, String clave, Materia cadena, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.cadena = cadena;
        this.creditos = creditos;
        listaAlumnos = new Lista();
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

    public Materia getCadena() {
        return cadena;
    }

    public void setCadena(Materia cadena) {
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
