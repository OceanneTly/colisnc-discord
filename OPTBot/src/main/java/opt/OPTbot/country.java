package opt.OPTbot;

import com.google.gson.annotations.SerializedName;

public class country {
    @SerializedName("code")
    private String mCode;
    @SerializedName("iso")
    private String mIso;
    @SerializedName("name")
    private String mName;

    /**
     * Constructeur de la country
     * @param code le code référent à la country
     * @param iso L'iso de la country
     * @param name Le nom de la country
     */
    public country(String code, String iso, String name){
        mCode = code;
        mIso = iso;
        mName = name;
    }

/*
LES GETTERS :
-------------------------------------------------------------
*/
    /**
     * Getter du code référent à la country
     * @return Le code référent à la country
     */
    public String getCode(){
        return mCode;
    }

    /**
     * Getter de l'iso de la country
     * @return L'iso de la country
     */
    public String getIso(){
        return mIso;
    }

    /**
     * Getter du nom de la country
     * @return Le nom de la country
     */
    public String getName(){
        return mName;
    }
}
