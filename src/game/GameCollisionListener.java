package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

import javax.swing.*;

public class GameCollisionListener implements CollisionListener {

    private GameView view;
    private GameWorld world;

    Arrow arrow ;
    Arrow2 arrow2;

    public Arrow2 getArrow2() {
        return arrow2;
    }

    public Arrow getArrow() {
        return arrow;
    }

    public GameCollisionListener(GameView view, GameWorld world){
        this.view=view;

        this.world = world;








    }


    @Override
    public void collide(CollisionEvent ce) {

        if(ce.getOtherBody() instanceof Coin){
            ce.getReportingBody();
            ce.getOtherBody().destroy();
            world.getPurpleBoy().setCredits(world.getPurpleBoy().getCredits()+5);
            System.out.println(world.getPurpleBoy().getCredits());
            world.getPurpleBoy2().setCredits(world.getPurpleBoy2().getCredits()+5);
            System.out.println(world.getPurpleBoy2().getCredits());
            world.getPurpleBoy3().setCredits(world.getPurpleBoy2().getCredits()+5);
            System.out.println(world.getPurpleBoy3().getCredits());

        }
        if(ce.getOtherBody() instanceof ViewChangeBox){
            ce.getOtherBody().destroy();
            arrow = new Arrow(world, view);
            arrow.setPosition(new Vec2(32.5f, 0));
            ArrowDestroyTimer ti = new ArrowDestroyTimer(this);
            Timer timer = new Timer(6000, ti);
            timer.start();


            }

        if(ce.getOtherBody() instanceof Arrow){

            ce.getOtherBody().destroy();
        }
        if(ce.getOtherBody() instanceof ViewChangeBox2){
            ce.getOtherBody().destroy();
            arrow2 = new Arrow2(world, view);
            arrow2.setPosition(new Vec2(100f, 0));
            ArrowDestroyTimer2 ti2 = new ArrowDestroyTimer2(this);
            Timer timer = new Timer(4000, ti2);
            timer.start();

        }
        if(ce.getOtherBody() instanceof ViewChangeBox3){
            ce.getOtherBody().destroy();
            view.setCentre(new Vec2(175,0));

        }

        if(ce.getOtherBody() instanceof Chest){

            ce.getOtherBody().destroy();
            for(int i =0; i<5; i++){
                Coin c = new Coin(world);
                c.setPosition(new Vec2(49,6));
            }
        }
        if(ce.getOtherBody() instanceof Chest2){

            ce.getOtherBody().destroy();
            for(int i =0; i<5; i++){
                Coin c2 = new Coin(world);
                c2.setPosition(new Vec2(147,5));
            }
        }



        if(ce.getOtherBody() instanceof Traps){


            ce.getReportingBody().destroy();


        }

        if(ce.getOtherBody() instanceof Skeleton){

            ce.getReportingBody().destroy();


        }
        if(ce.getOtherBody() instanceof Skeleton2){

            ce.getReportingBody().destroy();


        }
        if(ce.getOtherBody() instanceof Skeleton2){

            ce.getReportingBody().destroy();


        }
        if(ce.getOtherBody() instanceof Skeleton2){
            ce.getReportingBody().destroy();
        }
        if(ce.getOtherBody() instanceof Skeleton3){
            ce.getReportingBody().destroy();
        }
        if(ce.getOtherBody() instanceof SkWalking){
            ce.getReportingBody().destroy();
        }




    }



    }



