package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by petaj on 30/12/2017.
 */

public class BitcoinDataModel {

    private String mPrice;

    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();

            bitcoinData.mPrice = jsonObject.getString("ask");

            return bitcoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPrice() {
        return mPrice;
    }
}
