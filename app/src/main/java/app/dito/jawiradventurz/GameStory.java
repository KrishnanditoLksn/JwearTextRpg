package app.dito.jawiradventurz;

public class GameStory {
    GameScreen gameScreen;

    public GameStory(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public void entryPoint() {
        gameScreen.setTextView("You are in a dark room. You can't see anything. What do you do?");
        gameScreen.setButton1("Selamatkan dunia bung!!!");
        gameScreen.setButton2("Menyerah");
    }
}
