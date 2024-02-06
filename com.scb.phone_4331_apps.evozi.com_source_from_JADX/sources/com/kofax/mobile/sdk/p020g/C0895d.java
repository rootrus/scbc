package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.DocumentEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

/* renamed from: com.kofax.mobile.sdk.g.d */
public class C0895d extends C0892a {
    private static final String TAG = C0895d.class.getSimpleName();
    private String documentType = "";

    /* renamed from: iL */
    private String f2135iL = null;

    /* renamed from: xD */
    private AppStatsEventIDType f2136xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;

    /* renamed from: xJ */
    private DocumentEventDao f2137xJ = null;

    /* renamed from: a */
    public void mo12297a(AppStatsEventIDType appStatsEventIDType, String str, String str2) {
        this.f2136xD = appStatsEventIDType;
        this.f2135iL = str;
        this.documentType = str2;
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (C08972.f2139xL[appStatsEventIDType.ordinal()] == 1) {
                    C0895d.this.m2331iG();
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.d$2 */
    static /* synthetic */ class C08972 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2139xL;

        static {
            int[] iArr = new int[AppStatsEventIDType.values().length];
            f2139xL = iArr;
            try {
                iArr[AppStatsEventIDType.APP_STATS_DOCUMENT_CREATE_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: it */
    public AppStatsEventIDType mo12274it() {
        return this.f2136xD;
    }

    /* access modifiers changed from: private */
    /* renamed from: iG */
    public void m2331iG() {
        DocumentEventDao documentEventDao = new DocumentEventDao();
        this.f2137xJ = documentEventDao;
        documentEventDao.setId(this.f2135iL);
        this.f2137xJ.setCreationTime(Long.valueOf(this.asFriend.currentEventTime()));
        DocumentEventDao documentEventDao2 = this.f2137xJ;
        documentEventDao2.setSessionKey(documentEventDao2.getAppStatsSessionKey());
        this.f2137xJ.setDocumentType(this.documentType);
        this.f2137xJ.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f2137xJ});
    }
}
