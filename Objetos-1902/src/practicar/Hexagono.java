/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicar;

/**
 *
 * @author Rubén
 */
public class Hexagono extends Figura{
    private float lado;
    private float apotema;
    
    @Override
    public void Nombre_Figura() {
        setNombre("Hexágono");
    }
    
    @Override
    public void Calcular_Perimetro() {
        setPerimetro(lado*6);
    }

    @Override
    public void Calcular_Area() {
        setArea((lado*6*apotema)/2);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getApotema() {
        return apotema;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
}
