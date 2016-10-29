/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas.simulador.siit;


public class Alumno extends Nodo{
    
    public String no_control;
    public String nombre;
    public String apellido_mat;
    public String apellido_pat;
    
    public int creditos;
    public int semestre;
    public float promedio_acumulado;
    public Lista <Materia> materias;

    public Alumno(String no_control, String nombre, String apellido_mat, String apellido_pat, int creditos, int semestre, float promedio_acumulado) {
        this.no_control = no_control;
        this.nombre = nombre;
        this.apellido_mat = apellido_mat;
        this.apellido_pat = apellido_pat;
        this.creditos = creditos;
        this.semestre = semestre;
        this.promedio_acumulado = promedio_acumulado;
        this.materias= new Lista();
    }

    public String getNo_control() {
        return no_control;
    }

    public void setNo_control(String no_control) {
        this.no_control = no_control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_mat() {
        return apellido_mat;
    }

    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }

    public String getApellido_pat() {
        return apellido_pat;
    }

    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public float getPromedio_acumulado() {
        return promedio_acumulado;
    }

    public void setPromedio_acumulado(float promedio_acumulado) {
        this.promedio_acumulado = promedio_acumulado;
    }

    public Lista<Materia> getMaterias() {
        return materias;
    }

    public void agregarMateria(Materia m) {
        this.materias.InsertarAlFinal(m);
    }
    
    
    
}
