package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.FieldEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.mobile.sdk.g.e */
public class C0898e extends C0892a {
    private String TAG = C0898e.class.getSimpleName();
    private int count = 0;
    private String fieldName;

    /* renamed from: iL */
    private String f2140iL;

    /* renamed from: iZ */
    private String f2141iZ;

    /* renamed from: rL */
    private String f2142rL;

    /* renamed from: rM */
    private String f2143rM;

    /* renamed from: rN */
    private int f2144rN;

    /* renamed from: xD */
    private AppStatsEventIDType f2145xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;

    /* renamed from: xM */
    private FieldEventDao f2146xM;

    /* renamed from: a */
    public void mo12299a(AppStatsEventIDType appStatsEventIDType, String str, String str2, String str3, String str4, int i, String str5) {
        this.f2145xD = appStatsEventIDType;
        this.f2140iL = str;
        this.f2142rL = str2;
        this.f2143rM = str3;
        this.fieldName = str4;
        this.f2144rN = i;
        this.f2141iZ = str5;
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09002.f2148xL[appStatsEventIDType.ordinal()] == 1) {
                    C0898e.this.m2335iH();
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.e$2 */
    static /* synthetic */ class C09002 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2148xL;

        static {
            int[] iArr = new int[AppStatsEventIDType.values().length];
            f2148xL = iArr;
            try {
                iArr[AppStatsEventIDType.APP_STATS_FIELD_CHANGE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: it */
    public AppStatsEventIDType mo12274it() {
        return this.f2145xD;
    }

    /* access modifiers changed from: private */
    /* renamed from: iH */
    public void m2335iH() {
        String str = this.TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("how many times = 2 = ");
        int i = this.count;
        this.count = i + 1;
        sb.append(i);
        C0767k.m1807c(str, sb.toString());
        FieldEventDao fieldEventDao = new FieldEventDao();
        this.f2146xM = fieldEventDao;
        fieldEventDao.setDocumentID(this.f2140iL);
        this.f2146xM.setEventTime(this.asFriend.currentEventTime());
        this.f2146xM.setOriginalValue(this.f2142rL);
        this.f2146xM.setChangedValue(this.f2143rM);
        this.f2146xM.setFieldname(this.fieldName);
        this.f2146xM.setIsValid(this.f2144rN);
        this.f2146xM.setErrorDescription(this.f2141iZ);
        this.f2146xM.setSessionEventID(this.asFriend.getLastSessionEventID());
        this.f2146xM.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2146xM});
    }
}
