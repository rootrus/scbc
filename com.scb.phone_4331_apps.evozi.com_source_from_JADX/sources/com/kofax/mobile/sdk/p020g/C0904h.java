package com.kofax.mobile.sdk.p020g;

import com.kofax.kmc.ken.engines.data.ImageSource;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClientEventLogger;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImageDao;
import com.kofax.kmc.kut.utilities.appstats.dao.ImgCaptureEventDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.ArrayList;

/* renamed from: com.kofax.mobile.sdk.g.h */
public class C0904h extends C0892a {
    /* access modifiers changed from: private */
    public static final String TAG = C0904h.class.getSimpleName();
    /* access modifiers changed from: private */
    public String imageID = null;
    int level = -1;
    int stability = -1;
    /* access modifiers changed from: private */

    /* renamed from: xD */
    public AppStatsEventIDType f2153xD = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;

    /* renamed from: xU */
    private ImgCaptureEventDao f2154xU = null;
    /* access modifiers changed from: private */

    /* renamed from: xV */
    public int f2155xV = 0;
    /* access modifiers changed from: private */

    /* renamed from: xW */
    public AppStatsEventIDType f2156xW = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;

    /* renamed from: xX */
    int f2157xX = -1;

    /* renamed from: xY */
    int f2158xY = -1;

    /* renamed from: xZ */
    int f2159xZ = -1;

    public C0904h(AppStatsInstanceType appStatsInstanceType) {
        super(appStatsInstanceType);
    }

    public C0904h(String str, AppStatsInstanceType appStatsInstanceType, boolean z) {
        super(str, appStatsInstanceType, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: it */
    public AppStatsEventIDType mo12274it() {
        return this.f2153xD;
    }

    /* renamed from: b */
    public void mo12303b(AppStatsEventIDType appStatsEventIDType) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                String unused = C0904h.this.imageID = null;
                int i = C09073.f2163xL[appStatsEventIDType.ordinal()];
                if (i == 1) {
                    AppStatsEventIDType unused2 = C0904h.this.f2153xD = appStatsEventIDType;
                    if (C0904h.this.f2156xW != appStatsEventIDType && C0904h.this.f2157xX != C0904h.this.f2155xV) {
                        C0904h.this.m2347iI();
                        C0904h hVar = C0904h.this;
                        hVar.f2157xX = hVar.f2155xV;
                    }
                } else if (i == 2) {
                    AppStatsEventIDType unused3 = C0904h.this.f2153xD = appStatsEventIDType;
                    if (C0904h.this.f2156xW != appStatsEventIDType && C0904h.this.f2159xZ != C0904h.this.f2155xV) {
                        C0904h.this.m2347iI();
                        C0904h hVar2 = C0904h.this;
                        hVar2.f2159xZ = hVar2.f2155xV;
                    }
                } else if (i == 3) {
                    AppStatsEventIDType unused4 = C0904h.this.f2153xD = appStatsEventIDType;
                    if (C0904h.this.f2156xW != appStatsEventIDType && C0904h.this.level != C0904h.this.f2155xV) {
                        String iK = C0904h.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append("------ImgCaptureAppStatsClient :: APP_STATS_IMG_CAPTURE_LEVELNESS event = ");
                        sb.append(C0904h.this.f2155xV);
                        C0767k.m1807c(iK, sb.toString());
                        C0904h.this.m2347iI();
                        C0904h hVar3 = C0904h.this;
                        hVar3.level = hVar3.f2155xV;
                    }
                } else if (i == 4) {
                    AppStatsEventIDType unused5 = C0904h.this.f2153xD = appStatsEventIDType;
                    if (C0904h.this.f2156xW != appStatsEventIDType && C0904h.this.stability != C0904h.this.f2155xV) {
                        C0904h.this.m2347iI();
                        C0904h hVar4 = C0904h.this;
                        hVar4.stability = hVar4.f2155xV;
                    }
                }
            }
        });
    }

    /* renamed from: com.kofax.mobile.sdk.g.h$3 */
    static /* synthetic */ class C09073 {

        /* renamed from: xL */
        static final /* synthetic */ int[] f2163xL;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType[] r0 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2163xL = r0
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2163xL     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2163xL     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2163xL     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.p020g.C0904h.C09073.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo12302a(AppStatsEventIDType appStatsEventIDType, final String str) {
        mo12271a(appStatsEventIDType, (AppStatsClientEventLogger) new AppStatsClientEventLogger() {
            public void logEvent(AppStatsEventIDType appStatsEventIDType) {
                if (appStatsEventIDType == AppStatsEventIDType.APP_STATS_IMG_CAPTURE_EVENT || appStatsEventIDType == AppStatsEventIDType.APP_STATS_IMG_EXP_CAPTURE_EVENT || appStatsEventIDType == AppStatsEventIDType.APP_STATS_IMG_FORCE_CAPTURE_EVENT) {
                    String iK = C0904h.TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("eventID = ");
                    sb.append(appStatsEventIDType);
                    C0767k.m1807c(iK, sb.toString());
                    AppStatsEventIDType unused = C0904h.this.f2153xD = appStatsEventIDType;
                    String unused2 = C0904h.this.imageID = str;
                    C0904h.this.m2347iI();
                }
            }
        });
    }

    /* renamed from: g */
    public void mo12304g(int i) {
        this.f2155xV = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: iI */
    public void m2347iI() {
        ArrayList arrayList = new ArrayList();
        ImgCaptureEventDao imgCaptureEventDao = new ImgCaptureEventDao();
        this.f2154xU = imgCaptureEventDao;
        imgCaptureEventDao.setInstanceId(this.f2115rG);
        this.f2154xU.setEventType(this.f2153xD);
        this.f2154xU.setEventTime(this.asFriend.currentEventTime());
        this.f2154xU.setDsOperation(AppStatsDsOpType.APP_STATS_DS_INSERT);
        this.f2154xU.setValue(this.f2155xV);
        this.f2154xU.setImageID(this.imageID);
        ImgCaptureEventDao imgCaptureEventDao2 = this.f2154xU;
        imgCaptureEventDao2.setSessionKey(imgCaptureEventDao2.getAppStatsSessionKey());
        arrayList.add(this.f2154xU);
        if (this.imageID != null) {
            ImageDao imageDao = new ImageDao();
            imageDao.setId(this.imageID);
            imageDao.setDsOperation(AppStatsDsOpType.APP_STATS_DS_UPDATE);
            imageDao.setSource(ImageSource.CAPTURE);
            imageDao.setSessionKey(this.f2154xU.getAppStatsSessionKey());
            arrayList.add(imageDao);
        }
        mo12268a((AppStatsDao[]) arrayList.toArray(new AppStatsDao[arrayList.size()]));
    }

    /* renamed from: iJ */
    private void m2348iJ() {
        mo12270a(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS, 500);
        mo12270a(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT, 500);
        mo12270a(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS, 500);
        mo12270a(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY, 500);
    }
}
