import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ghost3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ghost3 extends Actor
{
    // instance or state variables
    public int speed = 4;
    public String direction = "down";
        
    // Method called whenever act or run is pressed.
    public void act() 
    {
       setLocation(getX()+ speed, getY() );
       atWall();
    }
    // Changes the direction of the bug.
    public void changeDirection()
    {
       if (direction.equals("right")){
           direction = "right";
       }
    }
    // If the ghost is at the wall, have it change direction.
    public void atWall()
    {
        Actor wall = getOneIntersectingObject(brick.class);
        if (wall != null && !(wall instanceof point)) {
        speed = -speed;
        changeDirection();
        }
}
}
