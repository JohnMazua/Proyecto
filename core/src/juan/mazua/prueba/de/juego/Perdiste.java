package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.InputEvent;

/**
 * Created by alumno on 3/21/15.
 */
public class Perdiste extends Image
{
    Perdiste()
    {
        super(new Texture("perdiste.png"));

        addListener(new InputListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
            {
                Principal.reiniciarJuego();
                return true;
            }
        });
    }

}



