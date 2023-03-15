package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Arrow2 extends StaticBody implements StepListener {

    private static final Shape liftShape = new BoxShape(0.5f, 0.5f);

    private static final BodyImage image = new BodyImage("data/arrow.png", 2);
    private Vec2 startPosition;
    private float top, bottom;

    private GameView view;
    private float delta;

    /*
    This implementation works for static bodies that don't have a startWalking method. The body
    is moved using multiple calls to setPosition();
     */

    public Arrow2(World w, GameView view) {
        super(w, liftShape);
        AttachedImage ai = this.addImage(image);
         ai.setOffset(new Vec2(0,0));
        this.view = view;
        startPosition = this.getPosition();
        bottom = startPosition.x;
        top = startPosition.x+120;
        delta=0.1f;
        w.addStepListener(this);
    }

    @Override
    public void preStep(StepEvent stepEvent) {
        if (getPosition().x < bottom){
            this.setPosition(startPosition);
            delta*=-1;
        }
        if (getPosition().x > top){
            delta*=0;
        }



        this.setPosition(new Vec2(this.getPosition().x+delta, this.getPosition().y));


        // System.out.println( this.getPosition().x + " " + this.getPosition().y);
    }

    @Override
    public void postStep(StepEvent stepEvent) {
        view.setCentre(new Vec2(this.getPosition()));


    }


}