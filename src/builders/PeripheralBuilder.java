/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builders;

import pc_class.*;


/**
 *
 * @author mahin
 */

public abstract class PeripheralBuilder implements FirstBuild<PeripheralBuilder>,Build<Peripheral>{
    public abstract PeripheralBuilder setNumberPorts(int number);
    public abstract PeripheralBuilder setTypePlug(String type);
    public abstract PeripheralBuilder setTypePeripheral(TypePeripheral type);
    public abstract PeripheralBuilder setTypePut(TypePut type);
    public abstract PeripheralBuilder setTypeCartridge(String type);
    public abstract PeripheralBuilder setTypeToner(String type);
    public abstract PeripheralBuilder setNumberPage(int number);
}
