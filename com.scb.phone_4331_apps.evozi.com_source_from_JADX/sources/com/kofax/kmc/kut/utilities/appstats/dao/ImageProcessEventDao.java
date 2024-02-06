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

public class ImageProcessEventDao extends AppStatsDao implements Cloneable {
    private static final String TAG = ImageProcessEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f938ro = "ImageProcessorEvent";

    /* renamed from: rr */
    private static Integer f939rr = null;

    /* renamed from: rs */
    private static Integer f940rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f941rt;

    /* renamed from: id */
    String f942id;

    /* renamed from: oA */
    private String f943oA;

    /* renamed from: rG */
    private String f944rG;

    /* renamed from: rR */
    private long f945rR;

    /* renamed from: rS */
    String f946rS;

    /* renamed from: rT */
    String f947rT;

    /* renamed from: rU */
    String f948rU;
    int resultCode;
    private long startTime;

    static {
        ArrayList arrayList = new ArrayList();
        f941rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("StopTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("StartTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("ResultCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("ProcessingProfile", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("SourceImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("ProcessedImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f941rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public ImageProcessEventDao() {
        this.f942id = new String();
        this.f944rG = new String();
        this.f946rS = new String();
        this.f947rT = new String();
        this.f948rU = new String();
        this.f943oA = null;
        this.f942id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f942id;
    }

    public void setId(String str) {
        this.f942id = str;
    }

    public String getInstanceId() {
        return this.f944rG;
    }

    public void setInstanceId(String str) {
        this.f944rG = str;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public long getEndTime() {
        return this.f945rR;
    }

    public void setEndTime(long j) {
        this.f945rR = j;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public String getProcessingProfile() {
        return this.f946rS;
    }

    public void setProcessingProfile(String str) {
        this.f946rS = str;
    }

    public String getSourceImage() {
        return this.f947rT;
    }

    public void setSourceImage(String str) {
        this.f947rT = str;
    }

    public String getProcessedImage() {
        return this.f948rU;
    }

    public void setProcessedImage(String str) {
        this.f948rU = str;
    }

    public String getSessionKey() {
        return this.f943oA;
    }

    public void setSessionKey(String str) {
        this.f943oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f939rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f939rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        return f940rs;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        f940rs = num;
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        SQLiteStatement sQLiteStatement;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(this.f942id));
        arrayList.add(String.valueOf(this.f944rG));
        arrayList.add(String.valueOf(dateStringFromEventTime(this.startTime)));
        arrayList.add(String.valueOf(dateStringFromEventTime(this.f945rR)));
        arrayList.add(Integer.valueOf(this.resultCode));
        arrayList.add(String.valueOf(this.f946rS));
        arrayList.add(String.valueOf(this.f947rT));
        arrayList.add(String.valueOf(this.f948rU));
        arrayList.add(String.valueOf(this.f943oA));
        if (this.dsOperation == AppStatsDsOpType.APP_STATS_DS_UPDATE) {
            sQLiteStatement = createUpdateStatement(f938ro, this.f942id, f941rt, arrayList, sQLiteDatabase);
        } else {
            sQLiteStatement = createInsertStatement(f938ro, f941rt, arrayList, sQLiteDatabase);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sQLiteStatement);
        return arrayList2;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f938ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f938ro, f941rt);
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ImageProcessEventDao imageProcessEventDao = new ImageProcessEventDao();
        imageProcessEventDao.f942id = UUID.randomUUID().toString();
        imageProcessEventDao.f944rG = UUID.randomUUID().toString();
        imageProcessEventDao.startTime = this.startTime;
        imageProcessEventDao.f945rR = this.f945rR;
        imageProcessEventDao.f948rU = this.f948rU;
        imageProcessEventDao.f947rT = this.f947rT;
        imageProcessEventDao.f946rS = this.f946rS;
        imageProcessEventDao.resultCode = this.resultCode;
        return imageProcessEventDao;
    }
}
