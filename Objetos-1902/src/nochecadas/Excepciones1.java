/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nochecadas;

import funciones.Funciones;

/**
 *
 * @author Rubén
 */
public class Excepciones1 {

    public static void main(String[] args) {
        Funciones f = new Funciones();
        int[] arreglito = {3, -2, 5};
        try {
            f.Imprimir(arreglito[2] + "");
            f.Imprimir(arreglito[3] + "");
            f.Imprimir("Yo me vere");
        } catch (Exception ex) {
            f.Imprimir("Ahora no me veras ni lo de abajo");
            f.Imprimir("Error: "+ex.getMessage());
            f.Imprimir("Fuera de rango.");
        }
    }
}
