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
public class ValidarMayor18Exception extends Exception{
    public ValidarMayor18Exception()
    {
        super("¡No se permiten menores de edad!");
    }
}
