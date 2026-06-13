import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ghost4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ghost4 extends Actor
{
    // instance or state variables
    public int speed = 4;
    public String direction = "down";
        
    // Method called whenever act or run is pressed.
    public void act() 
    {
       setLocation(getX(), getY() + speed);
       atWall();
    }
    // Changes the direction of the bug.
    public void changeDirection()
    {
       if (direction.equals("down")){
           direction = "up";
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
