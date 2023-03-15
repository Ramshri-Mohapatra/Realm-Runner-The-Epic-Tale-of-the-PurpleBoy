package game;

import city.cs.engine.*;

public class ViewChangeBox extends StaticBody {
    private static final Shape viewBoxShape = new BoxShape(0.5f, 15);


    public ViewChangeBox(World world)
    {
        super(world, viewBoxShape);


    }
}
