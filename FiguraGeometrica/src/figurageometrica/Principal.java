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
public class Principal {
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo(2, 2, 3,4);
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(2, 4);
        
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
        System.out.println(cuadrado.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println(rectangulo.calcularArea());
        
        
        
        
        
        
        
    }
}
