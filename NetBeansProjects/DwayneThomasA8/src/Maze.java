/**
 * Title:     Maze
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program solves the maze using Recursion
 * and prints the result
 * 
 */

public class Maze {
    
    private char[][] chart;
    
    /**
     * This method initializes the maze
     * @param m The maze
     */
    public Maze(char[][] m){
    
        chart = m;
        
    }
    
    /**
     * This method cleans up the maze 
     */
    public void cleanChart(){
        
        for(int i = 0; i < chart.length; ++i){
            
            for(int j = 0; j < chart[0].length; ++j){
                
                if(chart[i][j] == '+' || chart[i][j] == 'E'){
                    
                    chart[i][j] = ' ';
                    
                }
                
            }
            
        }
        
    }
    
    /**
     * This method uses recursion to solve the maze
     * @param row The row of the maze
     * @param col The column of the maze
     * @return whether you can escape from the maze
     */
    public boolean escape(int row, int col){
        
        //this is to prevent out of bound error
        if( row < 0 || row >= chart.length || col < 0 || col >= chart[0].length ){
            
            return false;
            
        }
        
        /*check if the program hit a wall or went 
          back to the place that was already check*/
        if(chart[row][col] == '*' || chart[row][col] == '+'){
                        
            return false;
            
        }
        
        // The program has successfully exit the maze(Denoted as E on the chart)
        if(chart[row][col] == ' ' && (row == 0 || row == chart.length - 1)){
            
            chart[row][col] = 'E'; 
            return true;
            
        }
        
        //to prevent stack over Flow error 
        chart[row][col] = '+';
        
        //check up
        if(escape(row - 1, col)){
            
            chart[row][col] = '+';
            return true;
            
        }
        
        //check right
        if(escape(row,col + 1)){
        
            chart[row][col] = '+';
            return true;
            
        }
        
        //check down
        if(escape(row + 1 ,col)){
            
            chart[row][col] = '+';
            return true;
            
        }        
        
        //check left
        if(escape(row,col - 1)){
        
            chart[row][col] = '+';
            return true;
            
        }
        
        return false;
        
    }
    
    /**
     * This method prints the maze
     */
    public void printChart(){
        
        for(int i = 0; i < chart.length; i++){
            
            for(int j = 0; j < chart[0].length; ++j){
                
                System.out.print(chart[i][j]);
                            
            }
            
            System.out.println();
        }
    }
    
}
