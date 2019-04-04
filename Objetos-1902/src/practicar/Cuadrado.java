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
public class Cuadrado extends Figura{
    private float lado;

    @Override
    public void Nombre_Figura() {
        setNombre("Cuadrado");
    }

    @Override
    public void Calcular_Area() {
        setArea(lado*lado);
    }

    @Override
    public void Calcular_Perimetro() {
        setPerimetro(lado*4);
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
