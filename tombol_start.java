import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileWriter;

/**
 * Write a description of class tombol_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol_start extends Actor
{
    /**
     * Act - do whatever the tombol_start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public void act()
    {
    GreenfootImage image = new GreenfootImage("START", 36, Color.RED, null);
    setImage(image);
        if (Greenfoot.mousePressed(this)) {
    String playerName = JOptionPane.showInputDialog("Enter your name:");
     if (playerName != null && !playerName.isEmpty()) {
        Greenfoot.setWorld(new level());
        menu_play_game menu = (menu_play_game) getWorld();
        menu.MusicStop();
        Greenfoot.playSound("pacman_beginning.wav");
    } else {
        JOptionPane.showMessageDialog(null, "Please enter a valid name!");
    }
}}
}

