/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas.simulador.siit;

import java.lang.reflect.Field;

/**
 *
 * @author shirokami
 * @param <Type>
 */
public class Lista<Type> {
    
    Type p = null;
    Type w = null;
    Type u = null;
    Type r = null;
    Type a = null;
    Type tmp = null;
    
    public Lista(){
        
    }
    
    public boolean crearOInsertar(Type nodo){
        if(p == null){
            p = nodo;
            u = nodo;
            return false;
        }else{
            return true;
        }
    };
    
    public boolean existePoref(String atributo, String ref) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(!estaVacia()){
            //Se saca el campo identificador de la clase de la lista
        Field f = p.getClass().getField(atributo);
        
        //bandera en falso (no se ha encontrado)
        boolean band = false;
        
        //asignamos p a r para iniciar el recorrido
	r = p;
        
        //recorremos la lista
	while(r!=null){
            
            //obtenemos el campo del objeto r y checamos si es el que estamos buscando
            if(f.get(r).equals(ref)){
                //encontramos el dato, cambiamos la bandera
                band = true;
                break;
            }
            //avanzamos en la lista
            r = (Type)((Nodo) r).liga_derecha;
        }
        return band;
        }else{
            return false;
        }
    };
    
    public boolean estaVacia(){
        return (p==null);
    }
    
    public void InsertarAlInicio(Type nodo){
	if( crearOInsertar(nodo) ){
            ((Nodo)nodo).liga_derecha = p;
            p = nodo;
        }
    };
    
    public void InsertarAlFinal(Type nodo){
        if(crearOInsertar(nodo)){
            ((Nodo)u).liga_derecha = nodo;
            u = nodo;
            ((Nodo)u).liga_derecha = null;
        }
    }
    
    public void InsertarAntesDeReferencia(Type nodo, String atributo, String ref) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(existePoref(atributo,ref)){
            Field f = p.getClass().getField(atributo);
            r = p;
            while(r!=null){
                if(f.get(r).equals(ref)){
                    if(r==p){
                        InsertarAlInicio(nodo);
                        break;
                    }else{
                        ((Nodo) nodo).liga_derecha = r;
                        ((Nodo)tmp).liga_derecha = nodo;
                        break;
                    }
                }
                tmp = r;
                r = (Type)((Nodo)r).liga_derecha;
            }
        }
    };
    
    public void InsertarDespuesDeReferencia(Type nodo, String atributo, String ref) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(existePoref(atributo,ref)){
            Field f = p.getClass().getField(atributo);
            r = p;
            while(r!=null){
                if(f.get(r).equals(ref)){
                    if(r==u){
                        InsertarAlFinal(nodo);
                        break;
                    }else{
                        ((Nodo)nodo).liga_derecha = ((Nodo)r).liga_derecha;
                        ((Nodo)r).liga_derecha = nodo;               
                        break;
                    }
                }
                r = (Type)((Nodo)r).liga_derecha;
            }
        }
    };
     
    public void EliminarPrimerNodo(){
        if(!estaVacia()){
            if(p == u){
                tmp = p;
                p = null;
                u = null;
                //destruir tmp
            }else{
                tmp = p;
                p = (Type) ((Nodo)p).liga_derecha;
                //destruir tmp
            }            
        }
    };
    
    public void EliminarUltimoNodo (){
        r = p;
        while(r != null){
            if(r==u){
                if (r == p){
                    tmp = r;
                    p = null;
                    u = null;
                    //destruir tmp
                }else{
                    tmp = r;
                    r = null;
                    ((Nodo)a).liga_derecha = null;
                    //destruir tmp
                }
            }
            a = r;
            r = (Type) ((Nodo)r).liga_derecha;
        }
    };
    
    public void EliminarPorReferencia(String atributo, String ref) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(existePoref(atributo, ref)){
            r = p;
            a = null;
            Field f = p.getClass().getField(atributo);
            while(r!=null){
                if(f.get(r).equals(ref)){
                    //Caso el nodo a eliminar es el primero
                    if( r == p ){
                        EliminarPrimerNodo();
                        break;
                    }
                    //Caso el nodo a eliminar es el ultimo
                    else if ( r == u ){
                        EliminarUltimoNodo();
                        break;
                    }
                    //Caso el nodo es intermedio y no es un unico nodo
                    else{
                       tmp = r;
                       ((Nodo)a).liga_derecha = ((Nodo)r).liga_derecha;
                       r = (Type)((Nodo)r).liga_derecha;
                       //destruir tmp
                       break;
                    }
                }else{
                    a = r;
                    r = (Type) ((Nodo)r).liga_derecha;
                }
            }
        }
    }
    
    public Type consultarReferencia(String atributo, String ref) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(!estaVacia()){
            //Se saca el campo identificador de la clase de la lista
            Field f = p.getClass().getField(atributo);

            //asignamos p a r para iniciar el recorrido
            Type e = null;
            r = p;

            //recorremos la lista
            while(r!=null){

                //obtenemos el campo del objeto r y checamos si es el que estamos buscando
                if(f.get(r).equals(ref)){
                    //encontramos el dato, cambiamos la bandera
                    e = r;
                }
                //avanzamos en la lista
                r = (Type)((Nodo) p).liga_derecha;
            }
            return e;
        }else{
            return null;
        }
    }
    
    public void imprimirLista(String atributos[]) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        if(!estaVacia()){
            r = p;
            while(r!=null){
                for(String atributo : atributos){
                    Field f = p.getClass().getField(atributo);
                    System.out.println(f.get(r));
                }
                r = (Type) ((Nodo)r).liga_derecha;
            }
        }
    };
    
    //void CambiarAtributo();
}
