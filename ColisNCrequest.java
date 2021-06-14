paquet  org.optbot ;
importer  java.io.* ;
importer  java.net.* ;

 classe  publique colisNcRequest {
    /**
     * 
     * @param url Entrez l'url du site dont vous voulez récupérer les informations  
     * @return Données du site entrez en paramètre
     * @lance IOException
     */
    public  static  String  get ( String  url ) lève  IOException {

        Chaîne source = " " ;
        URL oracle =  nouvelle  URL (url);
        URLConnection yc = oracle . ouvrirConnexion();
        BufferedReader dans =  nouveau  BufferedReader (
        nouveau  InputStreamReader (
        yc . getInputStream()));
        Chaîne inputLine;
        
        while ((inputLine = in . readLine()) !=  null )
        source += entréeLigne ;
        dans . Fermer();
        source de retour ;
        }
}
