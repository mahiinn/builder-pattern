/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc_class;
/**
 *
 * @author mahin
 */
public class Peripheral {
    private String nameProduct;
    private String nameProducer;
    private double price;
    private int numberPorts = 0;
    private String typePlug;
    private TypePeripheral typeP = TypePeripheral.DEFAULT;
    private TypePut typePut = TypePut.DEFAULT;
    private String typeCartridge = "NOT APPLY"; //For inkjet printer
    private String typeToner = "NOT APPLY"; //For laser printer
    private int numberPage=0;//For laser printer

    public Peripheral(String nameProduct, String nameProducer, double price) {
        this.nameProduct = nameProduct;
        this.nameProducer = nameProducer;
        this.price = price;
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

    public int getNumberPorts() {
        return numberPorts;
    }

    public void setNumberPorts(int numberPorts) {
        this.numberPorts = numberPorts;
    }

    public String getTypePlug() {
        return typePlug;
    }

    public void setTypePlug(String typePlug) {
        this.typePlug = typePlug;
    }

    public TypePeripheral getTypeP() {
        return typeP;
    }

    public void setTypeP(TypePeripheral typeP) {
        this.typeP = typeP;
    }

    public TypePut getTypePut() {
        return typePut;
    }

    public void setTypePut(TypePut typePut) {
        this.typePut = typePut;
    }

    public String getTypeCartridge() {
        return typeCartridge;
    }

    public void setTypeCartridge(String typeCartridge) {
        this.typeCartridge = typeCartridge;
    }

    public String getTypeToner() {
        return typeToner;
    }

    public void setTypeToner(String typeToner) {
        this.typeToner = typeToner;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }
    
}
