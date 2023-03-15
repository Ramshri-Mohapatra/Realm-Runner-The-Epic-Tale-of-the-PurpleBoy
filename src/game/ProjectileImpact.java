package game;

import city.cs.engine.*;

import java.net.CookiePolicy;

public class ProjectileImpact implements CollisionListener {


    @Override

    public void collide(CollisionEvent ce2) {

        ce2.getReportingBody().destroy();

        if (ce2.getOtherBody() instanceof Skeleton) {
            ce2.getOtherBody().destroy();



        }
        if (ce2.getOtherBody() instanceof Skeleton2) {
            ce2.getOtherBody().destroy();


        }
        if (ce2.getOtherBody() instanceof Skeleton3) {
            ce2.getOtherBody().destroy();


        }
        if (ce2.getOtherBody() instanceof SkWalking) {
            ce2.getOtherBody().destroy();


        }
    }
}
