package pixelmoba.server;

import com.badlogic.gdx.backends.headless.HeadlessApplication;

public class ServerLauncher {
    public static void main(String[] args) {
        new HeadlessApplication(new GameServer());
    }
}