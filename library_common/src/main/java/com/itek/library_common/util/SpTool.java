package com.itek.library_common.util;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashMap;
import java.util.Map;

import androidx.annotation.NonNull;


/**
 * Author:：simon
 * Date：2019-12-12:16:06
 * Mail：simon@itekiot.com
 * Copyright (c) 2019 itek. All rights reserved.
 * Description：
 */
public class SpTool {


    private static Map<String, SpTool> sSPMap = new HashMap<>();
    private SharedPreferences sp;

    /**
     * 获取SP实例
     *
     * @return {@link SpTool}
     */
    public static SpTool getInstance() {
        return getInstance("");
    }

    /**
     * 获取SP实例
     *
     * @param spName sp名
     * @return {@link SpTool}
     */
    public static SpTool getInstance(String spName) {
        if (isSpace(spName)) spName = "spUtils";
        SpTool sp = sSPMap.get(spName);
        if (sp == null) {
            sp = new SpTool(spName);
            sSPMap.put(spName, sp);
        }
        return sp;
    }

    private SpTool(final String spName) {
        sp = Utils.getContext().getSharedPreferences(spName, Context.MODE_PRIVATE);
    }

    /**
     * 保存在手机里面的文件名
     */
    private  final String FILE_NAME = "share_date";

    /**
     * 保存数据的方法，我们需要拿到保存数据的具体类型，然后根据类型调用不同的保存方法
     *
     * @param context
     * @param key
     * @param object
     */
    public  void save(Context context, String key, Object object) {

        String type = object.getClass().getSimpleName();

        SharedPreferences.Editor editor = sp.edit();

        switch (type) {
            case "String":
                editor.putString(key, (String) object);
                break;
            case "Integer":
                editor.putInt(key, (Integer) object);
                break;
            case "Boolean":
                editor.putBoolean(key, (Boolean) object);
                break;
            case "Float":
                editor.putFloat(key, (Float) object);
                break;
            case "Long":
                editor.putLong(key, (Long) object);
                break;
        }

        editor.apply();
    }


    /**
     * 得到保存数据的方法，我们根据默认值得到保存的数据的具体类型，然后调用相对于的方法获取值
     *
     * @param context
     * @param key
     * @param defaultObject
     * @return
     */
    public  Object get(Context context, String key, Object defaultObject) {
        String type = defaultObject.getClass().getSimpleName();

        switch (type) {
            case "String":
                return sp.getString(key, (String) defaultObject);
            case "Integer":
                return sp.getInt(key, (Integer) defaultObject);
            case "Boolean":
                return sp.getBoolean(key, (Boolean) defaultObject);
            case "Float":
                return sp.getFloat(key, (Float) defaultObject);
            case "Long":
                return sp.getLong(key, (Long) defaultObject);
        }

        return null;
    }

    private static boolean isSpace(final String s) {
        if (s == null) return true;
        for (int i = 0, len = s.length(); i < len; ++i) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    /**
     * SP中清除所有数据
     */
    public void clear() {
        sp.edit().clear().apply();
    }

    /**
     * SP中移除该key
     *
     * @param key 键
     */
    public void remove(@NonNull final String key) {
        sp.edit().remove(key).apply();
    }

}
