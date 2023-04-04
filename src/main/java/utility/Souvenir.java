/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

/**
 *
 * @author SANTIAGO
 */
public class Souvenir {
    private String code;
    private String description;
    private double price;
    private int amountInStock;

    public Souvenir(String code, String description, double price, int amountInStock) {
        this.code = code;
        this.amountInStock = amountInStock;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Souvenir{code=").append(code);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", amountInStock=").append(getAmountInStock());
        sb.append('}');
        return sb.toString();
    }

    
    public Souvenir() {
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the amountInStock
     */
    public int getAmountInStock() {
        return amountInStock;
    }

    /**
     * @param amountInStock the amountInStock to set
     */
    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }
    
    
}
