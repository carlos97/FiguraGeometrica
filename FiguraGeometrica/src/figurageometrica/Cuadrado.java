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
public class Cuadrado extends FiguraGeometrica{
    int lado1;
    
    public Cuadrado(int lado1) {
        this.lado1 = lado1;
    }
    
    @Override
    int calcularPerimetro(){
        return lado1*4;
    }
    
    @Override
    int calcularArea() {
        return lado1*lado1;
    }
}
