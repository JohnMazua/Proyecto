package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
/**
 * Created by alumno on 3/21/15.
 */
public class Pelotita_Mala extends Image{

    Pelotita_Mala p = this;

    Pelotita_Mala() {
        super(new Texture("pelotita_mala.png"));
        setX(-getWidth());
        setY((float)(Math.random()*1000)%380);
        addListener(new PelotitaMalaListener(this));
    }
        /*
        addListener(new InputListener()
        {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
            {
                p.setVisible(false);
                //p.remove();
                return true;
            }
        });
    }*/

    @Override
    public void act(float delta)
    {
        float posicion_vieja = getX();
        float posicion_nueva = posicion_vieja+1;
        setX(posicion_nueva);
        //setX(getX()+1);
    }

}
