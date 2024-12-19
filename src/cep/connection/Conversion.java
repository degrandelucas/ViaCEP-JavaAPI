package cep.connection;

import cep.dto.InfoCEP;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversion {

    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static InfoCEP conversionFromJson(String responseBodyAPI) {
        return gson.fromJson(responseBodyAPI, InfoCEP.class);
    }

    public static String conversionToJson (InfoCEP infoCEP){
        return gson.toJson(InfoCEP.class);
    }
}
