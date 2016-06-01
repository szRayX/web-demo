package com.ray.base.log;

import com.ray.springmvc.domain.Passport;

import java.io.Serializable;

/**
 * Created on 2016/6/1.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class Log implements Serializable {

    public Log(String level, String type, String deviceId, String context, Passport passport) {
        this.level = level;
        this.type = type;
        this.deviceId = deviceId;
        this.context = context;
        this.passport = passport;
    }

    public Log(String level, String type, String deviceId, String context, Passport passport, Throwable t) {
        this.level = level;
        this.type = type;
        this.deviceId = deviceId;
        this.context = context;
        this.passport = passport;
        this.t = t;
    }

    public Log() {
    }

    // 级别
    private String level;

    // 类型
    private String type;

    // 设备ID
    private String deviceId;

    // 内容
    private String context;

    // 用户护照
    private Passport passport;

    // 异常信息
    private Throwable t;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Throwable getT() {
        return t;
    }

    public void setT(Throwable t) {
        this.t = t;
    }
}
