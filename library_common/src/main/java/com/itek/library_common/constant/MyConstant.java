package com.itek.library_common.constant;

import android.os.Environment;


import com.itek.library_common.util.Utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:：simon
 * Date：2019/7/12:2:46 PM
 * Mail：simon@itekiot.com
 * Copyright (c) 2019 itek. All rights reserved.
 * Description：
 */
public class MyConstant {


    //================= log =====================


    //================= PATH ====================
    public static final String PATH_DATA = Utils.getContext().getCacheDir().getAbsolutePath() + File.separator + "data";
    public static final String PATH_CACHE = PATH_DATA + "/NetCache";
    public static final String PATH_CACHE_BLE = PATH_DATA + "/BleCache";
    public static final String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + "smartlock" + File.separator + "ble";

    public static final String REAML_KEY = "123456789@simonzhang@306@123456789";

    public static final String SplitKey = "@simonzhang@306@";

    //功能检测错误代码
    public static final String funcs_check_error_code_1 = "触摸板无响应";
    public static final String funcs_check_error_code_2 = "LED灯不亮";
    public static final String funcs_check_error_code_3 = "蜂鸣器不响";
    public static final String funcs_check_error_code_4 = "电机驱动不良";
    public static final String funcs_check_error_code_5 = "冷复位不良";
    public static final String funcs_check_error_code_6 = "门磁不良";
    public static final String funcs_check_error_code_7 = "锁舌不良";
    public static final String funcs_check_error_code_8 = "NB无数据";

    /// controller Ips
    public static final String controller_Ip_Unicom = "139.159.140.34"; //联通
    public static final String controller_Ip_port_Unicom = "5683"; //联通
    public static final String controller_Ip_Telecom = "180.101.147.115"; //电信
    public static final String controller_Ip_port_Telecom = "5683"; //电信
    public static final String controller_Ip_Mobile = "139.159.140.34"; //移动  待定

    //井盖状态  睡眠，标定，监控，隔离，警情
    public static final byte cover_state_type_k11_hole_open_lock_open = 0x11;  //电源孔开+锁开
    public static final byte cover_state_type_k01_hole_close_lock_open = 0x01;  //电源孔闭+锁开
    public static final byte cover_state_type_k10_hole_open_lock_close = 0x10;  //电源孔开+锁闭
    public static final byte cover_state_type_k00_hole_close_lock_close = 0x00;  //电源孔关+锁关
    public static final byte cover_Nb_Connected = 0x01;  //nb 连接
    public static final byte cover_Nb_disConnected = 0x00;  //nb 断开
    public static final byte cover_Emergency_hole_closed = 0x00;  //nb 闭
    public static final byte cover_Emergency_hole_open = 0x01;  //nb 开
    public static final byte cover_set_sensitivity = 0x68;  //nb 开

    public static Map<Byte, String> cover_state_type_name_huamai = new HashMap<>(); //井盖锁状态类
    public static Map<String, String> ble_work_status_names = new HashMap<>();

    public static final String key_ble_workstate_00 ="0";  //0：正在注册网络，
    public static final String key_ble_workstate_01 ="1";  //1：正在初始化udp
    public static final String key_ble_workstate_02 ="2";  //2:正在初始化coap
    public static final String key_ble_workstate_03 ="3";  //3:coap模式
    public static final String key_ble_workstate_04 ="4";  //4：UDP模式
    public static final String key_ble_workstate_05 ="5";  //5：获取SIM卡号中
    public static final String key_ble_workstate_06 ="6";  //6：检查sim卡号中
    public static final String key_ble_workstate_07 ="7";  //7：正在检查网络信号
    public static final String key_ble_workstate_08 ="8";  //8：产品没有入库，网络关闭
    public static final String key_ble_workstate_09 ="9";  //9：nb找不到网络
    public static final String key_ble_workstate_10 ="10";  //10：开始绑定云平台
    public static final String key_ble_workstate_11 ="11";  //11：nb不能进入psm状态，nb已关闭
    public static final String key_ble_workstate_12 ="12";  //11：nb不能进入psm状态，nb已关闭


    static {
        cover_state_type_name_huamai.put(cover_state_type_k11_hole_open_lock_open,"钥匙口未激活+锁开");//11
        cover_state_type_name_huamai.put(cover_state_type_k01_hole_close_lock_open,"钥匙口已激活+锁开");//01
        cover_state_type_name_huamai.put(cover_state_type_k10_hole_open_lock_close,"钥匙口未激活+锁关");//10
        cover_state_type_name_huamai.put(cover_state_type_k00_hole_close_lock_close,"钥匙口已激活+锁关"); //00

        ble_work_status_names.put(key_ble_workstate_00,"正在注册网络");
        ble_work_status_names.put(key_ble_workstate_01,"正在初始化udp");
        ble_work_status_names.put(key_ble_workstate_02,"正在初始化coap");
        ble_work_status_names.put(key_ble_workstate_03,"coap模式");
        ble_work_status_names.put(key_ble_workstate_04,"UDP模式");
        ble_work_status_names.put(key_ble_workstate_05,"获取SIM卡号中");
        ble_work_status_names.put(key_ble_workstate_06,"检查sim卡号中");
        ble_work_status_names.put(key_ble_workstate_07,"正在检查网络信号");
        ble_work_status_names.put(key_ble_workstate_08,"产品没有入库，网络关闭");
        ble_work_status_names.put(key_ble_workstate_09,"nb找不到网络");
        ble_work_status_names.put(key_ble_workstate_10,"开始绑定云平台");
        ble_work_status_names.put(key_ble_workstate_11,"nb不能进入psm状态，nb已关闭");
        ble_work_status_names.put(key_ble_workstate_12,"nb复位次数超限");

    }

}
