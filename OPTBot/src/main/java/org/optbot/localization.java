package org.optbot;

import com.google.gson.annotations.SerializedName;

public class localization {
    @SerializedName("longName")
    private String mLongName;
    @SerializedName("name") 
    private String mName;
    @SerializedName("url")
    private String mUrl;

    /**
     * Constructeur de la localization
     * @param longName Le nom complet de la localization
     * @param name Le nom de la localization
     * @param url L'url Google maps de la localization
     */
    public localization(String longName, String name, String url){
        mLongName = longName;
        mName = name;
        mUrl = url;
    }

/*
LES GETTERS :
-------------------------------------------------------------
*/
    /**
     * Getter du nom complet de la localization
     * @return Le nom complet de la localization
     */
    public String getLongName(){
        return mLongName;
    }

    /**
     * Getter du nom de la localization
     * @return Le nom de la localization
     */
    public String getName(){
        return mName;
    }

    /**
     * Getter de l'url Google maps de la localization
     * @return L'url Google maps de la localization
     */
    public String getUrl(){
        return mUrl;
    }
}
