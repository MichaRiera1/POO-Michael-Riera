/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
//OPERADORES 
/**
 *
 * @author Michael Riera
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a=8;
     int b=2;
     int suma= 5;
     a--;
     int resta, multiplicacion, division;
     suma +=b;
     resta=a-b;
     multiplicacion= a*b;
     division= a/b;
     
     System.out.println(++a);
     System.out.println("RESTA: "+resta);
     System.out.println("MULTIPLICACION: "+multiplicacion);
     System.out.println("DIVISION: "+division);
    }
    
}
