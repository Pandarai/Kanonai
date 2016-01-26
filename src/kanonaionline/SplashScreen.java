/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanonaionline;

import java.util.concurrent.ThreadLocalRandom;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author Charley_Micu
 */
public class SplashScreen implements GameState {

    private final int ID = 0;
    
    private final Image splash;
    
    private final int[][] color = new int[100][3];
    
    @Override
    public int getID() {
        return ID;
    }
    
    public SplashScreen() throws SlickException{
        this.splash = new Image("res/splash.png");
        
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 3; j++){
                color[i][j] = randInt();
            }
        }
        render(gc, sbg, new Graphics());
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        splash.draw();
        
        for(int i = 0; i < 100; i++){
            grphcs.setColor(new Color(color[i][0], color[i][1], color[i][2]));
            grphcs.fillRect(8*i, 0, 8, 8);
        }
        
        
    }
    
    public static int randInt() {

        int randomNum = ThreadLocalRandom.current().nextInt(100, 255 + 1);

        return randomNum;
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        
    }

    @Override
    public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException {
       
    }

    @Override
    public void leave(GameContainer gc, StateBasedGame sbg) throws SlickException {
        
    }

    @Override
    public void mouseWheelMoved(int i) {
        
    }

    @Override
    public void mouseClicked(int i, int i1, int i2, int i3) {
        
    }

    @Override
    public void mousePressed(int i, int i1, int i2) {
        
    }

    @Override
    public void mouseReleased(int i, int i1, int i2) {
        
    }

    @Override
    public void mouseMoved(int i, int i1, int i2, int i3) {
        
    }

    @Override
    public void mouseDragged(int i, int i1, int i2, int i3) {
        
    }

    @Override
    public void setInput(Input input) {
        
    }

    @Override
    public boolean isAcceptingInput() {
       return false; 
    }

    @Override
    public void inputEnded() {
        
    }

    @Override
    public void inputStarted() {
        
    }

    @Override
    public void keyPressed(int i, char c) {
        
    }

    @Override
    public void keyReleased(int i, char c) {
        
    }

    @Override
    public void controllerLeftPressed(int i) {
        
    }

    @Override
    public void controllerLeftReleased(int i) {
       
    }

    @Override
    public void controllerRightPressed(int i) {
       
    }

    @Override
    public void controllerRightReleased(int i) {
        
    }

    @Override
    public void controllerUpPressed(int i) {
       
    }

    @Override
    public void controllerUpReleased(int i) {
       
    }

    @Override
    public void controllerDownPressed(int i) {
        
    }

    @Override
    public void controllerDownReleased(int i) {
       
    }

    @Override
    public void controllerButtonPressed(int i, int i1) {
       
    }

    @Override
    public void controllerButtonReleased(int i, int i1) {
        
    }
    
}
