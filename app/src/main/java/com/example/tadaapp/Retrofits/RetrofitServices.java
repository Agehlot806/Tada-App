package com.example.tadaapp.Retrofits;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitServices {
    public static final String BASE_URL="https://tada.progressiveaidata.in/api/";
    public static Retrofit retrofit;
    public static Retrofit getRetrofit()
    {
        if (retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
