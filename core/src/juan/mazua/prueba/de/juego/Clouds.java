package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by John on 3/24/2015.
 */
public class Clouds extends Image {

    Clouds p = this;

    Clouds() {
        super(new Texture("Cloud.png"));
        setX((float)((Math.random()*5000)/Math.random()*5)%565);
        setY(700);

    }
    @Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja-1;
        setY(posicion_nueva);
        //setY(getY()+4);
    }

}