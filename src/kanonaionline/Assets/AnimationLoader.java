/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kanonaionline.Assets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.util.BufferedImageUtil;

/**
 *
 * @author Charley_Micu
 */
public class AnimationLoader {
    
    private final String DirLocation;
    private final int Duration;
    private final Animation Images = new Animation();
    
    public AnimationLoader(String location, int duration){
        DirLocation = location;
        Duration = duration;
        
        try {
            loadImages();
        } catch (SlickException ex) {
            Logger.getLogger(AnimationLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void loadImages() throws SlickException {
        try{
            File directory = new File(DirLocation);
            File[] contents = directory.listFiles();
            for(File image : contents){
                BufferedImage img = ImageIO.read(image);
                Texture texture = BufferedImageUtil.getTexture("", img);
                Image slickImage = new Image(texture.getImageWidth(), texture.getImageHeight());
                slickImage.setTexture(texture);
                Images.addFrame(slickImage, Duration);
            }
        } catch(IOException e){
            Logger.getLogger(AnimationLoader.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public Animation getAnimation(){
        return Images;
    }
    
}
