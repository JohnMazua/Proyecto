package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
/**
 * Created by alumno on 3/14/15.
 */
public class MiActor extends Image{

    MiActor()
    {
        super(new Texture("badlogic.jpg"));
        addListener(new MiInputListener(this));
        setX(100);
        setY(300);
    }

    @Override
    public void act(float delta)
    {
        setX(getX()+1);
        setY(getY()-1);
    }



}
