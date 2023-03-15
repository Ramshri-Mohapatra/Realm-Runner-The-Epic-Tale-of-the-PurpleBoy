package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Traps extends StaticBody {
    private static final Shape trapShape = new BoxShape(5f, 1f);
    private static final BodyImage image = new BodyImage("data/trap.png", 6f);

    public Traps(World world)
    {
        super(world, trapShape);
        AttachedImage ci = this.addImage(image);
        ci.setOffset(new Vec2(-2f,-1f));
    }


}
