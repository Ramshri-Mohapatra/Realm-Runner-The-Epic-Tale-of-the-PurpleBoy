package game;

import city.cs.engine.*;
import org.jbox2d.common.Vec2;

public class SkeletonDeath implements DestructionListener {

    GameWorld world;

    public SkeletonDeath(GameWorld world) {
        this.world = world;
    }

    @Override
    public void destroy(DestructionEvent destructionEvent) {

        if (destructionEvent.getSource() instanceof Skeleton){

            Shape shape = new BoxShape(0.1f, 0.1f);
            StaticBody skDeath = new StaticBody(world, shape);
            //GhostlyFixture gh = new GhostlyFixture(skDeath,shape);
            skDeath.setPosition(new Vec2(world.getSk().getPosition().x,world.getSk().getPosition().y-5 ));
            BodyImage ski = new BodyImage("data/skdeath.gif", 8f);
            AttachedImage skdi = skDeath.addImage(ski);
            skdi.setOffset(new Vec2(0, 5));
            skDeath.setName("skdeath");
        }
        if (destructionEvent.getSource() instanceof Skeleton2){

            Shape shape2 = new BoxShape(0.1f, 0.1f);
            StaticBody skDeath2 = new StaticBody(world, shape2);
            //GhostlyFixture gh = new GhostlyFixture(skDeath,shape);
            skDeath2.setPosition(new Vec2(world.getSk2().getPosition().x,world.getSk2().getPosition().y -5));
            BodyImage ski2 = new BodyImage("data/skdeath.gif", 8f);
            AttachedImage skdi2 = skDeath2.addImage(ski2);
            skdi2.setOffset(new Vec2(0, 5));
            skDeath2.setName("skdeath2");
        }
        if (destructionEvent.getSource() instanceof Skeleton3){

            Shape shape3 = new BoxShape(0.1f, 0.1f);
            StaticBody skDeath3 = new StaticBody(world, shape3);
            //GhostlyFixture gh = new GhostlyFixture(skDeath,shape);
            skDeath3.setPosition(new Vec2(world.getSk3().getPosition().x,world.getSk3().getPosition().y-5 ));
            BodyImage ski3 = new BodyImage("data/skdeath.gif", 8f);
            AttachedImage skdi3 = skDeath3.addImage(ski3);
            skdi3.setOffset(new Vec2(0, 5));
            skDeath3.setName("skdeath3");
        }
        if (destructionEvent.getSource() instanceof SkWalking){

            Shape skshape = new BoxShape(0.1f, 0.1f);
            StaticBody skDeath2 = new StaticBody(world, skshape);
            //GhostlyFixture gh = new GhostlyFixture(skDeath,shape);
            skDeath2.setPosition(new Vec2(world.getSkWalking().getPosition().x,world.getSkWalking().getPosition().y-5 ));
            BodyImage ski3 = new BodyImage("data/skdeath.gif", 8f);
            AttachedImage skdi2 = skDeath2.addImage(ski3);
            skdi2.setOffset(new Vec2(0, 5));

        }


    }
}
