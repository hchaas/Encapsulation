/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
public class MainClass {
    private String firstName;
    private String lastName;
    private String ssn;
    private String cubeID;
    
    public void EmployeeStart(){
        Employee newEmployee = new Employee(firstName, lastName, ssn);
        
        newEmployee.meetWithHrForBenefitAndSalryInfo();
        newEmployee.meetDepartmentStaff();
        newEmployee.reviewDeptPolicies();
        newEmployee.moveIntoCubicle(cubeID);
    }
}
