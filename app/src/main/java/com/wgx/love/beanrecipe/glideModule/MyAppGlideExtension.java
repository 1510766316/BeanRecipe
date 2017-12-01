package com.wgx.love.beanrecipe.glideModule;

import com.bumptech.glide.annotation.GlideExtension;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.request.RequestOptions;

/**
 * Created by wugx on 17-11-30.
 */

@GlideExtension
public class MyAppGlideExtension {
    // Size of mini thumb in pixels.
    private static final int MINI_THUMB_SIZE = 400;

    private MyAppGlideExtension() { } // utility class

    @GlideOption
    public static void miniThumb(RequestOptions options) {
        options.fitCenter().override(MINI_THUMB_SIZE);
    }
}
