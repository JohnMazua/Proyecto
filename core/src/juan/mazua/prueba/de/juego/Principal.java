package juan.mazua.prueba.de.juego;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.graphics.*;

import java.util.ArrayList;


public class Principal extends ApplicationAdapter {
	Stage stage;
    static Ganaste ganaste;
    static Perdiste perdiste;
    static int frame;
    static int velocidad;

    static ArrayList<RedBalloon> mis_redballoons;
    static ArrayList<BlueBalloon> mis_blueballoons;
    static ArrayList<GreenBalloon>mis_greenballoons;
    static ArrayList<PurpleBalloon>mis_purpleballoons;
    static ArrayList<YellowBalloon>mis_yellowballoons;
    static ArrayList<BlackBalloon>mis_blackballoons;
    static ArrayList<Clouds>mis_clouds;

    static int puntaje;


    SpriteBatch sprite_batch;
    BitmapFont bitmap_font;

    @Override
    public void create () {
        frame = 0;
        velocidad = 1;
        Music mp3Music = Gdx.audio.newMusic(Gdx.files.internal("99luftballoons.mp3"));
        mp3Music.setVolume(0.5f);
        mp3Music.setLooping(true);
        mp3Music.play();


        mis_redballoons = new ArrayList<RedBalloon>();
        mis_blueballoons = new ArrayList<BlueBalloon>();
        mis_greenballoons= new ArrayList<GreenBalloon>();
        mis_purpleballoons= new ArrayList<PurpleBalloon>();
        mis_yellowballoons= new ArrayList<YellowBalloon>();
        mis_blackballoons= new ArrayList<BlackBalloon>();
        mis_clouds = new ArrayList<Clouds>();

        stage = new Stage();
        stage.addActor(new Fondo());
        stage.addActor(new Sun());
        //stage.addActor(new Pelotita());
        //stage.addActor(new Pelotita_Mala());

        ganaste = new Ganaste();
        ganaste.setVisible(false);
        stage.addActor(ganaste);

        perdiste = new Perdiste();
        perdiste.setVisible(false);
        stage.addActor(perdiste);

        Gdx.input.setInputProcessor(stage);
        sprite_batch = new SpriteBatch();
        bitmap_font = new BitmapFont();

    }

    @Override
    public void render () {
        //Gdx.gl.glClearColor(0.1f, 0.2f, 1, 1);
        //Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if(!ganaste.isVisible() && !perdiste.isVisible()) {

            if (frame % 180 == 0){
                Clouds cl = new Clouds();
                stage.addActor(cl);
                mis_clouds.add(cl);
            }
            if (frame % 20 == 0){
                RedBalloon rb = new RedBalloon();
                stage.addActor(rb);
                mis_redballoons.add(rb);
            }
            if (frame % 60 == 0) {
                BlueBalloon bb = new BlueBalloon();
                stage.addActor(bb);
                mis_blueballoons.add(bb);
            }
            if (frame % 120 == 0) {
                GreenBalloon gb = new GreenBalloon();
                stage.addActor(gb);
                mis_greenballoons.add(gb);
            }
            if (frame % 240 == 0) {
                PurpleBalloon pb = new PurpleBalloon();
                stage.addActor(pb);
                mis_purpleballoons.add(pb);
            }
            if (frame % 360 == 0) {
                YellowBalloon yb = new YellowBalloon();
                stage.addActor(yb);
                mis_yellowballoons.add(yb);
            }
            if (frame % 120 == 0) {
                BlackBalloon blb = new BlackBalloon();
                stage.addActor(blb);
                mis_blackballoons.add(blb);
            }
            frame++;

        }
        stage.draw();
        stage.act();
        sprite_batch.begin();
        bitmap_font.setScale(1.5f, 1.6f);
        bitmap_font.setColor(Color.GRAY);
        bitmap_font.draw(sprite_batch,"Presionadas: "+puntaje,25,470);
        bitmap_font.draw(sprite_batch,"Tiempo: "+frame,265,470);
        sprite_batch.end();


    }

    static void reiniciarJuego()
    {
        ganaste.setVisible(false);
        perdiste.setVisible(false);

        for(int i=0; i<mis_redballoons.size(); i++)
        {
            mis_redballoons.get(i).remove();
        }
        for(int i=0; i<mis_blueballoons.size(); i++)
        {
            mis_blueballoons.get(i).remove();
        }
        for(int i=0; i<mis_greenballoons.size(); i++)
        {
            mis_greenballoons.get(i).remove();
        }
        for(int i=0; i<mis_purpleballoons.size(); i++)
        {
            mis_purpleballoons.get(i).remove();
        }
        for(int i=0; i<mis_yellowballoons.size(); i++)
        {
            mis_yellowballoons.get(i).remove();
        }
        for(int i=0; i<mis_clouds.size(); i++)
        {
            mis_clouds.get(i).remove();
        }

        puntaje=0;
        frame=0;
        velocidad=1;

    }


}
