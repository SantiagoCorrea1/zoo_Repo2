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
public class DomesticAnimal extends Animal {
    private String specie;
    private int kindnessLevel;

    public DomesticAnimal() {
    }

    public DomesticAnimal(String specie, int kindnessLevel) {
        this.specie = specie;
        this.kindnessLevel = kindnessLevel;
    }

    public DomesticAnimal(String specie, int kindnessLevel, int code, String name, float weigth, String type) {
        super(code, name, weigth, type);
        this.specie = specie;
        this.kindnessLevel = kindnessLevel;
    }

   

    /**
     * @return the specie
     */
    public String getSpecie() {
        return specie;
    }

    /**
     * @param specie the specie to set
     */
    public void setSpecie(String specie) {
        this.specie = specie;
    }

    /**
     * @return the kindnessLevel
     */
    public int getKindnessLevel() {
        return kindnessLevel;
    }

    /**
     * @param kindnessLevel the kindnessLevel to set
     */
    public void setKindnessLevel(int kindnessLevel) {
        this.kindnessLevel = kindnessLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DomesticAnimal{specie=").append(specie);
        sb.append(", kindnessLevel=").append(kindnessLevel);
        sb.append('}');
        return sb.toString();
    }
    
    
}
