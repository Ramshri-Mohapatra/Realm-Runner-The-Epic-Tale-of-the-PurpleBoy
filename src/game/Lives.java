package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class Lives implements DestructionListener {

    private GameView view;
    private GameWorld world;
    private PurpleBoy purpleBoy;
    //private StaticBody gameOver2;

    private int livesCounter ;
    private int a;


    public  Lives(GameView view, GameWorld world, PurpleBoy purpleBoy){
        this.world = world;
        this.view = view;
        this.purpleBoy= purpleBoy;
    }



    @Override
    public void destroy(DestructionEvent de) {


        if(de.getSource() == purpleBoy){
            System.out.println("U r noob");
            //view.setCentre(new Vec2(0,0));
            purpleBoy.setPosition(new Vec2(100,100));
            PurpleBoyController purpleBoyController2 = new PurpleBoyController(world.getPurpleBoy2());
            view.addKeyListener(purpleBoyController2);
            view.addMouseListener(new GiveFocus(view));

            GameCollisionListener gcl = new GameCollisionListener(view, world);
            world.purpleBoy2.addCollisionListener(gcl);


            world.getPurpleBoy2().setPosition(new Vec2(view.getCentre().x + 4 , view.getCentre().y +5));
            Image i2 = new ImageIcon("data/2alive.png").getImage();
            view.updateLives(i2);
            //ViewChangeBox v1 = new ViewChangeBox(world);
            //v1.setPosition(new Vec2(37.5f,-1));
            //setLivesCounter(2);





        }
        if(de.getSource() == world.getPurpleBoy2()){
            setLivesCounter(1);
            System.out.println("U r noob");
            //view.setCentre(new Vec2(0,0));
            world.getPurpleBoy2().setPosition(new Vec2(100,100));
            PurpleBoyController purpleBoyController3 = new PurpleBoyController(world.getPurpleBoy3());
            view.addKeyListener(purpleBoyController3);
            view.addMouseListener(new GiveFocus(view));

            GameCollisionListener gcl = new GameCollisionListener(view, world);
            world.purpleBoy3.addCollisionListener(gcl);


            world.getPurpleBoy3().setPosition(new Vec2(view.getCentre().x + 4 , view.getCentre().y +5));
            Image i1 = new ImageIcon("data/1alive.png").getImage();
            view.updateLives(i1);
            //ViewChangeBox v1 = new ViewChangeBox(world);
            //v1.setPosition(new Vec2(37.5f,-1));
           // setLivesCounter(1);


        }
        if(de.getSource() == world.getPurpleBoy3()){
            setLivesCounter(0);
            //view.setCentre(new Vec2(0,0));
            //System.out.println("U r noob");
            //gameOver2.setPosition(new Vec2(view.getCentre()));
           world.getGo2().setPosition(new Vec2(view.getCentre().x + 4 , view.getCentre().y +5));
           Image i0 = new ImageIcon("data/0alive.png").getImage();
           view.updateLives(i0);








        }
        System.out.println(livesCounter);
    }



    public void setLivesCounter(int livesCounter) {
        this.livesCounter = livesCounter;
    }
}
