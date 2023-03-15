package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class SkWalking extends Walker implements StepListener {

    private static final BodyImage skImage = new BodyImage("data/skwalking.gif", 8f);
    private static final Shape skShape = new BoxShape(1,2);
    private final int SPEED = 4;

    /*
    This implementation of moving is useful for multiple enemies with independent movement as
    each instance you create moves relative to its starting position. The range value can be
    increased to increase the amount of movement.
     */

    private float left, right;
    private final int RANGE = 9;

    public SkWalking(World world) {
        super(world,skShape);
        addImage(skImage);
        world.addStepListener(this);
        startWalking(SPEED);
    }

    @Override
    public void setPosition(Vec2 position) {
        super.setPosition(position);
        left = position.x-RANGE;
        right = position.x+RANGE;
    }

    @Override
    public void preStep(StepEvent stepEvent)
    {
        this.removeAllImages();
        AttachedImage skwi =  this.addImage(skImage);

        if (getPosition().x > right){
            startWalking(-SPEED);
        }
        if (getPosition().x < left){
            skwi.flipHorizontal();
            startWalking(SPEED);
        }
    }

    @Override
    public void postStep(StepEvent stepEvent) {

    }
}