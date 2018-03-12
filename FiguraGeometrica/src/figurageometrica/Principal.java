/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        Triangulo triangulo = new Triangulo(scanner("lado1 triangulo:"), 
                                            scanner("lado2 triangulo:"), 
                                            scanner("lado3 triangulo:"),
                                            scanner("altura triangulo:"));
        
        Cuadrado cuadrado = new Cuadrado(scanner("lado cuadrado:"));
        
        Rectangulo rectangulo = new Rectangulo(scanner("lado1 rectangulo:"),
                                                scanner("lado2 rectangulo:"));
        System.out.println("\n \n");
        System.out.println(triangulo.calcularPerimetro());
        System.out.println(triangulo.calcularArea());
        System.out.println(cuadrado.calcularPerimetro());
        System.out.println(cuadrado.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println(rectangulo.calcularArea());
    }
    
    public static int scanner(String print){
        System.out.println(print);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }
    
}
