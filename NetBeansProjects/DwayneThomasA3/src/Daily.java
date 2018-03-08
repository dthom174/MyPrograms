/**
 * Title:    Appointment
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program inherits the Appointment class
 */

public class Daily extends Appointment{
    
       
    @Override
    public boolean occursOn(int year, int month, int day){
              
        this.year = year;
        this.month = month;
        this.day = day;
        
        return true;

    }

    
}
