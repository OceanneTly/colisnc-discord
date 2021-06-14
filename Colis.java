paquet  org.optbot ;

importer  com.google.gson.annotations.SerializedName ;

 classe  publique Colis {

    @SerializedName ( " pays " )
    pays privé mPays;

    @SerializedName ( " date " )
     chaîne privée mDate;
    @SerializedName ( " informations " )
     chaîne privée mInformation;
    @SerializedName ( " itemId " )
    private  String mItemId;
    @SerializedName ( " localisation " )
     mlocalisation privée des chaînes ;

    @SerializedName ( " localisation " )
    localisation privée mLocalisation;

    @SerializedName ( " paie " )
     chaîne privée mPays ;
    @SerializedName ( " rawDateHeure " )
     chaîne privée mRawDateHeure;
    @SerializedName ( " statuts " )
     chaîne privée mStatus ;
    @SerializedName ( " typeEvenement " )
    private  String mTypeEvenement;

    /**
     * Constructeur du coli
     * @param country détails du pays ou se trouve le coli
     * @param date date d'arrivée du coli au dernier lieu connu ou de livraison du coli
     * @param informations informations suplémentaire sur le coli
     * @param itemId numéro du coli
     * @param localisation nom de la dernière localisation
     * @param localisation détails suplémentaire sur la dernière localisation connue
     * @param pays nom du pays ou se trouve le colis
     * @param rawDateHeure date et heure
     * @param status statut du coli
     * @param typeEvenement détails sur le statut du coli
     */
    public  Colis ( country  country , String  date , String  information , String  itemId , String  localisation , localisation  localisation , String  pays , String  rawDateHeure , String  status , String  typeEvenement ){
        mPays = pays ;
        mDate = date ;
        mInformation = information ;
        mItemId = itemId;
        mlocalisation = localisation ;
        mLocalisation = localisation ;
        mPays = paie ;
        mRawDateHeure = rawDateHeure;
        mStatus = état ;
        mTypeEvenement = typeEvenement;
    }

/*
LES GETTERS :
-------------------------------------------------- -----------
*/
    /**
     * Getter du code de pays
     * @return Le code de pays
     */
     chaîne  publique getCountryCode (){
        retourner mPays . obtenir le code();
    }

    /**
     * Getter de l'iso de country
     * @return L'iso de country
     */
     chaîne  publique getCountryIso (){
        retourner mPays . getIso();
    }

    /**
     * Getter du nom de pays
     * @retour Le nom de pays
     */
     chaîne  publique getCountryName (){
        retourner mPays . getName();
    }

    /**
     * Getter de la date
     * @retour La date
     */
     chaîne  publique getDate (){
        retourner mDate ;
    }

    /**
     * Getter des informations
     * @retour Les informations
     */
     chaîne  publique getInformation (){
        retourner mInformation;
    }

    /**
     * Getter du numéro de coli
     * @retour Le numéro du coli
     */
     chaîne  publique getItemId (){
        retourner mItemId;
    }

    /**
     * Getter du nom de la locqlisation
     * @return Le nom de la localisation
     */
     chaîne  publique getLocalisation (){
        retour mlocalisation;
    }

    /**
     * Getter du nom complet de la localisation
     * @return Le nom complet de la localisation
     */
     chaîne  publique getLocalizationLongName (){
        renvoie mLocalization . getLongName();
    }

    /**
     * Getter du nom de la localisation
     * @return Le nom de la localisation
     */
     chaîne  publique getLocalizationName (){
        renvoie mLocalization . getName();
    }

    /**
     * Getter de l'url Google Maps de la localisation
     * @return L'url Google Maps
     */
     chaîne  publique getLocalizationUrl (){
        renvoie mLocalization . getUrl();
    }

    /**
     * Getter du nom du pays
     * @retour Nom du pays
     */
     chaîne  publique getPays (){
        retourner mPays ;
    }

    /**
     * Getter de la date et de l'heure
     * @retour La date et l'heure
     */
     chaîne  publique getRawDateHeure (){
        return mRawDateHeure;
    }

    /**
     * Getter du statut du coli
     * @retour Le statut du coli
     */
    public  String  getStatuts (){
        renvoyer mStatus ;
    }

    /**
     * Getter des détails du statut du coli
     * @retour Les détails du statut du coli
     */
     chaîne  publique getTypeEvenement (){
        return mTypeEvenement;
    }
}
