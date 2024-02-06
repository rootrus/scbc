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

public class ImgClassificationEventAltDao extends AppStatsDao implements Cloneable {
    private static final String TAG = ImgClassificationEventAltDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f958ro = "ClassificationEventAlternative";

    /* renamed from: rr */
    private static Integer f959rr = null;

    /* renamed from: rs */
    private static Integer f960rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f961rt;

    /* renamed from: id */
    private String f962id;

    /* renamed from: rW */
    private String f963rW;

    /* renamed from: rX */
    private String f964rX;

    /* renamed from: rY */
    private float f965rY;

    static {
        ArrayList arrayList = new ArrayList();
        f961rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f961rt.add(new AppStatsDao.FieldTemplate("ClassificationEventID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f961rt.add(new AppStatsDao.FieldTemplate("AlternativeResult", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f961rt.add(new AppStatsDao.FieldTemplate("AlternativeConfidence", AppStatsDsFieldType.DS_FIELD_TYPE_FLOAT, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public ImgClassificationEventAltDao() {
        this.f962id = "";
        this.f963rW = "";
        this.f964rX = "";
        this.f965rY = -5000.0f;
        this.f962id = super.generateNewUniqueID();
    }

    public String getID() {
        return this.f962id;
    }

    public void setID(String str) {
        this.f962id = str;
    }

    public String getClassificationEventID() {
        return this.f963rW;
    }

    public void setClassificationEventID(String str) {
        this.f963rW = str;
    }

    public String getAltClassificationResult() {
        return this.f964rX;
    }

    public void setAltClassificationResult(String str) {
        this.f964rX = str;
    }

    public float getAltClassificationConfidence() {
        return this.f965rY;
    }

    public void setAltClassificationConfidence(float f) {
        this.f965rY = f;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f959rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f959rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f960rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f960rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f958ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f958ro, f961rt);
    }

    public ImgClassificationEventAltDao clone() {
        return (ImgClassificationEventAltDao) super.clone();
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f962id);
        arrayList.add(this.f963rW);
        arrayList.add(this.f964rX);
        arrayList.add(Float.valueOf(this.f965rY));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createInsertStatement(f958ro, f961rt, arrayList, sQLiteDatabase));
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ImgClassificationEventAltDao imgClassificationEventAltDao = new ImgClassificationEventAltDao();
        imgClassificationEventAltDao.f962id = UUID.randomUUID().toString();
        imgClassificationEventAltDao.f963rW = UUID.randomUUID().toString();
        imgClassificationEventAltDao.f964rX = new String(this.f964rX.getBytes());
        imgClassificationEventAltDao.f965rY = this.f965rY;
        return imgClassificationEventAltDao;
    }
}
