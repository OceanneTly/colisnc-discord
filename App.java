paquet  org.optbot ;

importer  org.javacord.api.DiscordApi ;
importer  org.javacord.api.DiscordApiBuilder ;
importer  org.springframework.boot.SpringApplication ;

importer  com.google.gson.Gson ;

import  java.io.IOException ;
import  java.util.* ;

 App de classe  publique {

    /**
     * Méthode principale de l'application OPT Bot Discord
     * 
     * @arguments param
     */
    public  App ( String [] args ) {

        Gson gson =  nouveau  Gson ();

        DiscordApi api =  nouveau  DiscordApiBuilder () . setToken( " jeton " )
                .login() . rejoindre();

        api . addMessageCreateListener(événement - > {
            Chaîne message = événement . getMessage() . Obtenir du contenu();
            Chaîne [] chaineMessage = message . split( "  " );
            List< String > list =  Arrays . asList(chaineMessage);

            if (list . contains( " /colis " ) && chaineMessage[ 1 ] !=  null  && list . size() ==  2 ) {
                // requette http pour l'api
                // System.out.println(chaineMessage[1]);

                Ficelle colis;
                essayez {
                    colis = colisNcRequête
                            .get( " https://colisnc-api.herokuapp.com/colis/ "  + chaineMessage[ 1 ] +  " /latest " );
                    Colis detailColis = gson . fromJson(colis, classe Colis . );
                    if (détailColis ==  null ) {
                        événement . getChannel() . sendMessage( " ```txt \n "  +  " \u 26A0 \u FE0F "  +  " Le numéro de colis "
                                + chaineMessage[ 1 ] +  " n'existe pas. \n "  +  " ``` " );
                    } autre {
                        if (detailColis . getLocalizationLongName() ==  null  || detailColis . getLocalizationUrl() ==  null ) {
                            événement . getChannel()
                                    .sendMessage( " ```txt \n "  +  " \u 2714 \u FE0F "  +  " Colis num° "  + detailColis . getItemId()
                                            +  " : \n "  + détail Colis . getRawDateHeure() +  " \n "
                                            + détail Colis . getTypeEvenement() +  " et à déjà été récupéré. \n "  +  " ``` " );
                        } autre {
                            if (detailColis . getCountryCode() . equals( " NC " )) {
                                // le print
                                événement . getChannel()
                                        .sendMessage( " ```txt \n "  +  " \u 2714 \u FE0F "  +  " Colis num° "
                                                + détail Colis . getItemId() +  " : \n "  + detailColis . getRawDateHeure()
                                                +  " \n "  + détail Colis . getTypeEvenement() +  " et est récupérable à l' "
                                                + détail Colis . getLocalizationLongName() +  " fr "
                                                + détail Colis . getCountryName() +  " \n\n\u D83D \u DDFA \u FE0F Localisation : "
                                                +  " ``` "  + détail Colis . getLocalizationUrl());
                            } autre {
                                événement . getChannel()
                                        .sendMessage( " ```txt \n "  +  " \u 2708 \u FE0F "  +  " Colis num° "
                                                + détail Colis . getItemId() +  " : \n "  + detailColis . getRawDateHeure()
                                                +  " \n "  + détail Colis . getTypeEvenement() +  " et se trouve en "
                                                + détail Colis . getCountryName() +  " \n\n\u D83D \u DDFA \u FE0F Localisation : "
                                                +  " ``` "  + détail Colis . getLocalizationUrl());
                            }
                        }
                    }
                } catch ( IOException e) {
                    e . printStackTrace();
                }

            } else  if (list . contains( " /help " )) {
                événement . getChannel() . sendMessage( " ```txt \n "
                        +  " \u 260E \u FE0F Pour réccupérer les informations de votre colis il vous faut écrire /colis suivi du numéro de colis. \n "
                        +  " ``` " );
            }

            /*
             * if (event.getMessageContent().equalsIgnoreCase("/colis")) {
             * event.getChannel().sendMessage(detailColis.getRawDateHeure() + " : " +
             * detailColis.getTypeEvenement()+" et est récupérable à l'"+
             * detailColis.getLocalizationLongName() + " :\n" +
             * detailColis.getLocalizationUrl()); }
             */
        });
    }

    public  static  void  main ( String [] args ) {
        SpringApplication . run( App . class, args);
    }

}
