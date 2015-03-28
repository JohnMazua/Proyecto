package juan.mazua.prueba.de.juego;

        import com.badlogic.gdx.scenes.scene2d.InputEvent;
        import com.badlogic.gdx.scenes.scene2d.InputListener;

/**
 * Created by alumno on 3/21/15.
 */
public class PelotitaMalaListener extends InputListener {

    Pelotita_Mala pelotita;
    PelotitaMalaListener(Pelotita_Mala pelotita)
    {
        this.pelotita = pelotita;
    }

    @Override
    public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
    {
        pelotita.remove();
        Principal.perdiste.setVisible(true);
        Principal.perdiste.toFront();
        return true;
    }



}
