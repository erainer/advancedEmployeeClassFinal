package com.example.java;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Emily Rainer", PositionTitle.ADMINISTRATION, true, 25.00, 1);
        Employee emp2 = new Employee("Henry Wright", PositionTitle.SALES, false, 20.00, 2);
        Employee emp3 = new Employee("Albert Roberts", PositionTitle.SECRETARIAL, false, 19.00, 3);
        emp1.calculate(45);
        emp1.printEmployee();
        emp2.calculate(50);
        emp2.printEmployee();
        emp3.calculate(35);
        emp3.printEmployee();
    }
}
