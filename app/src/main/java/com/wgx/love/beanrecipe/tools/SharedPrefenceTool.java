package com.wgx.love.beanrecipe.tools;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * SharedPreferences数据库管理
 *
 * @author wgx
 */
public class SharedPrefenceTool {

    /**
     * 将整型数据保存
     *
     * @param dbName 数据库名
     * @param key    键
     * @param value  值
     * @return true：保存成功 false：失败
     */
    public static boolean save2Int(Context context,String dbName, String key, int value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return sharedPreferences.edit().putInt(key, value).commit();

    }

    /**
     * 从数据库中获取对应的整型数据
     *
     * @param dbName   数据库名
     * @param key      键
     * @param defValue 默认值
     * @return
     */
    public static int get8Int(Context context,String dbName, String key, int defValue) {
        SharedPreferences preferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return preferences.getInt(key, defValue);
    }

    /**
     * 将长整型数据保存
     *
     * @param dbName 数据库名
     * @param key    键
     * @param value  值
     * @return true：保存成功 false：失败
     */
    public static boolean save2Long(Context context,String dbName, String key, long value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return sharedPreferences.edit().putLong(key, value).commit();

    }

    /**
     * 从数据库中获取对应的长整型数据
     *
     * @param dbName   数据库名
     * @param key      键
     * @param defValue 默认值
     * @return
     */
    public static long get8Long(Context context,String dbName, String key, long defValue) {
        SharedPreferences preferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return preferences.getLong(key, defValue);
    }

    /**
     * 将字符串数据保存
     *
     * @param dbName 数据库名
     * @param key    键
     * @param value  值
     * @return true：保存成功 false：失败
     */
    public static boolean save2String(Context context,String dbName, String key, String value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return sharedPreferences.edit().putString(key, value).commit();

    }

    /**
     * 从数据库中获取对应的字符串型数据
     *
     * @param dbName   数据库名
     * @param key      键
     * @param defValue 默认值
     * @return
     */
    public static String get8String(Context context,String dbName, String key, String defValue) {
        SharedPreferences preferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return preferences.getString(key, defValue);
    }

    /**
     * 将布尔类型数据保存
     *
     * @param dbName 数据库名
     * @param key    键
     * @param value  值
     * @return true：保存成功 false：失败
     */
    public static boolean save2Boolean(Context context,String dbName, String key, boolean value) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return sharedPreferences.edit().putBoolean(key, value).commit();
    }

    /**
     * 从数据库中获取对应的布尔型数据
     *
     * @param dbName   数据库名
     * @param key      键
     * @param defValue 默认值
     * @return
     */
    public static boolean get8Boolean(Context context,String dbName, String key, boolean defValue) {
        SharedPreferences preferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, defValue);
    }

    /**
     * 删除对应数据库
     *
     * @param dbName 数据库名
     * @return boolean
     */
    public static boolean clear4DB(Context context,String dbName) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(dbName, Context.MODE_PRIVATE);
        return sharedPreferences.edit().clear().commit();
    }
}

