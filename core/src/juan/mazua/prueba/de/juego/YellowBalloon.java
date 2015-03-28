package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by John on 3/26/2015.
 */
public class YellowBalloon extends Image{

    YellowBalloon p = this;

    YellowBalloon() {
        super(new Texture("Yellowballoon.png"));
        setX((float)((Math.random()*5000)/Math.random()*5)%565);
        setY(-100);
        addListener(new YellowBalloonListener(this));
    }
    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja+8;
        setY(posicion_nueva);
        //setY(getY()+4);
    }

}