import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class menu_play_game extends World
{
    private GreenfootSound backgroundSound;
    /**
     * Constructor for objects of class menu_play_game.
     * 
     */
    public menu_play_game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(tombol_start.class,tombol_bantuan.class,
                      tombol_exit.class);
        addObject(new tombol_start(),150,375);
        addObject(new tombol_bantuan(),320,375);
        addObject(new tombol_exit(),500,375);
        backgroundSound = new GreenfootSound("bacground.mp3");
        backgroundSound.playLoop();
        prepare();
    }
    public void MusicStop(){
        backgroundSound.stop();
    }
    public void exitGame(){
        backgroundSound.stop();
    }
    public void prepare()
    {
        Greenfoot.start();
    }
    
}
