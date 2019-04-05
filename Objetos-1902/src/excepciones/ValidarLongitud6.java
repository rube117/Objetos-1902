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
public class ValidarLongitud6 {
    public static void validarLongitud(String caracteres) throws ValidarLongitud6Exception
    {
        if(caracteres.length()<6) throw new ValidarLongitud6Exception();
        /*
        byte[] b.getBytes();
        if(b.length<6)throw new ValidarLongitud6Exception();
        */
    }
}
