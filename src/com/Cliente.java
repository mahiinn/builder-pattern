/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import Director.Director;
import static com.Data.*;
import java.util.*;
/**
 *
 * @author mahin
 */
public class Cliente {
    
    public static void main(String[] args) {
        Director direc = new Director();
        Scanner read = new Scanner (System.in);
        System.out.println("----------Perifericos disponibles----------");
        mostrarData();
        System.out.println("\n Escoja un procesador a llevar");
        int option = read.nextInt();
        
        switch (option) {
            case 0:
                System.out.println("El procesador a llevar es: \n" + direc.setCore(option));
                break;
            case 1: 
                System.out.println("El procesador a llevar es: \n" + direc.setCore(option));
                break;
            case 2:
                System.out.println("El procesador a llevar es: \n" + direc.setCore(option));
                break;
            case 3:
                System.out.println("El procesador a llevar es: \n" + direc.setCore(option));
                break;
            default:
                throw new AssertionError();
        }
        
        do{
            
            System.out.println("\n Escoja un periferico de salida");
            option = read.nextInt();
            
        }while(option!=3 && option!=4);
        
        switch (option) {
            case 3:
                System.out.println("El periferico a llevar es: \n" + direc.addOutPut(option));
                break;
            case 4:
                System.out.println("El procesador a llevar es: \n" + direc.addOutPut(option));
                break;
            default:
                throw new AssertionError();
        }
        
        do{
            
            System.out.println("\n Escoja un periferico de entrada");
            option = read.nextInt();
            
        }while(option==3 || option==4 || option==6 || option<0 || option>6);
        
        switch (option) {
            case 0:
                System.out.println("El periferico a llevar es: \n" + direc.addInPut(option));
                break;
            case 1:
                System.out.println("El procesador a llevar es: \n" + direc.addInPut(option));
                break;
            case 2:
                System.out.println("El procesador a llevar es: \n" + direc.addInPut(option));
                break;
            case 5:
                System.out.println("El procesador a llevar es: \n" + direc.addInPut(option));
                break;
            case 6:
                System.out.println("El procesador a llevar es: \n" + direc.addInPut(option));
                break;
            default:
                throw new AssertionError();
        }
        
        System.out.println("¿Desea agregar un periferico especial? 1.si 2.no");
        option = read.nextInt();
        
        if(option==1){
            
            System.out.println("Escoja un periferico especial");
            option = read.nextInt();
            
            while(option!=6){
                
                System.out.println("El periferico escogido no es especial, "
                        + "por favor revise las opcciones de más arriba y "
                        + "escoja el periferico especial de su agrado");
                
                option = read.nextInt();
                
            }
            
            direc.addSpecial(option);
            
            System.out.println("\nEl precio final del pc es: "+direc.calculatePrice());
            
        }else{
            
            System.out.println("\nEl precio final del pc es: "+direc.calculatePrice());
            
        }
    }
    
}
