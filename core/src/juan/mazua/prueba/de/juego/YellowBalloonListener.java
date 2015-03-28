package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by John on 3/26/2015.
 */
public class YellowBalloonListener extends InputListener {

    YellowBalloon YellowBalloon;
    YellowBalloonListener(YellowBalloon yellowBalloon)
    {
        this.YellowBalloon = yellowBalloon;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        Sound sound = Gdx.audio.newSound(Gdx.files.internal("Ballpop.wav"));
        sound.play(.2f);
        Principal.puntaje = Principal.puntaje+200;
        if(Principal.puntaje>=50) {
            Principal.ganaste.setVisible(true);
            Principal.ganaste.toFront();
        }
        YellowBalloon.remove();
        return true;
    }



}
