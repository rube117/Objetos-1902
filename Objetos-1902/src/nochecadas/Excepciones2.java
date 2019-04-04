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
public class Excepciones2 {

    public static void main(String[] args) {
        Funciones f = new Funciones();
        try {
            float x = 2.5f;
            float z = x / 0;
            f.Imprimir(""+z);
        } catch (ArithmeticException ex2) {
            f.Imprimir(ex2.getMessage());
            f.Imprimir("No está permitido el cociente con 0");
        }

    }
}
