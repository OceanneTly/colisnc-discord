package opt.OPTbot;
import java.io.*;
import java.net.*;

public class colisNcRequest {
    /**
     * 
     * @param url Entrez l'url du site dont vous voulez récupérer les informations  
     * @return Données du site entrez en paramètre
     * @throws IOException
     */
    public static String get(String url) throws IOException{

        String source ="";
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(
        yc.getInputStream()));
        String inputLine;
        
        while ((inputLine = in.readLine()) != null)
        source +=inputLine;
        in.close();
        return source;
        }
}
