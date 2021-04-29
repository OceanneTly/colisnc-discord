package opt.OPTbot;

import com.google.gson.annotations.SerializedName;

public class Colis {

    @SerializedName("country")
    private country mCountry;

    @SerializedName("date")
    private String mDate;
    @SerializedName("information")
    private String mInformation;
    @SerializedName("itemId")
    private String mItemId;
    @SerializedName("localisation")
    private String mLocalisation;

    @SerializedName("localization")
    private localization mLocalization;

    @SerializedName("pays")
    private String mPays;
    @SerializedName("rawDateHeure")
    private String mRawDateHeure;
    @SerializedName("statuts")
    private String mStatus;
    @SerializedName("typeEvenement")
    private String mTypeEvenement;

    /**
     * Constructeur du coli
     * @param country détails du pays ou se trouve le coli
     * @param date date d'arrivée du coli au dernier lieu connu ou de livraison du coli
     * @param information information suplémentaire sur le coli
     * @param itemId numéro du coli
     * @param localisation nom de la dernière localisation 
     * @param localization détails suplémentaire sur la dernière localisation connu
     * @param pays nom du pays ou se trouve le colis
     * @param rawDateHeure date et heure 
     * @param status statut du coli
     * @param typeEvenement détails sur le statut du coli
     */
    public Colis(country country, String date, String information, String itemId, String localisation, localization localization, String pays, String rawDateHeure, String status, String typeEvenement){
        mCountry = country;
        mDate = date;
        mInformation = information;
        mItemId = itemId;
        mLocalisation = localisation;
        mLocalization = localization;
        mPays = pays;
        mRawDateHeure = rawDateHeure;
        mStatus = status;
        mTypeEvenement = typeEvenement;
    }

/*
LES GETTERS :
-------------------------------------------------------------
*/
    /**
     * Getter du code de country
     * @return Le code de country
     */
    public String getCountryCode(){
        return mCountry.getCode();
    }

    /**
     * Getter de l'iso de country
     * @return L'iso de country
     */
    public String getCountryIso(){
        return mCountry.getIso();
    }

    /**
     * Getter du nom de country
     * @return Le nom de country
     */
    public String getCountryName(){
        return mCountry.getName();
    }

    /**
     * Getter de la date
     * @return La date
     */
    public String getDate(){
        return mDate;
    }

    /**
     * Getter des informations
     * @return Les informations
     */
    public String getInformation(){
        return mInformation;
    }

    /**
     * Getter du numéro de coli
     * @return Le numéro du coli
     */
    public String getItemId(){
        return mItemId;
    }

    /**
     * Getter du nom de la locqlisation
     * @return Le nom de la localisation
     */
    public String getLocalisation(){
        return mLocalisation;
    }

    /**
     * Getter du nom complet de la localisation
     * @return Le nom complet de la localisation
     */
    public String getLocalizationLongName(){
        return mLocalization.getLongName();
    }

    /**
     * Getter du nom de la localisation
     * @return Le nom de la localisation
     */
    public String getLocalizationName(){
        return mLocalization.getName();
    }

    /**
     * Getter de la l'url Google Maps de la localisation
     * @return L'url Google Maps
     */
    public String getLocalizationUrl(){
        return mLocalization.getUrl();
    }

    /**
     * Getter du nom du pays
     * @return Nom du pays
     */
    public String getPays(){
        return mPays;
    }

    /**
     * Getter de la date et l'heure
     * @return La date et l'heure
     */
    public String getRawDateHeure(){
        return mRawDateHeure;
    }

    /**
     * Getter du statut du coli
     * @return Le statut du coli
     */
    public String getStatuts(){
        return mStatus;
    }

    /**
     * Getter des détails du statut du coli
     * @return Les détails du statut du coli
     */
    public String getTypeEvenement(){
        return mTypeEvenement;
    }
}
