import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol_bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_bantuan extends Actor
{
    /**
     * Act - do whatever the tombol_bantuan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage image=new GreenfootImage("Bantuan",36,Color.RED,null);
        setImage(image);
        
        if(Greenfoot.mousePressed(this))
        {
            menu_play_game menu = (menu_play_game)getWorld();
            menu.MusicStop();
            Greenfoot.setWorld(new bantuan());
    }
}
}
