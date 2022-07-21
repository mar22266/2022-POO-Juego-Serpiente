import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int v;
    int a;
    int r;
    int speed = 5;
    int cont = 0;
    public Jugador(int r, int v, int a){
        setRotation(270);
        this.r = r;
        this.v = v;
        this.a = a;
        getImage().setColor(new Color(r,v,a));
        getImage().fillOval(0,0,50,50);
    }
    public void act()
    {
        cont++;
        getWorld().addObject(new Cola(r, v, a), getX(),getY());
        
        move(speed);
        
        moveAround();
        eatComida();
        
        if(Greenfoot.isKeyDown("right"))
            {setRotation(0);
            }
        if(Greenfoot.isKeyDown("left"))
            {setRotation(180);
            }
        if(Greenfoot.isKeyDown("up"))
            {setRotation(270);
            }
        if(Greenfoot.isKeyDown("down"))
            {setRotation(90);
            }
        
    }
    public void moveAround(){
        if(Greenfoot.isKeyDown("right"))
            {setRotation(0);
            }
        if(Greenfoot.isKeyDown("left"))
            {setRotation(180);
        }
        if(Greenfoot.isKeyDown("up"))
            {setRotation(270);
            }
        if(Greenfoot.isKeyDown("down"))
           { setRotation(90);
            }
    }
    public void eatComida(){
        if(isTouching(Comida.class))
        {   
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.Contador1.addPunteo();
        }
    
    }
}
