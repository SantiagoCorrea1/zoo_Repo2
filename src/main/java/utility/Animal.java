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
public class Animal {
    private int code;
    private String name;
    private float weigth;

    public Animal() {
    }

    public Animal(int code, String name, float weigth) {
        this.code = code;
        this.name = name;
        this.weigth = weigth;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the weigth
     */
    public float getWeigth() {
        return weigth;
    }

    /**
     * @param weigth the weigth to set
     */
    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal{code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", weigth=").append(weigth);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
