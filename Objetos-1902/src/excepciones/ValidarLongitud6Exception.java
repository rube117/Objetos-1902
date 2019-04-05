/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Rubén
 */
public class ValidarLongitud6Exception extends Exception{
    public ValidarLongitud6Exception()
    {
        super("¡No se permiten menos de 6 caracteres!");
    }
}
