package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by alumno on 3/21/15.
 */
public class PelotitaListener extends InputListener{

    Pelotita pelotita;
    PelotitaListener(Pelotita pelotita)
    {
        this.pelotita = pelotita;
    }

        @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
        {
            /*
            Principal.pelotitas_presionadas++;
            Principal.velocidad++;
            if(Principal.pelotitas_presionadas>=20) {
                Principal.ganaste.setVisible(true);
                Principal.ganaste.toFront();
            }
            */
            pelotita.remove();
            return true;
        }



}
