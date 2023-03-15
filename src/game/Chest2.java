package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Chest2 extends StaticBody {
    private static final Shape chestShape = new BoxShape(0.5f, 1);
    private static final BodyImage image = new BodyImage("data/chest.png", 4f);

    public Chest2(World world)
    {
        super(world, chestShape);
        AttachedImage ci = this.addImage(image);
        ci.setOffset(new Vec2(0,-2f));
    }


}