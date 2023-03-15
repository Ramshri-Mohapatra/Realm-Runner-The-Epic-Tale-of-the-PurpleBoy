package game;

import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWorld extends World implements ActionListener
{
    PurpleBoy purpleBoy;
    PurpleBoy purpleBoy2;
    PurpleBoy purpleBoy3;
    Skeleton sk;
    Skeleton2 sk2;
    Skeleton3 sk3;
    Chest c1;
    Chest2 c2;



    SkWalking skWalking;
    StaticBody go2;
    Arrow arrow;
    Coin coin;


    public Skeleton getSk() {
        return sk;
    }

    public SkWalking getSkWalking() {
        return skWalking;
    }

    public GameWorld() {
        super();
        this.arrow = arrow;


         go2 = new StaticBody(this);
        go2.setPosition(new Vec2(100,100));
        BodyImage gameOverImage = new BodyImage("data/gameover.png", 30f);
        AttachedImage goi =  go2.addImage(gameOverImage);
        goi.setOffset(new Vec2(-7,0));


        for(int i =0; i<5; i++) {
            Shape shape = new BoxShape(50, 1.5f);
            StaticBody ground = new StaticBody(this, shape);
            ground.setPosition(new Vec2(0f +100*i, -14.5f));
            BodyImage groundImage = new BodyImage("data/ground.png", 4f);
            AttachedImage gi = ground.addImage(groundImage);
            ground.setName("ground");
        }
        Shape wallShape = new BoxShape(17, 1.5f);
        StaticBody midWall = new StaticBody(this, wallShape);
        midWall.setPosition(new Vec2(137, 0f));
        BodyImage p5Image = new BodyImage("data/p5.png", 4f);
        AttachedImage gi2 = midWall.addImage(p5Image);
        AttachedImage gi3 = midWall.addImage(p5Image);
        gi2.setOffset(new Vec2(-9,0));
        gi3.setOffset(new Vec2(7,0));

        Shape wallEndShape = new BoxShape(1f, 7f);
        StaticBody midEndWall = new StaticBody(this, wallEndShape);
        midEndWall.setPosition(new Vec2(151.5f, 7f));
        BodyImage p5EndImage = new BodyImage("data/wall2.png", 13f);
        AttachedImage gie2 = midEndWall.addImage(p5EndImage);




        //AttachedImage gi2 = ground.addImage(groundImage) ;
        //AttachedImage gi3 = ground.addImage(groundImage) ;
        //gi.setScale();
        //gi.setOffset(new Vec2(0, 7f));
        //gi2.setOffset(new Vec2(17.5f, 7f));
        //gi3.setOffset(new Vec2(-17.5f, 7f));

        Shape mountShape = new BoxShape(4, 1.7f);
        StaticBody mount = new StaticBody(this, mountShape);
        mount.setPosition(new Vec2(-7, -11.5f));
        BodyImage mountImage = new BodyImage("data/mount.png", 8f);
        AttachedImage mi = mount.addImage(mountImage);
        mi.setOffset(new Vec2(-2f, 3f));


       /* Shape platformShape1 = new BoxShape(3, 0.5f);
        StaticBody platform2 = new StaticBody(this, platformShape1);
        platform2.setPosition(new Vec2(57.5f, 12f));
        BodyImage skyMount2 = new BodyImage("data/skymount2.png", 25f);
        //platform1.setClipped(true);
        platform2.addImage(skyMount2);*/


         Shape platformShape4 = new BoxShape(4, 2f);
        StaticBody mount2 = new StaticBody(this, platformShape4);
        mount2.setPosition(new Vec2(21, -8.5f));
        //BodyImage mountImage = new BodyImage("data/mount.png", 8f);
        AttachedImage mi2 = mount2.addImage(mountImage);
        mi2.setOffset(new Vec2(-2.5f, 2f));


        /*Shape platformShape = new BoxShape(3, 0.5f);
        StaticBody platform1 = new StaticBody(this, platformShape);
        platform1.setPosition(new Vec2(-1, 12f));
        BodyImage skyMount = new BodyImage("data/skymount2.png", 25f);
        //platform1.setClipped(true);
        platform1.addImage(skyMount);*/

        c1 = new Chest(this);
        c1.setPosition(new Vec2(49,-1));
        c2 =  new Chest2(this);
        c2.setPosition(new Vec2(147,-1));


        for(int i =5; i>=0; i--) {Shape platformShape3 = new BoxShape(3, 0.5f);
        StaticBody platform4 = new StaticBody(this, platformShape3);
        platform4.setPosition(new Vec2(0 + 58f*i, 12f));
        BodyImage skyMount3 = new BodyImage("data/skymount2.png", 25f);
        //platform1.setClipped(true);
        platform4.addImage(skyMount3);}

        for(int i = 0; i<5; i++){Shape skyBoxShape = new BoxShape(50, 1.5f);
        StaticBody skyBox = new StaticBody(this, skyBoxShape);
        skyBox.setPosition(new Vec2(0+100*i, 14.5f));
        BodyImage skyBoxImage = new BodyImage("data/ground.png", 4f);
        AttachedImage si = skyBox.addImage(skyBoxImage) ;}

        Shape wall1Shape = new BoxShape(0.5f, 5f);
        StaticBody wall1 = new StaticBody(this, wall1Shape);
        wall1.setPosition(new Vec2(5.5f, 5f));
        BodyImage wall1Image = new BodyImage("data/wall1.png", 15f);
        AttachedImage wi = wall1.addImage(wall1Image) ;

        Shape wall1BaseShape = new BoxShape(3, 0.5f);
        StaticBody wall1Base = new StaticBody(this, wall1BaseShape);
        wall1Base.setPosition(new Vec2(8.5f, 0f));

       /* Shape platform5Shape = new BoxShape(7, 1.5f);
        StaticBody platform5 = new StaticBody(this, platform5Shape);
        platform5.setPosition(new Vec2(35, -10.5f));
        BodyImage platform5Image = new BodyImage("data/p5.png", 4f);
        AttachedImage p5i = platform5.addImage(platform5Image);
        p5i.setOffset(new Vec2(0.5f, -1f));*/

         Shape platform6Shape = new BoxShape(15, 0.5f);
        StaticBody platform6 = new StaticBody(this, platform6Shape);
        platform6.setPosition(new Vec2(50, -5.5f));
        BodyImage platform6Image = new BodyImage("data/p6.png", 15f);
        AttachedImage p6i = platform6.addImage(platform6Image);
      // p6i.setOffset(new Vec2(-0.5f, -1f));

        Shape wall2Shape = new BoxShape(0.5f, 10.5f);
        StaticBody wall2 = new StaticBody(this, wall2Shape);
        wall2.setPosition(new Vec2(37f, 3f));
        BodyImage wall2Image = new BodyImage("data/wall2.png", 17f);
        AttachedImage w2i = wall2.addImage(wall2Image);
        w2i.setOffset(new Vec2(0.5f, 2f));

        //ridge
       Shape ridgeShape = new BoxShape(7, 5f);
        StaticBody ridge = new StaticBody(this, ridgeShape);
        ridge.setPosition(new Vec2(90, -7.5f));
        BodyImage ridgeImage = new BodyImage("data/ridge.png", 13f);
        AttachedImage ri = ridge.addImage(ridgeImage);
        ri.setOffset(new Vec2(0, 1f));









        // make a suspended platform




        purpleBoy = new PurpleBoy(this);
        purpleBoy.setPosition(new Vec2(-15, -5));



        //life2

       purpleBoy2= new PurpleBoy(this);
        purpleBoy2.setPosition(new Vec2(-35, -5));

        //life3
        purpleBoy3= new PurpleBoy(this);
        purpleBoy3.setPosition(new Vec2(-35, -5));



        //GameCollisionListener gcl = new GameCollisionListener();
        //purpleBoy.addCollisionListener(gcl);
        //coin
        sk =new Skeleton(this);
        sk.setPosition(new Vec2(56,0));
        sk2 =new Skeleton2(this);
        sk2.setPosition(new Vec2(146,-10));
        sk3 =new Skeleton3(this);
        sk3.setPosition(new Vec2(135,-10));
        new Traps(this).setPosition(new Vec2(78, -10));
        new Traps(this).setPosition(new Vec2(108, -10));
        Shape bugShape = new BoxShape(0.5f, 0.8f);
        StaticBody bugRemover = new StaticBody(this,bugShape);
        bugRemover.setPosition(new Vec2(72,-10));

        SkeletonDeath skd = new SkeletonDeath(this);
        sk.addDestructionListener(skd);
        //SkeletonDeath skd2 = new SkeletonDeath(this);
        sk2.addDestructionListener(skd);
        //SkeletonDeath skd3 = new SkeletonDeath(this);
        sk3.addDestructionListener(skd);











        new Coin(this).setPosition(new Vec2(9,3));
        new Coin(this).setPosition(new Vec2(-6,-7.5f));
        new Coin(this).setPosition(new Vec2(21,-6));
        new Coin(this).setPosition(new Vec2(23,-6));

        new ViewChangeBox(this).setPosition(new Vec2(37.5f,-1));
        new ViewChangeBox2(this).setPosition(new Vec2(98f,-1));
        new ViewChangeBox3(this).setPosition(new Vec2(155f,-1));

        /*Shape gameOverShape2 = new BoxShape(0.5f, 10.5f);
        StaticBody gameOver2 = new StaticBody(this, gameOverShape2);

        BodyImage gameOverImage = new BodyImage("data/gameover.png", 17f);
        AttachedImage go2i = gameOver2.addImage(gameOverImage);
        go2i.setOffset(new Vec2(0.5f, 2f));*/
        skWalking = new SkWalking(this);
        skWalking.setPosition(new Vec2(134, 10));
        SkeletonDeath skd1 = new SkeletonDeath(this);
        skWalking.addDestructionListener(skd1);



        //Arrow cameraCentre = new Arrow(this);
       // arrow = new Arrow(this, view);
        //arrow.setPosition(new Vec2(0, 0));



        Timer t = new Timer(10000, this );
        t.start();


    }




    public PurpleBoy getPurpleBoy(){
       return purpleBoy;
    }
    public PurpleBoy getPurpleBoy2(){
        return purpleBoy2;
    }
    public PurpleBoy getPurpleBoy3(){
        return purpleBoy3;
    }
    public StaticBody getGo2(){
        return go2;
    }
    public Skeleton2 getSk2() {
        return sk2;
    }

    public Skeleton3 getSk3() {
        return sk3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {





    }
}
