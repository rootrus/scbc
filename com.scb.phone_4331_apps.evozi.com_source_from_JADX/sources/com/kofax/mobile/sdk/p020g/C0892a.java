package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.AppStatsEnvSettings;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EventInstanceDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: com.kofax.mobile.sdk.g.a */
public abstract class C0892a {
    private static final String TAG = C0892a.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: xt */
    public static EnvironmentEventDao f2113xt = null;

    /* renamed from: xu */
    protected static C0893a f2114xu = new C0893a();
    protected AppStatistics appStats;
    protected AppStatistics.FriendAS asFriend;

    /* renamed from: rG */
    protected String f2115rG = "";

    /* renamed from: rJ */
    protected AppStatsInstanceType f2116rJ;

    /* renamed from: xA */
    private boolean f2117xA;

    /* renamed from: xB */
    private Map<AppStatsEventIDType, Integer> f2118xB;

    /* renamed from: xC */
    private Map<AppStatsEventIDType, Long> f2119xC;

    /* renamed from: xD */
    private AppStatsEventIDType f2120xD;

    /* renamed from: xv */
    private String f2121xv;

    /* renamed from: xw */
    private boolean f2122xw;

    /* renamed from: xx */
    private boolean f2123xx;

    /* renamed from: xy */
    private EventInstanceDao f2124xy;

    /* renamed from: xz */
    private boolean f2125xz;

    /* renamed from: com.kofax.mobile.sdk.g.a$a */
    static class C0893a implements AppStatistics.DataStoreInitializedListener {
        private AppStatistics appStats;
        private AppStatistics.FriendAS asFriend;

        /* renamed from: xE */
        private String f2126xE = "";

