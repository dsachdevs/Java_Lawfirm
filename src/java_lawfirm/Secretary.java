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
public class Secretary extends Employee {

    public Secretary() {
        super();
        this.behaviour = "how to take dictation";
    }

    String behaviour;

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    @Override
    public int getManual_pages() {
        return (super.getManual_pages() + 1);
    }
}
