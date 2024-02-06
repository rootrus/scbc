package com.kofax.kmc.kut.utilities;

import com.kofax.kmc.ken.engines.BarCodeReader;
import com.kofax.kmc.kut.utilities.version.KutVersion;

public class SdkVersion {
    public static String getSdkVersion() {
        return "3.4.0.1.0.519";
    }

    public static String getPackageVersion() {
        return KutVersion.getPackageVersion();
    }

    public static String getIpVersion() {
        return IpLibUtil.getKippVersion();
    }

    public static String getBcVersion() {
        return new BarCodeReader().getBcVersion();
    }

    public static String getClassifierVersion() {
        return ClassifierLibUtil.getClassifierVersion();
    }

    public static Boolean versionCompatible(String str, String str2) {
        return Boolean.valueOf(compare(str, str2) >= 0);
    }

    public static int compare(String str, String str2) {
        return Double.compare(m515r(str), m515r(str2));
    }

    /* renamed from: r */
    private static double m515r(String str) {
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        sb.append(split[0]);
        sb.append(split[1]);
        sb.append(split[2]);
        sb.append(".");
        sb.append(split[3]);
        return Double.parseDouble(sb.toString());
    }
}
