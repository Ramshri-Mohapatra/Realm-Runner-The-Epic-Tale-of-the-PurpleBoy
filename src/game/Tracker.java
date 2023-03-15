package game;

import city.cs.engine.StepEvent;
import city.cs.engine.StepListener;
import org.jbox2d.common.Vec2;

public class Tracker implements StepListener {
    private GameView view;
    private PurpleBoy purpleBoy;

    public Tracker(GameView view, PurpleBoy purpleBoy) {
        this.view = view;
        this.purpleBoy = purpleBoy;
    }

    public void preStep(StepEvent e) {
    }

    public void postStep(StepEvent e) {
        view.setCentre(new Vec2(purpleBoy.getPosition()));
    }

}
