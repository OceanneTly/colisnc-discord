paquet  org.optbot ;

importer  com.google.gson.annotations.SerializedName ;

 pays de classe  publique {
    @SerializedName ( " code " )
     chaîne privée mCode ;
    @SerializedName ( " iso " )
     chaîne privée mIso;
    @SerializedName ( " nom " )
     chaîne privée mName;

    /**
     * Constructeur de la campagne
     * @param code le code référent à la country
     * @param iso L'iso de la country
     * @param name Le nom de la country
     */
    publics  pays ( chaîne  Code , chaîne  iso , chaîne  nom ) {
        mCode = code ;
        mIso = iso;
        mNom = nom ;
    }

/*
LES GETTERS :
-------------------------------------------------- -----------
*/
    /**
     * Getter du code référent à la country
     * @return Le code référent à la campagne
     */
     chaîne  publique getCode (){
        renvoyer le mCode ;
    }

    /**
     * Getter de l'iso de la country
     * @return L'iso de la country
     */
     chaîne  publique getIso (){
        retourner mIso;
    }

    /**
     * Getter du nom de la country
     * @retour Le nom de la campagne
     */
     chaîne  publique getName (){
        renvoie mName ;
    }
}
