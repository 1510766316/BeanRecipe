package com.wgx.love.beanrecipe.retrofitTools;

import java.net.ConnectException;
import java.net.SocketTimeoutException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by wugx on 17-12-4.
 */

public abstract class RequestCallBack<T extends CallInfo> implements Callback<T> {

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        int code = response.body().getCode();
        String msg = response.body().getMsg();
        switch (code) {
            case 200:
                onSuccess(response);
                break;
            case 100:
                onFail(msg);
                break;
            case 404:
                onFail(msg);
                break;
            default:
                break;
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        if(t instanceof SocketTimeoutException){

        }else if(t instanceof ConnectException){

        }else if(t instanceof RuntimeException){

        }
        onFail(t.getMessage());
    }

    public abstract void onSuccess(Response<T> response);

    public abstract void onFail(String message);
}
