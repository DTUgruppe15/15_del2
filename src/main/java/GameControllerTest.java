import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameControllerTest {

    @Test
    @DisplayName("Language test English")
    void landOnFieldEnglishText() {
        Languages languages = new Languages();
        languages.setLanguages("en","US");
        GameController game = new GameController();
        Player player = new Player();

        assertAll(
                ()->assertEquals(game.landOnField(player,2),"You have raided a tower and stolen 250 gold."),
                ()->assertEquals(game.landOnField(player,3),"You have fallen into a crater and dropped 100 gold."),
                ()->assertEquals(game.landOnField(player,4),"You have entered the palace gates and \"found\" 100 gold worth of decorations."),
                ()->assertEquals(game.landOnField(player,5),"The desert is cold at night, so you rent a room for 20 gold."),
                ()->assertEquals(game.landOnField(player,6),"A walled city makes people feel safe, lowering their guard to pickpocketing. You gain 180 gold."),
                ()->assertEquals(game.landOnField(player,7),"The monastery is poor, but you are not the type to donate."),
                ()->assertEquals(game.landOnField(player,8),"You walk into a dark cave, only to robbed of 70 gold."),
                ()->assertEquals(game.landOnField(player,9),"The huts in the mountains are isolated, perfect for robbing. You gain 60 gold."),
                ()->assertEquals(game.landOnField(player,10),"Werewolves are tough, you have to spend 80 gold on silver weapons. The adrenaline keeps you going."),
                ()->assertEquals(game.landOnField(player,11),"You lost 50 gold gambling in the fighting pits."),
                ()->assertEquals(game.landOnField(player,12),"While the dwarfs are in the mine, you steal their stash.")
        );
    }

    @Test
    @DisplayName("Language test Danish")
    void landOnFieldDanishText() {
        Languages languages = new Languages();
        languages.setLanguages("da","DK");
        GameController game = new GameController();
        Player player = new Player();

        assertAll(
                ()->assertEquals(game.landOnField(player,2),"Du har plynret et tårn og stjålet 250 guld."),
                ()->assertEquals(game.landOnField(player,3),"Du er faldet ned i et krater og tabt 100 guld."),
                ()->assertEquals(game.landOnField(player,4),"Du er gået ind i paladsets porte og \"fundet\" dekorationer for 100 guld."),
                ()->assertEquals(game.landOnField(player,5),"Ørkenen er kold om natten, så du lejer et værelse til 20 guld."),
                ()->assertEquals(game.landOnField(player,6),"En by omgivet af mure får folk til at føle sig trygge og sænker deres vagt til lommetyveri. Du stjæler 180 guld."),
                ()->assertEquals(game.landOnField(player,7),"Klostret er fattigt, men du er ikke typen, der donerer."),
                ()->assertEquals(game.landOnField(player,8),"Du går ind i en mørk hule, kun for at blive berøvet 70 guld."),
                ()->assertEquals(game.landOnField(player,9),"Hytterne i bjergene er isolerede, perfekte til at røve. Du stjæler 60 guld."),
                ()->assertEquals(game.landOnField(player,10),"Varulve er hårde, du skal bruge 80 guld på sølvvåben. Adrenalinen holder dig i gang."),
                ()->assertEquals(game.landOnField(player,11),"Du taber 50 guld ved satsning i kampgraven."),
                ()->assertEquals(game.landOnField(player,12),"Mens dværgene er i minen, stjæler du deres skatte.")
        );
    }
}