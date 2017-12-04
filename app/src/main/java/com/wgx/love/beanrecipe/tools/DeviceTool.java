package com.wgx.love.beanrecipe.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.view.WindowManager;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * Create view by wgx
 *
 * @Describe 设备工具类
 * <p>
 * Create at 2016/9/10 15:59
 */
public class DeviceTool {


    /**
     * @Describe 获取本机IP地址
     * <p>
     * Create at 2016/9/10 16:00
     */
    public static String getLocalIP(Context context) {
        try {
            for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements(); ) {
                NetworkInterface intf = en.nextElement();
                for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements(); ) {
                    InetAddress inetAddress = enumIpAddr.nextElement();
                    if (!inetAddress.isLoopbackAddress() && inetAddress instanceof Inet4Address) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (Exception e) {
        }
        return "";
    }


    /**
     * @Describe 获取本机MAC地址
     * <p>
     * Create at 2016/9/10 16:01
     */
    public static String getMacAddress(Context context) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        WifiInfo info = wifi.getConnectionInfo();
        String address = "";
        if (info != null) {
            address = info.getMacAddress();
        }
        return address == null ? "" : address;
    }

    /**
     * @Describe 获取当前app的版本号
     * <p>
     * Create at 2016/9/10 16:01
     */
    public static String getVersion(Context context) {
        try {
            PackageManager manager = context.getPackageManager();
            PackageInfo info = manager.getPackageInfo(context.getPackageName(), 0);
            String version = info.versionName;
            return version;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * @Describe 获取项目名称AppName
     * <p>
     * Create at 2016/9/10 16:01
     */
    public static String getAppName(Context context) {
        PackageManager pm = context.getPackageManager();
        String appName = context.getApplicationInfo().loadLabel(pm).toString();
        return appName;
    }

    /**
     * 根据屏幕密度，将一个dp值转换成对应的px值
     *
     * @param context 上下文对象
     * @param dp      需要转换的dp值
     * @return dp值对应的px值
     */
    public static int dp2px(Context context, float dp) {
        return (int) (0.5F + context.getResources().getDisplayMetrics().density * dp);
    }

    /**
     * 将一个px转换成dp值
     *
     * @param context 上下文对象
     * @param px      需要转换的px值
     * @return px对应的dp值
     */
    public static int px2dp(Context context, float px) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }

    /**
     * 获取封装屏幕宽高的Point对象
     *
     * @param context 上下文对象
     * @return 封装尺寸的对象
     */
    public static int[] getScreenSize(Context context) {
        int[] screen=new int[2];
        WindowManager wm = (WindowManager)context
                .getSystemService(Context.WINDOW_SERVICE);

        screen[0]= wm.getDefaultDisplay().getWidth();
        screen[1] = wm.getDefaultDisplay().getHeight();
        return screen;
    }
}
