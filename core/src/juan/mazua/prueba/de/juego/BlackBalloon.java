package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by John on 3/26/2015.
 */
public class BlackBalloon extends Image {

    BlackBalloon p = this;

    BlackBalloon() {
        super(new Texture("Blackballoon.png"));
        setX((float)((Math.random()*5000)/Math.random()*5)%565);
        setY(-100);
        addListener(new BlackBalloonListener(this));
    }
    @Override
    public void act(float delta)
    {
        int posi;
        float posicion_vieja = getY();
        posi=(int)(Math.random()*20+1);
        if(posi>16) posi=posi*-1;
        float posicion_nueva = getY()+posi;
        setY(posicion_nueva);
        //setY(getY()+4);
    }

}