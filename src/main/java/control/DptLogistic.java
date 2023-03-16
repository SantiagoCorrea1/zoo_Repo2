/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.ArraysControl;
import utility.Animal;
import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;
import java.util.ArrayList;


/**
 *
 * @author SANTIAGO
 */
public class DptLogistic {
    
    ArraysControl arraysControl =  new ArraysControl();
    
    public void addMinorAnimals (MinorAnimal animal) {
        MinorAnimal minorAnimal =  new MinorAnimal(animal.getVulgarName(), animal.getHabitat(), animal.getUse(),
                animal.getCode(), animal.getName(), animal.getWeigth(), animal.getType());
        arraysControl.addMinor(minorAnimal);
    }
    
    public void addDomesticAnimals(DomesticAnimal a) {
        DomesticAnimal domesticAnimal = new DomesticAnimal(a.getSpecie(), a.getKindnessLevel(), a.getCode(), a.getName(),
                a.getWeigth(), a.getType());
        arraysControl.addDomestic(a);
    }
    
    public void addSavageAnimals(SavageAnimal a){
        SavageAnimal savageAnimal =  new SavageAnimal(a.getDangerLevel(), a.getHabitat(), a.getSpecies(), a.getCode(),
                a.getName(), a.getWeigth(), a.getType());
        arraysControl.addSavage(a);
    }
    
    public void modificarAnimales () {
   
    }
    
    
    public void reubicarAnimales() {  //cuando muere
    
    }
  
}
