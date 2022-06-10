/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_class;

import java.util.ArrayList;

/**
 *
 * @author mahin
 */
public class PC {
    private Processor core;
    private ArrayList <Peripheral> input = new ArrayList<>();
    private ArrayList <Peripheral> output = new ArrayList<>();
    private Peripheral special;
    private Double precio;

    public Processor getCore() {
        return core;
    }

    public void setCore(Processor core) {
        this.core = core;
    }

    public ArrayList<Peripheral> getInput() {
        return input;
    }

    public void setInput(Peripheral input) {
        this.input.add(input);
    }

    public ArrayList<Peripheral> getOutput() {
        return output;
    }

    public void setOutput(Peripheral output) {
        this.output.add(output);
    }

    public Peripheral getSpecial() {
        return special;
    }

    public void setSpecial(Peripheral special) {
        this.special = special;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
    
    
}
