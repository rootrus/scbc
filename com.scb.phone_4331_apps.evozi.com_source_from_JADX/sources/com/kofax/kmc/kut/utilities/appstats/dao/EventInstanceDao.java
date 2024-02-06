package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EventInstanceDao extends AppStatsDao implements Cloneable {
    private static final String TAG = EventInstanceDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f905ro = "Instance";

    /* renamed from: rr */
    private static Integer f906rr = null;

    /* renamed from: rs */
    private static Integer f907rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f908rt;

    /* renamed from: oA */
    private String f909oA = null;

    /* renamed from: rG */
    private String f910rG = new String();

    /* renamed from: rH */
    private long f911rH = 0;

    /* renamed from: rI */
    private long f912rI = 0;

    /* renamed from: rJ */
    private AppStatsInstanceType f913rJ = AppStatsInstanceType.INST_TYPE_UNUSED;

    /* renamed from: rp */
    private String f914rp = new String();

    static {
        ArrayList arrayList = new ArrayList();
        f908rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f908rt.add(new AppStatsDao.FieldTemplate("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f908rt.add(new AppStatsDao.FieldTemplate("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f908rt.add(new AppStatsDao.FieldTemplate("DismissalTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f908rt.add(new AppStatsDao.FieldTemplate("InstanceType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f908rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public String getInstanceId() {
        return this.f910rG;
    }

    public void setInstanceId(String str) {
        this.f910rG = str;
    }

    public String getEnvironmentId() {
        return this.f914rp;
    }

    public void setEnvironmentId(String str) {
        this.f914rp = str;
    }

    public long getCreationTime() {
        return this.f911rH;
    }

    public void setCreationTime(long j) {
        this.f911rH = j;
    }

    public long getDismissalTime() {
        return this.f912rI;
    }

    public void setDismissalTime(long j) {
        this.f912rI = j;
    }

    public AppStatsInstanceType getInstanceType() {
        return this.f913rJ;
    }

    public void setInstanceType(AppStatsInstanceType appStatsInstanceType) {
        this.f913rJ = appStatsInstanceType;
    }

    public String getSessionKey() {
        return this.f909oA;
    }

    public void setSessionKey(String str) {
        this.f909oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f906rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f906rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f907rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f907rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f905ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f905ro, f908rt);
    }

    public EventInstanceDao clone() {
        EventInstanceDao eventInstanceDao = (EventInstanceDao) super.clone();
        eventInstanceDao.f913rJ = this.f913rJ;
        return eventInstanceDao;
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f910rG);
        arrayList2.add(this.f914rp);
        arrayList2.add(dateStringFromEventTime(this.f911rH));
        arrayList2.add(dateStringFromEventTime(this.f912rI));
        arrayList2.add(this.f913rJ.toString());
        arrayList2.add(this.f909oA);
        arrayList.add(createInsertStatement(f905ro, f908rt, arrayList2, sQLiteDatabase));
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        EventInstanceDao eventInstanceDao = new EventInstanceDao();
        eventInstanceDao.f910rG = UUID.randomUUID().toString();
        eventInstanceDao.f914rp = UUID.randomUUID().toString();
        eventInstanceDao.f911rH = this.f911rH;
        eventInstanceDao.f912rI = this.f912rI;
        eventInstanceDao.f913rJ = this.f913rJ;
        return eventInstanceDao;
    }
}
