package com.wgx.love.beanrecipe.glideTools;

import android.content.Context;
import android.util.Log;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.module.AppGlideModule;

/**
 * Created by wugx on 17-11-30.
 */
@GlideModule
public final class MyAppGlideModule extends AppGlideModule{
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        super.applyOptions(context, builder);
        builder.setLogLevel(Log.DEBUG);
        int memoryCacheSizeBytes = 1024 * 1024 * 20; // 内存缓存20mb
        builder.setMemoryCache(new LruResourceCache(memoryCacheSizeBytes));
    }
}
