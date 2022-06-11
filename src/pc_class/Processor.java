/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_class;

/**
 *
 * @author mahin
 */
public class Processor {
    
    private String nameProduct;
    private String nameProducer;
    private double price=0;
    
    public Processor() {
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProducer() {
        return nameProducer;
    }

    public void setNameProducer(String nameProducer) {
        this.nameProducer = nameProducer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nombre del procesador: " + nameProduct 
                + ",\n Nombre del fabricante: " + nameProducer 
                + ",\n Precio: " + price;
    }
       
}
