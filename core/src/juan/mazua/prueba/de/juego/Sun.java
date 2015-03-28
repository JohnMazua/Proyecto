package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by John on 3/26/2015.
 */
public class Sun extends Image {

    Sun p = this;

    Sun() {
        super(new Texture("Sun.png"));
        setX(530);
        setY(380);

    }
    /*@Override
    public void act(float delta)
    {
        float posicion_vieja = getY();
        float posicion_nueva = posicion_vieja;
        setY(posicion_nueva);
        //setY(getY()+4);
    }
    */

}