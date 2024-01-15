package Q6;

import java.util.Calendar;
import java.util.Date;

public class Employee {
    private String name;
    private String employeeNumber;
    private Calendar hireDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeNumber(String employeeNumber) {//Sets the employee number if it's in the correct format. If not, it throws an exception.
        if (!isValidEmployeeNumber(employeeNumber)){
            throw new IllegalArgumentException("Invalid employee number");
        }
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    private boolean isValidEmployeeNumber(String s){//Makes sure employee number is in the format XXX–L, where each X is a digit within the range 0–9 and the L is a letter within the range A–M.
        return s.length() == 5 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2)) && s.charAt(3) == '-' && s.charAt(4) <= 'M' && s.charAt(4) >= 'A';
    }



    public Calendar getHireDate() {
        return hireDate;
    }

    public Employee(String name, String employeeNumber, Calendar hireDate){
        this.name = name;
        if (!isValidEmployeeNumber(employeeNumber)){//Checks if the employee number is valid (XXX-L format)
            throw new IllegalArgumentException("Invalid employee number");
        }
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;


    }

}
