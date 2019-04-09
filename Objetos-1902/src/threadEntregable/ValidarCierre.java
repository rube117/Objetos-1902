/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadEntregable;

/**
 *
 * @author Rubén
 */
public class ValidarCierre {
    public static void ValidarNoNegativo(int x) throws CerrarVentanaException
    {
        if(x<0) throw new CerrarVentanaException();
    }
}
