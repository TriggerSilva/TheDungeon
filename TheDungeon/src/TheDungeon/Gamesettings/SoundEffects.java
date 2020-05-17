package TheDungeon.Gamesettings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author Trigger PC - Home
 */
public class SoundEffects {

    public void gameMusic() {

        String filename = "C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon//music//Dungeon song.wav";
        try {
            File musicPath = new File(filename);

            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
}
