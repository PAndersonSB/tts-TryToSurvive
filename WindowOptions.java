import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WindowOptions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.*;

public class WindowOptions extends World
{

    /**
     * Constructor for objects of class WindowOptions.
     * 
     */
    private GreenfootSound backgroundMusic;
    
    private Button jogar= new Button("jogar.png");
    private Button sair= new Button("sair.png");
    private Button projeto= new Button("projeto.png");
    private Button comandos= new Button("comandos.png");
    
    public WindowOptions(GreenfootSound backgroundMusic)
    {    
        super(1000, 500, 1);
        
        setBackground("windows/WindowOptions.png");
        this.backgroundMusic = backgroundMusic;
        
        addObject(jogar,90,170);
        addObject(comandos,90,240);
        addObject(projeto,90,310);
        addObject(sair,90,380);
        
    }
    public void act() {
        if (Greenfoot.mouseClicked(jogar)){
           Greenfoot.setWorld(new WindowSelectActor(backgroundMusic) );
        }
        if (Greenfoot.mouseClicked(comandos)){
            setBackground("windows/WindowComandos.png");
        }
        if (Greenfoot.mouseClicked(projeto)){
            setBackground("windows/WindowProject.png");
        }
        if (Greenfoot.mouseClicked(sair)){  
            Greenfoot.stop();
        }
    }
}
