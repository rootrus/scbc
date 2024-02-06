package com.kofax.kmc.kut.utilities.appstats.dao;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.kofax.kmc.kut.utilities.appstats.AppStatsDsExportHandler;
import com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs;
import com.kofax.kmc.kut.utilities.appstats.dao.AppStatsDao;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldKeyType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDbFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsDsFieldType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsPropertyType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PropertyChangeEventDao extends AppStatsDao implements Cloneable {
    private static final String TAG = PropertyChangeEventDao.class.getSimpleName();

    /* renamed from: ro */
    private static final String f976ro = "PropertyChangeEvent";

    /* renamed from: rr */
    private static Integer f977rr = null;

    /* renamed from: rs */
    private static Integer f978rs = 0;

    /* renamed from: rt */
    private static final List<AppStatsDao.FieldTemplate> f979rt;

    /* renamed from: id */
    private String f980id;

    /* renamed from: oA */
    private String f981oA;

    /* renamed from: rG */
    private String f982rG;

    /* renamed from: rK */
    private long f983rK;

    /* renamed from: sc */
    private AppStatsPropertyType f984sc;

    /* renamed from: sd */
    private String f985sd;

    static {
        ArrayList arrayList = new ArrayList();
        f979rt = arrayList;
        arrayList.add(new AppStatsDao.FieldTemplate("ID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_PRIMARY_KEY));
        f979rt.add(new AppStatsDao.FieldTemplate("InstanceID", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_GUID, AppStatsDbFieldKeyType.DB_FIELD_FOREIGN_KEY));
        f979rt.add(new AppStatsDao.FieldTemplate("EventTime", AppStatsDsFieldType.DS_FIELD_TYPE_DATE, AppStatsDbFieldType.DB_FIELD_TYPE_DATETIME, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f979rt.add(new AppStatsDao.FieldTemplate("PropertyType", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f979rt.add(new AppStatsDao.FieldTemplate("PropertyValue", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
        f979rt.add(new AppStatsDao.FieldTemplate("SessionKey", AppStatsDsFieldType.DS_FIELD_TYPE_STRING, AppStatsDbFieldType.DB_FIELD_TYPE_TEXT, AppStatsDbFieldKeyType.DB_FIELD_NO_KEY));
    }

    public PropertyChangeEventDao() {
        this.f980id = new String();
        this.f982rG = new String();
        this.f983rK = 0;
        this.f985sd = "";
        this.f981oA = null;
        this.f980id = super.generateNewUniqueID();
    }

    public String getId() {
        return this.f980id;
    }

    public void setId(String str) {
        this.f980id = str;
    }

    public String getInstanceId() {
        return this.f982rG;
    }

    public void setInstanceId(String str) {
        this.f982rG = str;
    }

    public long getEventTime() {
        return this.f983rK;
    }

    public void setEventTime(long j) {
        this.f983rK = j;
    }

    public AppStatsPropertyType getPropertyType() {
        return this.f984sc;
    }

    public void setPropertyType(AppStatsPropertyType appStatsPropertyType) {
        this.f984sc = appStatsPropertyType;
    }

    public String getPropertyValue() {
        return this.f985sd;
    }

    public void setPropertyValue(String str) {
        this.f985sd = str;
    }

    public String getSessionKey() {
        return this.f981oA;
    }

    public void setSessionKey(String str) {
        this.f981oA = str;
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSize() {
        Integer num;
        synchronized (this) {
            num = f977rr;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSize(Integer num) {
        synchronized (this) {
            f977rr = num;
        }
    }

    /* access modifiers changed from: protected */
    public Integer getAppStatsDaoObjSizeInstCnt() {
        Integer num;
        synchronized (this) {
            num = f978rs;
        }
        return num;
    }

    /* access modifiers changed from: protected */
    public void setAppStatsDaoObjSizeInstCnt(Integer num) {
        synchronized (this) {
            f978rs = num;
        }
    }

    public static long countRows() {
        return AppStatsSqLiteDs.getInstance().countrows(f976ro);
    }

    public static void export(String str, AppStatsDsExportHandler appStatsDsExportHandler) {
        export(str, appStatsDsExportHandler, f976ro, f979rt);
    }

    public PropertyChangeEventDao clone() {
        return (PropertyChangeEventDao) super.clone();
    }

    public List<SQLiteStatement> getWriteToDbStatements(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f980id);
        arrayList.add(this.f982rG);
        arrayList.add(dateStringFromEventTime(this.f983rK));
        arrayList.add(this.f984sc);
        arrayList.add(this.f985sd);
        arrayList.add(this.f981oA);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(createInsertStatement(f976ro, f979rt, arrayList, sQLiteDatabase));
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public AppStatsDao createDaoSampleSizingObj() {
        PropertyChangeEventDao propertyChangeEventDao = new PropertyChangeEventDao();
        propertyChangeEventDao.f980id = UUID.randomUUID().toString();
        propertyChangeEventDao.f982rG = UUID.randomUUID().toString();
        propertyChangeEventDao.f983rK = this.f983rK;
        propertyChangeEventDao.f984sc = this.f984sc;
        propertyChangeEventDao.f985sd = this.f985sd;
        return propertyChangeEventDao;
    }
}
