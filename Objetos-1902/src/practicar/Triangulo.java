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
public class Triangulo extends Figura{
    private float base;
    private float altura;
    private float lado1;
    private float lado2;
    
    @Override
    public void Nombre_Figura() {
        setNombre("Triángulo");
    }

    @Override
    public void Calcular_Area() {
        setArea((base*altura)/2);
    }

    @Override
    public void Calcular_Perimetro() {
        setPerimetro(base+lado1+lado2);
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
