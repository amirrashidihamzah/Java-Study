package Employee;

public class PartTimeEmployee extends Employee{

    private int workingHour;
    private double hourlyRate;

    public PartTimeEmployee(String employeeID, String employeeName,int workingHour,double hourlyRate) {
        super(employeeID, employeeName);
        this.workingHour=workingHour;
        this.hourlyRate=hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHour*hourlyRate;
    }
}
