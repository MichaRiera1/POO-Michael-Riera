/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5randomrieramichael;

/**
 *
 * @author ESPE
 */
public class Practica5RandomRieraMichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println(Math.random());
        //Para hacerlo de 2 digitos    
        System.out.println(Math.random()*100);
        //para convertir en entero
        Sysyem.out.println((int)(Math.random()*100));
        //
        
        
        
        
        int a=0;
        a= (int)(Math. random()*100);
        boolean resultado =a >= 10&& a<=60;
        System.out.println(a);
        System.out.println(resultado);
    }
    
}
