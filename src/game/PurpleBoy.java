package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class PurpleBoy extends Walker
{

    private static final Shape studentShape = new BoxShape(1, 2);
    private static final BodyImage image = new BodyImage("data/game.png", 6f);

    private int credits=0 ;

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public PurpleBoy(World world)
    {
        super(world, studentShape);
        this.addImage(image);

    }


}
