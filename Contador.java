import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int Punteo = 0;
    public Contador(){
        setImage(new GreenfootImage("Puntos: "+ Punteo, 42, Color.RED, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage("Puntos: "+ Punteo, 42, Color.RED, Color.WHITE));
        Ganaste();
    }
    public void addPunteo(){
    Punteo++;
    }
    public int getPunteo(){
        return Punteo;
    }
    public void Ganaste(){
        if (Punteo == 25){
           getWorld().addObject(new Ganaste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
           Greenfoot.stop();
        }
    }
}
