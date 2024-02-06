package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsEnvSettings;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EnvironmentEventDao extends AppStatsDao {
    private static final String TAG = EnvironmentEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f879ro = "Environment";

    /* renamed from: rr */
    private static Integer f880rr = null;

    /* renamed from: rs */
    private static Integer f881rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f882rt;

    /* renamed from: id */
    private String f883id;

    /* renamed from: oh */
    private String f884oh;

    /* renamed from: rA */
    private String f885rA;

    /* renamed from: rB */
    private String f886rB;

    /* renamed from: rC */
    private String f887rC;

    /* renamed from: rD */
    private String f888rD;

    /* renamed from: ru */
    private long f889ru;

    /* renamed from: rv */
    private String f890rv;

    /* renamed from: rw */
    private String f891rw;

    /* renamed from: rx */
    private String f892rx;

    /* renamed from: ry */
    private String f893ry;

    /* renamed from: rz */
    private String f894rz;

    static {
        ArrayList arrayList = new ArrayList();
        f882rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("DeviceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("Manufacturer", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("Model", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("Memory", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("OSVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("Language", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("SDKVersion", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("TimeZone", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("Carrier", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f882rt.add(new AppStatsDao.FieldTemplate("OSName", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public EnvironmentEventDao() {
        this.f883id = "";
        this.f889ru = 0;
        this.f884oh = "";
        this.f890rv = "";
        this.f891rw = "";
        this.f892rx = "";
        this.f893ry = "";
        this.f894rz = "";
        this.f885rA = "";
        this.f886rB = "";
        this.f887rC = "";
        this.f888rD = "";
        this.f883id = super.generateNewUniqueID();
    }

    public EnvironmentEventDao(AppStatsEnvSettings appStatsEnvSettings, long j) {
        this.f883id = "";
        this.f889ru = 0;
        this.f884oh = "";
        this.f890rv = "";
        this.f891rw = "";
        this.f892rx = "";
        this.f893ry = "";
        this.f894rz = "";
        this.f885rA = "";
        this.f886rB = "";
        this.f887rC = "";
        this.f888rD = "";
        this.f883id = super.generateNewUniqueID();
        this.f889ru = j;
        this.f884oh = appStatsEnvSettings.getEnvDeviceID(false);
        this.f890rv = appStatsEnvSettings.getEnvManufacturer(false);
        this.f891rw = appStatsEnvSettings.getEnvModel(false);
        this.f892rx = appStatsEnvSettings.getEnvMemorySize(false);
        this.f893ry = appStatsEnvSettings.getEnvOsVersion(false);
        this.f894rz = appStatsEnvSettings.getEnvLanguage(false);
        this.f885rA = appStatsEnvSettings.getEnvSdkVersion(false);
        this.f886rB = appStatsEnvSettings.getEnvTimeZone(false);
        this.f887rC = appStatsEnvSettings.getEnvCarrier(false);
        this.f888rD = appStatsEnvSettings.getEnvOsName(false);
    }

    public String getId() {
        return this.f883id;
    }

    public void setId(String str) {
        this.f883id = str;
    }

    public long getEnvTime() {
        return this.f889ru;
    }

    public void setEnvTime(long j) {
        this.f889ru = j;
    }

    public String getDeviceID() {
        return this.f884oh;
    }

    public void setDeviceID(String str) {
        this.f884oh = str;
    }

    public String getManufacturer() {
        return this.f890rv;
    }

    public void setManufacturer(String str) {
        this.f890rv = str;
    }

    public String getModel() {
        return this.f891rw;
    }

    public void setModel(String str) {
        this.f891rw = str;
    }

    public String getMemory() {
        return this.f892rx;
    }

    public void setMemory(String str) {
        this.f892rx = str;
    }

    public String getOsVersion() {
        return this.f893ry;
    }

    public void setOsVersion(String str) {
        this.f893ry = str;
    }

    public String getLanguage() {
        return this.f894rz;
    }

    public void setLanguage(String str) {
        this.f894rz = str;
    }

    public String getSdkVersion() {
        return this.f885rA;
    }

    public void setSdkVersion(String str) {
        this.f885rA = str;
    }

    public String getTimeZone() {
        return this.f886rB;
    }

    public void setTimeZone(String str) {
        this.f886rB = str;
    }

    public String getCarrier() {
        return this.f887rC;
    }

    public void setCarrier(String str) {
        this.f887rC = str;
    }

    public String getOsName() {
        return this.f888rD;
    }

    public void setOsName(String str) {
        this.f888rD = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f880rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f880rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f881rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f881rs = num;
        }
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.f883id);
        arrayList2.add(this.f884oh);
        arrayList2.add(this.f890rv);
        arrayList2.add(this.f891rw);
        arrayList2.add(this.f892rx);
        arrayList2.add(this.f893ry);
        arrayList2.add(this.f894rz);
        arrayList2.add(this.f885rA);
        arrayList2.add(this.f886rB);
        arrayList2.add(this.f887rC);
        arrayList2.add(this.f888rD);
        arrayList.add(createInsertStatement(f879ro, f882rt, arrayList2, sQLiteDatabase));
        return arrayList;
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f879ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f879ro, f882rt);
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        EnvironmentEventDao environmentEventDao = new EnvironmentEventDao();
        environmentEventDao.f883id = UUID.randomUUID().toString();
        environmentEventDao.f889ru = this.f889ru;
        environmentEventDao.f884oh = UUID.randomUUID().toString();
        environmentEventDao.f890rv = String.valueOf(this.f890rv);
        environmentEventDao.f891rw = String.valueOf(this.f891rw);
        environmentEventDao.f892rx = String.valueOf(this.f892rx);
        environmentEventDao.f893ry = String.valueOf(this.f893ry);
        environmentEventDao.f894rz = String.valueOf(this.f894rz);
        environmentEventDao.f885rA = String.valueOf(this.f885rA);
        environmentEventDao.f886rB = String.valueOf(this.f886rB);
        environmentEventDao.f887rC = String.valueOf(this.f887rC);
        environmentEventDao.f888rD = String.valueOf(this.f888rD);
        return environmentEventDao;
    }
}
