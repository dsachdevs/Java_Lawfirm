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
public class Lawyer extends Employee{

    public Lawyer() {
        super();
        this.behaviour = "how to sue";
    }

    String behaviour;

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public int getVacation_weeks() {
        return (super.getVacation_weeks() + 1);
    }

    @Override
    public String getLeave_form() {
        return "Pink";
    }

    public int getManual_pages() {
        return (super.getManual_pages() + 2);
    }

}
