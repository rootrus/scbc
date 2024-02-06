package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.ken.engines.data.ImageSource;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageProcessEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.kofax.mobile.sdk.g.g */
public class C8391g extends C0892a {
    private static final String TAG = C8391g.class.getSimpleName();

    /* renamed from: xR */
    ImageProcessEventDao f4906xR;

    public C8391g(AppStatsInstanceType appStatsInstanceType) {
        super(appStatsInstanceType);
    }

    public C8391g(String str, AppStatsInstanceType appStatsInstanceType, boolean z) {
        super(str, appStatsInstanceType, z);
    }

    /* renamed from: a */
    public void mo55287a(AppStatsEventIDType appStatsEventIDType, final C0894c cVar) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                int i = C83932.f4909xL[appStatsEventIDType.ordinal()];
                if (i == 1) {
                    C8391g.this.mo12269a(appStatsEventIDType);
                    C8391g.this.mo55288a(cVar);
                } else if (i == 2) {
                    C8391g.this.mo12269a(appStatsEventIDType);
                    C8391g.this.m4875b(cVar);
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.g$2 */
    static /* synthetic */ class C83932 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f4909xL;

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
                f4909xL = r0
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_PROCESSING_START_EVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4909xL     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_PROCESSING_STOP_EVENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p020g.C8391g.C83932.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55288a(C0894c cVar) {
        ImageProcessEventDao imageProcessEventDao = new ImageProcessEventDao();
        this.f4906xR = imageProcessEventDao;
        imageProcessEventDao.setInstanceId(this.f2115rG);
        this.f4906xR.setSourceImage(cVar.mo12292iF());
        this.f4906xR.setStartTime(this.asFriend.currentEventTime());
        ImageProcessEventDao imageProcessEventDao2 = this.f4906xR;
        imageProcessEventDao2.setSessionKey(imageProcessEventDao2.getAppStatsSessionKey());
        this.f4906xR.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        mo12268a(new AppStatsDao[]{this.f4906xR});
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m4875b(C0894c cVar) {
        ArrayList arrayList = new ArrayList();
        ImageProcessEventDao imageProcessEventDao = this.f4906xR;
        if (imageProcessEventDao == null) {
            C0767k.m1807c(TAG, "imageprocessor dao property is null, start event was never fired (app issue)");
            return;
        }
        ImageProcessEventDao imageProcessEventDao2 = (ImageProcessEventDao) imageProcessEventDao.clone();
        this.f4906xR = imageProcessEventDao2;
        imageProcessEventDao2.setEndTime(System.currentTimeMillis());
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("endTme = ");
        sb.append(System.currentTimeMillis());
        sb.append(new Date(System.currentTimeMillis()).toString());
        C0767k.m1807c(str, sb.toString());
        this.f4906xR.setResultCode(cVar.getResultCode());
        this.f4906xR.setProcessingProfile(cVar.mo12290iD());
        this.f4906xR.setProcessedImage(cVar.mo12289iC());
        this.f4906xR.setSourceImage(cVar.mo12292iF());
        ImageProcessEventDao imageProcessEventDao3 = this.f4906xR;
        imageProcessEventDao3.setSessionKey(imageProcessEventDao3.getAppStatsSessionKey());
        this.f4906xR.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
        if (cVar.mo12289iC() != null) {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ImageProcessing failed or cancelled : ");
            sb2.append(cVar.mo12289iC());
            C0767k.m1807c(str2, sb2.toString());
            ImageDao imageDao = new ImageDao();
            imageDao.setId(cVar.mo12289iC());
            imageDao.setEventTime(this.asFriend.currentEventTime());
            imageDao.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
            imageDao.setFileSize((long) cVar.mo12291iE());
            imageDao.setSource(ImageSource.PROCESSOR);
            imageDao.setDocumentId(cVar.getDocumentID());
            imageDao.setSessionKey(this.f4906xR.getAppStatsSessionKey());
            arrayList.add(imageDao);
        }
        arrayList.add(this.f4906xR);
        mo12268a((AppStatsDao[]) arrayList.toArray(new AppStatsDao[arrayList.size()]));
        this.f4906xR = null;
    }
}
