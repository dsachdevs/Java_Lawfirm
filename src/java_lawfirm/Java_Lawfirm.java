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
public class Java_Lawfirm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lawyer lw = new Lawyer();
        Secretary s = new Secretary();
        Marketer m = new Marketer();
        LegalSecretary ls = new LegalSecretary();

        System.out.println("LAWYER details:");
        System.out.println("Manual pages:" + lw.getManual_pages() + " || Hours:" + lw.getHours() + " || Salary:"
                + lw.getSalary() + " || vacation_weeks:" + lw.getVacation_weeks() + " || leave_form:"
                + lw.getLeave_form() + " || Behaviour:" + lw.getBehaviour());

        System.out.println("SECRETARY details:");
        System.out.println("Manual pages:" + s.getManual_pages() + " || Hours:" + s.getHours() + " || Salary:"
                + s.getSalary() + " || vacation_weeks:" + s.getVacation_weeks() + " || leave_form:"
                + s.getLeave_form() + " || Behaviour:" + s.getBehaviour());

        System.out.println("MARKETER details:");
        System.out.println("Manual pages:" + m.getManual_pages() + " || Hours:" + m.getHours() + " || Salary:"
                + m.getSalary() + " || vacation_weeks:" + m.getVacation_weeks() + " || leave_form:"
                + m.getLeave_form() + " || Behaviour:" + m.getBehaviour());

        System.out.println("LEGAL SECRETARY details:");
        System.out.println("Manual pages:" + ls.getManual_pages() + " || Hours:" + ls.getHours() + " || Salary:"
                + ls.getSalary() + " || vacation_weeks:" + ls.getVacation_weeks() + " || leave_form:"
                + ls.getLeave_form() + " || Behaviour:" + ls.getBehaviour());

    }

}
