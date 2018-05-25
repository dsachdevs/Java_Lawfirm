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
public class Employee {

    public Employee() {
        this.manual_pages = 20;
        this.hours = 40;
        this.salary = 40000;
        this.vacation_weeks = 2;
        this.leave_form = "yellow";
    }

    int hours, vacation_weeks, manual_pages;
    double salary;
    String leave_form;

    public int getManual_pages() {
        return manual_pages;
    }

    public void setManual_pages(int manual_pages) {
        this.manual_pages = manual_pages;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getVacation_weeks() {
        return vacation_weeks;
    }

    public void setVacation_weeks(int vacation_weeks) {
        this.vacation_weeks = vacation_weeks;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLeave_form() {
        return leave_form;
    }

    public void setLeave_form(String leave_form) {
        this.leave_form = leave_form;
    }

}
