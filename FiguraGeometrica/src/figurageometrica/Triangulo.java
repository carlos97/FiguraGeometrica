/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Estudiantes
 */
public class Triangulo extends FiguraGeometrica{
    
    int lado1;
    int lado2;
    int lado3;
    int altura;

    public Triangulo(int lado1, int lado2, int lado3,int altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.altura = altura;
    }
    
    @Override
    int calcularPerimetro(){
        return lado1+lado2+lado3;
    }
    
    @Override
    int calcularArea() {
        return (lado1*altura)/2;
    }
}
