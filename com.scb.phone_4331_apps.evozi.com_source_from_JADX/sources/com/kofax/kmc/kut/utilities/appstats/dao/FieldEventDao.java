package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FieldEventDao extends AppStatsDao implements Cloneable {
    private static final String TAG = FieldEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f915ro = "FieldChangeEvent";

    /* renamed from: rr */
    private static Integer f916rr = null;

    /* renamed from: rs */
    private static Integer f917rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f918rt;
    private String fieldName;

    /* renamed from: iL */
    private String f919iL;

    /* renamed from: iZ */
    private String f920iZ;

    /* renamed from: id */
    private String f921id;

    /* renamed from: rK */
    private long f922rK;

    /* renamed from: rL */
    private String f923rL;

    /* renamed from: rM */
    private String f924rM;

    /* renamed from: rN */
    private int f925rN;

    /* renamed from: rO */
    private String f926rO;

    static {
        ArrayList arrayList = new ArrayList();
        f918rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("OriginalValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("ChangedValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("FieldName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("IsValid", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("ErrorDescription", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("SessionEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate(KtaJsonExactionHelper.CONFIDENCE, AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f918rt.add(new AppStatsDao.FieldTemplate("FormattingFailed", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public FieldEventDao() {
        this.f921id = new String();
        this.f922rK = 0;
        this.fieldName = new String();
        this.f921id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f921id;
    }

    public void setId(String str) {
        this.f921id = str;
    }

    public String getDocumentID() {
        return this.f919iL;
    }

    public void setDocumentID(String str) {
        this.f919iL = str;
    }

    public long getEventTime() {
        return this.f922rK;
    }

    public void setEventTime(long j) {
        this.f922rK = j;
    }

    public String getOriginalValue() {
        return this.f923rL;
    }

    public void setOriginalValue(String str) {
        this.f923rL = str;
    }

    public String getChangedValue() {
        return this.f924rM;
    }

    public void setChangedValue(String str) {
        this.f924rM = str;
    }

    public String getFieldname() {
        return this.fieldName;
    }

    public void setFieldname(String str) {
        this.fieldName = str;
    }

    /* renamed from: bc */
    private int m590bc() {
        return this.f925rN;
    }

    public void setIsValid(int i) {
        this.f925rN = i;
    }

    public String getErrorDescription() {
        return this.f920iZ;
    }

    public void setErrorDescription(String str) {
        this.f920iZ = str;
    }

    public String getSessionEventID() {
        return this.f926rO;
    }

    public void setSessionEventID(String str) {
        this.f926rO = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f916rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f916rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f917rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f917rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f915ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f915ro, f918rt);
    }

    public FieldEventDao clone() {
        return (FieldEventDao) super.clone();
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f921id);
        arrayList.add(this.f919iL);
        arrayList.add(dateStringFromEventTime(this.f922rK));
        arrayList.add(this.f923rL);
        arrayList.add(this.f924rM);
        arrayList.add(this.fieldName);
        arrayList.add(Integer.valueOf(this.f925rN));
        arrayList.add(this.f920iZ);
        arrayList.add(this.f926rO);
        arrayList.add(Float.valueOf(1.0f));
        arrayList.add(0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createInsertStatement(f915ro, f918rt, arrayList, sQLiteDatabase));
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        FieldEventDao fieldEventDao = new FieldEventDao();
        fieldEventDao.f921id = UUID.randomUUID().toString();
        fieldEventDao.f919iL = UUID.randomUUID().toString();
        fieldEventDao.f922rK = this.f922rK;
        fieldEventDao.f923rL = "Here is an original value";
        fieldEventDao.f924rM = "Here is a changed value";
        fieldEventDao.fieldName = "Sample Fieldname";
        fieldEventDao.f925rN = 1;
        fieldEventDao.f920iZ = "Sample error description";
        return fieldEventDao;
    }
}
