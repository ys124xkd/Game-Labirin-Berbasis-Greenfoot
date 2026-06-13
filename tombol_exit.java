import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_exit extends Actor
{
    /**
     * Act - do whatever the tombol_exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image=new GreenfootImage("Exit",36,Color.RED,null);
        setImage(image);
        
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.stop();
            menu_play_game menu = (menu_play_game)getWorld();
            menu.exitGame();
    }
    }
}
