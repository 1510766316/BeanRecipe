package com.wgx.love.beanrecipe;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.wgx.love.beanrecipe.bean.DateInfo;
import com.wgx.love.beanrecipe.glideTools.GlideApp;
import com.wgx.love.beanrecipe.retrofitTools.CallInfo;
import com.wgx.love.beanrecipe.retrofitTools.RequestCallBack;
import com.wgx.love.beanrecipe.retrofitTools.RetrofitManager;
import com.wgx.love.beanrecipe.tools.APIServices;
import com.wgx.love.beanrecipe.tools.APPUrl;

import retrofit2.Response;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.tv);
        show();
        showWW();
    }


    private void show() {
        String url = "http://img0.imgtn.bdimg.com/it/u=2069423848,1745692628&fm=27&gp=0.jpg";
        GlideApp.with(this).asDrawable()
                .transition(withCrossFade()).miniThumb().dontTransform().load(url).into(imageView);
    }


    private void showWW() {
        RetrofitManager.getInstance(APPUrl.Base_url)
               .createService(APIServices.class)
               .getDate()
               .enqueue(new RequestCallBack<CallInfo<DateInfo>>() {
                   @Override
                   public void onSuccess(Response<CallInfo<DateInfo>> response) {
                       Log.i(TAG,"response="+response.body().getData().toString());
                       textView.setText(response.body().getData().toString());

                   }

                   @Override
                   public void onFail(String message) {

                   }
               });

    }
}
