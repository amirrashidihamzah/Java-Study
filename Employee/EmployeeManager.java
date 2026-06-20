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

    public String showEmployees() {

        StringBuilder sb = new StringBuilder();

        sb.append("List of employee\n");

        for (Employee employee : employees) {

            double salary = employee.calculateSalary();

            sb.append("Name: ").append(employee.getEmployeeName())
                    .append(" | Salary: ").append(String.format("%.2f", salary));

            if (employee instanceof EligibleBonus empBonus) {

                double bonus = empBonus.bonusCalculation();

                sb.append(" | Bonus: ").append(String.format("%.2f", bonus))
                        .append(" | Total Salary: ")
                        .append(String.format("%.2f", salary + bonus));
            }

            sb.append("\n"); // IMPORTANT: new line for every employee
        }
        return sb.toString();
    }
}
