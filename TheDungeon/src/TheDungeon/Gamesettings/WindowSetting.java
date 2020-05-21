package TheDungeon.Gamesettings;

import com.sun.media.jfxmedia.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */
public class WindowSetting {

    
//Object calling GameWindows
    GameWindow win;
    SoundEffects music;
    

    //construtor
    public WindowSetting(GameWindow gameWindow, SoundEffects soundEffects) {
        win = gameWindow;
        music = soundEffects;
    }

    //GameControl object 
    GameControl gameControl = new GameControl();

    public String position, gameTEXT;

    //Test method to hold Player
    public void playerSetup() {

        int playerHP = gameControl.player.getHealth();
        String weapon = gameControl.player.getWeapon();
        win.playerHPNumber.setText("" + playerHP);
        if (win.weaponLabelNAME.getText().equals("")) {
            win.weaponLabelNAME.setText(weapon);
        }

    }

    //It will show text from game, character by character
    Timer timer = new Timer(40, new ActionListener() {
        int i;

        @Override
        public void actionPerformed(ActionEvent ae) {

            char character[] = gameTEXT.toCharArray();
            int arrayNumber = character.length;

            String addedCharacter = "";
            String black = "";

            addedCharacter = black + character[i];
            win.mainTextArea.append(addedCharacter);

            i++;

            if (i == arrayNumber) {
                i = 0;
                timer.stop();
            }
        }
    });

    //It will show text from game, character by character (2)
    public void TextTime() {
        win.mainTextArea.setText("");
        timer.start();
    }

    //First Mission
    public void dungeonGate() {
        position = "dungeonGate";

        win.mainTextArea.setText("  The King of IRELAND asked you to rescue"
                + "\nhis gold pot from the DARK Leprechaun which is powerful."
                + "\n  Many brave warriors tried to make it \nbut they never returned from that Dungeon."
                + "\n"
                + "\nDo you want to try your strength?");
        /*gameTEXT = "  The King of IRELAND asked you to rescue"
                + "\nhis gold pot from the DARK Leprechaun which ispowerful."
                + "\n  Many brave warriors tried to make it \nbut they never returned from that Dungeon."
                + "\n"
                + "\nDo you want to try your strength?";
        TextTime();*/

        win.choice1.setText("Accept");
        win.choice2.setText("Reject");
        win.choice3.setText("<>");

    }

    //text and choices that are responsable for show if the player press RejectMission 
    public void rejectMission() {
        position = "rejectMission";

        win.mainTextArea.setText("  Regardless that cave has many enemies you \ncould die and The Dark Leprechaun is powerful.\n"
                + "The King will not pay you for giving up\nhe cannot blame you if you are afraid of going in there.");

        win.choice1.setText("");
        win.choice2.setText("EXIT");
        win.choice3.setText("");
    }

    //text and choices that are responsable for show if the player press acceptMission
    public void acceptMission() {

        position = "acceptMission";

        win.mainTextArea.setText("You are inside of The Dungeon.\nI do not think you can make it alive.\n\nWhat do you want to do?");

        win.choice1.setText("Go Left");
        win.choice2.setText("Go Right");
        win.choice3.setText("<>");

    }

    //text and choices that are responsable for show if the player press GO LEFT - Monster
    public void goLeft() {

        position = "goLeft";

        win.mainTextArea.setText("You encounter a monster\n" + gameControl.enemyAppears() + "\n\nWhat you want to do?");

        win.choice1.setText("Attack");
        win.choice2.setText("Drink Portion");
        win.choice3.setText("Run");

    }

    // GO LEFT - Monster - ACTION
    public void ActionDisplay(String result) {

        //position = "goLeft";
        if (gameControl.attackResult.equals("wonBossBattle")) {
            WonBossBattle(result);
        } else if (gameControl.attackResult.equals("wonBattle")) {
            WonBattle(result);
        } else if (gameControl.attackResult.equals("gameOver")) {
            gameOver(result);
        } else {
            win.mainTextArea.setText(result);

        }
        playerSetup();
    }

