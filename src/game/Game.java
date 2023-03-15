package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;

/**
 * Your main game entry point
 */
public class Game {


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        GameWorld world = new GameWorld();


        //2. populate it with bodies (ex: platforms, collectibles, characters)

        //make a ground platform


        //make a character (with an overlaid image)
        //Shape studentShape = new BoxShape(1,2);



        //student.addImage(new BodyImage("data/student.png", 4));



        //3. make a view to look into the game world
        GameView view = new GameView(world, world.getPurpleBoy(),1280, 680);



        GameCollisionListener gcl = new GameCollisionListener(view, world);
        world.purpleBoy.addCollisionListener(gcl);
        //GameCollisionListener gcl = new GameCollisionListener(view, world);
        world.purpleBoy2.addCollisionListener(gcl);
        world.purpleBoy3.addCollisionListener(gcl);
        world.c1.addCollisionListener(gcl);
        world.c2.addCollisionListener(gcl);



        Lives l = new Lives(view,world,world.purpleBoy);
        world.purpleBoy.addDestructionListener(l);

        Lives l2 = new Lives(view,world,world.purpleBoy2);
        world.purpleBoy2.addDestructionListener(l2);
        Lives l3 = new Lives(view,world,world.purpleBoy3);
        world.purpleBoy3.addDestructionListener(l3);
        //Lives l2 = new Lives(view,world,world.purpleBoy);
       // world.purpleBoy.addDestructionListener(l2);
        //view.setCentre(new Vec2(5,0));
        view.setCentre(new Vec2(5,0));












        //optional: draw a 1-metre grid over the view
        // view.setGridResolution(1);


        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("City Game");
        frame.add(view);

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
         JFrame debugView = new DebugViewer(world, 1000, 1000);


        // start our game world simulation!
        world.start();

        world.getPurpleBoy() ;

        //purpleBoyController
       PurpleBoyController purpleBoyController = new PurpleBoyController( world.getPurpleBoy());
        view.addKeyListener(purpleBoyController);


        view.addMouseListener(new GiveFocus(view));

        //Tracker tracker = new Tracker(view, world.getPurpleBoy());
        //world.addStepListener(tracker);
        //Arrow arrow = new Arrow(world, view);
        //arrow.setPosition(new Vec2(0, 0));
        FlyingPlatform f =  new FlyingPlatform(world,view);
        f.setPosition(new Vec2(76,0));
        FlyingPlatform2 f2 =  new FlyingPlatform2(world,view);
        f2.setPosition(new Vec2(100,-4));






    }

    /** Run the game. */
    public static void main(String[] args) {
        new Game( );








    }
}
