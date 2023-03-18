/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
//import utility.Animal;
import java.util.ArrayList;
import utility.Animal;
import utility.DomesticAnimal;
import utility.MinorAnimal;
import utility.SavageAnimal;
import utility.Plan;
import utility.Souvenir;
import utility.Pass;
import utility.Ticket;
import utility.Person;
import utility.User;


/**
 *
 * @author SANTIAGO
 */
public class ArraysControl {
    
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<DomesticAnimal> domesticAnimals = new ArrayList<>();
    private ArrayList<MinorAnimal> minorAnimals = new ArrayList<>();
    private ArrayList<SavageAnimal> savageAnimals = new ArrayList<>();
    private ArrayList<Plan> plans = new ArrayList<>();
    private ArrayList<Souvenir> souvenirs = new ArrayList<>();
    private ArrayList<Pass> passes = new ArrayList<>();
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private ArrayList<Person> persons = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
           
    /**
     * @return the animals
     */
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    /**
     * @return the domesticAnimals
     */
    public ArrayList<DomesticAnimal> getDomesticAnimals() {
        return domesticAnimals;
    }

    /**
     * @return the minorAnimals
     */
    public ArrayList<MinorAnimal> getMinorAnimals() {
        return minorAnimals;
    }

    /**
     * @return the savageAnimals
     */
    public ArrayList<SavageAnimal> getSavageAnimals() {
        return savageAnimals;
    }

    /**
     * @return the plans
     */
    public ArrayList<Plan> getPlans() {
        return plans;
    }

    /**
     * @return the souvenirs
     */
    public ArrayList<Souvenir> getSouvenirs() {
        return souvenirs;
    }

    /**
     * @return the passes
     */
    public ArrayList<Pass> getPasses() {
        return passes;
    }

    /**
     * @return the tickets
     */
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    /**
     * @return the persons
     */
    public ArrayList<Person> getPersons() {
        return persons;
    }

    /**
     * @return the users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * @param animals the animals to set
     */
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    /**
     * @param domesticAnimals the domesticAnimals to set
     */
    public void setDomesticAnimals(ArrayList<DomesticAnimal> domesticAnimals) {
        this.domesticAnimals = domesticAnimals;
    }

    /**
     * @param minorAnimals the minorAnimals to set
     */
    public void setMinorAnimals(ArrayList<MinorAnimal> minorAnimals) {
        this.minorAnimals = minorAnimals;
    }

    /**
     * @param savageAnimals the savageAnimals to set
     */
    public void setSavageAnimals(ArrayList<SavageAnimal> savageAnimals) {
        this.savageAnimals = savageAnimals;
    }

    /**
     * @param plans the plans to set
     */
    public void setPlans(ArrayList<Plan> plans) {
        this.plans = plans;
    }

    /**
     * @param souvenirs the souvenirs to set
     */
    public void setSouvenirs(ArrayList<Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }

    /**
     * @param passes the passes to set
     */
    public void setPasses(ArrayList<Pass> passes) {
        this.passes = passes;
    }

    /**
     * @param tickets the tickets to set
     */
    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    
}
