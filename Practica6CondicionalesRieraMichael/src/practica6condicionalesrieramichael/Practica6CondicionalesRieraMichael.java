/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6condicionalesrieramichael;

/**
 *
 * @author ESPE
 */
public class Practica6CondicionalesRieraMichael {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int hora=-5;
    if (hora>=0 && hora <=12){
        System.out.println("Buenos Dias");
    }else if (hora > 12 && hora <=18){
         System.out.println("Buenos Tardes");
    }else{
        System.out.println("Buenas noches");
    }
    }
    
}
