package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by John on 3/24/2015.
 */
public class PurpleBalloon extends Image{

    PurpleBalloon p = this;

    PurpleBalloon() {
        super(new Texture("Purpleballoon.png"));
        setX((float)((Math.random()*5000)/Math.random()*5)%565);
        setY(-100);
        addListener(new PurpleBalloonListener(this));
    }
    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja+7;
        setY(posicion_nueva);
        //setY(getY()+4);
    }

}