import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.FileWriter;
import java.io.IOException;
/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{
    /**
     * Constructor for objects of class YouWin.
     * 
     */
    public YouWin(int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 270, 1); 
        setPaintOrder(Play_Again.class,tombol_kembali.class);
        addObject(new Play_Again(),240,230);
        addObject(new tombol_kembali(),240,255);
        showText("Final Score: " + score , getWidth() / 3 + 70, getHeight() / 2 + 15);
    }
}
