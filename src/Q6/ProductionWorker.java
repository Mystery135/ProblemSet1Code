package Q6;

import java.util.Calendar;

public class ProductionWorker extends Employee{
    private int shift;
    private double hourlyPayRate;

    public int getShift() {
        return shift;
    }
    public String getShiftString(){//Returns shift. 1 = day, 2 = night. Else, return null.
        return switch (shift) {
            case 1 -> "day";
            case 2 -> "night";
            default -> null;
        };
    }

    public void setShift(int shift) {//Sets shift. Throws an exception if the shift is not 1 or 2.
        if (!isValidShift(shift)){
            throw new IllegalArgumentException("Invalid shift number");
        }
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
    private boolean isValidShift(int i){//Checks if the given number is 1 or 2 (valid shift numbers)
            return i == 1 || i == 2;
    }
    public ProductionWorker(String name, String employeeNumber, Calendar hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        if (!isValidShift(shift)){//Checks if shift is valid
            throw new IllegalArgumentException("Invalid shift number");
        }
        this.hourlyPayRate = hourlyPayRate;
        this.shift = shift;

    }
}
