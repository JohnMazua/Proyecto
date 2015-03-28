package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by John on 3/26/2015.
 */
public class BlackBalloonListener extends InputListener {

    BlackBalloon BlackBalloon;
    BlackBalloonListener(BlackBalloon blackBalloon)
    {
        this.BlackBalloon = blackBalloon;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        Sound sound = Gdx.audio.newSound(Gdx.files.internal("Ballpop.wav"));
        sound.play(.2f);
        BlackBalloon.remove();
        Principal.perdiste.setVisible(true);
        Principal.perdiste.toFront();
        return true;
    }



}
