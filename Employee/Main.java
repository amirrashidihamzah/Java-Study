package Employee;

public class Main {

    public static void main(String[] args){

        EmployeeManager manager=new EmployeeManager();

        manager.addEmployee(new FullTimeEmployee("1001","Ahmad",5000));
        manager.addEmployee(new PartTimeEmployee("1002","Siti",5,8.80));
        manager.addEmployee(new ContractEmployee("1003","Calvin",4,1500));

        System.out.println("List of employee\n" + manager.showEmployees());
    }
}
