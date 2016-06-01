package com.ray.base.util;

import com.ray.base.constant.ConfigPropertiesConst;
import com.ray.base.log.LogUtil;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class SettingUtil {

    /**
     * 读取指定配置文件里的指定属性(未指定文件时，默认为setting.properties)
     * @param filePath 文件名
     * @param propName 属性名
     * @return 格式化后的字符串
     */
    public static String getProperty(String filePath, String propName){
        if(filePath == null || "".equals(filePath)){
            filePath = "config.properties";
        }

        Properties prop = new Properties();
        InputStream in = getCaller(3).getResourceAsStream("/" + filePath);
        String propValue = "";
        try {
            prop.load(in);
            propValue = prop.getProperty(propName).trim();
            propValue = new String(propValue.getBytes("ISO-8859-1"),"gbk");
        } catch (Exception e) {
            e.printStackTrace();
            return propValue;
        }
        return propValue;
    }

    public static String getProperty(String propName){
        String filePath = "config.properties";

        Properties prop = new Properties();
        InputStream in = getCaller(4).getResourceAsStream("/" + filePath);
        String propValue = "";
        try {
            prop.load(in);
            propValue = prop.getProperty(propName).trim();
            propValue = new String(propValue.getBytes("ISO-8859-1"),"gbk");
        } catch (Exception e) {
            LogUtil.errorLog(e);
            return propValue;
        }
        return propValue;
    }

    /**
     *
     * @return
     */
    public static String getDeployMode() {
        // 后端
        String deployMode = getProperty("", ConfigPropertiesConst.DEPLOY_MODE);
        if(deployMode!=null && !deployMode.equals("")){
            return deployMode;
        }
        // 前端
        deployMode = getProperty(ConfigPropertiesConst.DEPLOY_MODE);
        return deployMode;
    }
    /**
     *
     * @return
     */
    public static String getVerifyMode() {
        return getProperty(ConfigPropertiesConst.VERIFY_MODE);
    }
    /**
     *
     * @return
     */
//    public static String getFlumeHost() {
//        // 后端
//        String flumeHost = getProperty("",ConfigPropertiesConst.FLUME_HOST);
//        if(flumeHost!=null && !flumeHost.equals("")){
//            return flumeHost;
//        }
//        // 前端
//        flumeHost = getProperty(ConfigPropertiesConst.FLUME_HOST);
//        return flumeHost;
//    }
//    /**
//     *
//     * @return
//     */
//    public static String getFlumePort() {
//        // 后端
//        String flumePort = getProperty("",ConfigPropertiesConst.FLUME_PORT);
//        if(flumePort!=null && !flumePort.equals("")){
//            return flumePort;
//        }
//        // 前端
//        flumePort = getProperty(ConfigPropertiesConst.FLUME_PORT);
//        return flumePort;
//    }
    /**
     *
     * @return
     */
//    public static String getModuleName() {
//        // 后端
//        String moduleName = getProperty("",ConfigPropertiesConst.MODULE_NAME);
//        if(moduleName!=null && !moduleName.equals("")){
//            return moduleName;
//        }
//        // 前端
//        moduleName = getProperty(ConfigPropertiesConst.MODULE_NAME);
//        return moduleName;
//    }
    /**
     *
     * @return
     */
    public static String getVersion() {
        return getProperty(ConfigPropertiesConst.VERSION);
    }


    /**
     * 使用线程堆栈信息获取方法的调用者类名
     * @return 调用者类名
     */
    public static Class getCaller(int level){
        StackTraceElement stack[] = Thread.currentThread().getStackTrace();
        Class clazz;
        try {
            String name = stack[level].getClassName();
            clazz = Class.forName(name);
        }catch(Exception ex){
            ex.printStackTrace();
            clazz = Object.class;
        }
        return clazz;
    }
}
