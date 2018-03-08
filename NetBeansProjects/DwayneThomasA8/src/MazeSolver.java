/**
 * Title:     MazeSolver
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program runs the maze class by initializing the maze
 * and sending the starting position
 * 
 */


public class MazeSolver {
    
    public static void main(String args[]){
        
        char[][] m = {
         {'*', ' ', '*', '*', '*', '*', '*', '*', '*'}, 
         {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'}, 
         {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'}, 
         {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'}, 
         {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'}, 
         {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'}, 
         {'*', '*', '*', ' ', '*', ' ', '*', '*', '*'}, 
         {'*', ' ', ' ', '*', ' ', ' ', '*', ' ', '*'}, 
         {'*', '*', '*', '*', '*', ' ', '*', ' ', '*'}};
         
      Maze maze = new Maze(m);

      System.out.println(maze.escape(4, 3));
      System.out.println("Expected: true");
      
      //result for starting position at(4,3) 
      maze.printChart();  
      
      //this is to get rid of the marks
      maze.cleanChart();
      
      System.out.println(maze.escape(5, 5));
      System.out.println("Expected: false");
      
      //result for starting position at (5,5)
      maze.printChart();
       
        
    }
    
}