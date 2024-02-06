package com.kofax.kmc.kut.utilities.appstats;

import android.os.Build;
import android.telephony.TelephonyManager;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import p040o.ModifyQuickTopUpReviewActivity;

public class AppStatsEnvSettings {

    /* renamed from: pn */
    private final String f789pn = "unknown memory size";

    /* renamed from: po */
    private final String f790po = "Android";

    /* renamed from: pp */
    private String f791pp = "";

    /* renamed from: pq */
    private String f792pq = "";

    /* renamed from: pr */
    private String f793pr = "";

    /* renamed from: ps */
    private String f794ps = "";

    /* renamed from: pt */
    private String f795pt = "";

    /* renamed from: pu */
    private String f796pu = "";

    /* renamed from: pv */
    private String f797pv = "";

    /* renamed from: pw */
    private String f798pw = "";

    /* renamed from: px */
    private String f799px = "";

    /* renamed from: py */
    private String f800py = "";

    public AppStatsEnvSettings(boolean z) {
        if (z) {
            getEnvManufacturer(true);
            getEnvModel(true);
            getEnvMemorySize(true);
            getEnvOsVersion(true);
            getEnvLanguage(true);
            getEnvSdkVersion(true);
            getEnvTimeZone(true);
            getEnvCarrier(true);
            getEnvOsName(true);
        }
    }

    public AppStatsEnvSettings(EnvironmentEventDao environmentEventDao) {
        this.f791pp = environmentEventDao.getDeviceID();
        this.f792pq = environmentEventDao.getManufacturer();
        this.f793pr = environmentEventDao.getModel();
        this.f794ps = environmentEventDao.getMemory();
        this.f795pt = environmentEventDao.getOsVersion();
        this.f796pu = environmentEventDao.getLanguage();
        this.f797pv = environmentEventDao.getSdkVersion();
        this.f798pw = environmentEventDao.getTimeZone();
        this.f799px = environmentEventDao.getCarrier();
        this.f800py = environmentEventDao.getOsName();
    }

    public String getEnvDeviceID(boolean z) {
        if (z) {
            this.f791pp = UUID.randomUUID().toString();
        }
        return this.f791pp;
    }

    public void setEnvDeviceID(String str) {
        this.f791pp = str;
    }

    public String getEnvManufacturer(boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(Build.MANUFACTURER.charAt(0)));
            sb.append(Build.MANUFACTURER.substring(1));
            this.f792pq = sb.toString();
        }
        return this.f792pq;
    }

    public String getEnvModel(boolean z) {
        String str;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toUpperCase(Build.MANUFACTURER.charAt(0)));
            sb.append(Build.MANUFACTURER.substring(1));
            String obj = sb.toString();
            if (ModifyQuickTopUpReviewActivity.write((CharSequence) Build.MODEL, (CharSequence) obj)) {
                str = Build.MODEL;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                str = sb2.toString();
            }
            this.f793pr = str;
        }
        return this.f793pr;
    }

    public String getEnvMemorySize(boolean z) {
        if (z) {
            try {
                this.f794ps = m570aP();
            } catch (IOException unused) {
                this.f793pr = "unknown memory size";
            }
        }
        return this.f794ps;
    }

    public String getEnvOsVersion(boolean z) {
        if (z) {
            this.f795pt = Build.VERSION.RELEASE;
        }
        return this.f795pt;
    }

    public String getEnvLanguage(boolean z) {
        if (z) {
            this.f796pu = Locale.getDefault().toString();
        }
        return this.f796pu;
    }

    public String getEnvSdkVersion(boolean z) {
        if (z) {
            this.f797pv = SdkVersion.getSdkVersion();
        }
        return this.f797pv;
    }

    public String getEnvTimeZone(boolean z) {
        if (z) {
            this.f798pw = TimeZone.getDefault().getDisplayName(TimeZone.getDefault().inDaylightTime(new Date(System.currentTimeMillis())), 0);
        }
        return this.f798pw;
    }

    public String getEnvCarrier(boolean z) {
        if (z) {
            this.f799px = ((TelephonyManager) AppContextProvider.getContext().getSystemService("phone")).getNetworkOperatorName();
        }
        return this.f799px;
    }

    public String getEnvOsName(boolean z) {
        if (z) {
            this.f800py = "Android";
        }
        return this.f800py;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppStatsEnvSettings appStatsEnvSettings = (AppStatsEnvSettings) obj;
        if (!bothNullOrEqual(this.f791pp, appStatsEnvSettings.getEnvDeviceID(false)) || !bothNullOrEqual(this.f792pq, appStatsEnvSettings.getEnvManufacturer(false)) || !bothNullOrEqual(this.f793pr, appStatsEnvSettings.getEnvModel(false)) || !bothNullOrEqual(this.f794ps, appStatsEnvSettings.getEnvMemorySize(false)) || !bothNullOrEqual(this.f795pt, appStatsEnvSettings.getEnvOsVersion(false)) || !bothNullOrEqual(this.f796pu, appStatsEnvSettings.getEnvLanguage(false)) || !bothNullOrEqual(this.f797pv, appStatsEnvSettings.getEnvSdkVersion(false)) || !bothNullOrEqual(this.f798pw, appStatsEnvSettings.getEnvTimeZone(false)) || !bothNullOrEqual(this.f799px, appStatsEnvSettings.getEnvCarrier(false)) || !bothNullOrEqual(this.f800py, appStatsEnvSettings.getEnvOsName(false))) {
            return false;
        }
        return true;
    }

    public boolean bothNullOrEqual(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* renamed from: aP */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m570aP() throws java.io.IOException {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "/proc/meminfo"
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = "\\s+"
            java.lang.String[] r2 = r1.split(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0043
            int r1 = r2.length     // Catch:{ all -> 0x0047 }
            r3 = 1
            if (r1 <= r3) goto L_0x001c
            r1 = r2[r3]     // Catch:{ all -> 0x0047 }
            goto L_0x001f
        L_0x001c:
            r1 = 0
            r1 = r2[r1]     // Catch:{ all -> 0x0047 }
        L_0x001f:
            int r3 = r2.length     // Catch:{ all -> 0x0047 }
            r4 = 2
            if (r3 <= r4) goto L_0x0043
            r3 = r2[r4]     // Catch:{ all -> 0x0047 }
            java.lang.String r5 = "kB"
            boolean r3 = p040o.ModifyQuickTopUpReviewActivity.write((java.lang.CharSequence) r3, (java.lang.CharSequence) r5)     // Catch:{ all -> 0x0047 }
            if (r3 == 0) goto L_0x0043
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r3.<init>()     // Catch:{ all -> 0x0047 }
            r3.append(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = " "
            r3.append(r1)     // Catch:{ all -> 0x0047 }
            r1 = r2[r4]     // Catch:{ all -> 0x0047 }
            r3.append(r1)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r0.close()
            return r1
        L_0x0047:
            r1 = move-exception
            goto L_0x004c
        L_0x0049:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            r0.close()
        L_0x0051:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.appstats.AppStatsEnvSettings.m570aP():java.lang.String");
    }
}
