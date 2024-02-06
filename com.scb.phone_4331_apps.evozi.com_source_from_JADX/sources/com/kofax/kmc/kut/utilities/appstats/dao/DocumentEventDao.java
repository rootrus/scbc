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

public class DocumentEventDao extends AppStatsDao {
    private static final String TAG = DocumentEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f871ro = "Document";

    /* renamed from: rr */
    private static Integer f872rr = null;

    /* renamed from: rs */
    private static Integer f873rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f874rt;
    private String documentType = null;

    /* renamed from: id */
    private String f875id = new String();

    /* renamed from: oA */
    private String f876oA = null;

    /* renamed from: rp */
    private String f877rp = new String();

    /* renamed from: rq */
    private Long f878rq = null;

    static {
        ArrayList arrayList = new ArrayList();
        f874rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f874rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f874rt.add(new AppStatsDao.FieldTemplate("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f874rt.add(new AppStatsDao.FieldTemplate("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f874rt.add(new AppStatsDao.FieldTemplate("DocumentType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public String getId() {
        return this.f875id;
    }

    public void setId(String str) {
        this.f875id = str;
    }

    public String getEnvironmentId() {
        return this.f877rp;
    }

    public void setEnvironmentId(String str) {
        this.f877rp = str;
    }

    public Long getCreationTime() {
        return this.f878rq;
    }

    public void setCreationTime(Long l) {
        this.f878rq = l;
    }

    public String getSessionKey() {
        return this.f876oA;
    }

    public void setSessionKey(String str) {
        this.f876oA = str;
    }

    public String getDocumentType() {
        return this.documentType;
    }

    public void setDocumentType(String str) {
        this.documentType = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f872rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f872rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f873rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f873rs = num;
        }
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f875id);
        arrayList2.add(this.f876oA);
        arrayList2.add(dateStringFromEventTime(this.f878rq.longValue()));
        arrayList2.add(this.f877rp);
        arrayList2.add(this.documentType);
        arrayList.add(createInsertStatement(f871ro, f874rt, arrayList2, sQLiteDatabase));
        return arrayList;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f871ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f871ro, f874rt);
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        DocumentEventDao documentEventDao = new DocumentEventDao();
        documentEventDao.f875id = UUID.randomUUID().toString();
        documentEventDao.f877rp = UUID.randomUUID().toString();
        documentEventDao.f876oA = new String(this.f876oA.getBytes());
        documentEventDao.documentType = new String(this.documentType.getBytes());
        documentEventDao.f878rq = this.f878rq;
        return documentEventDao;
    }
}
