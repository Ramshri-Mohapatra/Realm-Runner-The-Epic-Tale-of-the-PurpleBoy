package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class FlyingPlatform2 extends StaticBody implements StepListener {

    private static final Shape liftShape = new BoxShape(3f, 0.5f);

    private static final BodyImage image = new BodyImage("data/mount.png", 8f);
    private Vec2 startPosition;
    private float top, bottom;
    private GameView view;


    private float delta;

    /*
    This implementation works for static bodies that don't have a startWalking method. The body
    is moved using multiple calls to setPosition();
     */

    public FlyingPlatform2(World w, GameView view) {
        super(w, liftShape);
        this.view = view;
        AttachedImage ai = this.addImage(image);
         ai.setOffset(new Vec2(-3.5f,1));

        startPosition = this.getPosition();
        bottom = 100;
        System.out.println(startPosition.x);
        top = startPosition.x + 115;
        delta = 0.05f;
        w.addStepListener(this);
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x < bottom) {

            delta *= -1;
        }
        if (getPosition().x > top) {
            //this.setPosition(startPosition);
            delta *= -1;
        }


        this.setPosition(new Vec2(this.getPosition().x+ delta, this.getPosition().y ));


       //  System.out.println( this.getPosition().x + " " + this.getPosition().y);
    }

    @Override
    public void postStep(StepEvent stepEvent) {
        //view.setCentre(new Vec2(this.getPosition()));


    }

}
