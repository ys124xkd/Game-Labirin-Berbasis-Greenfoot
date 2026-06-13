import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game_OVER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class Game_OVER.
     * 
     */
    
    private int score;  
    public GameOver(int score)
    {    
    // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    super(600, 400, 1);
    setPaintOrder(Play_Again.class,tombol_kembali.class,tombol_exit.class);
    addObject(new Play_Again(),200,280);
    addObject(new tombol_kembali(),400,280);
    showText("Final Score: " + score , getWidth() / 2, getHeight() / 2 + 50);
         
    }}