        public C0893a() {
            AppStatistics instance = AppStatistics.getInstance();
            this.appStats = instance;
            AppStatistics.FriendAS friendAS = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
            this.asFriend = friendAS;
            friendAS.addDataStoreInitializedListener(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: iA */
        public String mo12280iA() {
            return this.f2126xE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: S */
        public boolean mo12279S(String str) {
            return !this.f2126xE.equals(str);
        }

        public void dataStoreInitialized(String str) {
            this.f2126xE = str;
            EnvironmentEventDao unused = C0892a.f2113xt = null;
        }
    }

    public C0892a() {
        AppStatistics instance = AppStatistics.getInstance();
        this.appStats = instance;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
        this.f2121xv = "";
        this.f2122xw = false;
        this.f2123xx = true;
        this.f2124xy = null;
        this.f2125xz = false;
        this.f2117xA = false;
        this.f2118xB = new HashMap();
        this.f2119xC = new HashMap();
        this.f2120xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
    }

    public C0892a(AppStatsInstanceType appStatsInstanceType) {
        AppStatistics instance = AppStatistics.getInstance();
        this.appStats = instance;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
        this.f2121xv = "";
        this.f2122xw = false;
        this.f2123xx = true;
        this.f2124xy = null;
        this.f2125xz = false;
        this.f2117xA = false;
        this.f2118xB = new HashMap();
        this.f2119xC = new HashMap();
        this.f2120xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        this.f2116rJ = appStatsInstanceType;
        this.f2115rG = m2308iu();
        this.f2121xv = f2114xu.mo12280iA();
        mo12278iy();
    }

    public C0892a(String str, AppStatsInstanceType appStatsInstanceType, boolean z) {
        AppStatistics instance = AppStatistics.getInstance();
        this.appStats = instance;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
        this.f2121xv = "";
        this.f2122xw = false;
        this.f2123xx = true;
        this.f2124xy = null;
        this.f2125xz = false;
        this.f2117xA = false;
        this.f2118xB = new HashMap();
        this.f2119xC = new HashMap();
        this.f2120xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
        this.f2115rG = str;
        this.f2123xx = false;
        this.f2121xv = f2114xu.mo12280iA();
        this.f2116rJ = appStatsInstanceType;
        this.f2122xw = z;
        if (z) {
            mo12278iy();
            return;
        }
        this.f2125xz = true;
        this.f2117xA = true;
    }

    public String getInstanceId() {
        return this.f2115rG;
    }

    /* access modifiers changed from: protected */
    /* renamed from: it */
    public AppStatsEventIDType mo12274it() {
        return this.f2120xD;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12269a(AppStatsEventIDType appStatsEventIDType) {
        this.f2120xD = appStatsEventIDType;
    }

    /* renamed from: iu */
    public static String m2308iu() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: iv */
    public void mo12275iv() {
        if (this.f2125xz) {
            mo12277ix();
        }
        this.f2125xz = false;
        this.f2115rG = m2308iu();
        mo12278iy();
    }

    /* renamed from: R */
    public void mo12267R(String str) {
        this.f2115rG = str;
    }

    /* renamed from: iw */
    public void mo12276iw() {
        this.f2117xA = false;
        mo12277ix();
    }

    /* renamed from: ix */
    public void mo12277ix() {
        synchronized (this) {
            if (this.f2124xy != null && !this.f2117xA && this.appStats.isRecording()) {
                EventInstanceDao clone = this.f2124xy.clone();
                this.f2124xy = clone;
                clone.setDismissalTime(this.asFriend.currentEventTime());
                this.f2124xy.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
                this.asFriend.logAppStats(new AppStatsDao[]{this.f2124xy});
                this.f2117xA = true;
                this.f2125xz = false;
                this.f2124xy = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finalize() throws java.lang.Throwable {
        /*
            r1 = this;
            r1.mo12277ix()     // Catch:{ all -> 0x0007 }
            super.finalize()
            return
        L_0x0007:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0009 }
        L_0x0009:
            r0 = move-exception
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p020g.C0892a.finalize():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: iy */
    public void mo12278iy() {
        synchronized (this) {
            if (!this.f2125xz && this.appStats.isRecording()) {
                m2309iz();
                EventInstanceDao eventInstanceDao = new EventInstanceDao();
                this.f2124xy = eventInstanceDao;
                eventInstanceDao.setInstanceId(this.f2115rG);
                this.f2124xy.setEnvironmentId(f2113xt.getId());
                this.f2124xy.setCreationTime(this.asFriend.currentEventTime());
                this.f2124xy.setInstanceType(this.f2116rJ);
                this.f2124xy.setSessionKey(this.f2124xy.getAppStatsSessionKey());
                this.f2124xy.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
                this.asFriend.logAppStats(new AppStatsDao[]{this.f2124xy});
                this.f2125xz = true;
                this.f2117xA = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ErrorInfo mo12268a(AppStatsDao[] appStatsDaoArr) {
        C0892a aVar = this;
        AppStatsDao[] appStatsDaoArr2 = appStatsDaoArr;
        if (f2114xu.mo12279S(aVar.f2121xv)) {
            if (aVar.f2123xx) {
                aVar.f2125xz = false;
                aVar.f2124xy = null;
                aVar.f2115rG = m2308iu();
                for (AppStatsDao appStatsDao : appStatsDaoArr2) {
                    if (appStatsDao.getInstanceId() != null) {
                        appStatsDao.setInstanceId(aVar.f2115rG);
                    }
                }
            }
            aVar.f2121xv = f2114xu.mo12280iA();
        }
        for (AppStatsDao appStatsDao2 : appStatsDaoArr2) {
            if (appStatsDao2.getInstanceId() != null) {
                mo12278iy();
            } else if (appStatsDao2.getEnvironmentId() != null) {
                m2309iz();
                appStatsDao2.setEnvironmentId(f2113xt.getId());
            }
        }
        AppStatsEventIDType it = mo12274it();
        if (aVar.f2118xB.containsKey(it)) {
            long convert = TimeUnit.NANOSECONDS.convert((long) aVar.f2118xB.get(it).intValue(), TimeUnit.MILLISECONDS);
            long nanoTime = System.nanoTime();
            long convert2 = TimeUnit.MILLISECONDS.convert(convert, TimeUnit.NANOSECONDS);
            long convert3 = TimeUnit.MILLISECONDS.convert(nanoTime, TimeUnit.NANOSECONDS);
            Long l = aVar.f2119xC.get(it);
            if (l != null) {
                long convert4 = TimeUnit.MILLISECONDS.convert(l.longValue(), TimeUnit.NANOSECONDS);
                long convert5 = TimeUnit.MILLISECONDS.convert(nanoTime - l.longValue(), TimeUnit.NANOSECONDS);
                if (nanoTime - l.longValue() < convert) {
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append(it);
                    sb.append(" not logged... eventThrottleMs(");
                    sb.append(convert2);
                    sb.append(") not elpased. (");
                    sb.append(convert5);
                    sb.append(").");
                    C0767k.m1801b(str, sb.toString());
                    return ErrorInfo.KMC_UT_STATS_EVENT_THROTTLED;
                }
                String str2 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(it);
                sb2.append(" logged... eventThrottleMs(");
                sb2.append(convert2);
                sb2.append(")  currentTimeMs=");
                sb2.append(convert3);
                sb2.append(", eventLastTimeMs=");
                sb2.append(convert4);
                sb2.append(" elpased=");
                sb2.append(convert5);
                C0767k.m1801b(str2, sb2.toString());
            }
            aVar = this;
            aVar.f2119xC.put(it, Long.valueOf(nanoTime));
        }
        aVar.asFriend.logAppStats(appStatsDaoArr);
        return ErrorInfo.KMC_SUCCESS;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12270a(AppStatsEventIDType appStatsEventIDType, int i) {
        this.f2118xB.put(appStatsEventIDType, Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12271a(AppStatsEventIDType appStatsEventIDType, AppStatsClientEventLogger appStatsClientEventLogger) {
        if (this.appStats.isRecording()) {
            appStatsClientEventLogger.logEvent(appStatsEventIDType);
        }
    }

    /* renamed from: iz */
    private void m2309iz() {
        synchronized (this) {
            if (this.appStats.isRecording()) {
                AppStatsEnvSettings appStatsEnvSettings = new AppStatsEnvSettings(true);
                String deviceId = this.appStats.getDeviceId();
                if (!deviceId.isEmpty()) {
                    appStatsEnvSettings.setEnvDeviceID(deviceId);
                }
                if (f2113xt != null && appStatsEnvSettings.getEnvDeviceID(false).isEmpty()) {
                    appStatsEnvSettings.setEnvDeviceID(f2113xt.getDeviceID());
                }
                if (f2113xt == null || !appStatsEnvSettings.equals(new AppStatsEnvSettings(f2113xt))) {
                    if (appStatsEnvSettings.getEnvDeviceID(false).isEmpty()) {
                        appStatsEnvSettings.getEnvDeviceID(true);
                    }
                    EnvironmentEventDao environmentEventDao = new EnvironmentEventDao(appStatsEnvSettings, this.asFriend.currentEventTime());
                    f2113xt = environmentEventDao;
                    this.asFriend.logAppStats(new AppStatsDao[]{environmentEventDao});
                }
            }
        }
    }
}
