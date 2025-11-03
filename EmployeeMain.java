public class EmployeeMain
{
    public static void main( String[] args)
    {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager(101, "Fahiyan Shah Chad", 200000, 145000);
        employees[1] = new Developer(102,"Niloy Chandra Datta", 120000, 80000);
        employees[2] = new Employee(103, "Deep Chad Sarkar", 35000);
        
        System.out.println("Manager Salary calculated: " + employees[0].calculateSalary());
        System.out.println("Developer Salary Calculated: " + employees[1].calculateSalary());
        System.out.println();
        System.out.println("Employee Details:");
        
        for(int i = 0; i < 3 ; i++)
        {
            System.out.println("ID: " + employees[i].getEmpId() +
                    " | Name: " + employees[i].getName() +
                    " | Company: " + Employee.COMPANY_NAME +
                    " | Salary: " + employees[i].calculateSalary());
            //System.out.println();   
        }
        System.out.println();
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}
