package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.Sizeof;
import com.kofax.kmc.kut.utilities.appstats.AppStatistics;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDaoField;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import com.kofax.kmc.kut.utilities.async.TaskRunner;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Callable;
import p040o.ModifyQuickTopUpReviewActivity;

public abstract class AppStatsDao implements Sizeof.SizeOfNewObject, Cloneable {
    /* access modifiers changed from: private */
    public static final String TAG = AppStatsDao.class.getSimpleName();

    /* renamed from: aZ */
    private static TaskRunner f844aZ = null;

    /* renamed from: qT */
    private static final int f845qT = 2;

    /* renamed from: qU */
    private static final int f846qU = 50;

    /* renamed from: qV */
    private static final int f847qV = 50;

    /* renamed from: qW */
    private static final int f848qW = 50;

    /* renamed from: qX */
    private static final int f849qX = 3;
    /* access modifiers changed from: private */

    /* renamed from: qY */
    public static final C0489b f850qY = C0489b.SIZEOF_ALGORITHM;

    /* renamed from: qZ */
    private static long f851qZ = 0;

    /* renamed from: ra */
    private static long f852ra = 0;

    /* renamed from: rb */
    private static long f853rb = 0;

    /* renamed from: rc */
    private static long f854rc = 0;

    /* renamed from: rd */
    private static List<AppStatsDao> f855rd = new ArrayList();

    /* renamed from: re */
    private static int f856re = 0;
    /* access modifiers changed from: private */

    /* renamed from: rf */
    public static AppStatsDaoCalcObjSize f857rf = null;
    private AppStatistics appStats;
    private AppStatistics.FriendAS asFriend;
    protected List<AppStatsDaoField> daoFields = new ArrayList();
    protected AppStatsDsOpType dsOperation = AppStatsDsOpType.APP_STATS_DS_INSERT;

    public interface AppStatsDaoCalcObjSize {
        void daoCalcObjSizeResult(int i, String str);
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$b */
    enum C0489b {
        SIZEOF_ALGORITHM,
        HEAP_SIZE_USAGE_ALGORITHM
    }

    /* access modifiers changed from: protected */
    public abstract AppStatsDao createDaoSampleSizingObj();

    /* access modifiers changed from: protected */
    public abstract Integer getAppStatsDaoObjSize();

    /* access modifiers changed from: protected */
    public abstract Integer getAppStatsDaoObjSizeInstCnt();

    public String getEnvironmentId() {
        return null;
    }

    public String getInstanceId() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase);

    /* access modifiers changed from: protected */
    public abstract void setAppStatsDaoObjSize(Integer num);

    /* access modifiers changed from: protected */
    public abstract void setAppStatsDaoObjSizeInstCnt(Integer num);

    public class AppStatsDaoCalcObjSizeResult {
        public int daoObjSize;
        public String daoObjSizeId;

        public AppStatsDaoCalcObjSizeResult(int i, String str) {
            this.daoObjSize = i;
            this.daoObjSizeId = str;
        }
    }

    protected static class FieldTemplate {
        String name;

        /* renamed from: oK */
        AppStatsDsFieldType f861oK;

        /* renamed from: oL */
        AppStatsDbFieldType f862oL;

        /* renamed from: oM */
        AppStatsDbFieldKeyType f863oM;

        FieldTemplate(String str, AppStatsDsFieldType appStatsDsFieldType, AppStatsDbFieldType appStatsDbFieldType, AppStatsDbFieldKeyType appStatsDbFieldKeyType) {
            this.name = str;
            this.f861oK = appStatsDsFieldType;
            this.f862oL = appStatsDbFieldType;
            this.f863oM = appStatsDbFieldKeyType;
        }
    }

    public AppStatsDao() {
        AppStatistics instance = AppStatistics.getInstance();
        this.appStats = instance;
        this.asFriend = new AppStatistics.FriendAS("com.kofax.kmc.kut.utilities.appstats");
        Sizeof.registerNewObjectListener(this);
    }

    public AppStatsDsOpType getDsOperation() {
        return this.dsOperation;
    }

    public void setDsOperation(AppStatsDsOpType appStatsDsOpType) {
        this.dsOperation = appStatsDsOpType;
    }

    public String getAppStatsSessionKey() {
        return this.asFriend.getSessionKey();
    }

    public String getAppStatsCategory() {
        return this.asFriend.getCategory();
    }

