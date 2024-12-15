/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.raiz;

import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Raiz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double raiz;
        
        System.out.println("Favor ingresar un numero");
        raiz = Math.sqrt(entrada.nextDouble());
        
        System.out.println("La raiz cuadrada es; "+raiz);
    }
}
