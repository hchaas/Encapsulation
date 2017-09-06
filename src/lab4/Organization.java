
package lab4;

public class Organization {
    private Manager manager;
    
    public Organization(){
        manager = new Manager();
    }
    
    public void hireNewEmployee(String firstName, String lastName, String ssn){
        manager.hireEmployee(firstName, lastName, ssn);
        
    }
    
    public void setManager(Manager manager){
        this.manager = manager;
    }
    
    public Manager getManager(){
        return manager;
    }
}
