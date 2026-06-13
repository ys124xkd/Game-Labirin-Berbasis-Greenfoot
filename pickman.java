import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pickman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pickman extends Actor
{
    private GreenfootImage pacmanimage1 = new GreenfootImage ("pacman.png");
    private GreenfootImage pacmanimage2 = new GreenfootImage("pacman2.png");
    private GreenfootImage appelimage= new GreenfootImage("apple1.png");
    private GreenfootImage wingameimage = new GreenfootImage("youwin.png");
    private int lives = 3;
    private int score;
    private int pointEaten;
    private int timer;
    private int level = 1;
    private boolean hasPower = false;
    boolean p1 = false;
    /**
     * Act - do whatever the pickman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pickman()
    {
        timer = 1000;
        pacmanimage1.scale(20,20);
        pacmanimage2.scale(20,20);
        appelimage.scale(5,5);
        wingameimage.scale(150,120);
    }
    public void act()
    {
        pacmanMove();
        detectGhost();
        eatPoint();
        detectPortal();
        showStatus();
        youWin();
        updateTimer();
    }
    public void animate()
    {
        if(getImage()==pacmanimage1){
            setImage(pacmanimage2);
        }
        else{
            setImage(pacmanimage1);
        }
    }
    public void pacmanMove()
    {
        if (Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX()+4, getY());
            setRotation(360);
            animate();
            Actor wall = getOneIntersectingObject(brick.class);
            if (wall !=null)
            {
                setLocation (getX()-4,getY());
            }
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX()-4, getY());
            setRotation(180);
            animate();
            Actor wall = getOneIntersectingObject(brick.class);
            if (wall !=null)
            {
                setLocation (getX()+4,getY());
            }
        }
        if (Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY()+4);
            setRotation(90);
            animate();
            Actor wall = getOneIntersectingObject(brick.class);
            if (wall !=null)
            {
                setLocation (getX(),getY()-4);
            }
        }
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-4);
            setRotation(-90);
            animate();
            Actor wall = getOneIntersectingObject(brick.class);
            if (wall !=null)
            {
                setLocation (getX(),getY()+4);
            }
    }
}
    public void detectGhost()
    {
        if(isTouching(ghost1.class) && hasPower == false){
            Greenfoot.playSound("hurt03.wav");
            setLocation(15,135);
            removeLife();
        }
        else if(isTouching(ghost2.class) && hasPower == false){
            Greenfoot.playSound("hurt03.wav");
            setLocation(15,135);
            removeLife();
        }
        else if(isTouching(ghost3.class) && hasPower == false){
            Greenfoot.playSound("hurt03.wav");
            setLocation(15,135);
            removeLife();
        }
        else if(isTouching(ghost4.class) && hasPower == false){
            Greenfoot.playSound("hurt03.wav");
            setLocation(15,135);
            removeLife();
        }
        else if(isTouching(apel.class)){
            Greenfoot.playSound("bonus_apel1.mp3");
            removeTouching(apel.class);
            hasPower = true; //set hasPower menjadi true setelah Pickman memakan apel
        }
        else if(isTouching(ghost1.class) && hasPower == true){
            Greenfoot.playSound("death_ghost.mp3");
            removeTouching(ghost1.class); //hapus karakter hantu
            hasPower = false; //set hasPower menjadi false setelah membunuh hantu
            increaseScore();
            score = score + 20;
        }
        else if(isTouching(ghost2.class) && hasPower == true){
            Greenfoot.playSound("death_ghost.mp3");
            removeTouching(ghost2.class);
            hasPower = false;
            increaseScore();
            score = score + 20;
        }
        else if(isTouching(ghost3.class) && hasPower == true){
            Greenfoot.playSound("death_ghost.mp3");
            removeTouching(ghost3.class);
            hasPower = false;
            increaseScore();
            score = score + 20;
        }
        else if(isTouching(ghost4.class) && hasPower == true){
            Greenfoot.playSound("death_ghost.mp3");
            removeTouching(ghost4.class);
            hasPower = false;
            increaseScore();
            score = score + 20;
        }
    }

public void detectPortal()
    {
    level myworld = (level) getWorld();
    if (isTouching(portal.class)) {
        // Hapus objek yang ada di level saat ini (misalnya, koin dan hantu)
        myworld.removeObjects(myworld.getObjects(point.class));
        myworld.removeObjects(myworld.getObjects(apel.class));
        myworld.removeObjects(myworld.getObjects(ghost1.class));
        myworld.removeObjects(myworld.getObjects(ghost2.class));
        myworld.removeObjects(myworld.getObjects(ghost3.class));
        myworld.removeObjects(myworld.getObjects(ghost4.class));

        // Pindahkan pemain ke posisi baru
        setLocation(15, 135);
        Greenfoot.playSound("cartoon-yuppie.wav");
        // Melanjutkan level
        level++;
        myworld.increaseLevel();
        timer = 1000;
        }
    }
    public void eatPoint()
    {
        if(isTouching(point.class)){
            Greenfoot.playSound("nom.wav");
            removeTouching(point.class);
            increaseScore();
            timer = timer + 20;
        }
}       
    public void removeLife()
    {
        lives--;
        timer = 1000;
        gameOver();
        showStatus();
    }
    public void youWin()
    {
        if(level > 3){
        Greenfoot.playSound("you win.wav");
        World youWinWorld = new YouWin(score);
        Greenfoot.setWorld(youWinWorld);
        }
    }
    public void gameOver()
    {
        if(lives <= 0){
        Greenfoot.playSound("game over.wav");
        World gameOverWorld = new GameOver(score); // Membuat dunia GameOver
        Greenfoot.setWorld(gameOverWorld); // Mengganti dunia saat ini menjadi GameOver
    }
    }
    public void increaseScore()
    {
        score+=10;
        showStatus();
    }
    public void showStatus()
    {
        getWorld().showText("Level : "+level, 73,15);
        getWorld().showText("Lives : "+lives, 70, 35);
        getWorld().showText("Score : "+score, 70, 55);
        getWorld().showText("Time Left = "+timer, 70, 75);
    }
    public void updateTimer()
    {
        timer--;
        if(timer < 1){
            removeLife();
            Greenfoot.playSound("hurt03.wav");
            setLocation(15,135);
            gameOver();
        }
    }
}



        

