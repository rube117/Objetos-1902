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
public class Aplicacion {
    
    public static void main(String[] args) {
        Cuadrado c=new Cuadrado();
        c.setLado(12);
        Triangulo t=new Triangulo();
        t.setBase(10);
        t.setAltura(42);
        t.setLado1(43.17f);
        t.setLado2(43.17f);
        Circulo cir=new Circulo();
        cir.setRadio(7);
        Hexagono h=new Hexagono();
        h.setLado(3.46f);
        h.setApotema(3);
        Figura figuras[]={c,t,cir,h};
        
        for(Figura f:figuras)
        {
            f.Nombre_Figura();
            f.Calcular_Area();
            f.Calcular_Perimetro();
            System.out.println("La figura es un: "+f.getNombre()+" el área es: "+f.getArea()+" y el perímetro es: "+f.getPerimetro());
        }
    }
}
