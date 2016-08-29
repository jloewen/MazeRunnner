
/**
 *Jameson Loewen
 *MazeWalker
 *Aug 26, 2016
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    
    public void walkMaze(MazeBot mazeBot){
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        
        mazeBot.turnLeft();
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
       while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()){
            mazeBot.moveForward();
        }
        if (mazeBot.didReachGoal())
       {
         mazeBot.signalSuccess();
       }
          else{
         mazeBot.signalError();
          }
  }
 }
