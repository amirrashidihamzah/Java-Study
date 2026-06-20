package Employee;

public class ContractEmployee extends Employee{

    private int projectCount;
    private double payPerProject;
    private Department departmentName;


    public ContractEmployee(String id, String name, int projectCount, double payPerProject) {
        super(id, name); // NO department
        this.projectCount = projectCount;
        this.payPerProject = payPerProject;
    }

    @Override
    double calculateSalary() {
        return projectCount*payPerProject;
    }
}
