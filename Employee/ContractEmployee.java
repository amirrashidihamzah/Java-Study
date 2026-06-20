package Employee;

public class ContractEmployee extends Employee{

    private int projectCount;
    private double payPerProject;

    public ContractEmployee(String employeeID, String employeeName,int projectCount,double payPerProject) {
        super(employeeID, employeeName);
        this.projectCount=projectCount;
        this.payPerProject=payPerProject;
    }

    @Override
    double calculateSalary() {
        return projectCount*payPerProject;
    }
}
