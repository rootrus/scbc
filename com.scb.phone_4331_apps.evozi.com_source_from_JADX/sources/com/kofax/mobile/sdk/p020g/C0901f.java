package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;

/* renamed from: com.kofax.mobile.sdk.g.f */
public class C0901f extends C0892a {
    private static final String TAG = C0901f.class.getSimpleName();

    /* renamed from: xO */
    private ImageDao f2149xO;

    /* renamed from: a */
    public void mo12300a(AppStatsEventIDType appStatsEventIDType, final C8390b bVar) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                int i = C09032.f2152xL[appStatsEventIDType.ordinal()];
                if (i == 1) {
                    C0901f.this.mo12269a(appStatsEventIDType);
                    C0901f.this.mo12301a(bVar);
                } else if (i == 2) {
                    C0901f.this.mo12269a(appStatsEventIDType);
                    C0901f.this.m2339b(bVar);
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.f$2 */
    static /* synthetic */ class C09032 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2152xL;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType[] r0 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2152xL = r0
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMAGE_CREATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2152xL     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMAGE_ADD_TO_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p020g.C0901f.C09032.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo12301a(C8390b bVar) {
        ImageDao imageDao = new ImageDao();
        this.f2149xO = imageDao;
        imageDao.setId(bVar.getImageID());
        this.f2149xO.setEventTime(this.asFriend.currentEventTime());
        this.f2149xO.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        this.f2149xO.setFileSize((long) ((int) bVar.getFileSize()));
        this.f2149xO.setSource(bVar.getSource());
        ImageDao imageDao2 = this.f2149xO;
        imageDao2.setSessionKey(imageDao2.getAppStatsSessionKey());
        mo12268a(new AppStatsDao[]{this.f2149xO});
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2339b(C8390b bVar) {
        ImageDao imageDao = new ImageDao();
        this.f2149xO = imageDao;
        imageDao.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
        this.f2149xO.setDocumentId(bVar.getDocumentID());
        this.f2149xO.setId(bVar.getImageID());
        this.f2149xO.setEventTime(bVar.mo55281iB());
        this.f2149xO.setFileSize((long) ((int) bVar.getFileSize()));
        this.f2149xO.setSource(bVar.getSource());
        ImageDao imageDao2 = this.f2149xO;
        imageDao2.setSessionKey(imageDao2.getAppStatsSessionKey());
        mo12268a(new AppStatsDao[]{this.f2149xO});
    }
}
