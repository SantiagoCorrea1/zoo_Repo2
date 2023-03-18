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
    VerificationMetodesAnimals verificationMetodesAnimals = new VerificationMetodesAnimals();
    
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
        showMessageDialog(null, "el animal fue agregado correctamente");
    }
    
     //método agregar animales domesticos
    public void addDomesticAnimals(DomesticAnimal a) {
        Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
        arraysControl.getAnimals().add(0, animalN);
        arraysControl.getDomesticAnimals().add(0, a);
        showMessageDialog(null, "el animal fue agregado correctamente");
    }
    
     //método agregar animales salvajes
    public void addSavageAnimals(SavageAnimal a){
        Animal animalN = new Animal(a.getCode(), a.getName(), a.getWeigth(), a.getType());
        arraysControl.getAnimals().add(0, animalN);
        arraysControl.getSavageAnimals().add(0, a);
        showMessageDialog(null, "el animal fue agregado correctamente");
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editMinorAnimals (String code, MinorAnimal a) {
        if (verificationMetodesAnimals.minorExists(code)) {
            MinorAnimal b = verificationMetodesAnimals.returnMinors(code);
            b.setName(a.getName());
            b.setUse(a.getUse());
            b.setVulgarName(a.getVulgarName());
            b.setWeigth(a.getWeigth());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    // al animal menor retornado le setea todo menos el código (el código no se puede cambiar)
    public void editDomesticAnimals (String code, DomesticAnimal a) {
        if (verificationMetodesAnimals.domesticExists(code)) {
            DomesticAnimal b = verificationMetodesAnimals.returnDomestic(code);           
            b.setName(a.getName());     
            b.setWeigth(a.getWeigth());
            b.setKindnessLevel(a.getKindnessLevel());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            System.out.println("hola");
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    
    // al animal salvaje retornado le setea los datos que se pueden cambiar, algunos no tiene sentido permitir cambios
    public void editSavage (String code, SavageAnimal a) {
        if (verificationMetodesAnimals.savageExists(code)) {
            SavageAnimal b = verificationMetodesAnimals.returnSavage(code);
            b.setName(a.getName());
            b.setWeigth(a.getWeigth());
            b.setDangerLevel(a.getDangerLevel());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    //elimina el animal del arreglo tipo y del arreglo general
    public void deleteAnimal(String code, String type) {  
        
            if (verificationMetodesAnimals.getPosition(code, type) != -1 && verificationMetodesAnimals.getPositionGeneral(code) != -1) {
                switch (type) {
                    case "menor":    
                        arraysControl.getMinorAnimals().remove(verificationMetodesAnimals.getPosition(code, type));
                        arraysControl.getAnimals().remove(verificationMetodesAnimals.getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                break;
                    case "domestico":
                        arraysControl.getDomesticAnimals().remove(verificationMetodesAnimals.getPosition(code, type));
                        arraysControl.getAnimals().remove(verificationMetodesAnimals.getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                break;
                    case "salvaje":
                        arraysControl.getSavageAnimals().remove(verificationMetodesAnimals.getPosition(code, type));
                        arraysControl.getAnimals().remove(verificationMetodesAnimals.getPositionGeneral(code));
                        showMessageDialog(null, "el animal fue eliminado correctamente de la base de datos");
                break;
                }
            } else{
                System.out.println("no se encontró la posición");
                        }
    }
}
