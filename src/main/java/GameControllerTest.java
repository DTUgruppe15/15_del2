import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    @Test
    @DisplayName("Language test English")
    void landOnFieldEnglishText() {
        LanguageSelect languageSelect = new LanguageSelect();
        languageSelect.selectLanguage(0);
        GameController game = new GameController();
        Player player = new Player();

        assertAll(
                ()->assertEquals(game.landOnField(player,2),"You have raided a tower and stolen 250 gold."),
                ()->assertEquals(game.landOnField(player,3),"You have fallen into a crater and dropped 100 gold."),
                ()->assertEquals(game.landOnField(player,4),"You have entered the palace gates and \"found\" 100 gold worth of decorations."),
                ()->assertEquals(game.landOnField(player,5),"The desert is cold at night so you rent a room for 20 gold."),
                ()->assertEquals(game.landOnField(player,6),"A walled city makes people feel safe, lowering their guard to pickpocketing. You gain 180 gold."),
                ()->assertEquals(game.landOnField(player,7),"The monestary is poor but you are not the type to donate."),
                ()->assertEquals(game.landOnField(player,8),"You walk into a dark cave, only to robbed of 70 gold."),
                ()->assertEquals(game.landOnField(player,9),"The huts in the mountains are isolated, perfect for robbing. You gain 60 gold."),
                ()->assertEquals(game.landOnField(player,10),"Werewolves are tough, you have to spend 80 gold on silver weapons. The adrenaline keeps you going."),
                ()->assertEquals(game.landOnField(player,11),"You lost 50 gold gambling in the fighting pits."),
                ()->assertEquals(game.landOnField(player,12),"While the dwarfs are in the mine, you steal their stash.")
        );
    }
}