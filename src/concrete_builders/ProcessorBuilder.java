/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concrete_builders;

import builders.Build;
import builders.FirstBuild;
import pc_class.Processor;

/**
 *
 * @author mahin
 */
public class ProcessorBuilder implements Build<Processor>, FirstBuild<ProcessorBuilder> {

    Processor unity;

    private ProcessorBuilder() {
        this.unity = new Processor(
                this.unity.getNameProduct(),
                this.unity.getNameProducer(),
                this.unity.getPrice()
        );
    }

    public static ProcessorBuilder unity() {
        return new ProcessorBuilder();
    }

    @Override
    public Processor build() {
        return this.unity;
    }

    @Override
    public ProcessorBuilder setMinimumRequirements(String nameProduct, String nameProducer, double price) {
        this.unity.setNameProduct(nameProduct);
        this.unity.setNameProducer(nameProducer);
        this.unity.setPrice(price);
        return this;
    }

}
