package uk.gov.tax.testleafnew.data.TestLeaf_TestData;

import java.io.Serializable;

public class Product implements Serializable {

    private String name;
    private int price;
    private String colour;
    private String[] sellername;
    public Product(String name, int price, String colour, String[] sellername) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.sellername = sellername;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("************************************");
        sb.append("\nname: ").append(name);
        sb.append("\nprice: ").append(price);
        sb.append("\ncolour: ").append(colour);
        sb.append("\nsellername: ").append(sellername);
        sb.append("\n************************************");
        return sb.toString();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String[] getSellername() {
        return sellername;
    }

    public void setSellername(String[] sellername) {
        this.sellername = sellername;
    }



}
