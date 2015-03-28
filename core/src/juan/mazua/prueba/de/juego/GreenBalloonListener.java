package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by alumno on 3/21/15.
 */

public class GreenBalloonListener extends InputListener {

    GreenBalloon GreenBalloon;
    GreenBalloonListener(GreenBalloon greenBalloon)
    {
        this.GreenBalloon = greenBalloon;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        Sound sound = Gdx.audio.newSound(Gdx.files.internal("Ballpop.wav"));
        sound.play(.2f);
        Principal.puntaje = Principal.puntaje+50;
        if(Principal.puntaje>=50) {
            Principal.ganaste.setVisible(true);
            Principal.ganaste.toFront();
        }
        GreenBalloon.remove();
        return true;
    }



}
