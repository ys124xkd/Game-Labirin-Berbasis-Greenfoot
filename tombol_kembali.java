import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_kembali here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_kembali extends Actor
{
    /**
     * Act - do whatever the tombol_kembali wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image=new GreenfootImage("Kembali",36,Color.RED,null);
        setImage(image);
        
        if(Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new menu_play_game());
    }
    }
}
