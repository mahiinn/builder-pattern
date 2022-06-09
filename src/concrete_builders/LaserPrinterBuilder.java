/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concrete_builders;

import builders.*;
import pc_class.Peripheral;
import pc_class.TypePeripheral;
import pc_class.TypePut;

/**
 *
 * @author mahin
 */
public class LaserPrinterBuilder extends PeripheralBuilder {
    
    private Peripheral peripheral;
    
    private LaserPrinterBuilder(){
        this.peripheral = new Peripheral(
                this.peripheral.getNameProduct(),
                this.peripheral.getNameProducer(),
                this.peripheral.getPrice()
        );
    }
    public static LaserPrinterBuilder laserPrinter(){
        return new LaserPrinterBuilder();
    }
   @Override
    public PeripheralBuilder setTypePlug(String type) {
        this.peripheral.setTypePlug(type);
        return this;
    }

    @Override
    public PeripheralBuilder setTypePeripheral(TypePeripheral type) {
        this.peripheral.setTypeP(type);
        return this;
    }

    @Override
    public PeripheralBuilder setTypePut(TypePut type) {
        this.peripheral.setTypePut(type);
        return this;
    }

    @Override
    public PeripheralBuilder setTypeCartridge(String type) {
        this.peripheral.setTypeCartridge(type);
        return this;
    }

    @Override
    public PeripheralBuilder setTypeToner(String type) {
        this.peripheral.setTypeToner(type);
        return this;
    }

    @Override
    public PeripheralBuilder setNumberPage(int number) {
        this.peripheral.setNumberPage(number);
        return this;
    }

    @Override
    public PeripheralBuilder setMinimumRequirements(String nameProduct, String nameProducer, double price) {
        this.peripheral.setNameProduct(nameProduct);
        this.peripheral.setNameProducer(nameProducer);
        this.peripheral.setPrice(price);
        return this;
    }
    @Override
    public PeripheralBuilder setNumberPorts(int number) {
        this.peripheral.setNumberPorts(number);
        return this;
    }
    @Override
    public Peripheral build() {
        return this.peripheral;
    }
    
}
