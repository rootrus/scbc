package com.thunderhead.android.infrastructure.server.entitys;

public class DeviceInfo {
    public String appName = null;
    public String appVer = null;
    public String devMfr = null;
    public String devModel = null;
    public String devType = null;
    public String ipAddress = "detected";
    public Double locHorzAccuracy = null;
    public Long locLastUpdated = null;
    public Double locLatitude = null;
    public Double locLongitude = null;
    public String locale = null;
    public String osName = null;
    public String osVer = null;
    public String pushToken = null;

    public DeviceInfo() {
    }

    public DeviceInfo(DeviceInfo deviceInfo) {
        this.appName = deviceInfo.appName;
        this.appVer = deviceInfo.appVer;
        this.osVer = deviceInfo.osVer;
        this.osName = deviceInfo.osName;
        this.devType = deviceInfo.devType;
        this.devMfr = deviceInfo.devMfr;
        this.devModel = deviceInfo.devModel;
        this.locale = deviceInfo.locale;
        this.ipAddress = deviceInfo.ipAddress;
        this.locLatitude = deviceInfo.locLatitude;
        this.locLongitude = deviceInfo.locLongitude;
        this.locLastUpdated = deviceInfo.locLastUpdated;
        this.pushToken = deviceInfo.pushToken;
        this.locHorzAccuracy = deviceInfo.locHorzAccuracy;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppVersion(String str) {
        this.appVer = str;
    }

    public void setOsVersion(String str) {
        this.osVer = str;
    }

    public void setOsName(String str) {
        this.osName = str;
    }

    public void setDeviceType(String str) {
        this.devType = str;
    }

    public void setManufacturer(String str) {
        this.devMfr = str;
    }

    public void setModel(String str) {
        this.devModel = str;
    }

    public void setLocale(String str) {
        this.locale = str;
    }

    public void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public void setLocLatitude(double d) {
        this.locLatitude = Double.valueOf(d);
    }

    public void setLocLongitude(double d) {
        this.locLongitude = Double.valueOf(d);
    }

    public void setLocHorzAccuracy(double d) {
        this.locHorzAccuracy = Double.valueOf(d);
    }

    public void setPushToken(String str) {
        this.pushToken = str;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public void setLocLastUpdated(long j) {
        this.locLastUpdated = Long.valueOf(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("appName:");
        sb.append(this.appName);
        sb.append(", appVer:");
        sb.append(this.appVer);
        sb.append(", osVer:");
        sb.append(this.osVer);
        sb.append(", osName:");
        sb.append(this.osName);
        sb.append(", devType:");
        sb.append(this.devType);
        sb.append(", devMfr:");
        sb.append(this.devMfr);
        sb.append(", devModel:");
        sb.append(this.devModel);
        sb.append(", locLatitude:");
        sb.append(this.locLatitude);
        sb.append(", locLongitude:");
        sb.append(this.locLongitude);
        sb.append(", locHorzAccuracy:");
        sb.append(this.locHorzAccuracy);
        sb.append(", locLastUpdated:");
        sb.append(this.locLastUpdated);
        sb.append(", locale:");
        sb.append(this.locale);
        sb.append(", ipAddress:");
        sb.append(this.ipAddress);
        if (this.pushToken != null) {
            sb.append(", pushToken:");
            sb.append(this.pushToken);
        }
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r1.devType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasData() {
        /*
            r1 = this;
            java.lang.String r0 = r1.appName
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r1.appVer
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = r1.devType
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.android.infrastructure.server.entitys.DeviceInfo.hasData():boolean");
    }
}
