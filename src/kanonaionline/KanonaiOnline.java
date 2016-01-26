/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanonaionline;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Charley_Micu
 */
public class KanonaiOnline extends StateBasedGame {

    
    // Game state identifiers
    public static final int MAINMENU     = 1;
    public static final int GAME         = 2;

    // Application Properties
    public static final int WIDTH   = 800;
    public static final int HEIGHT  = 500;
    public static final int FPS     = 60;
    public static final double VERSION = 1.0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        try {
            AppGameContainer app;
            app = new AppGameContainer(new KanonaiOnline("Kanoi"));
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        } catch(SlickException e) {
        }
    }

    public KanonaiOnline(String name) {
        super(name);
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        // The first state added will be the one that is loaded first, when the application is launched
        this.addState(new SplashScreen());
        //this.addState(new MainMenu(MAINMENU));
        //this.addState(new Game(GAME));
    }
    
}
