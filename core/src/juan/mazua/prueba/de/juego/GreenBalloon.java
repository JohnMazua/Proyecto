package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
/**
 * Created by alumno on 3/21/15.
 */
public class GreenBalloon extends Image{

    GreenBalloon p = this;

    GreenBalloon() {
        super(new Texture("GreenBalloon.png"));
        setX((float)((Math.random()*5000)/Math.random()*5)%565);
        setY(-100);
        addListener(new GreenBalloonListener(this));
    }
    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja+6;
        setY(posicion_nueva);
        //setY(getY()+4);
    }

}