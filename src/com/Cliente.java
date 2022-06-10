/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import static com.Data.*;
import java.util.*;
/**
 *
 * @author mahin
 */
public class Cliente {
    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("----------Perifericos disponibles----------");
        mostrarData();
        System.out.println("\n Escoja un procesador a llevar");
        int option = read.nextInt();
        switch (option) {
            case 0:
                
                break;
            case 1: 
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
