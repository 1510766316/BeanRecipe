package com.wgx.love.beanrecipe.tools;

import com.wgx.love.beanrecipe.bean.DateInfo;
import com.wgx.love.beanrecipe.bean.UserInfo;
import com.wgx.love.beanrecipe.retrofitTools.CallInfo;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wugx on 17-12-4.
 */

public interface APIServices {

    @GET("")
    Call<CallInfo<UserInfo>> getUserInfo();

    @GET("api/CalenderInfo/getCalender?date_c=2015-01-01")
    Call<CallInfo<DateInfo>> getDate();

}
