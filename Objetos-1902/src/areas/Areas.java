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
public abstract class Areas {

    private float area;
    private float perimetro;

    @Override
    public String toString() {
        return "Areas{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }

    //calcular area
    public void calcularArea() {

    }

    public void calcularPermietro() {

    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
}
