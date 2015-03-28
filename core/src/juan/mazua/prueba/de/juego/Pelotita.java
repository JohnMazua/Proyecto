package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
/**
 * Created by alumno on 3/21/15.
 */
public class Pelotita extends Image{

    Pelotita p = this;

    Pelotita() {
        super(new Texture("pelotita.png"));
        setX(-100);
        setY((float)(Math.random()*1000)%380);
        addListener(new PelotitaListener(this));
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
        float posicion_nueva = posicion_vieja+Principal.velocidad;
        setX(posicion_nueva);
        //setX(getX()+1);
    }

}
