/**
 * Title:     InterestRate
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program prompts the user to enter the initial amount,
 * annual interest rate, and the number of years to display
 * the balance of the savings account after the end of each year
 * 
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class InterestRate extends JFrame{
    
    private static final int FRAME_WIDTH = 550;
    private static final int FRAME_HEIGHT = 250;
    private static final int AREA_ROWS = 10;
    private static final int AREA_COLUMNS = 20;
    private double balance;
    
    private JLabel amountLabel;
    private JLabel interestRateLabel;
    private JLabel numYearsLabel;
    private JLabel error;
    private JTextField amountField;
    private JTextField interestRateField;
    private JTextField numYearsField;
    private JButton quit;
    private JButton calculate;
    private JTextArea chart;
    private JTextArea barChart;
    
    /**
     * This method initialize the instance variable
     */
    public InterestRate(){
        
        balance = 0;
        chart = new JTextArea(AREA_ROWS,AREA_COLUMNS);
        chart.setText("$" + balance + "\n");
        chart.setEditable(false);
        
        createTextField();
        createButtons();
        createPanels();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
    }
   
    /**
     * This method define all the label and text field
     */
    private void createTextField(){
        
        amountLabel = new JLabel("Initial Amount");
        interestRateLabel = new JLabel("Annual Interest Rate");
        numYearsLabel = new JLabel("Number Of Years");
        error = new JLabel("");
        
        final int FIELD_WIDTH = 10;
        amountField = new JTextField(FIELD_WIDTH);
        interestRateField = new JTextField(FIELD_WIDTH);
        numYearsField = new JTextField(FIELD_WIDTH);
        
    }
    
    /**
     * This class will close the window when the user select the quit button
     */
    class Quit implements ActionListener{
    
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            System.exit(0);
            
        }
    
    }
    
    /**
     * This class will calculate the balance of the savings account 
     * after the end of each year
     */
    class Calculate implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent event){
            
            //refresh 
            error.setText("");
            chart.setText("$0.0");
            
            try {

                double rate = Double.parseDouble(interestRateField.getText());
                balance = Double.parseDouble(amountField.getText());
                int year = Integer.parseInt(numYearsField.getText());
                
                if(balance < 0){
                    
                    throw new Exception("*The Initial Amount is less than zero");
                }
                
                if(year < 1){
                    
                    throw new Exception("*The year is less than one");
                }
                
                if(rate < 0){
                    
                    throw new Exception("*The rate is negative");
                }
                
                double interest = balance * rate / 100;
                chart.setSize(year, AREA_COLUMNS);
                chart.setText("$" + balance + "\n");

                //calculate and add the balance to the chart
                for (int i = 0; i < year; ++i) {

                    balance += interest;
                    chart.append(String.format("$%.2f\n" , balance));

                }
                
            } catch (NumberFormatException x) {
                
                error.setText("*You did not enter a number");

            }catch(Exception ex){
                
                error.setText(ex.getMessage());
                
            }
   
        }       
    }
    
    /**
     * This method define and attach an ActionListener to the 
     * quit and calculate button
     * 
     */
    private void createButtons(){
        
        quit = new JButton("Quit");
        ActionListener quitListener = new Quit();
        quit.addActionListener(quitListener);  
        
        calculate= new JButton("Calculate");
        ActionListener calListener = new Calculate();
        calculate.addActionListener(calListener);
        
    }
    
    /**
     * This method organize the layout of the Application
     */
    private void createPanels(){
        
        //lable and text field
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));
        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(interestRateLabel);
        panel.add(interestRateField);
        panel.add(numYearsLabel);
        panel.add(numYearsField);
        
        //button
        JPanel button = new JPanel();
        button.add(quit);
        button.add(calculate);
        
        //scroll bar for the chart
        JScrollPane scroll = new JScrollPane(chart);
        
        //put everything together
        add(scroll, BorderLayout.WEST);
        add(panel, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
        
        //this is to notify the user that there is an error
        add(error, BorderLayout.NORTH);
    }
    
}
