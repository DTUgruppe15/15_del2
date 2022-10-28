public class Main {
    public static void main(String[] args) {
        Languages languages = new Languages();
        Languages.setLanguages("en","US");

        GameController gameController = new GameController();

        gameController.game();
    }
}
