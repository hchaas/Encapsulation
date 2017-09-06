package lab4;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */

/*I had trouble understanding this lab I think in part because I was thinking about it too literally in how
each person would interface with the software. To better understand it, I studied the solution and copied
it over, changing the variable and method names so that I could walk through each part of the code, understanding
how it fit together.
*/
public class Startup {
    public static void main(String[] args) {
        Organization organization = new Organization();
        organization.hireNewEmployee("Peter", "Piper", "333-33-3333");

    }
    
    
}
