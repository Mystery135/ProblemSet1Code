package Q6;

import java.util.Calendar;

public class ProductionWorker extends Employee{
    private int shift;
    private double hourlyPayRate;

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
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
    private boolean isValidShift(int i){
            return i == 1 || i == 2;

    }
    public ProductionWorker(String name, String employeeNumber, Calendar hireDate, int shift, double hourlyPayRate) {
        super(name, employeeNumber, hireDate);
        if (!isValidShift(shift)){
            throw new IllegalArgumentException("Invalid shift number");
        }
        this.hourlyPayRate = hourlyPayRate;
        this.shift = shift;

    }
}
