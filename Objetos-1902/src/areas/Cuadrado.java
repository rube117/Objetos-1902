/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;

/**
 *
 * @author T-101
 */
public class Cuadrado extends Areas {

    private float lado;

    @Override
    public void calcularArea() {

        float area = lado * lado;
        setArea(area);
    }
    
    @Override
    public void calcularPermietro() {
        float perimetro=4*lado;
        setPerimetro(perimetro);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

}
