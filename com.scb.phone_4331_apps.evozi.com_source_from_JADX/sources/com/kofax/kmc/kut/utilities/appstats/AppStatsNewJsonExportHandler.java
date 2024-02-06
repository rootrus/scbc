package com.kofax.kmc.kut.utilities.appstats;

import android.util.Log;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class AppStatsNewJsonExportHandler implements AppStatsDsExportHandler, AppStatsExportListener {
    private static AppStatistics appStats;
    private static AppStatistics.FriendAS asFriend;

    /* renamed from: pG */
    private final String f3630pG = ".json";

    /* renamed from: pL */
    private File f3631pL = null;

    /* renamed from: pW */
    FileOutputStream f3632pW = null;

    /* renamed from: pX */
    OutputStreamWriter f3633pX = null;

    /* renamed from: pY */
    private boolean f3634pY = true;

    /* renamed from: pZ */
    private String f3635pZ;

    static {
        AppStatistics instance = AppStatistics.getInstance();
        appStats = instance;
        asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
    }

    public AppStatsNewJsonExportHandler() {
        asFriend.addAppStatsExportListener(this, 0);
    }

    /* renamed from: u */
    private void m3821u(String str) {
        try {
            this.f3633pX.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onExportAppStatsRowEvent(String str, AppStatsDaoField[] appStatsDaoFieldArr) {
        String str2;
        if (this.f3634pY) {
            this.f3634pY = false;
            String sdkVersion = SdkVersion.getSdkVersion();
            StringBuilder sb = new StringBuilder();
            sb.append("{\r\n  \"AppStatisticsVersion\" : \"");
            sb.append(sdkVersion);
            sb.append("\",\r\n");
            m3821u(sb.toString());
            m3821u("  \"AppStatisticsTables\" : {\r\n");
        }
        int i = 0;
        for (AppStatsDaoField appStatsDaoField : appStatsDaoFieldArr) {
            if (!this.f3635pZ.equals(str)) {
                if (!this.f3635pZ.equals("")) {
                    m3821u("\r\n    ],\r\n");
                }
                this.f3635pZ = str;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("    \"");
                sb2.append(str);
                sb2.append("s\" : [\r\n");
                m3821u(sb2.toString());
            } else if (i == 0) {
                m3821u(",\r\n");
            }
            if (i == 0) {
                m3821u("      {\r\n");
            } else {
                m3821u(",\r\n");
            }
            i++;
            String dsFieldName = appStatsDaoField.getDsFieldName();
            String dsValueString = appStatsDaoField.getDsValueString();
            if (dsValueString.equals("null") || dsValueString == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("        \"");
                sb3.append(dsFieldName);
                sb3.append("\": null");
                str2 = sb3.toString();
            } else {
                String replace = dsValueString.replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\\n").replace("\r", "\\\r").replace("\t", "\\\t");
                StringBuilder sb4 = new StringBuilder();
                sb4.append("        \"");
                sb4.append(dsFieldName);
                sb4.append("\": \"");
                sb4.append(replace);
                sb4.append("\"");
                str2 = sb4.toString();
            }
            m3821u(str2);
        }
        m3821u("\r\n      }");
    }

    public void configDsExpFilePath(String str) {
        if (!str.endsWith(".json")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".json");
            str = sb.toString();
        }
        this.f3631pL = new File(str);
        try {
            this.f3632pW = new FileOutputStream(this.f3631pL);
            this.f3633pX = new OutputStreamWriter(this.f3632pW);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f3634pY = true;
        this.f3635pZ = "";
    }

    public void exportStatusEvent(AppStatsExportEvent appStatsExportEvent) {
        int percentComplete = appStatsExportEvent.getPercentComplete();
        StringBuilder sb = new StringBuilder();
        sb.append("percent complete: ");
        sb.append(percentComplete);
        Log.d("EXPORT", sb.toString());
        if (percentComplete == 100) {
            m3821u("\r\n    ]\r\n  }\r\n}\r\n");
            try {
                this.f3633pX.close();
                this.f3632pW.close();
                Log.d("EXPORT", "file closed");
            } catch (Exception e) {
                e.printStackTrace();
            }
            appStats.removeAppStatsExportListener(this);
        }
    }
}
