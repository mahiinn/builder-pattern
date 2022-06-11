/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Director;

import static com.Data.*;
import concrete_builders.PCBuilder;
import pc_class.PC;
import pc_class.Peripheral;
/**
 *
 * @author mahin
 */
public class Director {
    
    public PC pc;
    
    public String setCore(int core){
        
      pc = PCBuilder.unity().setProccesor(unity[core]).build();
       return unity[core].toString();
    }
    
    public String addOutPut(int core){
        
        pc.setOutput(obj[core]);
        return obj[core].toString();
    }
    
    public String addInPut(int core){
        
        pc.setInput(obj[core]);
        return obj[core].toString();
        
    }
    
    public void addSpecial(int core){
        pc.setInput(obj[core]);
    }
    public double calculatePrice(){
        double finalPrice=0;
        for (Peripheral i : pc.getInput()) {
            finalPrice+=i.getPrice();
        }
        for (Peripheral i : pc.getOutput()) {
            finalPrice+=i.getPrice();
        }
        if(pc.getSpecial()!=null){
            finalPrice+= pc.getCore().getPrice()+pc.getSpecial().getPrice();
            pc.setPrecio(finalPrice);
            return finalPrice;
        }else{
            finalPrice+= pc.getCore().getPrice();
            pc.setPrecio(finalPrice);
               return finalPrice;
        }
    }
}
