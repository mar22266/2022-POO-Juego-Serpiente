import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound myMusic = new GreenfootSound("soundss.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Jugador Jugador1 = new Jugador(0,255,0);
    Contador Contador1 = new Contador();
    int cont = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        getBackground().setColor(Color.GRAY);
        getBackground().fill();
        addObject(Jugador1,300,300);
        addObject(Contador1,70,50);
        prepare();
    }

    public void act(){
        cont++;
        if(cont > 25){
            addObject(new Comida(0,0,255), Greenfoot.getRandomNumber(getWidth() -1),Greenfoot.getRandomNumber(getHeight() -1));
            cont = 0; }
        myMusic.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
