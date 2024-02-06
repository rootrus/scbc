package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.AppStatsEnvSettings;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSessionEvent;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ErrorLogEventDao;
import com.kofax.kmc.kut.utilities.appstats.dao.SessEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;

/* renamed from: com.kofax.mobile.sdk.g.j */
public class C0911j extends C0892a {
    private static final String TAG = C0911j.class.getSimpleName();

    /* renamed from: yi */
    private final String f2171yi = "BeginSession";

    /* renamed from: yj */
    private final String f2172yj = "SessionCompleteSuccess";

    /* renamed from: yk */
    private final String f2173yk = "SessionCompleteFailed";

    /* renamed from: yl */
    private ErrorLogEventDao f2174yl = null;

    /* renamed from: ym */
    private EnvironmentEventDao f2175ym = null;

    /* renamed from: yn */
    private SessEventDao f2176yn = null;

    /* renamed from: yo */
    private String f2177yo = "";

    /* renamed from: com.kofax.mobile.sdk.g.j$a */
    static class C0918a {

        /* renamed from: yx */
        public static final C0911j f2191yx = new C0911j();

        private C0918a() {
        }
    }

    /* renamed from: iM */
    public static C0911j m2366iM() {
        return C0918a.f2191yx;
    }

    /* renamed from: a */
    public void mo12308a(AppStatsEventIDType appStatsEventIDType, final ErrorInfo errorInfo) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09176.f2190xL[appStatsEventIDType.ordinal()] == 1) {
                    C0911j.this.mo12269a(appStatsEventIDType);
                    C0911j.this.m2365d(errorInfo);
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.j$6 */
    static /* synthetic */ class C09176 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2190xL;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType[] r0 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2190xL = r0
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_ERROR_LOG_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2190xL     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_ENVIRONMENT_CHANGED_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2190xL     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_BEGIN_SESSION_EVENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2190xL     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_LOG_SESSION_EVENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2190xL     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_END_SESSION_EVENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p020g.C0911j.C09176.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo12306a(AppStatsEventIDType appStatsEventIDType, final AppStatsEnvSettings appStatsEnvSettings) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09176.f2190xL[appStatsEventIDType.ordinal()] == 2) {
                    C0911j.this.mo12269a(appStatsEventIDType);
                    C0911j.this.m2357a(appStatsEnvSettings);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12309a(AppStatsEventIDType appStatsEventIDType, final String str, final String str2) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09176.f2190xL[appStatsEventIDType.ordinal()] == 3) {
                    C0911j.this.mo12269a(appStatsEventIDType);
                    C0911j.this.m2367q(str, str2);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12307a(AppStatsEventIDType appStatsEventIDType, final AppStatsSessionEvent appStatsSessionEvent) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09176.f2190xL[appStatsEventIDType.ordinal()] == 4) {
                    C0911j.this.mo12269a(appStatsEventIDType);
                    C0911j.this.m2358a(appStatsSessionEvent);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo12310a(AppStatsEventIDType appStatsEventIDType, final boolean z, final String str) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09176.f2190xL[appStatsEventIDType.ordinal()] == 5) {
                    C0911j.this.mo12269a(appStatsEventIDType);
                    C0911j.this.m2364a(z, str);
                }
            }
        });
    }

    public String getLastSessionEventID() {
        return this.f2177yo;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m2365d(ErrorInfo errorInfo) {
        String errMsg = errorInfo.getErrMsg();
        if (!errorInfo.getErrCause().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(errMsg);
            sb.append(" (Cause: ");
            sb.append(errorInfo.getErrCause());
            sb.append(")");
            errMsg = sb.toString();
        }
        ErrorLogEventDao errorLogEventDao = new ErrorLogEventDao();
        this.f2174yl = errorLogEventDao;
        errorLogEventDao.setErrorTime(this.asFriend.currentEventTime());
        this.f2174yl.setErrorCode(errorInfo.getErr());
        this.f2174yl.setErrorDescription(errMsg);
        this.f2174yl.setErrorRecommendation(errorInfo.getErrDesc());
        ErrorLogEventDao errorLogEventDao2 = this.f2174yl;
        errorLogEventDao2.setSessionKey(errorLogEventDao2.getAppStatsSessionKey());
        this.f2174yl.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2174yl});
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2357a(AppStatsEnvSettings appStatsEnvSettings) {
        EnvironmentEventDao environmentEventDao = new EnvironmentEventDao();
        this.f2175ym = environmentEventDao;
        environmentEventDao.setEnvTime(this.asFriend.currentEventTime());
        this.f2175ym.setDeviceID(appStatsEnvSettings.getEnvDeviceID(false));
        this.f2175ym.setManufacturer(appStatsEnvSettings.getEnvManufacturer(false));
        this.f2175ym.setModel(appStatsEnvSettings.getEnvModel(false));
        this.f2175ym.setMemory(appStatsEnvSettings.getEnvMemorySize(false));
        this.f2175ym.setOsVersion(appStatsEnvSettings.getEnvOsVersion(false));
        this.f2175ym.setLanguage(appStatsEnvSettings.getEnvLanguage(false));
        this.f2175ym.setSdkVersion(appStatsEnvSettings.getEnvSdkVersion(false));
        this.f2175ym.setTimeZone(appStatsEnvSettings.getEnvTimeZone(false));
        this.f2175ym.setCarrier(appStatsEnvSettings.getEnvCarrier(false));
        this.f2175ym.setOsName(appStatsEnvSettings.getEnvOsName(false));
        mo12268a(new AppStatsDao[]{this.f2175ym});
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m2367q(String str, String str2) {
        SessEventDao sessEventDao = new SessEventDao();
        this.f2176yn = sessEventDao;
        this.f2177yo = sessEventDao.getId();
        this.f2176yn.setSessionKey(str);
        this.f2176yn.setCategory(str2);
        this.f2176yn.setType("BeginSession");
        this.f2176yn.setEventTime(Long.valueOf(this.asFriend.currentEventTime()));
        this.f2176yn.setResponse("");
        this.f2176yn.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2176yn});
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2358a(AppStatsSessionEvent appStatsSessionEvent) {
        SessEventDao sessEventDao = new SessEventDao();
        this.f2176yn = sessEventDao;
        this.f2177yo = sessEventDao.getId();
        SessEventDao sessEventDao2 = this.f2176yn;
        sessEventDao2.setSessionKey(sessEventDao2.getAppStatsSessionKey());
        SessEventDao sessEventDao3 = this.f2176yn;
        sessEventDao3.setCategory(sessEventDao3.getAppStatsCategory());
        this.f2176yn.setType(appStatsSessionEvent.getType());
        this.f2176yn.setEventTime(Long.valueOf(this.asFriend.currentEventTime()));
        this.f2176yn.setResponse(appStatsSessionEvent.getResponse());
        this.f2176yn.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2176yn});
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2364a(boolean z, String str) {
        SessEventDao sessEventDao = new SessEventDao();
        this.f2176yn = sessEventDao;
        this.f2177yo = sessEventDao.getId();
        SessEventDao sessEventDao2 = this.f2176yn;
        sessEventDao2.setSessionKey(sessEventDao2.getAppStatsSessionKey());
        SessEventDao sessEventDao3 = this.f2176yn;
        sessEventDao3.setCategory(sessEventDao3.getAppStatsCategory());
        this.f2176yn.setType(z ? "SessionCompleteSuccess" : "SessionCompleteFailed");
        this.f2176yn.setEventTime(Long.valueOf(this.asFriend.currentEventTime()));
        this.f2176yn.setResponse(str);
        this.f2176yn.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2176yn});
    }
}
