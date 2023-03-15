package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class Coin extends DynamicBody {
    private static final Shape coinShape = new BoxShape(0.5f, 1);
    private static final BodyImage image = new BodyImage("data/coin.gif", 2);

    public Coin(World world)
    {
        super(world, coinShape);
        AttachedImage ci = this.addImage(image);
        ci.setOffset(new Vec2(0,1));

    }


}
