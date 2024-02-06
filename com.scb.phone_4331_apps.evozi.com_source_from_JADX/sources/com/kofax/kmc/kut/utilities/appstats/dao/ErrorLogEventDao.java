package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ErrorLogEventDao extends AppStatsDao {
    private static final String TAG = ErrorLogEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f895ro = "ErrorLog";

    /* renamed from: rr */
    private static Integer f896rr = null;

    /* renamed from: rs */
    private static Integer f897rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f898rt;
    private int errorCode;

    /* renamed from: iZ */
    private String f899iZ;

    /* renamed from: id */
    private String f900id;

    /* renamed from: oA */
    private String f901oA;

    /* renamed from: rE */
    private long f902rE;

    /* renamed from: rF */
    private String f903rF;

    /* renamed from: rp */
    private String f904rp;

    static {
        ArrayList arrayList = new ArrayList();
        f898rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("ErrorTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("ErrorCode", AppStatsDsFieldType.DS_FIELD_TYPE_INTEGER, AppStatsDbFieldType.DB_FIELD_TYPE_INTEGER, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("Description", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("Recommendation", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f898rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public ErrorLogEventDao() {
        this.f900id = new String();
        this.f904rp = new String();
        this.f902rE = 0;
        this.f901oA = null;
        this.f900id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f900id;
    }

    public void setId(String str) {
        this.f900id = str;
    }

    public String getEnvironmentId() {
        return this.f904rp;
    }

    public void setEnvironmentId(String str) {
        this.f904rp = str;
    }

    public long getErrorTime() {
        return this.f902rE;
    }

    public void setErrorTime(long j) {
        this.f902rE = j;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public String getErrorDescription() {
        return this.f899iZ;
    }

    public void setErrorDescription(String str) {
        this.f899iZ = str;
    }

    public String getErrorRecommendation() {
        return this.f903rF;
    }

    public void setErrorRecommendation(String str) {
        this.f903rF = str;
    }

    public String getSessionKey() {
        return this.f901oA;
    }

    public void setSessionKey(String str) {
        this.f901oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f896rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f896rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f897rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f897rs = num;
        }
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f900id);
        arrayList2.add(this.f904rp);
        arrayList2.add(dateStringFromEventTime(this.f902rE));
        arrayList2.add(Integer.valueOf(this.errorCode));
        arrayList2.add(this.f899iZ);
        arrayList2.add(this.f903rF);
        arrayList2.add(this.f901oA);
        arrayList.add(createInsertStatement(f895ro, f898rt, arrayList2, sQLiteDatabase));
        return arrayList;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f895ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f895ro, f898rt);
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ErrorLogEventDao errorLogEventDao = new ErrorLogEventDao();
        errorLogEventDao.f900id = UUID.randomUUID().toString();
        errorLogEventDao.f904rp = UUID.randomUUID().toString();
        errorLogEventDao.f902rE = this.f902rE;
        errorLogEventDao.errorCode = this.errorCode;
        errorLogEventDao.f899iZ = new String(this.f899iZ.getBytes());
        errorLogEventDao.f903rF = new String(this.f903rF.getBytes());
        return errorLogEventDao;
    }
}
