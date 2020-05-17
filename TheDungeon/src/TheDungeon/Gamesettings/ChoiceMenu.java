package TheDungeon.Gamesettings;

/**
 *
 * @author Trigger PC - Home
 */
public class ChoiceMenu{

    WindowSetting windowSetting;
    
    ChoiceMenu(WindowSetting winSetting) {
        windowSetting = winSetting;
    }
    
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

    public void ChosenMenu(String yourChoice) {
        
        switch (windowSetting.position) {
            case "dungeonGate": dungeonGate(yourChoice);
                                break;
                /*switch (yourChoice) {
                    case "C1":
                        windowSetting.acceptMission();
                        break;
                    case "C2":
                        windowSetting.rejectMission();
                        break;
                    case "C3":
                        break;
                }
                break;*/
            //accepted mission - LEFT - RIGHT
            case "acceptMission": acceptMission(yourChoice);
            break;
                /*switch (yourChoice) {
                    case "C1":
                        windowSetting.goLeft();
                        break;
                    case "C2":
                        windowSetting.goRight();
                        break;
                    case "C3":
                        break;
                }
                break;*/
            case "goLeft":
                switch (yourChoice) {
                    case "C1":
                        windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Attack"));
                        break;
                    case "C2":
                        windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Drink Portion"));
                        break;
                    case "C3":
                        windowSetting.ActionDisplay(windowSetting.gameControl.choiceAction("Run"));
                        break;
                }
                break;
            case "wonBattle":
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
                break;
            case "gameOver":
                switch (yourChoice) {
                    case "C1":
                        break;
                    case "C2":
                        System.exit(0);
                        break;
                    case "C3":
                        break;
                }
                break;
            case "goRight":
                switch (yourChoice) {
                    case "C1":
                        break;
                    case "C2":
                        windowSetting.goRight();
                        break;
                    case "C3":
                        windowSetting.acceptMission();
                        break;
                }
                break;
            //rejected mission.    
            case "rejectMission":
                //yourChoice gets the action from buttons
                switch (yourChoice) {
                    case "C1":
                        break;
                    case "C2":
                        System.exit(0); //exit.actionPerformed(event);
                        break;
                    case "C3":
                        break;
                }
                break;//break switch yourChoice
            }
    }
    
}
