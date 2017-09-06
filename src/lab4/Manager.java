/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Employee> employees;

    public Manager() {
        employees = new ArrayList();

    }

    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee newEmployee = new Employee(firstName, lastName, ssn);
        employees.add(newEmployee);
        newEmployeeOrientation(newEmployee);
    }
    
        // HRManager delegates work to employee
    public void newEmployeeOrientation(Employee newEmployee) {
        newEmployee.doFirstTimeOrientation("B101");
    }

    public void outputReport(String ssn) {
        Employee newEmployee = null;
        
        // find employee in list
        for(Employee employee : employees) {
            if(employee.getSsn().equals(ssn)) {
                newEmployee = employee;
                break;
            } else {
                // if not found end method prematurely
                return;
            }
        }

        // if found run report
        if(newEmployee.isMetWithHr() && newEmployee.isMetDeptStaff()
           && newEmployee.isReviewedDeptPolicies() && newEmployee.isMovedIn()) {
            
            newEmployee.getReportService().outputReport();
            
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.hireEmployee("John", "Doe", "333-33-3333");
        System.out.println(manager.getEmployees());
//        for(Employee emp : hr.getEmployees()) {
//            System.out.println(emp);
//        }
    }
}
