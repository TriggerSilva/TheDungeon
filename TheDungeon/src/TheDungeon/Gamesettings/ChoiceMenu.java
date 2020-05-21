package TheDungeon.Gamesettings;

/**
 * @author Victor Silva - 18265 Student Number: 18265 - Final project The
 * Dungeon 05/15/2020
 */
//class that will control my menu of choices
public class ChoiceMenu {

    WindowSetting windowSetting;

    ChoiceMenu(WindowSetting winSetting) {
        windowSetting = winSetting;
    }

    //When the player press start / main gate
    public void dungeonGate(String yourChoice) {

        switch (yourChoice) {
            case "C1":
                windowSetting.acceptMission();
                break;
            case "C2":
                windowSetting.rejectMission();
                break;
            case "C3":
                break;
        }
    }

    //when the player accept the mission that is the choices. 
    public void acceptMission(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.goLeft();
                break;
            case "C2":
                windowSetting.goRight();
                break;
            case "C3":
                break;
        }
    }

    //when the player Reject the mission that is the choices. 
    public void rejectMission(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                break;
            case "C2":
                System.exit(0); //exit.actionPerformed(event);
                break;
            case "C3":
                break;
        }
    }

    //when the player goLeft the mission that is the choices. 
    public void goLeft(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Attack"));
                break;
            case "C2":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Drink Portion"));
                break;
            case "C3":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Run"));
                windowSetting.run();
                ;
                break;
        }
    }

    //when the player goRight the mission that is the choices. 
    public void goRight(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                break;
            case "C2":
                windowSetting.goRightAfterSword();
                break;
            case "C3":
                windowSetting.acceptMission();//Back
                break;
        }
    }

    //when the player goRightAfterSword the mission that is the choices. 
    public void goRightAfterSword(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                break;
            case "C2":
                windowSetting.OpenDoor();
                break;
            case "C3":
                break;
        }
    }

    //when the player openDoor the mission that is the choices. 
    public void OpenDoor(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Attack"));
                break;
            case "C2":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Drink Portion"));
                break;
            case "C3":
                windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Run"));
                windowSetting.run();
                ;
                break;
        }
    }

    //when the player run from mission that is the choices. 
    public void run(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.rejectMission();
                break;
            case "C2":
                break;
            case "C3":
                windowSetting.dungeonGate();
                //windowSetting.win.MainScreen();//OPENING ANOTHER WINDOW
                break;
        }
    }

    //when the player WonBattle the mission that is the choices. 
    public void WonBattle(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.Goforward();
                break;
            case "C2":
                break;
            case "C3":
                windowSetting.rejectMission();
                break;
        }
    }

    //when the player GOforward this is the choices. 
    public void Goforward(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                windowSetting.win.MainScreen();
                break;
            case "C2":
                windowSetting.win.MainScreen();
                break;
            case "C3":
                windowSetting.downstairs();//DOWNSTAIRS
                break;
        }
    }

    //when the player downstairs this is the choices. 
    public void downstairs(String yourChoice) {
        switch (yourChoice) {

            case "C1":
                windowSetting.EmptyRoom();
                break;
            case "C2":
                windowSetting.EmptyRoomWithDOOR();
                break;
            case "C3":
                windowSetting.boss();
                break;
        }
    }

    //when the player EmptyRoom this is the choices. 
    public void EmptyRoom(String yourChoice) {
        switch (yourChoice) {
            //Left
            case "C1":
                break;
            case "C2":
                windowSetting.downstairs();//DOWNSTAIRS
                break;
            case "C3":
                break;
        }
    }

    //when the player EmptyRoomWithDOOR this is the choices. 
    public void EmptyRoomWithDOOR(String yourChoice) {
        switch (yourChoice) {
            //Right
            case "C1":
                break;
            case "C2":
                break;
            case "C3":
                windowSetting.downstairs();//DOWNSTAIRS
                break;
        }
    }

    //when the player BOSS this is the choices. 
    public void boss(String yourChoice) {
        switch (yourChoice) {
            //go forward - boss
            case "C1":
                //windowSetting.gameControl.BosschoiceAction("Attack");
                windowSetting.ActionDisplay(windowSetting.gameControl.BosschoiceAction("Attack"));
                break;
            case "C2":
                windowSetting.ActionDisplay(windowSetting.gameControl.BosschoiceAction("Drink Portion"));
                break;
            case "C3":
                break;
        }
    }

    public void WonBossGAME(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                break;
            case "C2":
                System.exit(0);
                break;
            case "C3":
                break;
        }
    }
    //in case of the player gets game over in the mission this is the choices. 
    public void gameOver(String yourChoice) {
        switch (yourChoice) {
            case "C1":
                break;
            case "C2":
                System.exit(0);
                break;
            case "C3":
                break;
        }
    }

    //menu cases 
    public void ChosenMenu(String yourChoice) {

        switch (windowSetting.position) {
            case "dungeonGate":
                dungeonGate(yourChoice);
                break;
            //accepted mission - LEFT - RIGHT
            case "acceptMission":
                acceptMission(yourChoice);
                break;
            case "goLeft":
                goLeft(yourChoice);
                break;
            case "Goforward":
                Goforward(yourChoice);
                break;
            case "downstairs":
                downstairs(yourChoice);
                break;
            case "EmptyRoom":
                EmptyRoom(yourChoice);
                break;
            case "EmptyRoomWithDOOR":
                EmptyRoomWithDOOR(yourChoice);
                break;
            case "boss":
               boss(yourChoice);
                break;
            case "wonBossBattle":
               WonBossGAME(yourChoice);
                break;
            case "goRightAfterSword":
                goRightAfterSword(yourChoice);
                break;
            case "OpenDoor":
                OpenDoor(yourChoice);
                break;
            case "run":
                run(yourChoice);
                break;
            case "wonBattle":
                WonBattle(yourChoice);
                break;
            case "gameOver":
                gameOver(yourChoice);
                break;
            case "goRight":
                goRight(yourChoice);
                break;
            //rejected mission.
            case "rejectMission":
                rejectMission(yourChoice);
                break;
        }
    }

}
