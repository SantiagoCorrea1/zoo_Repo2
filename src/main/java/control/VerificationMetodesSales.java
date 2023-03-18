/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import utility.Ticket;
import utility.Pass;
import utility.Plan;
import utility.Souvenir;
import utility.Person;
import utility.User;

/**
 *
 * @author SANTIAGO
 */
public class VerificationMetodesSales {
    
    ArraysControl arraysControl = new ArraysControl();
    
     public boolean ticketExits (String code){
        for (int i = 0; i <= arraysControl.getTickets().size(); i++) {
            if (arraysControl.getTickets().get(i).getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }
    
    //si existe el animal menor lo retorna
    public Ticket returnTicket (String code) {
        for (int i = 0; i <= arraysControl.getTickets().size(); i++) {
            if (arraysControl.getTickets().get(i).getCode().equals(code)) {
                return arraysControl.getTickets().get(i);
            }
        }
        return null;
    }
    
    public int getPositionTickets (String code) {
        for (int i = 0; i <= arraysControl.getTickets().size(); i++) {
            if (ticketExits(code) && arraysControl.getTickets().get(i).getCode().equals(code)) {
                return arraysControl.getTickets().indexOf(returnTicket(code)) ;
                }
        }
        return -1;
    }
    
    public void verificationUser (){
        
    }
}
