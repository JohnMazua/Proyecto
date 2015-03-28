package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by John on 3/24/2015.
 */
public class PurpleBalloonListener  extends InputListener {

    PurpleBalloon PurpleBalloon;
    PurpleBalloonListener(PurpleBalloon purpleBalloon)
    {
        this.PurpleBalloon = purpleBalloon;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        Sound sound = Gdx.audio.newSound(Gdx.files.internal("Ballpop.wav"));
        sound.play(.2f);
        Principal.puntaje = Principal.puntaje+100;
        if(Principal.puntaje>=50) {
            Principal.ganaste.setVisible(true);
            Principal.ganaste.toFront();
        }
        PurpleBalloon.remove();
        return true;
    }



}
