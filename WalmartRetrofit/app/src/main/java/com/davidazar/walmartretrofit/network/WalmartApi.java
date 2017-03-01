package com.davidazar.walmartretrofit.network;

import com.davidazar.walmartretrofit.model.ProductRequest;
import com.davidazar.walmartretrofit.model.ProductSearchResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by David Azar
 *
 * Interfaz que contiene todos los endpoints de la applicacion (1 en este caso)
 * Aqui se configuran los parametros, metodos de HTTP, Headers y demas..
 */

public interface WalmartApi {


    @Headers({"Content-Type:application/json"})
    @POST("walmartmg/walmartgroceries/login/3/getItemsBySearching")
    Call<ProductSearchResponse> searchProductInGR(@Header("timestamp") String timestamp, @Body ProductRequest product);


}
