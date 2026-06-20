package Employee;

public class FullTimeEmployee extends Employee implements EligibleBonus{

    private double monthlySalary;

    public FullTimeEmployee(String employeeID, String employeeName,double monthlySalary) {
        super(employeeID, employeeName);
        this.monthlySalary=monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public double bonusCalculation() {
        return monthlySalary*0.25;
    }
}
