package opt.OPTbot;

import com.google.gson.Gson;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import java.io.IOException;
import java.util.*;

public class App {

    /**
     * Méthode principale de l'aplication OPT Bot Discord
     * @param args
     */
    public static void main(String[] args) {

        Gson gson = new Gson();

        DiscordApi api = new DiscordApiBuilder().setToken("ODE2NTcxMTEyNTY5NDM4MjM5.YD85HA.tV6leg5sFGoFSwDGQTPUxR-RCgk")
                .login().join();

        api.addMessageCreateListener(event -> {
            String message = event.getMessage().getContent();
            String[] chaineMessage = message.split(" ");
            List<String> list = Arrays.asList(chaineMessage);

            if (list.contains("/colis") && chaineMessage[1] != null) {
                // requette http pour l'api
                // System.out.println(chaineMessage[1]);

                String colis;
                try {
                    colis = colisNcRequest
                            .get("https://colisnc-api.herokuapp.com/colis/" + chaineMessage[1] + "/latest");
                    Colis detailColis = gson.fromJson(colis, Colis.class);
                    if (detailColis == null) {
                        event.getChannel().sendMessage("Le numéro de colis " + chaineMessage[1] + " n'existe pas.");
                    } else {
                        if (detailColis.getLocalizationLongName() == null || detailColis.getLocalizationUrl() == null) {
                            event.getChannel().sendMessage("Colis num° " + detailColis.getItemId() + " :\n"
                            + detailColis.getRawDateHeure() + "\n" + detailColis.getTypeEvenement()
                            + " et à déjà été récupéré.");
                        } else {
                            // le print
                            event.getChannel().sendMessage("Colis num° " + detailColis.getItemId() + " :\n"
                                    + detailColis.getRawDateHeure() + "\n" + detailColis.getTypeEvenement()
                                    + " et est récupérable à l'" + detailColis.getLocalizationLongName() + " en "
                                    + detailColis.getCountryName() + "\n\n" + detailColis.getLocalizationUrl());
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            /*
             * if (event.getMessageContent().equalsIgnoreCase("/colis")) {
             * event.getChannel().sendMessage(detailColis.getRawDateHeure() + " : " +
             * detailColis.getTypeEvenement()+" et est récupérable  à l'"+
             * detailColis.getLocalizationLongName() + " :\n" +
             * detailColis.getLocalizationUrl()); }
             */
        });
    }

}