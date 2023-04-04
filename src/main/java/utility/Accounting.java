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
public class Accounting {
    private int ticketsAdult_sold;
    private int ticketsKid_sold;
    private int passesExtreme_sold;
    private int passesRelax_sold;
    private int souvenirsLion_sold;
    private int souvenirsTiger_sold;
    private double income;

    public Accounting(int ticketsAdult_sold, int ticketsKid_sold, int passesExtreme_sold, int passesRelax_sold, int souvenirsLion_sold, int souvenirsTiger_sold, double income) {
        this.ticketsAdult_sold = ticketsAdult_sold;
        this.ticketsKid_sold = ticketsKid_sold;
        this.passesExtreme_sold = passesExtreme_sold;
        this.passesRelax_sold = passesRelax_sold;
        this.souvenirsLion_sold = souvenirsLion_sold;
        this.souvenirsTiger_sold = souvenirsTiger_sold;
        this.income = income;
    }

    
    
    public Accounting() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Accounting{ticketsAdult_sold=").append(ticketsAdult_sold);
        sb.append(", ticketsKid_sold=").append(ticketsKid_sold);
        sb.append(", passesExtreme_sold=").append(passesExtreme_sold);
        sb.append(", passesRelax_sold=").append(passesRelax_sold);
        sb.append(", souvenirsLion_sold=").append(souvenirsLion_sold);
        sb.append(", souvenirsTiger_sold=").append(souvenirsTiger_sold);
        sb.append(", income=").append(income);
        sb.append('}');
        return sb.toString();
    }

   
    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * @return the ticketsAdult_sold
     */
    public int getTicketsAdult_sold() {
        return ticketsAdult_sold;
    }

    /**
     * @param ticketsAdult_sold the ticketsAdult_sold to set
     */
    public void setTicketsAdult_sold(int ticketsAdult_sold) {
        this.ticketsAdult_sold = ticketsAdult_sold;
    }

    /**
     * @return the ticketsKid_sold
     */
    public int getTicketsKid_sold() {
        return ticketsKid_sold;
    }

    /**
     * @param ticketsKid_sold the ticketsKid_sold to set
     */
    public void setTicketsKid_sold(int ticketsKid_sold) {
        this.ticketsKid_sold = ticketsKid_sold;
    }

    /**
     * @return the passesExtreme_sold
     */
    public int getPassesExtreme_sold() {
        return passesExtreme_sold;
    }

    /**
     * @param passesExtreme_sold the passesExtreme_sold to set
     */
    public void setPassesExtreme_sold(int passesExtreme_sold) {
        this.passesExtreme_sold = passesExtreme_sold;
    }

    /**
     * @return the passesRelax_sold
     */
    public int getPassesRelax_sold() {
        return passesRelax_sold;
    }

    /**
     * @param passesRelax_sold the passesRelax_sold to set
     */
    public void setPassesRelax_sold(int passesRelax_sold) {
        this.passesRelax_sold = passesRelax_sold;
    }

    /**
     * @return the souvenirsLion_sold
     */
    public int getSouvenirsLion_sold() {
        return souvenirsLion_sold;
    }

    /**
     * @param souvenirsLion_sold the souvenirsLion_sold to set
     */
    public void setSouvenirsLion_sold(int souvenirsLion_sold) {
        this.souvenirsLion_sold = souvenirsLion_sold;
    }

    /**
     * @return the souvenirsTiger_sold
     */
    public int getSouvenirsTiger_sold() {
        return souvenirsTiger_sold;
    }

    /**
     * @param souvenirsTiger_sold the souvenirsTiger_sold to set
     */
    public void setSouvenirsTiger_sold(int souvenirsTiger_sold) {
        this.souvenirsTiger_sold = souvenirsTiger_sold;
    }
    
    
}
