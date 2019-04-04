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
public class Circulo extends Figura{
    private float radio;
    
    @Override
    public void Nombre_Figura() {
        setNombre("Círculo");
    }

    @Override
    public void Calcular_Area() {
        setArea(3.1416f*radio*radio);
    }

    @Override
    public void Calcular_Perimetro() {
        setPerimetro(2*3.1416f*radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
}
