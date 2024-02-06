package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.appstats.AppStatsExportListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public abstract class AppStatsDataStore {
    /* access modifiers changed from: private */
    public static final String TAG = AppStatsDataStore.class.getSimpleName();
    protected AppStatistics appStats;
    protected AppStatistics.FriendAS asFriend;
    protected String dsFilePath = "";
    protected File dsFilePathAsFileObj = null;
    protected String dsUniqueId = "";
    /* access modifiers changed from: private */

    /* renamed from: oS */
    public List<Class<?>> f767oS = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: oT */
    public long f768oT = 0;
    /* access modifiers changed from: private */

    /* renamed from: oU */
    public List<Long> f769oU = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: oV */
    public long f770oV = 0;

    public abstract void close();

    public abstract long countrows(String str);

    public abstract Object getDsHandle();

    public abstract boolean isOpen();

    public abstract void open();

    public abstract void open(String str);

    public abstract void upgrade(String str);

    public AppStatsDataStore() {
        AppStatistics instance = AppStatistics.getInstance();
        this.appStats = instance;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatsDataStore$a */
    enum C0482a {
        DAO_CLASS_ENVIRONMENT_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao"),
        DAO_CLASS_ERROR_LOG_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.ErrorLogEventDao"),
        DAO_CLASS_DOCUMENT_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.DocumentEventDao"),
        DAO_CLASS_SESSION_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.SessEventDao"),
        DAO_CLASS_IMAGE("com.kofax.kmc.kut.utilities.appstats.dao.ImageDao"),
        DAO_CLASS_EVENT_INSTANCE("com.kofax.kmc.kut.utilities.appstats.dao.EventInstanceDao"),
        DAO_CLASS_IMG_CLASSIFIER_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventDao"),
        DAO_CLASS_IMG_CLASSIFIER_EVENT_ALT("com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventAltDao"),
        DAO_CLASS_IMG_CAPTURE_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.ImgCaptureEventDao"),
        DAO_CLASS_PROPERTY_CHANGE_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.PropertyChangeEventDao"),
        DAO_CLASS_IMG_FIELD_CHANGED_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.FieldEventDao"),
        DAO_CLASS_IMAGE_PROCESSED_EVENT("com.kofax.kmc.kut.utilities.appstats.dao.ImageProcessEventDao");
        

        /* renamed from: pi */
        private String f784pi;

        private C0482a(String str) {
            this.f784pi = str;
        }

        public final String getName() {
            return this.f784pi;
        }
    }

    /* access modifiers changed from: protected */
    public String getDsUniqueId() {
        return this.dsUniqueId;
    }

    /* access modifiers changed from: protected */
    public String getDsFilePath() {
        return this.dsFilePath;
    }

    /* access modifiers changed from: protected */
    public void setDsFilePath(String str) {
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("setDsFilePath: dsFilePath parameter is null or empty");
        }
        this.dsFilePath = str;
        this.dsFilePathAsFileObj = new File(str);
    }

    public long calcDsSize() {
        String str = this.dsFilePath;
        if (str != null && this.dsFilePathAsFileObj != null && !str.isEmpty()) {
            return this.dsFilePathAsFileObj.length();
        }
        throw new NullPointerException("remove: dsFilePath parameter is null or empty");
    }

    public void remove() {
        String str = this.dsFilePath;
        if (str == null || str.isEmpty()) {
            throw new NullPointerException("remove: dsFilePath parameter is null or empty");
        }
        boolean delete = new File(this.dsFilePath).delete();
        String str2 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("remove: file was deleted = ");
        sb.append(delete);
        C0767k.m1801b(str2, sb.toString());
    }

    public void export(String str, AppStatsDsExportHandler appStatsDsExportHandler, AppStatistics.DataStoreStatusCallback dataStoreStatusCallback) {
        new Thread(new C0483b(str, appStatsDsExportHandler, dataStoreStatusCallback)).start();
    }

    /* access modifiers changed from: protected */
    public void remove(String... strArr) {
        for (String str : strArr) {
            if (str == null || str.isEmpty()) {
                throw new NullPointerException("remove: dsFilePath parameter is null or empty");
            }
            boolean delete = new File(str).delete();
            String str2 = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("remove: (");
            sb.append(str);
            sb.append(") file was deleted = ");
            sb.append(delete);
            C0767k.m1801b(str2, sb.toString());
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatsDataStore$b */
    class C0483b implements Runnable {
        private ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;

        /* renamed from: ov */
        private String f785ov;

        /* renamed from: pk */
        private AppStatsDsExportHandler f786pk;

        /* renamed from: pl */
        private AppStatistics.DataStoreStatusCallback f787pl;

        C0483b(String str, AppStatsDsExportHandler appStatsDsExportHandler, AppStatistics.DataStoreStatusCallback dataStoreStatusCallback) {
            this.f785ov = str;
            this.f786pk = appStatsDsExportHandler;
            this.f787pl = dataStoreStatusCallback;
        }

        public void run() {
            C0767k.m1801b(AppStatsDataStore.TAG, "AppStatsExportRunnable: run() start");
            AppStatsDataStore.this.f767oS.clear();
            AppStatsDataStore.this.f769oU.clear();
            long unused = AppStatsDataStore.this.f768oT = 0;
            long unused2 = AppStatsDataStore.this.f770oV = 0;
            this.f786pk.configDsExpFilePath(this.f785ov);
            m569a(AppStatsExportListener.ExportStatus.EXPORTING, 0, this.errorInfo);
            C0482a[] values = C0482a.values();
            int length = values.length;
            int i = 0;
            while (i < length) {
                C0482a aVar = values[i];
                try {
                    Class<?> cls = Class.forName(aVar.getName());
                    Long l = (Long) cls.getMethod("countRows", (Class[]) null).invoke((Object) null, new Object[0]);
                    if (l.longValue() > 0) {
                        AppStatsDataStore.this.f767oS.add(cls);
                        AppStatsDataStore.this.f769oU.add(l);
                        long unused3 = AppStatsDataStore.this.f768oT = AppStatsDataStore.this.f768oT + l.longValue();
                    }
                    i++;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    throw new TypeNotPresentException(aVar.getName(), new Throwable(e));
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                    throw new TypeNotPresentException(aVar.getName(), new Throwable(e2));
                } catch (IllegalArgumentException e3) {
                    e3.printStackTrace();
                    throw e3;
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                    throw new IllegalArgumentException(e4.getMessage(), e4);
                } catch (NoSuchMethodException e5) {
                    e5.printStackTrace();
                    throw new IllegalArgumentException(e5.getMessage(), e5);
                }
            }
            int i2 = 0;
            for (Class method : AppStatsDataStore.this.f767oS) {
                try {
                    method.getMethod("export", new Class[]{String.class, AppStatsDsExportHandler.class}).invoke((Object) null, new Object[]{this.f785ov, this.f786pk});
                    long unused4 = AppStatsDataStore.this.f770oV = AppStatsDataStore.this.f770oV + ((Long) AppStatsDataStore.this.f769oU.get(i2)).longValue();
                    int round = (int) Math.round(((double) (((float) AppStatsDataStore.this.f770oV) / ((float) AppStatsDataStore.this.f768oT))) * 100.0d);
                    AppStatsExportListener.ExportStatus exportStatus = AppStatsDataStore.this.f770oV == AppStatsDataStore.this.f768oT ? AppStatsExportListener.ExportStatus.COMPLETE : AppStatsExportListener.ExportStatus.EXPORTING;
                    if (exportStatus != AppStatsExportListener.ExportStatus.EXPORTING) {
                        this.f787pl.dataStoreExportComplete(this.errorInfo);
                    }
                    m569a(exportStatus, round, this.errorInfo);
                    i2++;
                } catch (NoSuchMethodException e6) {
                    e6.printStackTrace();
                    throw new IllegalArgumentException(e6.getMessage(), e6);
                } catch (IllegalArgumentException e7) {
                    e7.printStackTrace();
                    throw e7;
                } catch (IllegalAccessException e8) {
                    e8.printStackTrace();
                    throw new IllegalArgumentException(e8.getMessage(), e8);
                } catch (InvocationTargetException e9) {
                    e9.printStackTrace();
                    throw new IllegalArgumentException(e9.getMessage(), e9);
                }
            }
            if (AppStatsDataStore.this.f768oT == 0) {
                this.f787pl.dataStoreExportComplete(this.errorInfo);
                m569a(AppStatsExportListener.ExportStatus.COMPLETE, 100, ErrorInfo.KMC_UT_STATS_NOTHING_TO_EXPORT);
            }
            C0767k.m1801b(AppStatsDataStore.TAG, "AppStatsExportRunnable: run() end");
        }

        /* renamed from: a */
        private void m569a(AppStatsExportListener.ExportStatus exportStatus, int i, ErrorInfo errorInfo2) {
            AppStatsDataStore.this.asFriend.fireExportStatusEvent(new AppStatsExportEvent(AppStatsDataStore.this.appStats, exportStatus, i, errorInfo2));
        }
    }
}
