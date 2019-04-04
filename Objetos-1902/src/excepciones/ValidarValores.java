/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ValidarValores {

    public static void ValidarNoNegativo(byte valor) throws ValorNegativoException {
        if (valor < 0)throw new ValorNegativoException();
    }

}
