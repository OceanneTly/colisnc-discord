aquet  org.optbot ;

importer  com.google.gson.annotations.SerializedName ;

 localisation de classe  publique {
    @SerializedName ( " nom long " )
     chaîne privée mLongName;
    @SerializedName ( " nom " )
     chaîne privée mName;
    @SerializedName ( " url " )
    privé  Chaîne Mürl;

    /**
     * Constructeur de la localisation
     * @param longName Le nom complet de la localisation
     * @param name Le nom de la localisation
     * @param url L'url Google maps de la localisation
     */
     localisation publique ( String  longName , String  name , String  url ){
        mLlongName = longName;
        mNom = nom ;
        mUrl = url;
    }

/*
LES GETTERS :
-------------------------------------------------- -----------
*/
    /**
     * Getter du nom complet de la localisation
     * @return Le nom complet de la localisation
     */
     chaîne  publique getLongName (){
        return mLlongName;
    }

    /**
     * Getter du nom de la localisation
     * @return Le nom de la localisation
     */
     chaîne  publique getName (){
        renvoie mName ;
    }

    /**
     * Getter de l'url Google maps de la localisation
     * @return L'url Google maps de la localisation
     */
     chaîne  publique getUrl (){
        retourner mUrl;
    }
}
