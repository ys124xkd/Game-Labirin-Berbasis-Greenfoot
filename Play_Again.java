import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class retry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play_Again
 extends Actor
{
    /**
     * Act - do whatever the retry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Play Again",36, Color.RED, null);
        setImage(image);
        if (Greenfoot.mousePressed(this))
        {
                Greenfoot.setWorld(new level());
                Greenfoot.playSound("pacman_beginning.wav");
    }
}
}
