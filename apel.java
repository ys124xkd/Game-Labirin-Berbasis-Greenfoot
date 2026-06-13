import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apel extends Actor
{
    private GreenfootImage appelimage= new GreenfootImage("apple1.png");
    /**
     * Act - do whatever the apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        appelimage.scale(20,25);
        setImage(appelimage);
        
    }
}
