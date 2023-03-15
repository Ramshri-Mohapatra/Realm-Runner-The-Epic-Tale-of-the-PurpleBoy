package game;

import city.cs.engine.AttachedImage;
import city.cs.engine.BodyImage;
import city.cs.engine.CircleShape;
import city.cs.engine.DynamicBody;
import org.jbox2d.common.Vec2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PurpleBoyController implements KeyListener {

    private PurpleBoy purpleBoy;

   private BodyImage image2;


   private boolean shootRight ;

    public PurpleBoyController(PurpleBoy purpleBoy){
        this.purpleBoy = purpleBoy;



    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        image2 = new BodyImage("data/animation.gif", 6.5f);
        //System.out.println( "Key Pressed1" + " " + e.getKeyChar());






        int code = e.getKeyCode();

        if(code == KeyEvent.VK_A){

            purpleBoy.startWalking(-7);
            purpleBoy.removeAllImages();
            AttachedImage im2 = purpleBoy.addImage(image2);
            im2.flipHorizontal();
            shootRight = false;
            //System.out.println(shootRight);




        }
       else if (code == KeyEvent.VK_W){
            purpleBoy.jump(20);
            purpleBoy.setGravityScale(1);




            //im.setOffset(new Vec2(2.1f,0));
          //  im.setRotation(-0.5f);
            //student.addImage(image2);



        }
       else if (code == KeyEvent.VK_D){
            purpleBoy.startWalking(7);

            purpleBoy.removeAllImages();
            AttachedImage im2 = purpleBoy.addImage(image2);
            shootRight =true;
           // System.out.println(shootRight);
            //im2.setOffset(new Vec2(0, 1.4f));

            //student.addImage(image2);


           // im.setOffset(new Vec2(2.1f,0));

           // im.flipHorizontal();


        }
       if(code == KeyEvent.VK_S){
           if(shootRight == false){
               DynamicBody projectile1 = new DynamicBody(purpleBoy.getWorld(), new CircleShape(0.2f));
               ProjectileImpact pi1 = new ProjectileImpact();
               projectile1.setGravityScale(0);
               projectile1.addCollisionListener(pi1);
               projectile1.setPosition(new Vec2(purpleBoy.getPosition().x + -2.3f,purpleBoy.getPosition().y+1.9f));
               projectile1.setLinearVelocity(new Vec2(-10,0));
               BodyImage bImage = new BodyImage("data/bullet.png", 0.2f);
               AttachedImage bi = projectile1.addImage(bImage);


               purpleBoy.removeAllImages();
              BodyImage image3 = new BodyImage("data/gunleft.png", 6f);
               AttachedImage gl = purpleBoy.addImage(image3);
               gl.setOffset(new Vec2(0,0.5f));

           }
           if(shootRight == true){
               DynamicBody projectile2 = new DynamicBody(purpleBoy.getWorld(), new CircleShape(0.1f));
               ProjectileImpact pi1 = new ProjectileImpact();
               projectile2.setGravityScale(0);
               projectile2.addCollisionListener(pi1);
               projectile2.setPosition(new Vec2(purpleBoy.getPosition().x + 2.5f,purpleBoy.getPosition().y+1.9f));
               projectile2.setLinearVelocity(new Vec2(10,0));
               BodyImage bImage = new BodyImage("data/bullet.png", 0.1f);
               AttachedImage bi2 = projectile2.addImage(bImage);
               bi2.flipHorizontal();

               purpleBoy.removeAllImages();
               BodyImage image4 = new BodyImage("data/gunright.png", 6f);
               AttachedImage gl = purpleBoy.addImage(image4);
               gl.setOffset(new Vec2(0,0.5f));
           }

        }


    }



    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();
        if(code == KeyEvent.VK_A) {

            purpleBoy.stopWalking();
            purpleBoy.applyForce(new Vec2(10000,0));

        }
        if(code == KeyEvent.VK_D) {

            purpleBoy.stopWalking();
            purpleBoy.applyForce(new Vec2(-10000,0));


        }
        if(code == KeyEvent.VK_W) {

            purpleBoy.stopWalking();
            purpleBoy.setGravityScale(6);

        }


    }
    /*public void Shoot(){

        DynamicBody projectile = new DynamicBody(purpleBoy.getWorld(), new CircleShape(0.2f));
        projectile.setPosition(purpleBoy.getPosition());
        projectile.setLinearVelocity(new Vec2(1,0));


    }*/
}
