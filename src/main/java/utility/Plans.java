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
public class Plans {
     private int code; //
    private String name; // 
    private String duration; // horas que dura
    private String description; // un carretazo cualquiera
    private String days; //días que se puede
    private String hours; // horas en las que se realiza
    private int cantPeople; //cant personas que pueden particiapr por día
    private double pricepass; // 
    private double priceticket; //
    private String souvenir; //incluye un souvenir

    public Plans() {
    }

    public Plans(int code, String name, String duration, String description, String days, String hours, int cantPeople, double pricepass, double priceticket, String souvenir) {
        this.code = code;
        this.name = name;
        this.duration = duration;
        this.description = description;
        this.days = days;
        this.hours = hours;
        this.cantPeople = cantPeople;
        this.pricepass = pricepass;
        this.priceticket = priceticket;
        this.souvenir = souvenir;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the days
     */
    public String getDays() {
        return days;
    }

    /**
     * @param days the days to set
     */
    public void setDays(String days) {
        this.days = days;
    }

    /**
     * @return the hours
     */
    public String getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(String hours) {
        this.hours = hours;
    }

    /**
     * @return the cantPeople
     */
    public int getCantPeople() {
        return cantPeople;
    }

    /**
     * @param cantPeople the cantPeople to set
     */
    public void setCantPeople(int cantPeople) {
        this.cantPeople = cantPeople;
    }

    /**
     * @return the pricepass
     */
    public double getPricepass() {
        return pricepass;
    }

    /**
     * @param pricepass the pricepass to set
     */
    public void setPricepass(double pricepass) {
        this.pricepass = pricepass;
    }

    /**
     * @return the priceticket
     */
    public double getPriceticket() {
        return priceticket;
    }

    /**
     * @param priceticket the priceticket to set
     */
    public void setPriceticket(double priceticket) {
        this.priceticket = priceticket;
    }

    /**
     * @return the souvenir
     */
    public String getSouvenir() {
        return souvenir;
    }

    /**
     * @param souvenir the souvenir to set
     */
    public void setSouvenir(String souvenir) {
        this.souvenir = souvenir;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plans{code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", duration=").append(duration);
        sb.append(", description=").append(description);
        sb.append(", days=").append(days);
        sb.append(", hours=").append(hours);
        sb.append(", cantPeople=").append(cantPeople);
        sb.append(", pricepass=").append(pricepass);
        sb.append(", priceticket=").append(priceticket);
        sb.append(", souvenir=").append(souvenir);
        sb.append('}');
        return sb.toString();
    }
    
    
}
