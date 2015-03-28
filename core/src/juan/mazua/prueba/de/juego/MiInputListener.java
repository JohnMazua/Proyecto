package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
/**
 * Created by alumno on 3/14/15.
 */
public class MiInputListener extends InputListener{

    Actor actor;
    MiInputListener(Actor actor)
    {
        super();
        this.actor = actor;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        actor.setX(0);
        actor.setY(0);

        return true;
    }





}
