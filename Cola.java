import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola extends Actor
{
    /**
     * Act - do whatever the Cola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, v, a;
    int cont = 0;
    int contLenght = 0;
    static int jugadorLenght = 1;
    public Cola(int r, int v, int a){
        this.r = r;
        this.v = v;
        this.a = a;
        getImage().setColor(new Color(r,v,a));
        getImage().fillOval(0,0,50,50);
    }
    public void act()
    {
        contLenght++;
        

        if(contLenght > 40 && isTouching(Jugador.class))
        {
            getWorld().addObject(new Perdiste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(contLenght % jugadorLenght == 0){
            getWorld().removeObject(this);
            jugadorLenght++;
        }
        
        
        
        /*cont++;
        if (cont > 70)
        getWorld().removeObject(this);
        // Add your action code here.*/
    }
}
