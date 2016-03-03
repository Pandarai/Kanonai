/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanonaionline;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.fills.GradientFill;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.svg.Gradient;
import org.newdawn.slick.svg.RadialGradientFill;

/**
 *
 * @author Charley_Micu
 */
public class MainMenu implements GameState {

    public int movex, movey;
    private Image menu_play;
    
    @Override
    public int getID() {
        return 1;
    }

    public MainMenu() throws SlickException{
        menu_play = new Image("res/menu_play.bmp", new Color(195,195,195));
    }
    
    @Override
    public void init(GameContainer container, StateBasedGame game) throws SlickException {
        
        render(container, game, new Graphics());
    }

    @Override
    public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
        GradientFill grad = new GradientFill(container.getWidth()/2, 0, Color.lightGray, container.getWidth()/2, container.getScreenHeight()/5, Color.white, true);
        Rectangle rect = new Rectangle(0, 0, 800, 500);
        g.fill(rect, grad);
        
        float centerx = container.getWidth()/2 - menu_play.getWidth()/2;
        float centery = container.getHeight()/3 - menu_play.getHeight()/2;
        
        g.drawImage(menu_play, centerx, centery);
    }

    @Override
    public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
    }

    @Override
    public void enter(GameContainer container, StateBasedGame game) throws SlickException {
    }

    @Override
    public void leave(GameContainer container, StateBasedGame game) throws SlickException {
    }

    @Override
    public void mouseWheelMoved(int change) {
    }

    @Override
    public void mouseClicked(int button, int x, int y, int clickCount) {
    }

    @Override
    public void mousePressed(int button, int x, int y) {
    }

    @Override
    public void mouseReleased(int button, int x, int y) {
    }

    @Override
    public void mouseMoved(int oldx, int oldy, int newx, int newy) {
        movex = newx;
        movey = newy;
    }

    @Override
    public void mouseDragged(int oldx, int oldy, int newx, int newy) {
    }

    @Override
    public void setInput(Input input) {
    }

    @Override
    public void inputEnded() {
    }

    @Override
    public void inputStarted() {
    }

    @Override
    public void keyPressed(int key, char c) {
    }

    @Override
    public void keyReleased(int key, char c) {
    }

    @Override
    public void controllerLeftPressed(int controller) {
    }

    @Override
    public void controllerLeftReleased(int controller) {
    }

    @Override
    public void controllerRightPressed(int controller) {
    }

    @Override
    public void controllerRightReleased(int controller) {
    }

    @Override
    public void controllerUpPressed(int controller) {
    }

    @Override
    public void controllerUpReleased(int controller) {
    }

    @Override
    public void controllerDownPressed(int controller) {
    }

    @Override
    public void controllerDownReleased(int controller) {
    }

    @Override
    public void controllerButtonPressed(int controller, int button) {
    }

    @Override
    public void controllerButtonReleased(int controller, int button) {
    }

    @Override
    public boolean isAcceptingInput() {
        return true;
    }
    
}
