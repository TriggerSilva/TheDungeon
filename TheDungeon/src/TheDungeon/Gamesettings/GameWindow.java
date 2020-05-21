package TheDungeon.Gamesettings;

import TheDungeon.Gamesettings.SoundEffects;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */


//This classe show what is been showing when the game is running.
//Game Screen 
//This class will create windows and hold frames, containers and labels.
//Hardest class :( 
public final class GameWindow {

    private JFrame window;
    private Container con;
    public JPanel titleNamePanel, startPANEL, mainTextP, choicePanel, playerPanel;
    public JLabel titleNameLabel, playerHPLabel, playerHPNumber, weaponLabel, weaponLabelNAME;
    private Font pixelFont;
    public JButton startButton, exitButton, choice1, choice2, choice3, choice4;
    public JTextArea mainTextArea;

    //Get Name From User
    public String name;
    //SoundEffects music;

    TitleScreen titleScreenWindow = new TitleScreen();
    GameExit exit = new GameExit();
    SoundEffects music = new SoundEffects();
    WindowSetting windowSetting = new WindowSetting(this, music);

    //CHOICEMENU
    ChoiceButtons choiceButtons = new ChoiceButtons();
    ChoiceMenu choiceMenu = new ChoiceMenu(windowSetting);

    public GameWindow() {
            
        PixelFont();

        //Getting the String Name for collecting Player's NAME.
        name = JOptionPane.showInputDialog("Hello Player,\n" + "What Is Your Name?");

         MainScreen();
        
    }

    
    public void MainScreen(){

        //CREATE A WINDOWS 800X600 - BLACK COLOR -
        window = new JFrame();
        window.setSize(800, 600);
        window.setTitle("The Dungeon - Victor Silva - 18265");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        //TITLE OF THE GAME
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 50, 600, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("THE DUNGEON");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(pixelFont.deriveFont(96f));

        //IT WILL HOLD THE PANEL WITH START - EXIT BUTTONS
        startPANEL = new JPanel();
        startPANEL.setBounds(300, 400, 200, 100);
        startPANEL.setBackground(Color.black);
        startPANEL.setLayout(new GridLayout(2, 1));

        //START BUTTON CONFIGURATION
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(pixelFont);
        startButton.setFocusPainted(false);
        startPANEL.add(startButton);
        startButton.addActionListener(titleScreenWindow);

        //EXIT BUTTON CONFIGURATION
        exitButton = new JButton("EXIT");
        exitButton.setBackground(Color.black);
        exitButton.setForeground(Color.white);
        exitButton.setFont(pixelFont);
        exitButton.setFocusPainted(false);
        startPANEL.add(exitButton);
        exitButton.addActionListener(exit);

        //PANEL WITH TITLE ADDING THE TITLEnameLABEL
        titleNamePanel.add(titleNameLabel);

        //CONTAINER CREATED TO HOLD ALL PANELS
        con.add(titleNamePanel);
        con.add(startPANEL);

    }
            
    //GAME STARTS - WITH BUTTONS - FRAMES
    public void GameScreen() {

        //It sets title panel and start panel to be not visiable. (FALSE) 
        titleNamePanel.setVisible(false);
        startPANEL.setVisible(false);

        //This will be a Panel to hold textArea from the game.
        mainTextP = new JPanel();
        mainTextP.setBounds(100, 100, 600, 250);
        mainTextP.setBackground(Color.black);
        con.add(mainTextP);

        //RESPONSIBLE FOR IMPLEMENTING TEXT TO mainTextP.
        //It is holding text from the game.
        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(50, 100, 600, 250);
        mainTextArea.setBackground(Color.blue);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(pixelFont);
        mainTextArea.setLineWrap(true);
        mainTextP.add(mainTextArea);

        //choicePanel created to hold three options
        //setLayout is a GRID with 3,1 (3 row and 1 column)
        choicePanel = new JPanel();
        choicePanel.setBounds(250, 350, 300, 150);
        choicePanel.setBackground(Color.black);
        choicePanel.setLayout(new GridLayout(3, 1));
        con.add(choicePanel);

        //First Button
        choice1 = new JButton("ATTACK");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(pixelFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceButtons);
        choice1.setActionCommand("C1");
        choicePanel.add(choice1);

        //Second Button
        choice2 = new JButton("Drink Portion");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(pixelFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceButtons);
        choice2.setActionCommand("C2");
        choicePanel.add(choice2);

        //Third Button
        choice3 = new JButton("Run");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(pixelFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceButtons);
        choice3.setActionCommand("C3");
        choicePanel.add(choice3);

        //PlayerPanel it will hold HP and Weapon
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 40);
        playerPanel.setBackground(Color.blue);
        playerPanel.setLayout(new GridLayout(1, 4));
        con.add(playerPanel);

        playerHPLabel = new JLabel(name + " HP:");
        playerHPLabel.setFont(pixelFont);
        playerHPLabel.setForeground(Color.white);
        playerPanel.add(playerHPLabel);

        playerHPNumber = new JLabel();
        playerHPNumber.setFont(pixelFont);
        playerHPNumber.setForeground(Color.white);
        playerPanel.add(playerHPNumber);

        weaponLabel = new JLabel("   Weapon:");
        weaponLabel.setFont(pixelFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);

        weaponLabelNAME = new JLabel("");
        weaponLabelNAME.setFont(pixelFont);
        weaponLabelNAME.setForeground(Color.white);
        playerPanel.add(weaponLabelNAME);

        //THE GAME MUSIC
        this.music.MainMusic();
        
        windowSetting.playerSetup();
        windowSetting.dungeonGate();
    }

    
    //game TitleScreen event that will call GameScreen
    public class TitleScreen implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            GameScreen();
        }
    }

    //game exit events
    public class GameExit implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.exit(0);
        }
    }

    //button event that will hold the button choices
    public class ChoiceButtons implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();
            choiceMenu.ChosenMenu(yourChoice);

        }
    }

    //FONT configuration
    public void PixelFont() {

        try {
            pixelFont = Font.createFont(Font.TRUETYPE_FONT, new File("C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon/font/Pixel-Regular.ttf")).deriveFont(Font.PLAIN, 26f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("C://Users//Trigger PC - Home//Desktop//javaclassvera//TheDungeon//src//TheDungeon/font/Pixel-Regular.ttf")));

        } catch (IOException | FontFormatException e) {

        }
    }
}
