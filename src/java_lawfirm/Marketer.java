/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lawfirm;

/**
 *
 * @author DHiRAJ
 */
public class Marketer extends Employee{

    public Marketer() {
        super();
        this.behaviour = "how to advertise";
    }

    String behaviour;

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public double getSalary() {
        return (super.getSalary() + 10000);
    }

    @Override
    public int getManual_pages() {
        return (super.getManual_pages() + 3);
    }
}
