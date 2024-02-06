package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.C8007g;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class SessEventDao extends AppStatsDao {
    private static final String TAG = SessEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f986ro = "SessionEvent";

    /* renamed from: rr */
    private static Integer f987rr = null;

    /* renamed from: rs */
    private static Integer f988rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f989rt;
    private String category;

    /* renamed from: id */
    private String f990id;

    /* renamed from: oA */
    private String f991oA;
    private String response;

    /* renamed from: rp */
    private String f992rp;

    /* renamed from: se */
    private Long f993se;
    private String type;

    static {
        ArrayList arrayList = new ArrayList();
        f989rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("Category", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate(C8007g.f3800JN, AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("Response", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f989rt.add(new AppStatsDao.FieldTemplate("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
    }

    public SessEventDao() {
        this.f990id = new String();
        this.f992rp = new String();
        this.f991oA = null;
        this.category = "";
        this.f993se = null;
        this.f990id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f990id;
    }

    public void setId(String str) {
        this.f990id = str;
    }

    public String getEnvironmentId() {
        return this.f992rp;
    }

    public void setEnvironmentId(String str) {
        this.f992rp = str;
    }

    public String getSessionKey() {
        return this.f991oA;
    }

    public void setSessionKey(String str) {
        this.f991oA = str;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Long getEventTime() {
        return this.f993se;
    }

    public void setEventTime(Long l) {
        this.f993se = l;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String str) {
        this.response = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f987rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f987rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f988rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f988rs = num;
        }
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f990id);
        arrayList.add(this.f992rp);
        arrayList.add(this.f991oA);
        arrayList.add(this.category);
        arrayList.add(this.type);
        arrayList.add(dateStringFromEventTime(this.f993se.longValue()));
        arrayList.add(this.response);
        arrayList.add("");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createInsertStatement(f986ro, f989rt, arrayList, sQLiteDatabase));
        return arrayList2;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f986ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f986ro, f989rt);
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        SessEventDao sessEventDao = new SessEventDao();
        sessEventDao.f990id = UUID.randomUUID().toString();
        sessEventDao.f992rp = UUID.randomUUID().toString();
        sessEventDao.f991oA = new String(this.f991oA.getBytes());
        sessEventDao.f993se = this.f993se;
        sessEventDao.type = new String(this.type.getBytes());
        sessEventDao.response = new String(this.response.getBytes());
        return sessEventDao;
    }
}