    public String dateStringFromEventTime(long j) {
        if (j == 0) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("gmt"));
        return simpleDateFormat.format(new Date(j));
    }

    public void setInstanceId(String str) {
        throw new UnsupportedOperationException("cannot set instanceId on AppStatsDao superclass; sub-class must implement this.");
    }

    public void setEnvironmentId(String str) {
        throw new UnsupportedOperationException("cannot set environmentId on AppStatsDao superclass; sub-class must implement this.");
    }

    public static void addAppStatsDaoCalcObjSizeListener(AppStatsDaoCalcObjSize appStatsDaoCalcObjSize) {
        f857rf = appStatsDaoCalcObjSize;
    }

    public AppStatsDao clone() {
        try {
            AppStatsDao appStatsDao = (AppStatsDao) super.clone();
            appStatsDao.dsOperation = this.dsOperation;
            appStatsDao.daoFields = new ArrayList();
            for (AppStatsDaoField next : this.daoFields) {
                AppStatsDaoField appStatsDaoField = new AppStatsDaoField(next.getDsFieldName(), next.getDsFieldType(), next.getDbFieldType(), next.getDbFieldKeyType(), next.getDsValueString());
                appStatsDaoField.setDsValueFloat(next.getDsValueFloat());
                appStatsDaoField.setDsValueInt(next.getDsValueInt());
                appStatsDaoField.setDsValueLong(next.getDsValueLong());
                appStatsDaoField.setDsValueDate(next.getDsValueDate());
                appStatsDao.daoFields.add(appStatsDaoField);
            }
            return appStatsDao;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new InternalError("AppStatsDao: unexpected clone not supported exception");
        }
    }

    public Integer calcObjSize(boolean z, String str) {
        Integer appStatsDaoObjSize;
        synchronized (this) {
            if (getAppStatsDaoObjSize() == null || z) {
                Integer appStatsDaoObjSizeInstCnt = getAppStatsDaoObjSizeInstCnt();
                setAppStatsDaoObjSizeInstCnt(Integer.valueOf(appStatsDaoObjSizeInstCnt.intValue() + 1));
                if (appStatsDaoObjSizeInstCnt.intValue() == 0) {
                    TaskRunner m = m587m();
                    C0488a aVar = new C0488a(str);
                    m.addOnTaskCompletedListener(new C0490c(this, (C04871) null), aVar, false);
                    m.submit(aVar);
                }
            } else {
                getAppStatsDaoObjSize();
            }
            appStatsDaoObjSize = getAppStatsDaoObjSize();
        }
        return appStatsDaoObjSize;
    }

    public Object genNextNewObject() {
        return createDaoSampleSizingObj();
    }

    public final void writeToDb() {
        List<SQLiteStatement> writeToDbStatements;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) AppStatsSqLiteDs.getInstance().getDsHandle();
        if (sQLiteDatabase != null && (writeToDbStatements = getWriteToDbStatements(sQLiteDatabase)) != null) {
            for (SQLiteStatement execute : writeToDbStatements) {
                execute.execute();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final SQLiteStatement createInsertStatement(String str, List<FieldTemplate> list, List<Object> list2, SQLiteDatabase sQLiteDatabase) {
        String str2;
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("INSERT INTO ");
        sb2.append(str);
        sb2.append(" (");
        sb.append(sb2.toString());
        String str3 = "";
        for (FieldTemplate fieldTemplate : list) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(fieldTemplate.name);
            sb.append(sb3.toString());
            str3 = ", ";
        }
        sb.append(") VALUES (");
        List nCopies = Collections.nCopies(size, "?");
        if (nCopies == null) {
            str2 = null;
        } else {
            str2 = ModifyQuickTopUpReviewActivity.read((Iterator<?>) nCopies.iterator(), ", ");
        }
        sb.append(str2);
        sb.append(")");
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
        int i = 0;
        while (i < list.size()) {
            int i2 = i + 1;
            m578a(compileStatement, i2, list2.get(i), list.get(i).f861oK);
            i = i2;
        }
        return compileStatement;
    }

    /* access modifiers changed from: protected */
    public final SQLiteStatement createUpdateStatement(String str, String str2, List<FieldTemplate> list, List<Object> list2, SQLiteDatabase sQLiteDatabase) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(str);
        sb2.append(" SET ");
        sb.append(sb2.toString());
        String str3 = "";
        for (int i = 0; i < list.size(); i++) {
            if (list2.get(i) != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(list.get(i).name);
                sb3.append("=?");
                sb.append(sb3.toString());
                str3 = ", ";
            }
        }
        sb.append(" WHERE ID=?");
        SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(sb.toString());
        int i2 = 1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list2.get(i3);
            if (obj != null) {
                m578a(compileStatement, i2, obj, list.get(i3).f861oK);
                i2++;
            }
        }
        compileStatement.bindString(i2, str2);
        return compileStatement;
    }

    /* renamed from: a */
    private void m578a(SQLiteStatement sQLiteStatement, int i, Object obj, AppStatsDsFieldType appStatsDsFieldType) {
        int i2 = C04871.f858rg[appStatsDsFieldType.ordinal()];
        if (i2 == 1) {
            sQLiteStatement.bindLong(i, ((Long) obj).longValue());
        } else if (i2 == 2) {
            sQLiteStatement.bindLong(i, (long) ((Integer) obj).intValue());
        } else if (i2 != 3) {
            sQLiteStatement.bindString(i, String.valueOf(obj));
        } else {
            sQLiteStatement.bindDouble(i, (double) ((Float) obj).floatValue());
        }
    }

    protected static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler, String str2, List<FieldTemplate> list) {
        String str3 = str2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        String str4 = "";
        for (FieldTemplate fieldTemplate : list) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(fieldTemplate.name);
            sb.append(sb2.toString());
            str4 = ", ";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(" FROM ");
        sb3.append(str3);
        sb.append(sb3.toString());
        Cursor rawQuery = ((SQLiteDatabase) AppStatsSqLiteDs.getInstance().getDsHandle()).rawQuery(sb.toString(), (String[]) null);
        if (rawQuery != null) {
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.clear();
                    for (FieldTemplate next : list) {
                        int columnIndex = rawQuery.getColumnIndex(next.name);
                        int i = C04871.f858rg[next.f861oK.ordinal()];
                        if (i == 1) {
                            String str5 = next.name;
                            AppStatsDsFieldType appStatsDsFieldType = next.f861oK;
                            AppStatsDbFieldType appStatsDbFieldType = next.f862oL;
                            arrayList.add(new AppStatsDaoField(str5, appStatsDsFieldType, appStatsDbFieldType, next.f863oM, Long.valueOf(rawQuery.getLong(columnIndex))));
                        } else if (i == 2) {
                            arrayList.add(new AppStatsDaoField(next.name, next.f861oK, next.f862oL, next.f863oM, Integer.valueOf(rawQuery.getInt(columnIndex))));
                        } else if (i != 3) {
                            arrayList.add(new AppStatsDaoField(next.name, next.f861oK, next.f862oL, next.f863oM, rawQuery.getString(columnIndex)));
                        } else {
                            String str6 = next.name;
                            AppStatsDsFieldType appStatsDsFieldType2 = next.f861oK;
                            AppStatsDbFieldType appStatsDbFieldType2 = next.f862oL;
                            arrayList.add(new AppStatsDaoField(str6, appStatsDsFieldType2, appStatsDbFieldType2, next.f863oM, Float.valueOf(rawQuery.getFloat(columnIndex))));
                        }
                    }
                    appStatsDsExportHandler.onExportAppStatsRowEvent(str3, (AppStatsDaoField[]) arrayList.toArray(new AppStatsDaoField[arrayList.size()]));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
        }
    }

    /* access modifiers changed from: protected */
    public String generateNewUniqueID() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$c */
    class C0490c implements TaskRunner.TaskCompletedListener {
        private C0490c() {
        }

        /* synthetic */ C0490c(AppStatsDao appStatsDao, C04871 r2) {
            this();
        }

        public void onTaskCompleted(TaskRunner.TaskCompletedEvent taskCompletedEvent) {
            synchronized (AppStatsDao.this) {
                if (taskCompletedEvent.getTaskError() == ErrorInfo.KMC_SUCCESS) {
                    if (AppStatsDao.f857rf != null) {
                        AppStatsDaoCalcObjSizeResult appStatsDaoCalcObjSizeResult = (AppStatsDaoCalcObjSizeResult) taskCompletedEvent.getTaskReturnValue();
                        AppStatsDao.this.setAppStatsDaoObjSize(Integer.valueOf(appStatsDaoCalcObjSizeResult.daoObjSize));
                        String n = AppStatsDao.TAG;
                        StringBuilder sb = new StringBuilder();
                        sb.append(AppStatsDao.this.getClass().getSimpleName());
                        sb.append(".getAppStatsDaoObjSizeInstCnt() = ");
                        sb.append(AppStatsDao.this.getAppStatsDaoObjSizeInstCnt());
                        C0767k.m1801b(n, sb.toString());
                        Integer valueOf = Integer.valueOf(AppStatsDao.this.getAppStatsDaoObjSizeInstCnt().intValue() * appStatsDaoCalcObjSizeResult.daoObjSize);
                        AppStatsDao.f857rf.daoCalcObjSizeResult(valueOf.intValue(), appStatsDaoCalcObjSizeResult.daoObjSizeId);
                        String n2 = AppStatsDao.TAG;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(AppStatsDao.this.getClass().getSimpleName());
                        sb2.append(".daoCalcObjSizeResult(");
                        sb2.append(valueOf);
                        sb2.append(")");
                        C0767k.m1801b(n2, sb2.toString());
                        AppStatsDao.this.setAppStatsDaoObjSizeInstCnt(0);
                    } else {
                        throw new NullPointerException("daoCalcObjSizeListener is null, indicating no listener is registered");
                    }
                }
            }
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$a */
    class C0488a implements Callable<AppStatsDaoCalcObjSizeResult> {

        /* renamed from: rj */
        private String f865rj;

        /* renamed from: rk */
        int f866rk = 0;

        C0488a(String str) {
            this.f865rj = str;
        }

        /* renamed from: bb */
        public AppStatsDaoCalcObjSizeResult call() throws Exception {
            int i = C04871.f859rh[AppStatsDao.f850qY.ordinal()];
            if (i == 1) {
                this.f866rk = AppStatsDao.this.m580aX();
            } else if (i == 2) {
                this.f866rk = AppStatsDao.this.m581aY();
            }
            String n = AppStatsDao.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("Bytes used per ");
            sb.append(AppStatsDao.this.getClass().getSimpleName());
            sb.append(" object = ");
            sb.append(this.f866rk);
            C0767k.m1801b(n, sb.toString());
            return new AppStatsDaoCalcObjSizeResult(this.f866rk, this.f865rj);
        }
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$1 */
    static /* synthetic */ class C04871 {

        /* renamed from: rg */
        static final /* synthetic */ int[] f858rg;

        /* renamed from: rh */
        static final /* synthetic */ int[] f859rh;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$b[] r0 = com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao.C0489b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f859rh = r0
                r1 = 1
                com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$b r2 = com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao.C0489b.SIZEOF_ALGORITHM     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f859rh     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao$b r3 = com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao.C0489b.HEAP_SIZE_USAGE_ALGORITHM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType[] r2 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f858rg = r2
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r3 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_LONG     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f858rg     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r2 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f858rg     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType r1 = com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao.C04871.<clinit>():void");
        }
    }

    /* renamed from: aW */
    private static void m579aW() {
        for (int i = 0; i < 2; i++) {
            System.gc();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    private static void m584b(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aX */
    public int m580aX() {
        int i = 0;
        int i2 = 0;
        while (i < 3) {
            try {
                Sizeof.computeObjectSize(Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_SHELL, 50);
                i2 = Sizeof.computeObjectSize(Sizeof.ObjectDataTypes.DATA_TYPE_APP_CREATED, 50);
                Sizeof.computeObjectSize(Sizeof.ObjectDataTypes.DATA_TYPE_OBJECT_SHELL, 50);
                if (i2 > 0) {
                    break;
                }
                i++;
            } catch (Exception e) {
                e.printStackTrace();
                throw new IllegalThreadStateException(e.getMessage());
            }
        }
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: aY */
    public int m581aY() {
        C0767k.m1801b(TAG, "runComputeHeapSizeUsage(false)");
        m579aW();
        m584b(50);
        long h = m586h(false);
        m579aW();
        m584b(50);
        C0767k.m1801b(TAG, "runComputeHeapSizeUsage(true)");
        long h2 = m586h(true);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("heapUsedBase: ");
        sb.append(h);
        C0767k.m1801b(str, sb.toString());
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("heapUsedAppStatObj: ");
        sb2.append(h2);
        C0767k.m1801b(str2, sb2.toString());
        String str3 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("instanceDao objects created: ");
        sb3.append(f856re);
        C0767k.m1801b(str3, sb3.toString());
        return (int) ((h2 - h) / ((long) f856re));
    }

    /* renamed from: h */
    private long m586h(boolean z) {
        f856re = 0;
        f855rd.clear();
        f852ra = Runtime.getRuntime().freeMemory();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("heapFreeSize (start) = ");
        sb.append(NumberFormat.getInstance().format(f852ra));
        C0767k.m1801b(str, sb.toString());
        for (int i = 0; i < 50; i++) {
            f854rc = f851qZ;
            f851qZ = Runtime.getRuntime().freeMemory();
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("heapFreeSize = ");
            sb2.append(NumberFormat.getInstance().format(f851qZ));
            C0767k.m1801b(str2, sb2.toString());
            long j = f854rc;
            if (j == 0) {
                j = f851qZ;
            }
            f854rc = j;
            if (z) {
                f855rd.add(createDaoSampleSizingObj());
                f856re++;
            }
        }
        f853rb = Runtime.getRuntime().freeMemory();
        String str3 = TAG;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("heapFreeSize (end) = ");
        sb3.append(NumberFormat.getInstance().format(f853rb));
        C0767k.m1801b(str3, sb3.toString());
        long j2 = f852ra;
        long j3 = f853rb;
        f855rd.clear();
        return j2 - j3;
    }

    /* renamed from: m */
    private static TaskRunner m587m() {
        if (f844aZ == null) {
            f844aZ = new TaskRunner(1);
        }
        return f844aZ;
    }
}
