/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;
import utility.Animal;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author SANTIAGO
 */
public class DptLogistic {
    
    ArraysControl arraysControl =  new ArraysControl();
    
    public ArraysControl getArraysControl() {
        return arraysControl;
    }

    public void setArraysControl(ArraysControl arraysControl) {
        this.arraysControl = arraysControl;
    }
    
     //método agregar animales menores
    public void addMinorAnimals (MinorAnimal a) {
        Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
        arraysControl.getAnimals().add(0, animalN);
        arraysControl.getMinorAnimals().add(0, a);
    }
    
     //método agregar animales domesticos
    public void addDomesticAnimals(DomesticAnimal a) {
        Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
        arraysControl.getAnimals().add(0, animalN);
        arraysControl.getDomesticAnimals().add(0, a);
    }
    
     //método agregar animales salvajes
    public void addSavageAnimals(SavageAnimal a){
        Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
        arraysControl.getAnimals().add(0, animalN);
        arraysControl.getSavageAnimals().add(0, a);
    }
    
    //método para verificar si existe el animal menor de ese código
    public boolean minorExists(String code){
        for (int i = 0; i <= arraysControl.getMinorAnimals().size(); i++) {
            if (arraysControl.getMinorAnimals().get(i).getCode().equals(code)) {
            return true;
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public MinorAnimal returnMinors(String code) {
        for (int i = 0; i <= arraysControl.getMinorAnimals().size(); i++) {
            if (arraysControl.getMinorAnimals().get(i).getCode().equals(code)) {
            return arraysControl.getMinorAnimals().get(i);
            }
        }
        return null;
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editMinorAnimals (String code, MinorAnimal a) {
        if (minorExists(code)) {
            MinorAnimal b = returnMinors(code);
            b.setName(a.getName());
            b.setUse(a.getUse());
            b.setVulgarName(a.getVulgarName());
            b.setWeigth(a.getWeigth());
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    //m´étd para saber si existe el animal dao un código
    public boolean domesticExists(String code){
        for (int i = 0; i <= arraysControl.getDomesticAnimals().size(); i++) {
            if (arraysControl.getDomesticAnimals().get(i).getCode().equals(code)) {
            return true;
            }
        }
        return false;
    }
    
    //si existe el animal domestico lo retorna
    public DomesticAnimal returnDomestic(String code) {
        for (int i = 0; i <= arraysControl.getDomesticAnimals().size(); i++) {
            if (arraysControl.getDomesticAnimals().get(i).getCode().equals(code)) {
            return arraysControl.getDomesticAnimals().get(i);
            }
        }
        return null;
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editDomesticAnimals (String code, DomesticAnimal a) {
        if (domesticExists(code)) {
            DomesticAnimal b = returnDomestic(code);           
            b.setName(a.getName());     
            b.setWeigth(a.getWeigth());
            b.setKindnessLevel(a.getKindnessLevel());
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
   
  
    //método para verificar si existe el animal menor de ese código
    public boolean savageExists(String code){
        for (int i = 0; i <= arraysControl.getSavageAnimals().size(); i++) {
            if (arraysControl.getSavageAnimals().get(i).getCode().equals(code)) {
            return true;
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public SavageAnimal returnSavage(String code) {
        for (int i = 0; i <= arraysControl.getSavageAnimals().size(); i++) {
            if (arraysControl.getSavageAnimals().get(i).getCode().equals(code)) {
            return arraysControl.getSavageAnimals().get(i);
            }
        }
        return null;
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editSavage (String code, SavageAnimal a) {
        if (minorExists(code)) {
            SavageAnimal b = returnSavage(code);
            b.setName(a.getName());
            b.setWeigth(a.getWeigth());
            b.setDangerLevel(a.getDangerLevel());
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
     public void reubicarAnimales() {  //cuando muere
        
    }
}
