package com.shubham.crypto.Api_Related;

import com.shubham.crypto.Api_Related.Cryptodata.CryptoData;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Crypto {

    @GET("/v1/cryptocurrency/listings/latest?")
    Call<CryptoData>getCryptoData(@Header("X-CMC_PRO_API_KEY")String apikey);





}
