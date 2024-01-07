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

    public void setEmployeeNumber(String employeeNumber) {
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

    private boolean isValidEmployeeNumber(String s){
        return s.length() == 5 && Character.isDigit(s.charAt(0)) && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2)) && s.charAt(3) == '-' && s.charAt(4) <= 'M' && s.charAt(4) >= 'A';
    }



    public Calendar getHireDate() {
        return hireDate;
    }

    public Employee(String name, String employeeNumber, Calendar hireDate){
        this.name = name;
        if (!isValidEmployeeNumber(employeeNumber)){
            throw new IllegalArgumentException("Invalid employee number");
        }
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;


    }

}
