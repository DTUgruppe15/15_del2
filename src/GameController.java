public class GameController {
    public void landOnField(Player player, int field){
        switch (field){
            case 2:
                player.konto.insertMoney(250);
                System.out.println("You have raided a tower and stolen 250 gold.");
                break;
            case 3:
                player.konto.removeMoney(100);
                System.out.println("You have fallen into a crater and dropped 100 gold.");
                break;
            case 4:
                player.konto.insertMoney(100);
                System.out.println("You have entered the palace gates and \"found\" 100 gold worth of decorations.");
                break;
            case 5:
                player.konto.removeMoney(20);
                System.out.println("The desert is cold at night so you rent a room for 20 gold.");
                break;
            case 6:
                player.konto.insertMoney(180);
                System.out.println("A walled city makes people feel safe, lowering their guard to pickpocketing. You gain 180 gold.");
                break;
            case 7:
                System.out.println("The monestary is poor but you are not the type to donate.");
                break;
            case 8:
                player.konto.removeMoney(70);
                System.out.println("You walk into a dark cave, only to robbed of 70 gold.");
                break;
            case 9:
                player.konto.insertMoney(60);
                System.out.println("The huts in the mountains are isolated, perfect for robbing. You gain 60 gold.");
                break;
            case 10:
                player.konto.removeMoney(80);
                System.out.println("Werewolves are tough, you have to spend 80 gold on silver weapons. The adrenaline keeps you going.");
                break;
            case 11:
                player.konto.removeMoney(50);
                System.out.println("You lost 50 gold gambling in the fighting pits.");
                break;
            case 12:
                player.konto.insertMoney(650);
                System.out.println("While the dwarfs are in the mine, you steal their stash.");
                break;
        }
    }
}
