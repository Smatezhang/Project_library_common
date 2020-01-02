package com.itek.library_common.start;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;


import com.alibaba.android.arouter.launcher.ARouter;
import com.itek.library_common.constant.UrlConstant;
import com.itek.library_common.router.RouterActivityPath;
import com.itek.library_common.util.Utils;

import androidx.annotation.Nullable;


/**
 * 冷启动
 */

public class SplashActivity extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                inLogin();
            }
        }, 4 * 1000);
    }


    /**
     * 进入登录页面
     */
    private void inLogin() {

        String mPackageName = Utils.getPackageName(SplashActivity.this);
        String path = RouterActivityPath.Main.PAGER_MAIN;
        if (mPackageName != null) {
            String mPath = UrlConstant.packageToPathMap.get(mPackageName);
            if (mPath!= null) {
                path = mPath;
            }
        }

        ARouter.getInstance().build(RouterActivityPath.Sign.PAGER_LOGIN)
                .withString("path", path)
                .navigation();
        finish();
    }
}
