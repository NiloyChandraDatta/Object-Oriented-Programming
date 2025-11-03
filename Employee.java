package com.mycompany.employeemain;

public class Employee
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
        
        if(basicSalary < 10000)
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
        if(basicSalary < 10000)
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
