package com.kofax.kmc.kut.utilities.appstats.dao;

public abstract class EnvironmentOrmCommon {
    public abstract String getCarrier();

    public abstract String getDeviceID();

    public abstract Long getEnvTime();

    public abstract String getID();

    public abstract String getLanguage();

    public abstract String getManufacturer();

    public abstract String getMemory();

    public abstract String getModel();

    public abstract String getOSName();

    public abstract String getOSVersion();

    public abstract String getSDKVersion();

    public abstract String getTimeZone();

    public abstract void setCarrier(String str);

    public abstract void setDeviceID(String str);

    public abstract void setEnvTime(Long l);

    public abstract void setID(String str);

    public abstract void setLanguage(String str);

    public abstract void setManufacturer(String str);

    public abstract void setMemory(String str);

    public abstract void setModel(String str);

    public abstract void setOSName(String str);

    public abstract void setOSVersion(String str);

    public abstract void setSDKVersion(String str);

    public abstract void setTimeZone(String str);
}
