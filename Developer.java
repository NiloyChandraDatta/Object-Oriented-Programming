public class Developer extends Employee
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
