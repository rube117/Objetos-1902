/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion3;

import excepciones.ValidarLongitud6;
import excepciones.ValidarLongitud6Exception;
import funciones.Funciones;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rubén
 */
public class ProbarExcepcion {

    public static void main(String[] args) {
        Funciones f = new Funciones();
        try {
            ValidarLongitud6.validarLongitud("12345");
            f.Imprimir("Caracteres Aceptados :)");
            Validaciones.validaEdad(18);
            f.Imprimir("Edad Aceptada");
        } catch (MenorDeEdadException | ValidarLongitud6Exception ex) {
            f.Imprimir("Error: "+ex.getMessage());
        }
    }
}
