/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concrete_builders;

import builders.Build;
import pc_class.*;

/**
 *
 * @author mahin
 */
public class PCBuilder implements Build<PC>{
    PC newPc;

    private PCBuilder() {
        this.newPc = new PC();
    }

    public static PCBuilder unity() {
        return new PCBuilder();
    }
    
    public PCBuilder setProccesor(Processor processor){
        this.newPc.setCore(processor);
        return this;
    }
    
    public PCBuilder addPeripheralInput(Peripheral input){
        this.newPc.setInput(input);
        return this;
    }
    
    public PCBuilder addPeripheralOutput(Peripheral output){
        this.newPc.setOutput(output);
        return this;
    }
    
    public PCBuilder setPeripheralSpecial(Peripheral special){
        this.newPc.setSpecial(special);
        return this;
    }
    
    public PCBuilder setPrice(Double price){
        this.newPc.setPrecio(price);
        return this;
    }
    
    @Override
    public PC build() {
        return this.newPc;
    }
}
