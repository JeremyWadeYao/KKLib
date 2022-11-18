package com.hsty.kklib;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * @项目名: HstyPay
 * @包名: com.hstypay.hstysales.activity
 * @创建者: Jeremy
 * @创建时间: 2017/6/29 14:59
 * @描述: 像素转换工具类
 */

public class DensityUtils {

    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static int dp2px(Context context, int dp) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int dpi = metrics.densityDpi;

        return (int) (dp * dpi / 160f + 0.5f);
    }

    public static int px2dp(Context context, int px) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int dpi = metrics.densityDpi;

        return (int) (px * 160f / dpi + 0.5f);
    }
}
