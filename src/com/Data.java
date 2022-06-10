/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import pc_class.*;
import static concrete_builders.SimplePeripheralBuilder.simplePeripheral;
import static concrete_builders.LaserPrinterBuilder.laserPrinter;

/**
 *
 * @author mahin
 */
public class Data {
//    private String nameProduct;
//    private String nameProducer;
//    private double price;
//    private int numberPorts = 0;
//    private String typePlug;
//    private TypePeripheral typeP = TypePeripheral.DEFAULT;
//    private TypePut typePut = TypePut.DEFAULT;
    public static Peripheral obj[] = new Peripheral[7];
    public static Peripheral[] arrayObj(){
        
        Peripheral keyboard_1,keyboard_2,mouse_1,laser_printer_1,monitor_1,tableta_grafica_1,touch_screen_1;
        keyboard_1 = simplePeripheral()
                .setTypePut(TypePut.INPUT)
                .setMinimumRequirements("Macally Teclado", "Mace Group Inc / Macally Peripherals", 44.99)
                .setNumberPorts(2).setTypePlug("USB")
                .setTypePeripheral(TypePeripheral.KEYBOARD).build();
        keyboard_2 = simplePeripheral()
                .setTypePut(TypePut.INPUT)
                .setMinimumRequirements("Redragon K552 Mechanical Gaming", "Redragon", 39.99)
                .setTypePlug("USB")
                .setTypePeripheral(TypePeripheral.KEYBOARD).build();
        mouse_1 = simplePeripheral()
                .setTypePut(TypePut.INPUT)
                .setMinimumRequirements("Razer DeathAdder Essential Gaming Mouse: 6400 DPI", "Razer", 18.49)
                .setTypePlug("USB")
                .setTypePeripheral(TypePeripheral.MOUSE).build();
        laser_printer_1 = mouse_1 = laserPrinter()
                .setTypePut(TypePut.OUTPUT)
                .setMinimumRequirements("Impresora multifunción HP LaserJet Pro", "HP", 196.03)
                .setTypePlug("USB")
                .setNumberPage(150)
                .setTypeToner("TONER NEGRO")
                .setTypePeripheral(TypePeripheral.LASERPRINTER).build();
        monitor_1 = simplePeripheral()
                .setTypePut(TypePut.OUTPUT)
                .setMinimumRequirements("Monitor gamer Samsung F24T35 led 24 ", "Samsung", 176.50)
                .setTypePlug("D-Sub, HDMI 1.4")
                .setTypePeripheral(TypePeripheral.MONITOR).build();
        tableta_grafica_1 = simplePeripheral()
                .setTypePut(TypePut.INPUT)
                .setMinimumRequirements("Tableta digitalizadora Gaomon S620", "Gaomon", 39.23)
                .setTypePlug("USB")
                .setTypePeripheral(TypePeripheral.TGRAFICA).build();
        touch_screen_1 = simplePeripheral()
                .setTypePut(TypePut.MIXPUT)
                .setMinimumRequirements("Monitor Lenovo ThinkVision P27h-20 led 27 ", "Lenovo", 39.23)
                .setNumberPorts(8)
                .setTypePlug("USB-C, HDMI 1.4, 2 DisplayPort 1.4, 5 USB 3.1, Ethernet")
                .setTypePeripheral(TypePeripheral.TGRAFICA).build();
        
        obj[0]=keyboard_1;
        obj[1]=keyboard_2;
        obj[2]=mouse_1;
        obj[3]=laser_printer_1;
        obj[4]=monitor_1;
        obj[5]=tableta_grafica_1;
        obj[6]=touch_screen_1;
        return obj;
    }
    public static void mostrarData(){
        arrayObj();
        for (Peripheral i : obj) {
            System.out.println(i.toString()); 
        }
    }
}
