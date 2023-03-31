/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static javax.swing.JOptionPane.showMessageDialog;
import utility.Ticket;

/**
 *
 * @author SANTIAGO
 */
public class DptSales {
    
    private ArraysControl arraysControl = new ArraysControl();
    
    public boolean ticketExits (String code){
            for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
                if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                    return true;
                }
            }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Ticket returnTicket (String code) {
        for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
            if (getArraysControl().getTickets().get(i).getCode().equals(code)) {
                return getArraysControl().getTickets().get(i);
            }
        }
        return null;
    }
    
    public int getPositionTickets (String code) {
        for (int i = 0; i < getArraysControl().getTickets().size(); i++) {
            if (ticketExits(code) && getArraysControl().getTickets().get(i).getCode().equals(code)) {
                return getArraysControl().getTickets().indexOf(returnTicket(code)) ;
                }
        }
        return -1;
    }
    
    public void verificationUser (){
        
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
        getArraysControl().getTickets().add(t);
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
            } else {
                showMessageDialog(null, "no sé encontró el tiquete en la base de datos");
            }
        }
    }
    
    public void sellTickect(){
        
    }
    
    public void newSouvenir(){
    
    }
    
    public void editsouvenir(){
    
    }
    
    public void cancelsouvenir(){
    
    }
    
    public void sellTicket(){
    
    }

    /**
     * @return the arraysControl
     */
    public ArraysControl getArraysControl() {
        return arraysControl;
    }
    
    
    
}
