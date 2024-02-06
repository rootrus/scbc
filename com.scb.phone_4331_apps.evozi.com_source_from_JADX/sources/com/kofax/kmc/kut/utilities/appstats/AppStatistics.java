package com.kofax.kmc.kut.utilities.appstats;

import android.database.sqlite.SQLiteConstraintException;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.BuildConfig;
import com.kofax.kmc.kut.utilities.appstats.AppStatsWriteFileListener;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.async.ListenerCallbackThreadType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.kmc.kut.utilities.error.NullPointerException;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p020g.C0911j;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.ModifyQuickTopUpReviewActivity;

public class AppStatistics {
    /* access modifiers changed from: private */
    public static final String TAG = AppStatistics.class.getSimpleName();

    /* renamed from: aU */
    private ListenerCallbackThreadType f715aU;

    /* renamed from: aZ */
    private TaskRunner f716aZ;
    protected List<AppStatsDao> appStatsDaoCurrent;
    /* access modifiers changed from: private */
    public String category;
    /* access modifiers changed from: private */

    /* renamed from: nX */
    public C0911j f717nX;

    /* renamed from: nY */
    private int f718nY;

    /* renamed from: nZ */
    private int f719nZ;
    /* access modifiers changed from: private */

    /* renamed from: oA */
    public String f720oA;
    /* access modifiers changed from: private */

    /* renamed from: oa */
    public long f721oa;

    /* renamed from: ob */
    private String f722ob;

    /* renamed from: oc */
    private long f723oc;

    /* renamed from: od */
    private boolean f724od;

    /* renamed from: oe */
    private List<AppStatsDao> f725oe;

    /* renamed from: of */
    private List<AppStatsDao> f726of;
    /* access modifiers changed from: private */

    /* renamed from: og */
    public String f727og;

    /* renamed from: oh */
    private String f728oh;

    /* renamed from: oi */
    AppStatsDataStore f729oi;
    /* access modifiers changed from: private */

    /* renamed from: oj */
    public ArrayList<AppStatsWriteFileListener> f730oj;

    /* renamed from: ok */
    private ArrayList<AppStatsWriteFileListener> f731ok;
    /* access modifiers changed from: private */

    /* renamed from: ol */
    public ArrayList<AppStatsWriteFileListener> f732ol;

    /* renamed from: om */
    private ArrayList<AppstatsThresholdReachedListener> f733om;
    /* access modifiers changed from: private */

    /* renamed from: on */
    public CopyOnWriteArrayList<AppStatsExportListener> f734on;
    /* access modifiers changed from: private */

    /* renamed from: oo */
    public ArrayList<DataStoreInitializedListener> f735oo;
    /* access modifiers changed from: private */

    /* renamed from: op */
    public int f736op;

    /* renamed from: oq */
    private float f737oq;

    /* renamed from: or */
    private long f738or;
    /* access modifiers changed from: private */

    /* renamed from: os */
    public AppStatsDsExportHandler f739os;

    /* renamed from: ot */
    private AppStatsDsExportHandler f740ot;

    /* renamed from: ou */
    private AppStatsExportFormat f741ou;
    /* access modifiers changed from: private */

    /* renamed from: ov */
    public String f742ov;
    /* access modifiers changed from: private */

    /* renamed from: ow */
    public AppStatsState f743ow;
    /* access modifiers changed from: private */

    /* renamed from: ox */
    public AppStatsState f744ox;
    /* access modifiers changed from: private */

    /* renamed from: oy */
    public AppStatsState f745oy;
    /* access modifiers changed from: private */

    /* renamed from: oz */
    public FriendAS f746oz;

    public enum AppStatsExportFormat {
        EXP_FORMAT_SQL_SERVER,
        EXP_FORMAT_JSON,
        EXP_FORMAT_APP_DEFINED
    }

    public interface DataStoreInitializedListener {
        void dataStoreInitialized(String str);
    }

    protected interface DataStoreStatusCallback {
        void dataStoreExportComplete(ErrorInfo errorInfo);
    }

    public enum ThresholdType {
        THRESH_TYPE_RAM,
        THRESH_TYPE_FILE
    }

    public enum ExportStatusEvent {
        EXPORTING,
        COMPLETE,
        FAILED
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatistics$a */
    static class C0478a {

        /* renamed from: oE */
        public static final AppStatistics f752oE = new AppStatistics();

        private C0478a() {
        }
    }

