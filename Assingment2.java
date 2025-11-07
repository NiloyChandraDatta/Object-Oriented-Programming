/**
 * Base Employee class
 */
class Employee 
{
    private int empId;
    private String name;
    private double basicSalary;
    static final String COMPANY_NAME = "TechNova Pvt. Ltd.";
    static int totalEmployees;

    Employee(int empId, String name, double basicSalary) 
    {
        this.empId = empId;
        this.name = name;

        if (basicSalary < 10000) 
        {
            System.out.println("Invalid salary! Setting basic salary to 10000.0");
            this.basicSalary = 10000;
        } 
        else 
        {
            this.basicSalary = basicSalary;
        }

        totalEmployees++;
        System.out.println("Employee created at " + COMPANY_NAME);
    }

    void setName(String name) 
    {
        if (this.name != null) 
        {
            this.name = name;
        }
    }

    void setBasicSalary(double basicSalary) 
    {
        if (basicSalary < 10000) 
        {
            System.out.println("Invalid salary! Setting basic salary to 10000.0");
            this.basicSalary = 10000;
        } 
        else 
        {
            this.basicSalary = basicSalary;
        }
    }

    int getEmpId() 
    {
        return empId;
    }

    String getName() 
    {
        return name;
    }

    double getBasicSalary() 
    {
        return basicSalary;
    }

    double calculateSalary() 
    {
        return basicSalary;
    }

    static int getTotalEmployees() 
    {
        return totalEmployees;
    }
}



/**
 * Developer class, subclass of Employee
 */
class Developer extends Employee 
{
    private double projectAllowance;

    Developer(int empId, String name, double basicSalary, double projectAllowance) 
    {
        super(empId, name, basicSalary);
        this.projectAllowance = projectAllowance;
    }

    @Override
    double calculateSalary() 
    {
        return getBasicSalary() + projectAllowance;
    }
}

/**
 * Manager class, subclass of Employee.
 */
class Manager extends Employee 
{
    private double performanceBounus;

    Manager(int empId, String name, double basicSalary, double performanceBonus) 
    {
        super(empId, name, basicSalary);
        this.performanceBounus = performanceBonus;

    }

    @Override
    double calculateSalary() 
    {
        return getBasicSalary() + performanceBounus;

    }
}

public class EmployeeMain 
{
    public static void main(String[] args) 
    {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager(101, "Fahiyan Shah Chad", 200000, 145000);
        employees[1] = new Developer(102, "Niloy Chandra Datta", 120000, 80000);
        employees[2] = new Employee(103, "Deep Chad Sarkar", 35000);

        System.out.println("Manager Salary calculated: " + employees[0].calculateSalary());
        System.out.println("Developer Salary Calculated: " + employees[1].calculateSalary());
        System.out.println();
        System.out.println("Employee Details:");

        for (int i = 0; i < 3; i++) 
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