    //GO LEFT - You find a Long Sword
    public void goRight() {

        position = "goRight";

        win.mainTextArea.setText("The only thing You found here is this shine \nobject.\n\n What is it? \n\n(You obtained a Long Sword)");
        win.weaponLabelNAME.setText("Long Sword");

        win.choice1.setText("<>");
        win.choice2.setText("Right");
        win.choice3.setText("<Back>");

    }

    public void goRightAfterSword() {

        position = "goRightAfterSword";

        win.mainTextArea.setText("Well done PLAYER, You are doing well,"
                + "\n\nYou are in front of a odd door...\n\n"
                + "OPEN the door");

        win.choice1.setText("<>");
        win.choice2.setText("OPEN");
        win.choice3.setText("<>");
    }

    public void OpenDoor() {
        position = "OpenDoor";

        win.mainTextArea.setText("What are you doing here?\n"
                + "YOU WILL PAY FOR DISTURBING ME\n\n"
                + gameControl.enemyAppears()
                + "\n\nWhat you want to do?");

        win.choice1.setText("Attack");
        win.choice2.setText("Drink Portion");
        win.choice3.setText("Run");

    }

    public void run() {
        position = "run";

        win.choice1.setText("Give up");
        win.choice2.setText("<>");
        win.choice3.setText("Run From Dungeon");
    }

    //Method WonBattle
    public void WonBattle(String wonResult) {

        position = "wonBattle";

        win.mainTextArea.setText(wonResult);

        win.choice1.setText("Go forward");
        win.choice2.setText("<>");
        win.choice3.setText("Run From Dungeon");
    }

    //Method WonBossBattle
    public void WonBossBattle(String wonResult) {

        position = "wonBossBattle";

        win.mainTextArea.setText(wonResult);

        win.choice1.setText("<>");
        win.choice2.setText("Thank you");
        win.choice3.setText("<>");
    }

    //Method Goforward
    public void Goforward() {

        position = "Goforward";

        win.mainTextArea.setText("Wow, you have got this far.\n"
                + "choose an option - WARNING\n"
                + "If you pick the wrong one,\n\n"
                + "You will be released to outside from dungeon.");

        win.choice1.setText("DO NOT");
        win.choice2.setText("GO");
        win.choice3.setText("DOWNSTAIRS");
    }

    //Method Downstairs
    public void downstairs() {

        position = "downstairs";

        win.mainTextArea.setText("You are close to finding the DARK Leprechaun\n\n"
                + "Voices: He is strong... RUN RUN RUN\n\n"
                + "Voices: Youuu areee Deaddd\n\n"
                + "Voices: go left...nooo go right...DIEE");

        win.choice1.setText("Go Left");
        win.choice2.setText("Go Right");
        win.choice3.setText("Go Forward");
    }

    //Method EmptyRoom
    public void EmptyRoom() {

        position = "EmptyRoom";

        win.mainTextArea.setText("Empty...");

        win.choice1.setText("<>");
        win.choice2.setText("Go Back");
        win.choice3.setText("<>");
    }

    //Method EmptyRoom
    public void EmptyRoomWithDOOR() {

        position = "EmptyRoomWithDOOR";

        win.mainTextArea.setText("You found a Big GOLD Door, \nThere is a reward here..\n\n"
                + "<< Look for a Key >>");

        win.choice1.setText("<>");
        win.choice2.setText("<>");
        win.choice3.setText("GO BACK");
    }
    
    //Encounter boss fight Song
    public void boss() {
        //go forward
        position = "boss";
        
        music.BossMusic();

        win.mainTextArea.setText("" + gameControl.bossAppers() + "\n\nWhat do you want to do?");
        //win.mainTextArea.setText("You encounter a monster\n\n" + gameControl.bossAppers()+ "\n\nWhat you want to do?");
        win.mainTextArea.setBackground(Color.RED);
        win.choice1.setText("Attack");
        win.choice2.setText("Drink Portion");
        win.choice3.setText("You Cannot Run");

    }

    //Game Over / Sound
    public void gameOver(String gameOver) {
        position = "gameOver";
        
        music.GameOverSound();
        win.mainTextArea.setText(gameOver);

        win.choice1.setText("");
        win.choice2.setText("EXIT");
        win.choice3.setText("");

    }
}
