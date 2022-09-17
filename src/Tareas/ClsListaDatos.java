
package Tareas;

import java.util.*;


public class ClsListaDatos {
    //atribbutos
    Vector ClsListaDatos;

    //constructor
    public ClsListaDatos(){
        ClsListaDatos = new Vector();

    }

    //metodos
    public void añadirDatos(ClsDatos d){
        ClsListaDatos.add(d);
    }

    public void eliminarDatos(int i){
       ClsListaDatos.removeElement(i);
    }

    public void borraLista(){
        ClsListaDatos.removeAllElements();
    }

    void borrarTareas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
