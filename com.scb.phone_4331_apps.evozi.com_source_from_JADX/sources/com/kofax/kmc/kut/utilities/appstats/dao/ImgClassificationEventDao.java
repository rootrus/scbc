package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsOpType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ImgClassificationEventDao extends AppStatsDao implements Cloneable {
    private static final String TAG = ImgClassificationEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f966ro = "ClassificationEvent";

    /* renamed from: rr */
    private static Integer f967rr = null;

    /* renamed from: rs */
    private static Integer f968rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f969rt;

    /* renamed from: id */
    private String f970id;
    private String imageID;

    /* renamed from: oA */
    private String f971oA;

    /* renamed from: rG */
    private String f972rG;

    /* renamed from: rZ */
    private long f973rZ;

    /* renamed from: sa */
    private String f974sa;

    /* renamed from: sb */
    private float f975sb;
    private long startTime;

    static {
        ArrayList arrayList = new ArrayList();
        f969rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("ClassificationResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("ClassificationConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f969rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public ImgClassificationEventDao() {
        this.f970id = new String();
        this.f972rG = new String();
        this.startTime = 0;
        this.f973rZ = 0;
        this.f974sa = new String();
        this.f975sb = -5000.0f;
        this.imageID = null;
        this.f971oA = null;
        this.f970id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f970id;
    }

    public void setId(String str) {
        this.f970id = str;
    }

    public String getInstanceId() {
        return this.f972rG;
    }

    public void setInstanceId(String str) {
        this.f972rG = str;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public long getStopTime() {
        return this.f973rZ;
    }

    public void setStopTime(long j) {
        this.f973rZ = j;
    }

    public String getClassificationResult() {
        return this.f974sa;
    }

    public void setClassificationResult(String str) {
        this.f974sa = str;
    }

    public float getClassificationConfidence() {
        return this.f975sb;
    }

    public void setClassificationConfidence(float f) {
        this.f975sb = f;
    }

    public String getImageID() {
        return this.imageID;
    }

    public void setImageID(String str) {
        this.imageID = str;
    }

    public String getSessionKey() {
        return this.f971oA;
    }

    public void setSessionKey(String str) {
        this.f971oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f967rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f967rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f968rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f968rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f966ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f966ro, f969rt);
    }

    public ImgClassificationEventDao clone() {
        return (ImgClassificationEventDao) super.clone();
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement sQLiteStatement;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(this.f970id));
        arrayList.add(String.valueOf(this.f972rG));
        arrayList.add(String.valueOf(dateStringFromEventTime(this.startTime)));
        arrayList.add(String.valueOf(dateStringFromEventTime(this.f973rZ)));
        arrayList.add(String.valueOf(this.f974sa));
        arrayList.add(Float.valueOf(this.f975sb));
        arrayList.add(String.valueOf(this.imageID));
        arrayList.add(String.valueOf(this.f971oA));
        if (this.dsOperation == AppStatsDsOpType.APP_STATS_DS_UPDATE) {
            sQLiteStatement = createUpdateStatement(f966ro, this.f970id, f969rt, arrayList, sQLiteDatabase);
        } else {
            sQLiteStatement = createInsertStatement(f966ro, f969rt, arrayList, sQLiteDatabase);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sQLiteStatement);
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ImgClassificationEventDao imgClassificationEventDao = new ImgClassificationEventDao();
        imgClassificationEventDao.f970id = UUID.randomUUID().toString();
        imgClassificationEventDao.f972rG = UUID.randomUUID().toString();
        imgClassificationEventDao.startTime = this.startTime;
        imgClassificationEventDao.f973rZ = this.f973rZ;
        imgClassificationEventDao.f974sa = new String(this.f974sa.getBytes());
        imgClassificationEventDao.f975sb = this.f975sb;
        imgClassificationEventDao.imageID = UUID.randomUUID().toString();
        return imgClassificationEventDao;
    }
}
