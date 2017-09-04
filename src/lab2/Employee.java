package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;
    private String formattedDate;

    public Employee(String firstName, String lastName, String ssn) {
        if (validateEntry(firstName)) {
            this.firstName = firstName;
        }
        if (validateEntry(lastName)) {
            this.lastName = lastName;
        }
        if (validateEntry(ssn)) {
            this.ssn = ssn;
        }
        
        this.firstTimeEmployee();
    }
    
    public void firstTimeEmployee(String cubeId){
        orientationDate = new Date();
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
    }
    // Assume that an employee
    // would only do this once, upon being hired.
    
    public String getDate(Date date){
        DateUtilities newDate = new DateUtilities();
        return newDate.getFormattedDate(date); 
    }
    
    private void meetWithHrForBenefitAndSalryInfo() {
        this.setMetWithHr(metWithHr);
        formattedDate = this.getDate(orientationDate);
               
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + formattedDate);
    }

    // Assume this must be performed second, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        this.setMetDeptStaff(metDeptStaff);
        formattedDate = this.getDate(orientationDate);
               
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + formattedDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        this.setReviewedDeptPolicies(reviewedDeptPolicies);
        formattedDate = this.getDate(orientationDate);
                
        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + formattedDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        this.setCubeId(cubeId);
        this.setMovedIn(movedIn);
        formattedDate = this.getDate(orientationDate);
       
        System.out.println(firstName + " " + lastName + " moved into cubicle "
                + cubeId + " on " + formattedDate);
    }

    
    public boolean validateEntry(String toBeValidated) {
        if (toBeValidated.length() < 1) {
            System.out.println("Invalid entry; try again.");
            return false;
        } else {
            return true;
        }
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (validateEntry(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (validateEntry(lastName)) {
            this.lastName = lastName;
        }
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn.length() == 9) {
            this.ssn = ssn;
        } else {
            System.out.println("Invalid entry; try again");
        }
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public void setCubeId(String cubeId) {
        if (validateEntry(cubeId)) {
            this.cubeId = cubeId;
        }
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        Date dateToday = new Date();

        if (orientationDate.after(dateToday)) {
            System.out.println("Invalid entry; try again.");
        } else {
            this.orientationDate = orientationDate;
        }
    }

}
