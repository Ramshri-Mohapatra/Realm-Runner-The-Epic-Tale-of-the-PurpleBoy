package game;

import city.cs.engine.*;

public class Skeleton extends Walker
{

    private static final Shape studentShape = new BoxShape(2, 2.3f);
    private static final BodyImage image = new BodyImage("data/sk1.gif", 11f);








    public Skeleton(World world)
    {
        super(world, studentShape);
        this.addImage(image);

    }
}
