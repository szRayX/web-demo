package com.ray.base.log;

import com.ray.base.util.SettingUtil;
import com.ray.springmvc.domain.Passport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class LogUtil {

    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logUtil = LoggerFactory.getLogger(LogUtil.class);
    //    private final static MyRpcClientFacade client = new MyRpcClientFacade();
//    private final static String moduleName = SettingUtil.getModuleName();
    private final static String deployMode = SettingUtil.getDeployMode();
//    private static boolean isFlumeInit = false;

//    static{
//        int port = 0;
////        String host = SettingUtil.getFlumeHost();
//        try{
////            port = Integer.parseInt(SettingUtil.getFlumePort());
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//        if(host!=null && !host.equals("") && port > 0) {
//            try {
////                client.init(host, port);
////                isFlumeInit = true;
//            }catch(Exception ex){
//                ex.printStackTrace();
//            }
//        }
//    }

    /**
     * 输出info日志
     * @param log 日志对象
     */
    public static void writeLog(Log log){
        String level = log.getLevel().toLowerCase();
        switch (level) {
            case "debug":
                logUtil.debug(log.getContext());
                break;
            case "info":
                logUtil.info(log.getContext());
//                sendFlumeLog(log);
                break;
            case "warn":
                logUtil.warn(log.getContext());
//                sendFlumeLog(log);
                break;
            case "error":
                if(log.getT()!=null){
                    logUtil.error(log.getContext(),log.getT());
//                    sendFlumeLog(log);
                }else{
                    logUtil.error(log.getContext());
//                    sendFlumeLog(log);
                }
                break;
            default:
                break;
        }
    }

    /**
     * 输出info日志
     * @param context 日志内容
     */
    @Deprecated
    public static void infoLog(String context){
        writeLog(new Log("info", "", "", context, new Passport()));
    }

    /**
     * 输出debug日志
     * @param context 日志内容
     */
    @Deprecated
    public static void debugLog(String context){
        writeLog(new Log("debug","", "", context, new Passport()));
    }

    /**
     * 输出warn日志
     * @param context 日志内容
     */
    @Deprecated
    public static void warnLog(String context){
        writeLog(new Log("warn", "", "", context, new Passport()));
    }

    /**
     * 输出error日志
     * @param context 日志内容
     */
    @Deprecated
    public static void errorLog(String context){
        writeLog(new Log("error", "", "", context, new Passport()));
    }

    /**
     * 输出error日志
     * @param ex 日志内容
     */
    @Deprecated
    public static void errorLog(Throwable ex){
        writeLog(new Log("error", "", "", ex.getMessage(), new Passport(), ex));
    }

    /**
     * 获取异常详细堆栈信息
     */
    public static String dumpException(Throwable e){
        StringBuffer msg = new StringBuffer("null");
        if (e != null) {
            msg = new StringBuffer("");
            String message = e.toString();
            int length = e.getStackTrace().length;
            if (length > 0) {
                msg.append(message).append("\n");
                for (int i = 0; i < length; i++) {
                    msg.append("\t").append(e.getStackTrace()[i]).append("\n");
                }
            } else {
                msg.append(message);
            }
        }
        return msg.toString();
    }

//    public static void sendFlumeLog(Log log){
//        StringBuilder builder = new StringBuilder("");
//        // 拼接时间
//        Date now = new Date(new Date().getTime() - 8 * 3600 * 1000);
//        String date = DateUtil.formatDate(now,"yyyy-MM-dd");
//        String time = DateUtil.formatDate(now,"HH:mm:ss.SSS");
//        builder.append(date).append("T").append(time).append("Z");
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 拼接日志级别
//        builder.append(log.getLevel());
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 拼接ip地址
//        builder.append(SystemUtil.getHostIp());
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 拼接threadId
//        builder.append("thread-").append(SystemUtil.getThreadId());
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 拼接类名，方法名
//        builder.append(SystemUtil.getCallerClassName(4))
//                .append(".").append(SystemUtil.getCallerMethodName(4));
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 获取承租人ID
//        if(log.getPassport()!=null) {
//            builder.append(log.getPassport().getTenantId());
//        }else{
//            builder.append("0");
//        }
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 获取用户ID
//        if(log.getPassport()!=null) {
//            builder.append(log.getPassport().getUserId());
//        }else{
//            builder.append("0");
//        }
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 设备ID
//        String deviceId = log.getDeviceId();
//        if(deviceId!=null && !deviceId.equals("")){
//            builder.append(deviceId);
//        }
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 获取模块名称
//        builder.append(moduleName);
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 日志类型
//        String type = log.getType();
//        if(type!=null && !type.equals("")){
//            builder.append(type);
//        }else{
//            builder.append("system");
//        }
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 日志内容
//        if(log.getT()!=null){
//            builder.append(dumpException(log.getT()));
//        }else {
//            builder.append(log.getContext());
//        }
//
//        // 分隔符
//        builder.append(" | ");
//
//        // 发布模式
//        if(deployMode!=null && !deployMode.equals("")){
//            builder.append(deployMode);
//        }else{
//            builder.append("dev");
//        }
//
//        try {
//            if(isFlumeInit) {
//                client.sendDataToFlume(builder.toString());
//            }
//        }catch(Exception ex){
//            ex.printStackTrace();
//        }
//    }
//
//    protected void finalize() throws Throwable{
//        super.finalize();
//        client.cleanUp();
//    }

}
