package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public String showEmployees(){
        StringBuilder sb = new StringBuilder();
        for(Employee employee:employees){
            sb.append("Name:").append(employee.getEmployeeName());
            sb.append(" Salary: ").append(employee.calculateSalary()).append("\n");
        }
        return sb.toString();
    }
}
