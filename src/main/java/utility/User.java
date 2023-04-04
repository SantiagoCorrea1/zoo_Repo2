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
public class User extends Person{
    private boolean work;
    private int cantTimesPerYear;
    private double pass;

    public User(boolean work, int cantTimesPerYear, double pass, String name, String id, int age) {
        super(name, id, age);
        this.work = work;
        this.cantTimesPerYear = cantTimesPerYear;
        this.pass = pass;
    }
    
    public User() {
    }

    /**
     * @return the work
     */
    public boolean isWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(boolean work) {
        this.work = work;
    }

    /**
     * @return the cantTimesPerYear
     */
    public int getCantTimesPerYear() {
        return cantTimesPerYear;
    }

    /**
     * @param cantTimesPerYear the cantTimesPerYear to set
     */
    public void setCantTimesPerYear(int cantTimesPerYear) {
        this.cantTimesPerYear = cantTimesPerYear;
    }

    /**
     * @return the pass
     */
    public double getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(double pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User{work=").append(work);
        sb.append(", cantTimesPerYear=").append(cantTimesPerYear);
        sb.append(", pass=").append(pass);
        sb.append('}');
        return sb.toString();
    }
    
    
}
