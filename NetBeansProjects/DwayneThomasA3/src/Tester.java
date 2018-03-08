/**
 *Title:     Tester
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program reads the user input and illustrate the 
 * Appointment Book application
 */

import javax.swing.JOptionPane;

public class Tester {
    
    static int year = 0, month = 0, day = 0;
    
    public static void main(String[] args){  
          
        int userMenu = - 1;
        int i = 0;
        Appointment[] schedule = new Appointment[10];
        
       /* loop ends when the user wants to quit 
        */
        do{
            
          year = 0;
          month = 0;
          day = 0;
          String allAppointment = "";
          String description = "none";
          
          Object[] menu = {"Display appointments on a certain date", "add appointments", "quit"};
          
          //display the menu
          userMenu = JOptionPane.showOptionDialog(null,"Select an option", 
                                                      "Menu", JOptionPane.YES_NO_CANCEL_OPTION,
                                                      JOptionPane.QUESTION_MESSAGE,null,
                                                      menu,menu[2]);
            //display all Appointments
            if(userMenu == 0){
                
                if(i != 0){
                    
                    enter();
                    for(int x = 0; x < i; ++x){
                    
                      if(schedule[x].occursOn(year, month, day)){
                          
                          allAppointment += schedule[x].getAppointment() + "\n";
                          
                      }
                      
                    }  
                    
                    if(allAppointment.isEmpty()){
                        
                        JOptionPane.showMessageDialog(null,"There are no Appointments on that date");
                        
                    }
                    
                    else{
                        
                        JOptionPane.showMessageDialog(null, allAppointment);
                        
                    }
                    
                }
                
                else{
                    
                    JOptionPane.showMessageDialog(null,"The Appointment Book is Empty");
                    
                }
                
             }
            
            //add appointments
            else if(userMenu == 1){
                
                if(i == schedule.length){
                    
                    JOptionPane.showMessageDialog(null,"The Appointment book is full");
                    continue;
                }
                
                Object[] options = {"One time", "Daily", "Monthly"};
                
                int userOption = JOptionPane.showOptionDialog(null,"Select an Appointment Type","Appoinment type",
                                                             JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                                                             null,options,options[2]);
                //One Time - year, month, day
                if(userOption == 0){
                    
                     schedule[i] = new Onetime();
                     description = JOptionPane.showInputDialog(null,"Enter an description");
                     enter();
                     schedule[i].addAppointment(year, month, day, description);
                     
                }
                
                //Daily - only description 
                else if(userOption == 1){
                    
                    schedule[i] = new Daily();
                    description = JOptionPane.showInputDialog(null,"Enter an description");
                    schedule[i].addAppointment(year, month, day, description);
                    
                }
                
                //Monthly- day(1-28)
                else{
                    
                    schedule[i] = new Monthly();
                    
                    description = JOptionPane.showInputDialog(null,"Enter an description");
                    day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a day"));
                    
                    while(day < 1 || day > 28){
                        
                        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid day! Enter a day"));
                        
                        }
                    
                    schedule[i].addAppointment(year, month, day, description);
                    
                }
                
                ++i; 
            }
                  
        }while(userMenu != 2);
        
    }
    
    /**
     * This method ask the user
     * to enter a year, month, and day
     */
    public static void enter(){
        
        //year (2017 and up)
        year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year"));
                
                while(year < 2017){
                    
                    year = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid year! Enter a year"));
                    
                }
                
        //month(1-12)       
        month = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a month"));
                
                while(month < 1 || month > 12){
                    
                    month = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid month! Enter a month"));
                    
                }
         
        //day(depends on the month and year)        
        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a day"));
                
                if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                    
                    while(day < 1 || day > 31){
                    
                        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid day! Enter a day"));
                    
                    }
                
                }
                
                else if(month == 4 || month == 6 || month == 9 || month == 11){
                    
                    while(day < 1 || day > 30){
                        
                        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid day! Enter a day"));
                        
                    }
                    
                }
                
                else if(month == 2){
                    
                    if((year - 2016) % 4 == 0){
                        
                        while(day < 1 || day > 29){
                        
                        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid day! Enter a day"));
                        
                        }
                        
                    }
                    else{
                        
                        while(day < 1 || day > 28){
                        
                        day = Integer.parseInt(JOptionPane.showInputDialog(null, "Invalid day! Enter a day"));
                        
                        }
                        
                    }
                    
                  }
        
    }
 
}
