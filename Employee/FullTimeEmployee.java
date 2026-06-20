package Employee;

public class FullTimeEmployee extends Employee implements EligibleBonus{

    private double monthlySalary;
    private Department dept;

    public FullTimeEmployee(String employeeID, String employeeName,Department dept,double monthlySalary) {
        super(employeeID, employeeName,dept);
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
