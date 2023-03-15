package game;

import city.cs.engine.*;
import city.cs.engine.Shape;

import javax.swing.*;
import java.awt.*;



public class GameView extends UserView
{
    private Image background;
    private Image endScreen;
    private PurpleBoy purpleBoy;

    private Image lives;




    public GameView (GameWorld world, PurpleBoy purpleBoy,int width, int height)
    {

        super(world, width, height);
        this.purpleBoy = purpleBoy;
        background = new ImageIcon("data/bg.gif" ).getImage() ;
        endScreen = new ImageIcon("data/gameover.png").getImage();

        Image i3= new ImageIcon("data/3alive.png").getImage();


        lives = i3;

        //.getScaledInstance(20,20,Image.SCALE_DEFAULT));


    }
    protected void paintBackground(Graphics2D g) {

        g.drawImage(background, 0, 0, 1280,720,this);


    }

    protected void paintForeground(Graphics2D g) {
        g.drawImage(lives, 20, 600, 170,70,this);
       g.drawString("SCORE:" + purpleBoy.getCredits(), 20,200);





    }

    public void updateLives(Image i){
        lives = i;

    }

}
