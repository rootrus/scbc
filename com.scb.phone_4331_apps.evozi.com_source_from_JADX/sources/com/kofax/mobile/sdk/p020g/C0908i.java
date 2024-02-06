package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.PropertyChangeEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsPropertyType;

/* renamed from: com.kofax.mobile.sdk.g.i */
public class C0908i extends C0892a {
    private static final String TAG = C0908i.class.getSimpleName();

    /* renamed from: yc */
    private PropertyChangeEventDao f2164yc = null;

    /* renamed from: yd */
    private AppStatsPropertyType f2165yd = AppStatsPropertyType.PROP_TYPE_UNUSED;

    /* renamed from: ye */
    private String f2166ye = null;

    public C0908i(AppStatsInstanceType appStatsInstanceType) {
        super(appStatsInstanceType);
    }

    public C0908i(String str, AppStatsInstanceType appStatsInstanceType, boolean z) {
        super(str, appStatsInstanceType, z);
    }

    /* renamed from: a */
    public void mo12305a(AppStatsEventIDType appStatsEventIDType, AppStatsPropertyType appStatsPropertyType, final String str, final String str2) {
        this.f2165yd = appStatsPropertyType;
        this.f2166ye = str2;
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C09102.f2170xL[appStatsEventIDType.ordinal()] == 1 && !str.equals(str2)) {
                    C0908i.this.mo12269a(appStatsEventIDType);
                    C0908i.this.m2355iL();
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.i$2 */
    static /* synthetic */ class C09102 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2170xL;

        static {
            int[] iArr = new int[AppStatsEventIDType.values().length];
            f2170xL = iArr;
            try {
                iArr[AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: iL */
    public void m2355iL() {
        PropertyChangeEventDao propertyChangeEventDao = new PropertyChangeEventDao();
        this.f2164yc = propertyChangeEventDao;
        propertyChangeEventDao.setInstanceId(this.f2115rG);
        this.f2164yc.setEventTime(this.asFriend.currentEventTime());
        this.f2164yc.setPropertyType(this.f2165yd);
        this.f2164yc.setPropertyValue(this.f2166ye);
        PropertyChangeEventDao propertyChangeEventDao2 = this.f2164yc;
        propertyChangeEventDao2.setSessionKey(propertyChangeEventDao2.getAppStatsSessionKey());
        this.f2164yc.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2164yc});
    }
}
