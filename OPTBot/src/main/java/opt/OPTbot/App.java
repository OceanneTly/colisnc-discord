package opt.OPTbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class App {

    public static void main(String[] args) {

        DiscordApi api = new DiscordApiBuilder().setToken("ODE2NTcxMTEyNTY5NDM4MjM5.YD85HA.Ia3qSrxZpny23MPR4mupU5bGV-k")
                .login().join();

        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });
    }

}