package com.wgx.love.beanrecipe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.wgx.love.beanrecipe.glideModule.GlideApp;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "MainActivity";

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.image);
        show();
    }


    private void show(){
        String url = "http://img0.imgtn.bdimg.com/it/u=2069423848,1745692628&fm=27&gp=0.jpg";
        GlideApp.with(this).asDrawable()
                .transition(withCrossFade()).miniThumb().dontTransform().load(url).into(imageView);
    }
}
