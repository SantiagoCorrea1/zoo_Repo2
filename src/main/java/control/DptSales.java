/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static javax.swing.JOptionPane.showMessageDialog;
import utility.Ticket;
import utility.Accounting;
import utility.Souvenir;
/**
 *
 * @author SANTIAGO
 */
public class DptSales {
    private Accounting accounting = new Accounting();
    private ArraysControl arraysControl = new ArraysControl();
    
    //verifica si existe el ticket
    public boolean ticketExits (String code){
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }    
        return false;
    }
    
    //si existe el tiquete menor lo retorna
    public Ticket returnTicket (String code) {
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return getArraysControl().getTickets().get(i);
                }
            }
        }
        return null;
    }
    
    //retorna la posicion del tikect
    public int getPositionTickets (String code) {
        if (arraysControl.getTickets().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (ticketExits(code) && getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return getArraysControl().getTickets().indexOf(returnTicket(code)) ;
                }
            }
        }
        return -1;
    }
    
    public boolean souvenirExits (String code){
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Souvenir returnSouvenir (String code) {
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return getArraysControl().getSouvenirs().get(i);
                }
            }
        }
        return null;
    }
    
    public int getPositionSouvenir (String code) {
        if (arraysControl.getSouvenirs().isEmpty() == false) {
            for (int i = 0; i < getArraysControl().getSouvenirs().size(); i++) {
                if (ticketExits(code) && getArraysControl().getSouvenirs().get(i).getCode().equals(code)) {
                    return getArraysControl().getSouvenirs().indexOf(returnSouvenir(code)) ;
                    }
            }
        }
        return -1;
    }
    
    public void newPlan() {
        
    }
    
    public void editPlan() {
    
    }
    
    public void cancelPlan() {
    
    }
    
    public void sellPlan() {
    
    }
    
    public void newPass() {
    
    }
    
    public void editPass() {
    
    }
    
    public void cancelPass() {
    
    }
    
    public void sellPass() {
    
    }
    
    public void newTicket(Ticket t) {
        if (ticketExits(t.getCode())) {
            showMessageDialog(null, "el tiquete con ese código ya existe");
        } else {
            getArraysControl().getTickets().add(t);
            }
    }
    
    public void editTicket (String code, Ticket t) {
        if (ticketExits(code)) {
            Ticket b = returnTicket(code);
            b.setAge_restriction(t.getAge_restriction());
            b.setPrice(t.getPrice());
            showMessageDialog(null, "el tiquete fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al tiquete con ese código");
                }
    }
    
    public void cancelTicket(String code){
        
        if (ticketExits(code)) {
            if (getPositionTickets(code) != -1) {
                getArraysControl().getTickets().remove(getPositionTickets(code));
                showMessageDialog(null, "el tiquete fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no sé encontró el tiquete en la base de datos");
            }
    }
    
     public void newSouvenir(Souvenir s) {
         if (souvenirExits(s.getCode())) {
             showMessageDialog(null, "el souvenir con ese código ya existe");
         } else {
            getArraysControl().getSouvenirs().add(s);
            }
    }
    
    public void editSouvenir (String code, Souvenir s) {
        if (souvenirExits(code)) {
           Souvenir b = returnSouvenir(code);
            b.setDescription(s.getDescription());
            b.setPrice(s.getPrice());
            showMessageDialog(null, "el souvenir fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al souvenir con ese código");
                }
    }
    
    public void cancelSouvenir(String code){
        if (souvenirExits(code)) {
            if (getPositionSouvenir(code) != -1) {
                getArraysControl().getSouvenirs().remove(getPositionSouvenir(code));
                showMessageDialog(null, "el souvenir fue eliminado de la base de datos");
            } 
        }else {
            showMessageDialog(null, "no se encontró el souvenir en la base de datos");
        }
    }
    
    public void sellTicket(int amountAdult, int amountKid){ 
 
        double income = accounting.getIncome();
        int currentAdult = accounting.getTicketsAdult_sold();
        int currentKid = accounting.getTicketsKid_sold();
        double valueAdult = amountAdult * returnTicket("0002").getPrice();
        double valueKid = amountAdult * returnTicket("0001").getPrice();
        income = income + valueAdult + valueKid;
        currentAdult = currentAdult + amountAdult;
        currentKid = currentKid + amountKid;
        accounting.setTicketsAdult_sold(currentAdult);
        accounting.setTicketsKid_sold(currentKid);
        accounting.setIncome(income);
        showMessageDialog(null, "se han vendido correctamente las boletas");
    }

    public void sellSouvenir(int amountLion, int amountTiger){
        if (amountLion <= returnSouvenir("001").getAmountInStock() && amountTiger <= returnSouvenir("002").getAmountInStock()) {
            int currentAmountLion = accounting.getSouvenirsLion_sold();
            int currentAmounTiger = accounting.getSouvenirsTiger_sold();
            double income = accounting.getIncome();
            currentAmounTiger = currentAmounTiger + amountTiger;
            currentAmountLion = currentAmountLion + amountLion;
            double valueTiget = amountTiger * returnTicket("002").getPrice();
            double valueLion = amountLion * returnTicket("001").getPrice();
            income = income + valueLion + valueTiget;
            accounting.setSouvenirsLion_sold(currentAmountLion);
            accounting.setSouvenirsTiger_sold(currentAmounTiger);
            accounting.setIncome(income);
            showMessageDialog(null, "se han vendido correctamente las souvenir");
        }else {
            showMessageDialog(null, "no hay suficientes en stock");
        }
        
    }
    /**
     * @return the arraysControl
     */
    public ArraysControl getArraysControl() {
        return arraysControl;
    }
    
    
    
}
