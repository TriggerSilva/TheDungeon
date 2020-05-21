package TheDungeon.Gamesettings;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author Victor Silva - 18265 - Final project The Dungeon 05/15/2020
 */
public class SoundEffects {

    //This Class is responsable for the sound of the game,
    //after the button start is triggered
    Clip clip;
    AudioInputStream audioInput;

    public SoundEffects() {

    }

    public void MainMusic() {

        String filename = "C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon//music//Dungeon song.wav";
        // activeClip.stop();
        try {

            //  File musicPath = new File(filename);
            audioInput = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    //Boss encounter music find.
    public void BossMusic() {

        String filename = "C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon//music//BossFight.wav";
        try {
            
            clip.stop();
            audioInput = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
            //AudioInputStream = AudioSystem.getAudioInputStream();
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    
    //Boss encounter music find.
    public void GameOverSound() {

        String filename = "C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon//music//Game Over.wav";
        try {

            clip.stop();
            audioInput = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
            //AudioInputStream = AudioSystem.getAudioInputStream();
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }

}
