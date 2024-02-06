package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.ken.engines.data.ImageSource;
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

public class ImageDao extends AppStatsDao implements Cloneable {
    private static final String TAG = ImageDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f927ro = "Image";

    /* renamed from: rr */
    private static Integer f928rr = null;

    /* renamed from: rs */
    private static Integer f929rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f930rt;

    /* renamed from: iL */
    private String f931iL = null;

    /* renamed from: id */
    private String f932id = new String();

    /* renamed from: oA */
    private String f933oA = null;

    /* renamed from: rK */
    private long f934rK = 0;

    /* renamed from: rP */
    Long f935rP;

    /* renamed from: rQ */
    private ImageSource f936rQ = null;

    /* renamed from: rp */
    private String f937rp = new String();

    static {
        ArrayList arrayList = new ArrayList();
        f930rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("EnvironmentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("CreationTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("FileSize", AppStatsDsFieldType.DS_FIELD_TYPE_LONG, AppStatsDbFieldType.DB_FIELD_TYPE_FLOAT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("Source", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("DocumentID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("StoragePath", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f930rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        return f928rr;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        f928rr = num;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        return f929rs;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        f929rs = num;
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        String str;
        SQLiteStatement sQLiteStatement;
        if (this.f936rQ == ImageSource.IMAGE) {
            str = f927ro;
        } else if (this.f936rQ == ImageSource.PROCESSOR) {
            str = "ImageProcessor";
        } else {
            str = this.f936rQ == ImageSource.CAPTURE ? "ImageCapture" : null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(this.f932id));
        arrayList.add(String.valueOf(this.f937rp));
        arrayList.add(String.valueOf(dateStringFromEventTime(getEventTime())));
        arrayList.add(this.f935rP);
        if (this.dsOperation != AppStatsDsOpType.APP_STATS_DS_UPDATE) {
            str = String.valueOf(str);
        }
        arrayList.add(str);
        arrayList.add(this.dsOperation == AppStatsDsOpType.APP_STATS_DS_UPDATE ? this.f931iL : String.valueOf(this.f931iL));
        arrayList.add("");
        arrayList.add(String.valueOf(this.f933oA));
        if (this.dsOperation == AppStatsDsOpType.APP_STATS_DS_UPDATE) {
            sQLiteStatement = createUpdateStatement(f927ro, this.f932id, f930rt, arrayList, sQLiteDatabase);
        } else {
            sQLiteStatement = createInsertStatement(f927ro, f930rt, arrayList, sQLiteDatabase);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(sQLiteStatement);
        return arrayList2;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f927ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f927ro, f930rt);
    }

    public long getFileSize() {
        return this.f935rP.longValue();
    }

    public ImageSource getSource() {
        return this.f936rQ;
    }

    public long getEventTime() {
        return this.f934rK;
    }

    public String getDocumentId() {
        return this.f931iL;
    }

    public String getId() {
        return this.f932id;
    }

    public void setFileSize(long j) {
        this.f935rP = Long.valueOf(j);
    }

    public void setId(String str) {
        this.f932id = str;
    }

    public String getEnvironmentId() {
        return this.f937rp;
    }

    public void setEnvironmentId(String str) {
        this.f937rp = str;
    }

    public void setEventTime(long j) {
        this.f934rK = j;
    }

    public void setSource(ImageSource imageSource) {
        this.f936rQ = imageSource;
    }

    public void setDocumentId(String str) {
        this.f931iL = str;
    }

    public String getSessionKey() {
        return this.f933oA;
    }

    public void setSessionKey(String str) {
        this.f933oA = str;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        ImageDao imageDao = new ImageDao();
        imageDao.f932id = UUID.randomUUID().toString();
        imageDao.f937rp = UUID.randomUUID().toString();
        imageDao.f934rK = this.f934rK;
        imageDao.f931iL = this.f931iL;
        imageDao.f935rP = this.f935rP;
        imageDao.f936rQ = this.f936rQ;
        return imageDao;
    }
}
