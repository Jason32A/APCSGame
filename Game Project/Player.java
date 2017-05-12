import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Actor
{
    public String[] arrowKeys = new String[5];
    /**
     * arrowKeys[0] is equivalent to the up arrow
     * arrowKeys[1] is equivalent to the down arrow
     * arrowKeys[2] is equivalent to the right arrow
     * arrowKeys[3] is equivalent to the left arrow
     * arrowKeys[4] is the last button, to be determined by discretion
     */
    public float speed;
    public boolean boost = false;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int rotation = 0;
        if(Greenfoot.isKeyDown(arrowKeys[0]))
        {
            speed += 0.1;
        }
        if(Greenfoot.isKeyDown(arrowKeys[1]))
        {
            speed -= 0.1;
        }
        if(Greenfoot.isKeyDown(arrowKeys[2]))
        {
            rotation += 1;
        }
        if(Greenfoot.isKeyDown(arrowKeys[3]))
        {
            rotation -= 1;
        }
        if(Greenfoot.isKeyDown(arrowKeys[4]) && !boost)
        {
            speed += 2;
            boost = true;
        }
        if(boost && !Greenfoot.isKeyDown(arrowKeys[4]))
        {
            speed -= 2;
            boost = false;
        }
        turn(rotation);
        move((int)speed);
    }
    
}
