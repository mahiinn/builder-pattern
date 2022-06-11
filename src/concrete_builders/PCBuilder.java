/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concrete_builders;

import builders.Build;
import pc_class.PC;

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

    @Override
    public PC build() {
        return this.newPc;
    }
}
