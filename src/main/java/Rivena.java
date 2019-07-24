import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Game;

import javax.security.auth.login.LoginException;

public class Rivena {

    private Rivena() {

        try {
            new JDABuilder(AccountType.BOT)
                    .setToken(Token.TOKEN)
                    .setAudioEnabled(false)
                    .addEventListener(new Listener())
                    .setAudioEnabled(false)
                    .setGame((Game.streaming("League of Legends", "https://twitch.tv")))
                    .build().awaitReady();
                    System.out.printf("Running");

        } catch (LoginException | InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Rivena();
    }
}
