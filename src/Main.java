public class Main {
    World world;
    GameUI window;

    public Main() {
        this(false);
    }

    public Main(boolean isAdContaminated) {
        World.setTps(8);
        world = new Settingsscreen();
        Deathscreen.stats = Filework.readScores();
        window = new GameUI("Snake", world, isAdContaminated);
        window.setIconImage(Utils.loadImageFromAssets("title"));
        window.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
