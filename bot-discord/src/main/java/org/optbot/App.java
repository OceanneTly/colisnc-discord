package org.optbot;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.*;

public class App {

    /**
     * Méthode principale de l'aplication OPT Bot Discord
     * 
     * @param args
     */
    public static void main(String[] args) {

        Gson gson = new Gson();

        DiscordApi api = new DiscordApiBuilder().setToken("ODE2NTcxMTEyNTY5NDM4MjM5.YD85HA.XfMQUbRcVImvwzay68FkDsqxhHg")
                .login().join();

        api.addMessageCreateListener(event -> {
            String message = event.getMessage().getContent();
            String[] chaineMessage = message.split(" ");
            List<String> list = Arrays.asList(chaineMessage);


            if (list.contains("/colis") && chaineMessage[1] != null && list.size() == 2) {
                // requette http pour l'api
                // System.out.println(chaineMessage[1]);

                String colis;
                try {
                    colis = colisNcRequest
                            .get("https://colisnc-api.herokuapp.com/colis/" + chaineMessage[1] + "/latest");
                    Colis detailColis = gson.fromJson(colis, Colis.class);
                    if (detailColis == null) {
                        event.getChannel().sendMessage("```txt\n"+"\u26A0\uFE0F" + " Le numéro de colis " + chaineMessage[1] + " n'existe pas.\n" + "```");
                    } else {
                        if (detailColis.getLocalizationLongName() == null || detailColis.getLocalizationUrl() == null) {
                            event.getChannel()
                                    .sendMessage("```txt\n"+"\u2714\uFE0F" + "Colis num° " + detailColis.getItemId() + " :\n"
                                            + detailColis.getRawDateHeure() + "\n" + detailColis.getTypeEvenement()
                                            + " et à déjà été récupéré.\n" + "```");
                        } else {
                            if(detailColis.getCountryCode().equals("NC")) {
                            // le print
                            event.getChannel().sendMessage("```txt\n"+"\u2714\uFE0F" + "Colis num° " + detailColis.getItemId() + " :\n"
                                    + detailColis.getRawDateHeure() + "\n" + detailColis.getTypeEvenement()
                                    + " et est récupérable à l'" + detailColis.getLocalizationLongName() + " en "
                                    + detailColis.getCountryName() + "\n\n\uD83D\uDDFA\uFE0F Localisation :" + "```" + detailColis.getLocalizationUrl());
                            }
                            else {
                                event.getChannel().sendMessage("```txt\n"+"\u2708\uFE0F " + "Colis num° " + detailColis.getItemId() + " :\n"
                                    + detailColis.getRawDateHeure() + "\n" + detailColis.getTypeEvenement() + " et se trouve en" + detailColis.getCountryName() + "\n\n\uD83D\uDDFA\uFE0F Localisation :" + "```" + detailColis.getLocalizationUrl());
                            }
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else if (list.contains("/help")) {
                event.getChannel().sendMessage("```txt\n"+"\u260E\uFE0F Pour réccupérer les informations de votre colis il vous faut écrire /colis suivi du numéro de colis. \n" + "```");
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
