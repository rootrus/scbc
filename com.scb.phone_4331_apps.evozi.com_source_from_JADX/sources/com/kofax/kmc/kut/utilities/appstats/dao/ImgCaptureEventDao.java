package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ImgCaptureEventDao extends AppStatsDao implements Cloneable {
    private static final String TAG = ImgCaptureEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f949ro = "CaptureEvent";

    /* renamed from: rr */
    private static Integer f950rr = null;

    /* renamed from: rs */
    private static Integer f951rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f952rt;

    /* renamed from: id */
    private String f953id;
    private String imageID;

    /* renamed from: oA */
    private String f954oA;

    /* renamed from: rG */
    private String f955rG;

    /* renamed from: rK */
    private long f956rK;

    /* renamed from: rV */
    private AppStatsEventIDType f957rV;
    private int value;

    static {
        ArrayList arrayList = new ArrayList();
        f952rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate("EventType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate(KtaJsonExactionHelper.VALUE, AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate("ImageID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f952rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public ImgCaptureEventDao() {
        this.f953id = new String();
        this.f955rG = new String();
        this.f956rK = 0;
        this.f957rV = AppStatsEventIDType.APP_STATS_UNKNOWN_EVENT;
        this.imageID = null;
        this.f954oA = null;
        this.f953id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f953id;
    }

    public void setId(String str) {
        this.f953id = str;
    }

    public String getInstanceId() {
        return this.f955rG;
    }

    public void setInstanceId(String str) {
        this.f955rG = str;
    }

    public long getEventTime() {
        return this.f956rK;
    }

    public void setEventTime(long j) {
        this.f956rK = j;
    }

    public AppStatsEventIDType getEventType() {
        return this.f957rV;
    }

    public void setEventType(AppStatsEventIDType appStatsEventIDType) {
        this.f957rV = appStatsEventIDType;
    }

    public String getImageID() {
        return this.imageID;
    }

    public void setImageID(String str) {
        this.imageID = str;
    }

    public String getSessionKey() {
        return this.f954oA;
    }

    public void setSessionKey(String str) {
        this.f954oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f950rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f950rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f951rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f951rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f949ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f949ro, f952rt);
    }

    public ImgCaptureEventDao clone() {
        return (ImgCaptureEventDao) super.clone();
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f953id);
        arrayList.add(this.f955rG);
        arrayList.add(dateStringFromEventTime(this.f956rK));
        arrayList.add(this.f957rV.getEventTypeDescription());
        arrayList.add(Integer.valueOf(getValue()));
        arrayList.add(this.imageID);
        arrayList.add(this.f954oA);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createInsertStatement(f949ro, f952rt, arrayList, sQLiteDatabase));
        return arrayList2;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int i) {
        this.value = i;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ImgCaptureEventDao imgCaptureEventDao = new ImgCaptureEventDao();
        imgCaptureEventDao.f953id = UUID.randomUUID().toString();
        imgCaptureEventDao.f955rG = UUID.randomUUID().toString();
        imgCaptureEventDao.f956rK = this.f956rK;
        imgCaptureEventDao.f957rV = this.f957rV;
        imgCaptureEventDao.imageID = UUID.randomUUID().toString();
        return imgCaptureEventDao;
    }
}