    private AppStatistics() {
        this.f717nX = null;
        this.f718nY = 0;
        this.f719nZ = 0;
        this.f721oa = 0;
        this.f722ob = "";
        this.f723oc = 0;
        this.f724od = false;
        this.f715aU = ListenerCallbackThreadType.UI_THREAD;
        this.f725oe = new ArrayList();
        this.f726of = new ArrayList();
        this.appStatsDaoCurrent = this.f725oe;
        this.f727og = UUID.randomUUID().toString();
        this.f728oh = null;
        this.f729oi = null;
        this.f730oj = new ArrayList<>();
        this.f731ok = new ArrayList<>();
        this.f732ol = this.f730oj;
        this.f733om = new ArrayList<>();
        this.f734on = new CopyOnWriteArrayList<>();
        this.f735oo = new ArrayList<>();
        this.f716aZ = null;
        this.f736op = 0;
        this.f737oq = BitmapDescriptorFactory.HUE_RED;
        this.f738or = 0;
        this.f739os = null;
        this.f740ot = null;
        this.f741ou = null;
        this.f742ov = "";
        AppStatsState appStatsState = AppStatsState.APP_STATS_UNINITIALIZED;
        this.f743ow = appStatsState;
        this.f744ox = appStatsState;
        this.f745oy = AppStatsState.APP_STATS_UNINITIALIZED;
        this.f746oz = new FriendAS(getClass().getName());
        this.f720oA = null;
        this.category = null;
    }

    public static AppStatistics getInstance() {
        return C0478a.f752oE;
    }

    public int getRamSizeThreshold() {
        return this.f718nY;
    }

    public void setRamSizeThreshold(int i) {
        if (i >= 0) {
            this.f718nY = i;
            return;
        }
        throw new IllegalArgumentException("ramSizeThreshold cannot be a negative value.");
    }

    public int getFileSizeThreshold() {
        return this.f719nZ;
    }

    public void setFileSizeThreshold(int i) {
        if (i >= 0) {
            this.f719nZ = i;
            return;
        }
        throw new IllegalArgumentException("fileSizeThreshold cannot be a negative value.");
    }

    public long getRamSize() {
        return this.f721oa;
    }

    public long getFileSize() throws FileNotFoundException {
        AppStatsDataStore appStatsDataStore = this.f729oi;
        if (appStatsDataStore != null) {
            long calcDsSize = appStatsDataStore.calcDsSize();
            this.f723oc = calcDsSize;
            return calcDsSize;
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
    }

    public String getFileName() {
        return this.f722ob;
    }

    public String getDeviceId() {
        return this.f728oh;
    }

    public void setDeviceId(String str) {
        this.f728oh = str;
    }

    public ListenerCallbackThreadType getListenerCallbackThreadType() {
        return this.f715aU;
    }

    public void setListenerCallbackThreadType(ListenerCallbackThreadType listenerCallbackThreadType) {
        this.f715aU = listenerCallbackThreadType;
    }

    public final void initAppStats(String str) {
        synchronized (this) {
            String str2 = this.f728oh;
            boolean z = true;
            if (str2 == null || str2.length() == 0) {
                if (this.f728oh == null) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_DEVICE_ID_MISSING);
                }
            }
            m534a("initAppStats()", true);
            ErrorInfo a = AppStatsState.APP_STATS_INITIALIZING.mo10922a(C0486b.TASK_INIT_APPSTATS, this.f743ow.f806qf);
            if (a == ErrorInfo.KMC_SUCCESS) {
                if (!(str == null || str.length() == 0)) {
                    z = false;
                }
                if (z || str == null) {
                    throw new NullPointerException("Database path is empty");
                }
                if (this.f743ow == AppStatsState.APP_STATS_INITIALIZED && this.f729oi.isOpen()) {
                    this.f729oi.close();
                }
                this.f722ob = str;
                if (this.f729oi == null) {
                    this.f729oi = AppStatsSqLiteDs.getInstance();
                }
                this.f745oy = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_INITIALIZING;
                try {
                    this.f729oi.open(this.f722ob);
                    m559s(this.f729oi.getDsUniqueId());
                    this.f744ox = this.f743ow;
                    this.f743ow = AppStatsState.APP_STATS_INITIALIZING.mo10923b(C0486b.TASK_INIT_APPSTATS, this.f745oy.f806qf);
                    this.f745oy = this.f744ox;
                    this.f721oa = 0;
                    this.f738or = getFileSize();
                    this.f737oq = (float) getRamSize();
                    this.f725oe.clear();
                    this.f726of.clear();
                } catch (RuntimeException e) {
                    this.f744ox = this.f743ow;
                    this.f743ow = this.f743ow.mo10924c(C0486b.TASK_INIT_APPSTATS, this.f745oy.f806qf);
                    this.f745oy = this.f744ox;
                    throw e;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                m534a("initAppStats()", false);
            } else {
                throw new KmcRuntimeException(a);
            }
        }
    }

