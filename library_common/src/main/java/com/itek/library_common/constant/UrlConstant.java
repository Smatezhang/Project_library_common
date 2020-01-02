package com.itek.library_common.constant;



import com.itek.library_common.router.RouterActivityPath;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:：simon
 * Date：2019/6/22:10:02 PM
 * Mail：simon@itekiot.com
 * Copyright (c) 2019 itek. All rights reserved.
 * Description：
 */

public class UrlConstant {

    public final static String projectname_smartlock2n="smartlock2n";
    public final static String projectname_products="products";
    public final static String projectname_fttools="fttools";
    public final static String http="http://";
    public final static String https="https://";
    public static Map<String, String> UrlMap = new HashMap<>();

    public static Map<String, String> pathToProjectMap = new HashMap<>();
    public static Map<String, String> packageToPathMap = new HashMap<>();

    public static final String hearderKey = "url_name";
    public static final String token = "njItekCompany_306";
    public static final String Net_return_one = "1";
    public static final String Net_return_zero = "0";
    public static final String Net_return_unlogin = "-1";
    //    public static final String host_zly = "www.zlyit.com";
    public static final String host_zly = "218.2.234.170";
    //    public static final String localhost = "192.168.3.182";
    public static final String localhost = "192.168.3.182";
    public static final String port_mts = "23581";
    public static final String port_test = "8080";
    public static final String port_mts_test = "23684";
    public static final String port_epu_1t2 = "23583";
    public static final String baseUrl_key_mts = "baseUrl_mts";
    public static final String baseUrl_key_mts_test = "baseUrl_mts_test";
    public static final String baseUrl_key_equ_1t2 = "baseUrl_key_equ_1t2";
    public static final String baseUrl_key_localhost = "baseUrl_key_localhost";

    public static String Url_getSecretkeyBylockid = http + host_zly + ":" + port_epu_1t2 + "/" + projectname_smartlock2n + "/bluemanager/getSecretkeyBylockid_T";
    public static String Url_saveOpenlockRecord = http + host_zly + ":" + port_epu_1t2 + "/" + projectname_smartlock2n + "/smartequ/openEqu_T";

    public static final String hearderKey_value_mts = hearderKey + ":" + baseUrl_key_mts;  // 所有的MTS的项目下的api 调用url  Products
    public static final String hearderKey_value_smartlock2n = hearderKey + ":" + baseUrl_key_equ_1t2;  // 所有的一拖二的项目下的api 调用url

    public static final String websocket_host_ft = host_zly;
    public static final String websocket_port_ft = port_mts;
    public static final String websocket_Projectname_ft = projectname_products; // 设置url

    static {

        UrlMap.put(baseUrl_key_mts,http + host_zly + ":" + port_mts);   // products 地址
        UrlMap.put(baseUrl_key_mts_test,http + host_zly + ":" + port_mts_test); // mts 测试地址
        UrlMap.put(baseUrl_key_equ_1t2,http + host_zly + ":" + port_epu_1t2); // 正式一拖二系统
        UrlMap.put(baseUrl_key_localhost,http + localhost + ":" + port_test);  // 本地调试用的

        Url_getSecretkeyBylockid =  UrlMap.get(baseUrl_key_equ_1t2) + "/" + projectname_smartlock2n + "/bluemanager/getSecretkeyBylockid_T";
        Url_saveOpenlockRecord =  UrlMap.get(baseUrl_key_equ_1t2) + "/" + projectname_smartlock2n + "/smartequ/openEqu_T";

        packageToPathMap.put(PackageReflexs.ITEKMVVM, RouterActivityPath.Main.PAGER_MAIN);
        packageToPathMap.put(PackageReflexs.BLEKEY, RouterActivityPath.BleKey.PAGER_BleKey);
        packageToPathMap.put(PackageReflexs.PassivelockManager, RouterActivityPath.PassiveLockManager.PAGER_Home);
        packageToPathMap.put(PackageReflexs.FTTools, RouterActivityPath.FT.PAGER_FT);
        packageToPathMap.put(PackageReflexs.HG, RouterActivityPath.HG.PAGER_HG);
        packageToPathMap.put(PackageReflexs.DebugController, RouterActivityPath.DC.PAGER_Home);
        packageToPathMap.put(PackageReflexs.MTS, RouterActivityPath.Mts.PAGER_MTS);

        pathToProjectMap.put(RouterActivityPath.Main.PAGER_MAIN,projectname_smartlock2n);
        pathToProjectMap.put(RouterActivityPath.BleKey.PAGER_BleKey,projectname_smartlock2n);
        pathToProjectMap.put(RouterActivityPath.PassiveLockManager.PAGER_Home,projectname_smartlock2n);
        pathToProjectMap.put(RouterActivityPath.Mts.PAGER_MTS,projectname_products);
        pathToProjectMap.put(RouterActivityPath.FT.PAGER_FT,projectname_products);

    }

}
