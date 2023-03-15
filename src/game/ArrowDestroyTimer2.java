package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArrowDestroyTimer2 implements ActionListener {

    GameCollisionListener gcl;

    public ArrowDestroyTimer2(GameCollisionListener gcl){
        this.gcl = gcl;
    }



    private int counter = 0;
    @Override



    public void actionPerformed(ActionEvent e) {

        gcl.getArrow2().destroy();




    }


}