    public ErrorInfo startRecord() {
        AppStatsState appStatsState;
        synchronized (this) {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            m534a("startRecord()", true);
            if (this.f743ow == AppStatsState.APP_STATS_WRITING) {
                appStatsState = AppStatsState.APP_STATS_RECORDING_WRITING;
            } else {
                appStatsState = AppStatsState.APP_STATS_RECORDING;
            }
            ErrorInfo a = appStatsState.mo10922a(C0486b.TASK_START_RECORD, this.f743ow.f806qf);
            if (a == ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING) {
                m534a("startRecord() - already recording...", false);
                return a;
            } else if (a == ErrorInfo.KMC_SUCCESS) {
                this.f745oy = this.f743ow;
                this.f743ow = appStatsState;
                if (this.f722ob != null) {
                    this.f729oi.open();
                    this.f724od = true;
                    m534a("startRecord()", false);
                    return a;
                }
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_FILEPATH_IS_NULL);
            } else {
                throw new KmcRuntimeException(a);
            }
        }
    }

    public ErrorInfo stopRecord() {
        AppStatsState appStatsState;
        ErrorInfo a;
        synchronized (this) {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            m534a("stopRecord()", true);
            if (this.f743ow == AppStatsState.APP_STATS_RECORDING_WRITING) {
                appStatsState = AppStatsState.APP_STATS_WRITING;
            } else if (this.f743ow == AppStatsState.APP_STATS_RECORDING) {
                appStatsState = AppStatsState.APP_STATS_INITIALIZED;
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_INVALID_STATE_TRANSITION);
            }
            a = appStatsState.mo10922a(C0486b.TASK_STOP_RECORD, this.f743ow.f806qf);
            if (a == ErrorInfo.KMC_SUCCESS) {
                this.f745oy = this.f743ow;
                this.f743ow = appStatsState;
                if (this.f724od) {
                    this.f736op = this.f725oe.size();
                    this.f724od = false;
                }
                m534a("stopRecord()", false);
            } else {
                throw new KmcRuntimeException(a);
            }
        }
        return a;
    }

    public ErrorInfo writeToFile() {
        AppStatsState appStatsState;
        synchronized (this) {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            m534a("writeToFile()", true);
            if (this.f743ow == AppStatsState.APP_STATS_RECORDING) {
                appStatsState = AppStatsState.APP_STATS_RECORDING_WRITING;
            } else {
                appStatsState = AppStatsState.APP_STATS_WRITING;
            }
            ErrorInfo a = appStatsState.mo10922a(C0486b.TASK_WRITE, this.f743ow.f806qf);
            if (a == ErrorInfo.KMC_UT_STATS_ALREADY_WRITING) {
                m534a("writeToFile() - already writing...", false);
                return a;
            } else if (a == ErrorInfo.KMC_SUCCESS) {
                this.f745oy = this.f743ow;
                this.f743ow = appStatsState;
                if (!this.f724od) {
                    this.f729oi.open();
                }
                TaskRunner m = m554m();
                C0481c cVar = new C0481c();
                this.f716aZ.addOnTaskCompletedListener(new C0480b(), cVar, false);
                m.submit(cVar);
                m534a("writeToFile()", false);
                return a;
            } else {
                throw new KmcRuntimeException(a);
            }
        }
    }

    public void registerExportHandler(AppStatsDsExportHandler appStatsDsExportHandler) {
        this.f740ot = appStatsDsExportHandler;
    }

    public ErrorInfo export(String str, AppStatsExportFormat appStatsExportFormat) {
        ErrorInfo a;
        AppStatsDsExportHandler appStatsDsExportHandler;
        synchronized (this) {
            m534a("export()", true);
            a = AppStatsState.APP_STATS_EXPORTING.mo10922a(C0486b.TASK_EXPORT, this.f743ow.f806qf);
            if (a == ErrorInfo.KMC_SUCCESS) {
                if (str != null) {
                    if (!(str == null || str.length() == 0)) {
                        this.f741ou = appStatsExportFormat;
                        this.f742ov = str;
                        if (this.f740ot == null) {
                            if (appStatsExportFormat == AppStatsExportFormat.EXP_FORMAT_APP_DEFINED) {
                                ErrorInfo errorInfo = ErrorInfo.KMC_UT_STATS_EXPORT_HANDLER_MISSING;
                                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_EXPORT_HANDLER_MISSING);
                            }
                        }
                        this.f729oi.open();
                        int i = C04792.f753oD[appStatsExportFormat.ordinal()];
                        if (i == 1) {
                            appStatsDsExportHandler = new AppStatsMsSqlExportHandler();
                        } else if (i == 2) {
                            appStatsDsExportHandler = new AppStatsNewJsonExportHandler();
                        } else if (i == 3) {
                            appStatsDsExportHandler = this.f740ot;
                        } else {
                            throw new UnsupportedOperationException("export: the export format parameter specified is unsupported.");
                        }
                        this.f739os = appStatsDsExportHandler;
                        m537aL();
                        m534a("export()", false);
                    }
                }
                throw new IllegalArgumentException("Export file path is empty or null");
            }
            throw new KmcRuntimeException(a);
        }
        return a;
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatistics$2 */
    static /* synthetic */ class C04792 {

        /* renamed from: oD */
        static final /* synthetic */ int[] f753oD;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.AppStatistics$AppStatsExportFormat[] r0 = com.kofax.kmc.kut.utilities.appstats.AppStatistics.AppStatsExportFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f753oD = r0
                com.kofax.kmc.kut.utilities.appstats.AppStatistics$AppStatsExportFormat r1 = com.kofax.kmc.kut.utilities.appstats.AppStatistics.AppStatsExportFormat.EXP_FORMAT_SQL_SERVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f753oD     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.AppStatistics$AppStatsExportFormat r1 = com.kofax.kmc.kut.utilities.appstats.AppStatistics.AppStatsExportFormat.EXP_FORMAT_JSON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f753oD     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.appstats.AppStatistics$AppStatsExportFormat r1 = com.kofax.kmc.kut.utilities.appstats.AppStatistics.AppStatsExportFormat.EXP_FORMAT_APP_DEFINED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.appstats.AppStatistics.C04792.<clinit>():void");
        }
    }

    public ErrorInfo purge() {
        synchronized (this) {
            m534a("purge()", true);
            if (this.f743ow == AppStatsState.APP_STATS_RECORDING) {
                ErrorInfo errorInfo = ErrorInfo.KMC_UT_STATS_RECORDING_NOT_OFF;
                return errorInfo;
            }
            ErrorInfo a = AppStatsState.APP_STATS_PURGING.mo10922a(C0486b.TASK_PURGE, this.f743ow.f806qf);
            if (a != ErrorInfo.KMC_SUCCESS) {
                return a;
            }
            this.f745oy = this.f743ow;
            this.f743ow = AppStatsState.APP_STATS_PURGING;
            if (!this.f724od) {
                this.f729oi.close();
                this.f729oi.remove();
                this.f725oe.clear();
                this.f726of.clear();
                this.appStatsDaoCurrent = this.f725oe;
                this.f722ob = "";
                this.f744ox = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_PURGING.mo10923b(C0486b.TASK_PURGE, this.f745oy.f806qf);
                this.f745oy = this.f744ox;
                m534a("purge()", false);
                return a;
            }
            ErrorInfo errorInfo2 = ErrorInfo.KMC_UT_STATS_RECORDING_NOT_OFF;
            return errorInfo2;
        }
    }

    public boolean isRecording() {
        return this.f724od;
    }

    public void beginSession(String str, String str2) {
        synchronized (this) {
            m534a("beginSession()", true);
            m533a((Object) str, "sessionKey");
            m533a((Object) str2, "category");
            ErrorInfo a = AppStatsState.APP_STATS_BEGINNING_SESSION.mo10922a(C0486b.TASK_BEGIN_SESSION, this.f743ow.f806qf);
            if (a != ErrorInfo.KMC_SUCCESS) {
                throw new KmcRuntimeException(a);
            } else if (this.f720oA == null) {
                this.f745oy = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_BEGINNING_SESSION;
                if (this.f717nX == null) {
                    this.f717nX = new C0911j();
                }
                this.f717nX.mo12309a(AppStatsEventIDType.APP_STATS_BEGIN_SESSION_EVENT, str, str2);
                this.f744ox = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_BEGINNING_SESSION.mo10923b(C0486b.TASK_BEGIN_SESSION, this.f745oy.f806qf);
                this.f745oy = this.f744ox;
                this.f720oA = str;
                this.category = str2;
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_SESSION_ALREADY_BEGUN);
            }
        }
    }

    public void logSessionEvent(AppStatsSessionEvent appStatsSessionEvent) {
        synchronized (this) {
            m534a("logSessionEvent()", true);
            if (appStatsSessionEvent != null) {
                ErrorInfo a = AppStatsState.APP_STATS_LOGGING_SESSION.mo10922a(C0486b.TASK_LOG_SESSION, this.f743ow.f806qf);
                if (a != ErrorInfo.KMC_SUCCESS) {
                    throw new KmcRuntimeException(a);
                } else if (!isRecording()) {
                    throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_RECORDING_NOT_ON);
                } else if (this.f720oA != null) {
                    this.f745oy = this.f743ow;
                    this.f743ow = AppStatsState.APP_STATS_LOGGING_SESSION;
                    if (this.f717nX == null) {
                        this.f717nX = new C0911j();
                    }
                    this.f717nX.mo12307a(AppStatsEventIDType.APP_STATS_LOG_SESSION_EVENT, appStatsSessionEvent);
                    this.f744ox = this.f743ow;
                    this.f743ow = AppStatsState.APP_STATS_LOGGING_SESSION.mo10923b(C0486b.TASK_LOG_SESSION, this.f745oy.f806qf);
                    this.f745oy = this.f744ox;
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_NO_SESSION_BEGUN);
                }
            } else {
                throw new NullPointerException("logSessionEvent: sessionEvent param cannot be null");
            }
        }
    }

    public void endSession(boolean z, String str) {
        synchronized (this) {
            m534a("endSession()", true);
            m533a((Object) str, "description");
            ErrorInfo a = AppStatsState.APP_STATS_ENDING_SESSION.mo10922a(C0486b.TASK_END_SESSION, this.f743ow.f806qf);
            if (a != ErrorInfo.KMC_SUCCESS) {
                throw new KmcRuntimeException(a);
            } else if (this.f720oA != null) {
                this.f745oy = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_ENDING_SESSION;
                if (this.f717nX == null) {
                    this.f717nX = new C0911j();
                }
                this.f717nX.mo12310a(AppStatsEventIDType.APP_STATS_END_SESSION_EVENT, z, str);
                this.f744ox = this.f743ow;
                this.f743ow = AppStatsState.APP_STATS_ENDING_SESSION.mo10923b(C0486b.TASK_END_SESSION, this.f745oy.f806qf);
                this.f745oy = this.f744ox;
                this.f720oA = null;
                this.category = null;
            } else {
                throw new KmcRuntimeException(ErrorInfo.KMC_UT_STATS_NO_SESSION_BEGUN);
            }
        }
    }

    public void addAppStatsWriteFileListener(AppStatsWriteFileListener appStatsWriteFileListener) {
        if (appStatsWriteFileListener == null) {
            throw new NullPointerException("addAppStatsWriteFileListener: listener parameter is null");
        } else if (!this.f730oj.contains(appStatsWriteFileListener)) {
            this.f730oj.add(appStatsWriteFileListener);
        }
    }

    public void addAppStatsExportListener(AppStatsExportListener appStatsExportListener) {
        if (appStatsExportListener == null) {
            throw new NullPointerException("addAppStatsExportListener: listener parameter is null");
        } else if (!this.f734on.contains(appStatsExportListener)) {
            this.f734on.add(appStatsExportListener);
        }
    }

    public void addAppThresholdListener(AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        if (appstatsThresholdReachedListener == null) {
            throw new NullPointerException("addAppThresholdListener: listener parameter is null");
        } else if (!this.f733om.contains(appstatsThresholdReachedListener)) {
            this.f733om.add(appstatsThresholdReachedListener);
        }
    }

    public void removeAppStatsExportListener(AppStatsExportListener appStatsExportListener) {
        this.f734on.remove(appStatsExportListener);
    }

    public void removeAppStatsThresholdListener(AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        this.f733om.remove(appstatsThresholdReachedListener);
    }

    public void removeAppStatsWriteFileListener(AppStatsWriteFileListener appStatsWriteFileListener) {
        this.f730oj.remove(appStatsWriteFileListener);
    }

    public class FriendAS implements DataStoreStatusCallback, AppStatsWriteFileListener, AppStatsDao.AppStatsDaoCalcObjSize {
        public FriendAS(String str) {
            if (ModifyQuickTopUpReviewActivity.IconCompatParcelizer((CharSequence) str, (CharSequence) BuildConfig.APPLICATION_ID)) {
                AppStatsDao.addAppStatsDaoCalcObjSizeListener(this);
                return;
            }
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_UNSUPPORTED_OPERATION);
        }

        public AppStatsDataStore getAppStatsDataStore() {
            return AppStatistics.this.f729oi;
        }

        public String getSessionKey() {
            return AppStatistics.this.f720oA;
        }

        public String getLastSessionEventID() {
            if (AppStatistics.this.f717nX == null) {
                return "";
            }
            return AppStatistics.this.f717nX.getLastSessionEventID();
        }

        public String getCategory() {
            return AppStatistics.this.category;
        }

        public long currentEventTime() {
            return System.currentTimeMillis();
        }

        public void logAppStats(AppStatsDao[] appStatsDaoArr) {
            if (appStatsDaoArr != null) {
                synchronized (AppStatistics.this) {
                    for (AppStatsDao appStatsDao : appStatsDaoArr) {
                        AppStatistics.this.appStatsDaoCurrent.add(appStatsDao);
                        Integer calcObjSize = appStatsDao.calcObjSize(false, AppStatistics.this.f727og);
                        if (calcObjSize != null) {
                            long unused = AppStatistics.this.f721oa = AppStatistics.this.f721oa + ((long) calcObjSize.intValue());
                        }
                    }
                }
                AppStatistics.this.m525a(ThresholdType.THRESH_TYPE_RAM);
                return;
            }
            throw new NullPointerException("'appStatsDao' parameter is null");
        }

        public void fireExportStatusEvent(AppStatsExportEvent appStatsExportEvent) {
            AppStatistics.this.m535a((EventObject) appStatsExportEvent);
        }

        public void dataStoreExportComplete(ErrorInfo errorInfo) {
            synchronized (AppStatistics.this) {
                AppStatistics.this.m534a("DataStoreExportComplete()", true);
                AppStatsState unused = AppStatistics.this.f744ox = AppStatistics.this.f743ow;
                if (errorInfo == ErrorInfo.KMC_SUCCESS) {
                    AppStatsState unused2 = AppStatistics.this.f743ow = AppStatistics.this.f743ow.mo10923b(C0486b.TASK_EXPORT, AppStatistics.this.f745oy.f806qf);
                } else {
                    AppStatsState unused3 = AppStatistics.this.f743ow = AppStatistics.this.f743ow.mo10924c(C0486b.TASK_EXPORT, AppStatistics.this.f745oy.f806qf);
                }
                AppStatsState unused4 = AppStatistics.this.f745oy = AppStatistics.this.f744ox;
                AppStatistics.this.m534a("DataStoreExportComplete()", false);
            }
        }

        public void writeFileStatusEvent(AppStatsWritetoFileEvent appStatsWritetoFileEvent) {
            if (appStatsWritetoFileEvent.getWritetoFileStatus() != AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING) {
                synchronized (AppStatistics.this) {
                    ArrayList unused = AppStatistics.this.f732ol = AppStatistics.this.f730oj;
                }
            }
            if (appStatsWritetoFileEvent.getWritetoFileStatus() == AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE) {
                ErrorInfo a = AppStatsState.APP_STATS_EXPORTING.mo10922a(C0486b.TASK_EXPORT, AppStatistics.this.f743ow.f806qf);
                if (a == ErrorInfo.KMC_SUCCESS) {
                    AppStatistics appStatistics = AppStatistics.this;
                    AppStatsState unused2 = appStatistics.f745oy = appStatistics.f743ow;
                    AppStatsState unused3 = AppStatistics.this.f743ow = AppStatsState.APP_STATS_EXPORTING;
                    AppStatistics.this.f729oi.export(AppStatistics.this.f742ov, AppStatistics.this.f739os, AppStatistics.this.f746oz);
                    return;
                }
                throw new KmcRuntimeException(a);
            }
        }

        public void daoCalcObjSizeResult(int i, String str) {
            synchronized (AppStatistics.this) {
                if (AppStatistics.this.f727og.equals(str)) {
                    long unused = AppStatistics.this.f721oa = AppStatistics.this.f721oa + ((long) i);
                }
            }
            AppStatistics.this.m525a(ThresholdType.THRESH_TYPE_RAM);
        }

        public void addDataStoreInitializedListener(DataStoreInitializedListener dataStoreInitializedListener) {
            if (dataStoreInitializedListener == null) {
                throw new NullPointerException("addDataStoreInitializedListener: listener parameter is null");
            } else if (!AppStatistics.this.f735oo.contains(dataStoreInitializedListener)) {
                AppStatistics.this.f735oo.add(dataStoreInitializedListener);
            }
        }

        public void removeDataStoreInitializedListener(DataStoreInitializedListener dataStoreInitializedListener) {
            AppStatistics.this.f735oo.remove(dataStoreInitializedListener);
        }

        public void addAppStatsExportListener(AppStatsExportListener appStatsExportListener, int i) {
            if (appStatsExportListener == null) {
                throw new NullPointerException("addAppStatsExportListener: listener parameter is null");
            } else if (!AppStatistics.this.f734on.contains(appStatsExportListener)) {
                AppStatistics.this.f734on.add(i, appStatsExportListener);
            }
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatistics$b */
    class C0480b implements TaskRunner.TaskCompletedListener {
        private C0480b() {
        }

        public void onTaskCompleted(TaskRunner.TaskCompletedEvent taskCompletedEvent) {
            taskCompletedEvent.getTaskError();
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatistics$c */
    class C0481c implements Callable<AppStatsWriteToFileResults> {

        /* renamed from: oH */
        private int f757oH;

        private C0481c() {
        }

        /* renamed from: aN */
        public AppStatsWriteToFileResults call() throws Exception {
            ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
            AppStatistics.this.m534a("MyWriteToFileTask()", true);
            AppStatsWriteToFileResults appStatsWriteToFileResults = new AppStatsWriteToFileResults(errorInfo, AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING);
            List o = AppStatistics.this.m536aK();
            if (o.size() == 0) {
                appStatsWriteToFileResults.setState(AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE);
                AppStatistics.this.m531a(appStatsWriteToFileResults.getState(), 100.0f, errorInfo);
            } else {
                appStatsWriteToFileResults = m560a(o);
            }
            AppStatistics.this.m534a("MyWriteToFileTask()", false);
            return appStatsWriteToFileResults;
        }

        /* renamed from: a */
        private AppStatsWriteToFileResults m560a(List<AppStatsDao> list) {
            AppStatsWriteToFileResults appStatsWriteToFileResults;
            synchronized (this) {
                ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
                appStatsWriteToFileResults = new AppStatsWriteToFileResults(errorInfo, AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING);
                list.size();
                int unused = AppStatistics.this.f736op = list.size();
                Iterator<AppStatsDao> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        String aM = AppStatistics.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append(" i = ");
                        sb.append(0);
                        sb.append("  size = ");
                        sb.append(list.size());
                        C0767k.m1807c(aM, sb.toString());
                        it.next().writeToDb();
                    } catch (SQLiteConstraintException e) {
                        C0767k.m1814d(AppStatistics.TAG, e.getMessage());
                    }
                    C0767k.m1807c(AppStatistics.TAG, "WriteToDB");
                    it.remove();
                    try {
                        int p = AppStatistics.this.f736op - list.size();
                        this.f757oH = p;
                        int p2 = (p * 100) / AppStatistics.this.f736op;
                        appStatsWriteToFileResults.setState(p2 >= 100 ? AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE : AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_WRITING);
                        AppStatistics.this.m531a(appStatsWriteToFileResults.getState(), (float) p2, errorInfo);
                        AppStatistics.this.m525a(ThresholdType.THRESH_TYPE_FILE);
                        AppStatistics.this.m525a(ThresholdType.THRESH_TYPE_RAM);
                    } catch (Exception e2) {
                        appStatsWriteToFileResults.setState(AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_FAILED);
                        C0767k.m1814d(AppStatistics.TAG, e2.getMessage());
                    }
                }
            }
            return appStatsWriteToFileResults;
        }
    }

    /* renamed from: a */
    private void m533a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" parameter is null");
            throw new NullPointerException(sb.toString());
        } else if (obj.getClass().getSimpleName().equals("Integer") && ((Integer) obj).intValue() < 0) {
            ErrorInfo errorInfo = ErrorInfo.KMC_GN_PARAM_NEGATIVE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("'");
            sb2.append(str);
            sb2.append("' parameter is negative");
            errorInfo.setErrCause(sb2.toString());
            throw new KmcRuntimeException(errorInfo);
        }
    }

    /* renamed from: m */
    private TaskRunner m554m() {
        if (this.f716aZ == null) {
            this.f716aZ = new TaskRunner(1);
        }
        return this.f716aZ;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m531a(AppStatsWriteFileListener.WriteFileStatus writeFileStatus, float f, ErrorInfo errorInfo) {
        synchronized (this) {
            if (writeFileStatus == AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_COMPLETE) {
                m534a("handleWritetoFile()", true);
                this.f744ox = this.f743ow;
                this.f743ow = this.f743ow.mo10923b(C0486b.TASK_WRITE, this.f743ow.f806qf);
                this.f745oy = this.f744ox;
                m534a("handleWritetoFile()", false);
            } else if (writeFileStatus == AppStatsWriteFileListener.WriteFileStatus.WRITE_STATUS_FAILED) {
                this.f743ow = this.f743ow.mo10924c(C0486b.TASK_WRITE, this.f743ow.f806qf);
            }
        }
        m535a((EventObject) new AppStatsWritetoFileEvent(this, writeFileStatus, f, errorInfo));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m525a(ThresholdType thresholdType) {
        long j;
        if (thresholdType == ThresholdType.THRESH_TYPE_RAM) {
            int i = this.f718nY;
            if (i != 0) {
                j = this.f721oa;
                float f = (float) j;
                if (f - this.f737oq >= ((float) i)) {
                    this.f737oq = f;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (thresholdType == ThresholdType.THRESH_TYPE_FILE) {
            try {
                if (this.f719nZ != 0 && getFileSize() - this.f738or >= ((long) this.f719nZ)) {
                    this.f738or = getFileSize();
                    j = getFileSize();
                } else {
                    return;
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new KmcRuntimeException(ErrorInfo.KMC_GN_FILE_NOT_FOUND, e);
            }
        } else {
            throw new UnsupportedOperationException("handleThreshold: ThresholdType parameter specified is unsupported.");
        }
        m535a((EventObject) new AppStatsThresholdReachedEvent(this, thresholdType, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: aK */
    public List<AppStatsDao> m536aK() {
        List<AppStatsDao> list;
        synchronized (this) {
            list = this.appStatsDaoCurrent;
            if (this.appStatsDaoCurrent.hashCode() == this.f725oe.hashCode()) {
                this.appStatsDaoCurrent = this.f726of;
            } else {
                this.appStatsDaoCurrent = this.f725oe;
            }
            this.f727og = UUID.randomUUID().toString();
            this.f721oa = 0;
            this.f737oq = (float) getRamSize();
        }
        return list;
    }

    /* renamed from: aL */
    private void m537aL() {
        if (this.f731ok.isEmpty()) {
            this.f731ok.add(this.f746oz);
        }
        this.f732ol = this.f731ok;
        writeToFile();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m534a(String str, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" enter; appStatsState=");
            sb.append(this.f743ow);
            sb.append(", previousAppStatsState=");
            sb.append(this.f745oy);
            C0767k.m1801b("AppStatsState", sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" exit; appStatsState=");
        sb2.append(this.f743ow);
        sb2.append(", previousAppStatsState=");
        sb2.append(this.f745oy);
        C0767k.m1801b("AppStatsState", sb2.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m535a(final EventObject eventObject) {
        if (this.f715aU == ListenerCallbackThreadType.WORKER_THREAD) {
            m542b(eventObject);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    AppStatistics.this.m542b(eventObject);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m542b(EventObject eventObject) {
        if (eventObject instanceof AppStatsThresholdReachedEvent) {
            m530a((AppStatsThresholdReachedEvent) eventObject);
        } else if (eventObject instanceof AppStatsWritetoFileEvent) {
            m532a((AppStatsWritetoFileEvent) eventObject);
        } else if (eventObject instanceof AppStatsExportEvent) {
            fireExportStatusEvent((AppStatsExportEvent) eventObject);
        } else {
            throw new IllegalThreadStateException("fireAppStatsEvent: unsupported EventObject instance.");
        }
    }

    /* renamed from: a */
    private void m530a(AppStatsThresholdReachedEvent appStatsThresholdReachedEvent) {
        synchronized (this) {
            Iterator<AppstatsThresholdReachedListener> it = this.f733om.iterator();
            while (it.hasNext()) {
                it.next().thresholdReached(appStatsThresholdReachedEvent);
            }
        }
    }

    /* renamed from: a */
    private void m532a(AppStatsWritetoFileEvent appStatsWritetoFileEvent) {
        synchronized (this) {
            Iterator<AppStatsWriteFileListener> it = this.f732ol.iterator();
            while (it.hasNext()) {
                it.next().writeFileStatusEvent(appStatsWritetoFileEvent);
            }
        }
    }

    private void fireExportStatusEvent(AppStatsExportEvent appStatsExportEvent) {
        synchronized (this) {
            Iterator<AppStatsExportListener> it = this.f734on.iterator();
            while (it.hasNext()) {
                it.next().exportStatusEvent(appStatsExportEvent);
            }
        }
    }

    /* renamed from: s */
    private void m559s(String str) {
        synchronized (this) {
            Iterator<DataStoreInitializedListener> it = this.f735oo.iterator();
            while (it.hasNext()) {
                it.next().dataStoreInitialized(str);
            }
        }
    }
}
