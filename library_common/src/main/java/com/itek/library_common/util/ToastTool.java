package com.itek.library_common.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Author:：simon
 * Date：2019-12-16:17:11
 * Mail：simon@itekiot.com
 * Copyright (c) 2019 itek. All rights reserved.
 * Description：
 */

public class ToastTool {


    private static Toast toast;

    /**
     * 显示字符串
     *
     * @param context
     * @param content
     */
    public static void show(Context context, String content) {
        if (toast == null) {
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

    /**
     * 显示非字符串
     *
     * @param context
     * @param content
     */
    public static void show(Context context, int content) {
        if (toast == null) {
            toast = Toast.makeText(context, content + "", Toast.LENGTH_SHORT);
        } else {
            toast.setText(content + "");
        }
        toast.show();
    }


}

