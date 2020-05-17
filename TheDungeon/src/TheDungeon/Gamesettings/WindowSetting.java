package TheDungeon.Gamesettings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Trigger PC - Home
 */
public class WindowSetting{
    
     

    GameWindow win;
    
    public WindowSetting(GameWindow gameWindow) {
        win = gameWindow;
    }
    
    GameControl gameControl = new GameControl();
    
    
    public String position, gameTEXT;
    
       //Test method to hold Player
    public void playerSetup() {
        
        int playerHP = gameControl.player.getHealth();
        String weapon = gameControl.player.getWeapon();
        win.playerHPNumber.setText(""+playerHP);
        win.weaponLabelNAME.setText(weapon);

        
    }
    
    
    Timer timer = new Timer(70, new ActionListener() {
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
    
     public void TextTime(){
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
                + "\nhis gold pot from the DARK Leprechaun which is powerful."
                + "\n  Many brave warriors tried to make it \nbut they never returned from that Dungeon."
                + "\n"
                + "\nDo you want to try your strength?";
        TextTime();
        */
        win.choice1.setText("Accept");
        win.choice2.setText("Reject");
        win.choice3.setText("<>");

    }

    public void rejectMission() {
        position = "rejectMission";

        win.mainTextArea.setText("  Regardless that cave has many enemies you \ncould die and The Dark Leprechaun is powerful.\n"
                + "The King will not pay you for giving up\nhe cannot blame you if you are afraid of going in there.");

        win.choice1.setText("");
        win.choice2.setText("EXIT");
        win.choice3.setText("");
    }

    public void acceptMission() {

        position = "acceptMission";

        win.mainTextArea.setText("You are inside of The Dungeon.\nI do not think you can make it alive.\n\nWhat do you want to do?");

        win.choice1.setText("Go Left");
        win.choice2.setText("Go Right");
        win.choice3.setText("<>");

    }
    //GO LEFT - Monster
    public void goLeft() {

        position = "goLeft";

        win.mainTextArea.setText("You encounter a monster\n" + gameControl.enemyAppears() + "\n\nWhat you want to do?");

        win.choice1.setText("Attack");
        win.choice2.setText("Drink Portion");
        win.choice3.setText("Run");

    }
    //GO LEFT - Monster - ACTION
    public void ActionDisplay(String result) {

        position = "goLeft";
        if (gameControl.attackResult.equals("wonBattle")) {
            WonBattle(result);
        } else if (gameControl.attackResult.equals("gameOver")) {
            gameOver(result);
        } else {
            win.mainTextArea.setText(result);

        }
        playerSetup();
    }
    //Method WonBattle
    public void WonBattle(String wonResult) {

        position = "wonBattle";

        win.mainTextArea.setText(wonResult);

        win.choice1.setText("Go forward");
        win.choice2.setText("exit");
        win.choice3.setText("<>");
    }

    public void gameOver(String gameOver) {
        position = "gameOver";

        win.mainTextArea.setText(gameOver);

       win.choice1.setText("");
       win.choice2.setText("EXIT");
       win.choice3.setText("");

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
    
}
