import java.util.Arrays;
//import gui_main.GUI;
public class GameController {
    LanguageSelect languageSelect= new LanguageSelect();

    public void game(){
        languageSelect.selectLanguage(0);
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
            boolean clickRoll = uiController.gui.getUserLeftButtonPressed("Click for roll player: " + (playerTurn+1),  "yes","Yes");

            players[playerTurn].rollDice();

            landOnField(players[playerTurn], players[playerTurn].sumOfDice());

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
        boolean win = false;
        for (int i = 0; i < players.length; i++) {
            if(players[i].konto.getAmountOfMoney()>3000){
                win = true;
                System.out.printf(languageSelect.getTextAtIndex(11), i+1);
            }
        }
        return win;
    }

    public String landOnField(Player player, int field){
        switch (field){
            case 2:
                player.konto.insertMoney(250);
                return languageSelect.getTextAtIndex(0);
            case 3:
                player.konto.removeMoney(100);
                return languageSelect.getTextAtIndex(1);
            case 4:
                player.konto.insertMoney(100);
                return languageSelect.getTextAtIndex(2);
            case 5:
                player.konto.removeMoney(20);
                return languageSelect.getTextAtIndex(3);
            case 6:
                player.konto.insertMoney(180);
                return languageSelect.getTextAtIndex(4);
            case 7:
                return languageSelect.getTextAtIndex(5);
            case 8:
                player.konto.removeMoney(70);
                return languageSelect.getTextAtIndex(6);
            case 9:
                player.konto.insertMoney(60);
                return languageSelect.getTextAtIndex(7);
            case 10:
                player.konto.removeMoney(80);
                return languageSelect.getTextAtIndex(8);
            case 11:
                player.konto.removeMoney(50);
                return languageSelect.getTextAtIndex(9);
            case 12:
                player.konto.insertMoney(650);
                return languageSelect.getTextAtIndex(10);
            default:
                return "Out of bounds.";
        }
    }
}
