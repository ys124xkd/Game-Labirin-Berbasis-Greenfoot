import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bantuan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bantuan extends World
{

    /**
     * Constructor for objects of class bantuan.
     * 
     */
    public bantuan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(teks_bantuan.class,tombol_kembali.class);

        addObject(new teks_bantuan(), 300, 200);
        addObject(new tombol_kembali(),300,300);
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        navigasi navigasi = new navigasi();
        addObject(navigasi,301,120);
    }
}
