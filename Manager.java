package com.mycompany.employeemain;

public class Manager extends Employee
{
    private double performanceBounus;
    
    Manager(int empId, String name , double basicSalary, double performanceBonus)
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
