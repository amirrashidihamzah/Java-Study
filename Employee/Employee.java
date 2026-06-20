package Employee;

abstract class Employee {

    private String employeeID;
    private String employeeName;

    public Employee(String employeeID,String employeeName){
        this.employeeID=employeeID;
        this.employeeName=employeeName;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    abstract double calculateSalary();
}
