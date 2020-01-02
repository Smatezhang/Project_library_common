package com.itek.library_common.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 *
 */

public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/Main";
    }

    /**
     * 身份验证组件
     */
    public static class Sign {
        private static final String SIGN = "/sign";
        /*登录界面*/
        public static final String PAGER_LOGIN = SIGN + "/Login";
        public static final String PAGER_LOGIN_COAP = SIGN + "/Login/Coap";
    }

    /**
     * 追溯系统组件
     */
    public static class Mts {
        private static final String MTS = "/mts";
        /*追溯系统*/
        public static final String PAGER_MTS = MTS + "/Main";
    }


    /**
     * HG系统组件
     */
    public static class HG {
        private static final String HG = "/hg";
        public static final String PAGER_HG = HG + "/Main";
    }


    /**
     * ft系统组件
     */
    public static class FT {
        private static final String FT = "/ft";
        public static final String PAGER_FT = FT + "/Main";
    }

    /**
     * blekey系统组件
     */
    public static class BleKey {
        private static final String BleKey = "/blekey";
        public static final String PAGER_BleKey = BleKey + "/Main";
    }


    /**
     * 用户组件
     */
    public static class User {
        private static final String USER = "/user";
        /*用户详情*/
        public static final String PAGER_USERDETAIL = USER + "/UserDetail";
    }


    /**
     * 调试系统组件
     */
    public static class DC {
        private static final String DC = "/dc";
        public static final String PAGER_Home = DC + "/Main";
    }


    /**
     * 无源锁系统组件
     */
    public static class PassiveLockManager {
        private static final String PassiveLockManager = "/plm";
        public static final String PAGER_Home = PassiveLockManager + "/Main";
    }

    /**
     * NFC组件
     */
    public static class NFC {
        private static final String NFC = "/nfc";
        public static final String PAGER_Home = NFC + "/Main";
    }
}
