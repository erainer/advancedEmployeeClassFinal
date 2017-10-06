package com.example.java;
import java.text.NumberFormat;
import java.util.Locale;

public class Employee {
    String name;
    PositionTitle position;
    boolean salary;
    double payRate;
    int shift;
    double totalPay;
    String startDate;
    //contructor
    public Employee(String name, PositionTitle position, boolean salary, double payRate,int shift) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payRate = payRate;
        this.shift = shift;
    }
    //returns the name
    public String getName(){
        return name;
    }
    //sets the name
    public void setName(String name){ this.name = name;}
    //returns the salary
    public boolean getSalary(){
        return salary;
    }
    //sets the salary
    public void setSalary(boolean salary){
        this.salary = salary;
    }
    //returns the payRate
    public double getPayRate(){
        return payRate;
    }
    //sets the payRate
    public void setPayRate(double payRate){ this.payRate = payRate; }
    //returns the shift
    public int getShift(){
        return shift;
    }
    //sets the shift
    public void setShift(int shift) {
        this.shift = shift;
    }
    //returns the startDate
    public String getStartDate(){
        return startDate;
    }
    //sets the startDate
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    //calculates the weeks pay for each emloyee
    public void calculate(double hours){
        double overtimePay = 0;
        double overtimeHours;
        double shiftPay = 0;
        if(shift == 2)
            shiftPay = .05;
        else if(shift == 3)
            shiftPay = .10;
        totalPay = payRate * hours;
        if(shiftPay > 0)
            totalPay = totalPay * shiftPay;
        if(salary == false && hours > 40){
            overtimeHours = hours - 40;
            overtimePay = (payRate * overtimeHours) * 1.5;
        }
        totalPay = totalPay + overtimePay;
    }
    //prints employee
    public void printEmployee(){
        System.out.println("Employee: " + name + "\nPosition: " + position + "\nPay Rate: " + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(payRate)
                + "\nTotal Pay: " +  NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(totalPay) + "\n");
    }
}