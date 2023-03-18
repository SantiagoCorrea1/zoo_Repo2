/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import utility.Animal;
import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;

/**
 *
 * @author SANTIAGO
 */
public class VerificationMetodesAnimals {
    
    //instancia de la clase arreglos
    ArraysControl arraysControl = new ArraysControl();
    
    
    //verificación existe en animal menor
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
    
    //métdo para saber si existe el animal dado un código
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
    
    //verificaión existe animal base
    public boolean animalExits(String code){
        for (int i = 0; i <= arraysControl.getAnimals().size(); i++) {
            if (arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Animal returnAnimal(String code) {
        for (int i = 0; i <= arraysControl.getAnimals().size(); i++) {
            if (arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return arraysControl.getAnimals().get(i);
            }
        }
        return null;
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
    
    //retorna la posición de un animal en su arreglo de tipo
    public int getPosition (String code, String type){
        switch(type) {
            case "menor": 
                for (int i = 0; i <= arraysControl.getMinorAnimals().size(); i++) {
                    if (minorExists(code) && arraysControl.getMinorAnimals().get(i).getCode().equals(code)) {
                        return arraysControl.getMinorAnimals().indexOf(returnMinors(code));
                    }
                }
            break;
            case "domestico":
                for (int i = 0; i <= arraysControl.getDomesticAnimals().size(); i++) {
                    if (domesticExists(code) && arraysControl.getDomesticAnimals().get(i).getCode().equals(code)) {
                        return arraysControl.getDomesticAnimals().indexOf(returnDomestic(code));
                    } 
                }
            break;
            case "salvaje":
                for (int i = 0; i <= arraysControl.getSavageAnimals().size(); i++) {
                    if (savageExists(code) && arraysControl.getSavageAnimals().get(i).getCode().equals(code)) {
                        return arraysControl.getSavageAnimals().indexOf(returnSavage(code));
                    } 
                }
            break;
            }
            return -1;
        }
    
    //retorna la posición de un animal en el arreglo general
    public int getPositionGeneral (String code) {
        for (int i = 0; i <= arraysControl.getAnimals().size(); i++) {
            if (animalExits(code) && arraysControl.getAnimals().get(i).getCode().equals(code)) {
                return arraysControl.getAnimals().indexOf(returnAnimal(code)) ;
                }
        }
        return -1;
    }
    
}
