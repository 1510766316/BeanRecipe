package com.wgx.love.beanrecipe.retrofitTools;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wugx on 17-12-4.
 */

public class RetrofitManager {
    private static RetrofitManager mRetrofitManager;
    private Retrofit mRetrofit;

    public static RetrofitManager getInstance(String baseUrl){
        if (mRetrofitManager == null){
            synchronized (RetrofitManager.class){
                if (mRetrofitManager == null){
                    mRetrofitManager = new RetrofitManager(baseUrl);
                }
            }
        }
        return mRetrofitManager;
    }

    private RetrofitManager(String baseUrl){
        initRetrofit(baseUrl);
    }

    private void initRetrofit(String baseUrl) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.connectTimeout(20, TimeUnit.SECONDS);
        builder.readTimeout(25, TimeUnit.SECONDS);
        builder.writeTimeout(25, TimeUnit.SECONDS);
        builder.retryOnConnectionFailure(true);
        OkHttpClient client = builder.build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public <T> T createService(Class<T> apiServer){
        return mRetrofit.create(apiServer);
    }

}
