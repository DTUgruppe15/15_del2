import java.util.Arrays;
//import gui_main.GUI;
public class GameController {
    //LanguageSelect languageSelect = new LanguageSelect();
    Languages languages = new Languages();
    public void game(){
        //languageSelect.selectLanguage(0);
        Player[] players = new Player[2];
        //Arrays.fill(players, new Player());
        players[0] = new Player();
        players[1] = new Player();
        //GUI gui = new GUI();
        UIController uiController = new UIController();

        temp(players);

        int playerTurn = 0;
        while(!winCondition(players)){
            if(playerTurn >= players.length){
                playerTurn = 0;
            }
            boolean clickRoll = uiController.gui.getUserLeftButtonPressed(languages.getMessages("button") + (playerTurn+1), languages.getMessages("buttonAns"), languages.getMessages("buttonAns"));

            players[playerTurn].rollDice();

            System.out.println(landOnField(players[playerTurn], players[playerTurn].sumOfDice()));

            //System.out.println("Player " + playerTurn + " sum: " + players[playerTurn].konto.getAmountOfMoney());
            System.out.println("playerturn: " +(playerTurn+1));
            System.out.println("roll: " + players[playerTurn].sumOfDice());
            System.out.println("Player 1 sum: " + players[0].konto.getAmountOfMoney());
            System.out.println("Player 2 sum: " + players[1].konto.getAmountOfMoney());



            playerTurn++;
        }
    }

    public void temp(Player[] temp){
        temp[0].die1.rollDie();
        System.out.println("temp: " + temp[1].die1.getFaceValue());
    }

    public boolean winCondition(Player[] players){
//        Languages languages = new Languages();
        boolean win = false;
        for (int i = 0; i < players.length; i++) {
            if(players[i].konto.getAmountOfMoney()>3000){
                win = true;
                System.out.printf(languages.getMessages("playerWin"), i+1);
            }
        }
        return win;
    }

    public String landOnField(Player player, int field){
//        Languages languages = new Languages();
        switch (field){
            case 2:
                player.konto.changeBalance(250);
                return languages.getMessages("fieldTower");
            case 3:
                player.konto.changeBalance(-100);
                return languages.getMessages("fieldCrater");
            case 4:
                player.konto.changeBalance(100);
                return languages.getMessages("fieldPalace");
            case 5:
                player.konto.changeBalance(-20);
                return languages.getMessages("fieldDesert");
            case 6:
                player.konto.changeBalance(180);
                return languages.getMessages("fieldCity");
            case 7:
                return languages.getMessages("fieldMonastery");
            case 8:
                player.konto.changeBalance(-70);
                return languages.getMessages("fieldCave");
            case 9:
                player.konto.changeBalance(60);
                return languages.getMessages("fieldMountains");
            case 10:
                player.konto.changeBalance(-80);
                return languages.getMessages("fieldWerewall");
            case 11:
                player.konto.changeBalance(-50);
                return languages.getMessages("fieldPits");
            case 12:
                player.konto.changeBalance(650);
                return languages.getMessages("fieldMine");
            default:
                return "Out of bounds.";
        }
    }
}
