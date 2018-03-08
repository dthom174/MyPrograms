/**
 * Title:    Appointment
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program sets the appointment date,
 * adds a new appointment, returns the appointment date and description,
 * and checks whether the appointment occurs on a date
 */

class Appointment {
    
    int year;
    int month;
    int day;
    String description;
    
    /**
     * This is the default constructor
     */
    public Appointment(){
        
        year = 0;
        month = 0;
        day = 0;
        description = "none";
   
    }
    
    /**
     * This sets the year, month, day, and description.
     * @param year
     * @param month
     * @param day
     * @param description 
     */
    public Appointment(int year, int month, int day,String description){
        
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
        
    }
    
    /**
     * This adds a new appointment
     * @param year
     * @param month
     * @param day
     * @param description 
     */
    public void addAppointment(int year, int month, int day, String description){
        
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
        
    }
    
    /**
     * This method returns the description and the date
     * of the appointment
     * @return 
     */
    public String getAppointment(){
        
        return description + ": " + month + "/" + day + "/" + year;
    }
    
    /**
     * This method checks whether the Appointment
     * occurs on that date
     * @param year
     * @param month
     * @param day
     * @return 
     */
    public boolean occursOn(int year, int month, int day){
        
        return this.year == year && this.month == month && this.day == day;
        
    }
    
}
