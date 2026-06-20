package Employee;

abstract class Employee {

    private String employeeID;
    private String employeeName;

    private Department department;

    public Employee(String employeeID, String employeeName) {
        this(employeeID, employeeName, Department.NONE); // default
    }

    public Employee(String employeeID, String employeeName, Department department) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    abstract double calculateSalary();

    public Department getDepartment(){
        return department;
    }
}
