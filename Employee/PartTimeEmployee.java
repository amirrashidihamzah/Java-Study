package Employee;

public class PartTimeEmployee extends Employee{

    private int workingHour;
    private double hourlyRate;

    private Department dept;

    public PartTimeEmployee(String employeeID, String employeeName,Department dept,int workingHour,double hourlyRate) {
        super(employeeID, employeeName,dept);
        this.workingHour=workingHour;
        this.hourlyRate=hourlyRate;
    }

    @Override
    double calculateSalary() {
        return workingHour*hourlyRate;
    }
}
