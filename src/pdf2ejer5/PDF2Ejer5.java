/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdf2ejer5;

/**
 *
 * @author Gonzalo
 */
public class PDF2Ejer5 {

    public static void main(String[] args) {
 // declaración de números complejos
        Complejo c1 = new Complejo(5, 2);
        Complejo c2 = new Complejo(2, 4);
        Complejo c3;
        // operadores aritméticos
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        c3 = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        c3 = c1.dividir(c2);
        System.out.println(c1 + " / " + c2 + " = " + c3);
        c3 = c1.multiplicar(c2);
        System.out.println(c1 + " * " + c2 + " = " + c3);
        c3 = c1.multiplicar(3.5);
        System.out.println(c1 + " * 3.5 = " + c3);
        if (c2.equals(c3)) {
            System.out.println(c2 + " igual que " + c3);
        } else {
            System.out.println(c2 + " distinto que " + c3);
        }   
    }
    
}
