package lab1;

import java.util.Date;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document "EncapCheckList.pdf" if
 * needed.
 *
 * @author Jim Lombardo, WCTC Instructor
 * @version 1.02
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

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    /*Validation methods */
    
    public boolean validateEntry(String toBeValidated){
        if (toBeValidated.length()<1){
            System.out.println("Invalid entry; try again.");
            return false;
        }
        else
            return true;
    }
    
    /* Setters */
    
    public void setFirstName(String firstName) {
        if (validateEntry(firstName)){
            this.firstName = firstName;
        } 
    }

    public void setLastName(String lastName) {
        if (validateEntry(lastName)){
            this.lastName = lastName;
        }
    }

    public void setSsn(String ssn) {
        if (ssn.length() == 9){
            this.ssn = ssn;
        }
        else {
            System.out.println("Invalid entry; try again");
        }
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

    public void setCubeId(String cubeId) {
        if (validateEntry(cubeId)){
            this.cubeId = cubeId;
        }
    }

    public void setOrientationDate(Date orientationDate) {
        Date dateToday = new Date();
        
        if (orientationDate.after(dateToday)){
            System.out.println("Invalid entry; try again.");
        }
        else {
            this.orientationDate = orientationDate;
        }
    }

    /* Getters */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public String getCubeId() {
        return cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

}
