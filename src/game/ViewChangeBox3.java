package game;

import city.cs.engine.BoxShape;
import city.cs.engine.Shape;
import city.cs.engine.StaticBody;
import city.cs.engine.World;

public class ViewChangeBox3 extends StaticBody {
    private static final Shape viewBoxShape = new BoxShape(0.5f, 15);


    public ViewChangeBox3(World world)
    {
        super(world, viewBoxShape);


    }
}
