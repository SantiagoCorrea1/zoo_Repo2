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
    
    ArraysControl arraysControl = new ArraysControl();
    VerificationMetodesSales vms = new VerificationMetodesSales();
    
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
    
    public void newTicket() {
        Ticket ticket = new Ticket(0, "", 0);
        arraysControl.getTickets().add(0, ticket);
    }
    
    public void editTicket (String code, Ticket t) {
        if (vms.ticketExits(code)) {
            Ticket b = vms.returnTicket(code);
            b.setAge_restriction(t.getAge_restriction());
            b.setPrice(t.getPrice());
            showMessageDialog(null, "el animal fue editado correctamente");
        } else{
            showMessageDialog(null, "no existe al animal con ese código");
                }
    }
    
    public void cancelTicket(String code){
        
        if (vms.ticketExits(code)) {
            if (vms.getPositionTickets(code) != -1) {
                arraysControl.getTickets().remove(vms.getPositionTickets(code));
                showMessageDialog(null, "el tickete fue eliminado de la base de datos");
            } else {
                showMessageDialog(null, "no sé encontró el ticket en la base de datos");
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
    
    
    
}
