package com.kofax.kmc.kut.utilities.appstats;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.kofax.kmc.kut.utilities.AppContextProvider;

public class AppStatsSqLiteDs extends AppStatsDataStore {
    private static final String TAG = AppStatsSqLiteDs.class.getSimpleName();

    /* renamed from: qa */
    private C7886b f3636qa;

    public void close() {
    }

    public boolean isOpen() {
        return false;
    }

    public void open() {
    }

    public void upgrade(String str) {
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs$a */
    static class C7885a {

        /* renamed from: qb */
        public static final AppStatsSqLiteDs f3637qb = new AppStatsSqLiteDs();

        private C7885a() {
        }
    }

    public static AppStatsSqLiteDs getInstance() {
        return C7885a.f3637qb;
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatsSqLiteDs$b */
    class C7886b extends SQLiteOpenHelper {

        /* renamed from: qc */
        private static final int f3638qc = 310;

        public C7886b(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, f3638qc);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Instance (InstanceID TEXT PRIMARY KEY NOT NULL, EnvironmentID TEXT, CreationTime DATETIME, DismissalTime DATETIME, InstanceType TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Environment (ID TEXT PRIMARY KEY  NOT NULL , DeviceID TEXT, Manufacturer TEXT, Model TEXT, Memory TEXT, OSVersion TEXT, Language TEXT, SDKVersion TEXT, TimeZone TEXT, Carrier TEXT, OSName TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ClassificationEvent (ID TEXT PRIMARY KEY  NOT NULL, InstanceID TEXT, StartTime DATETIME, StopTime DATETIME, ClassificationResult TEXT, ClassificationConfidence FLOAT, ImageID TEXT, DocumentID TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ClassificationEventAlternative (ID TEXT PRIMARY KEY  NOT NULL , ClassificationEventID TEXT, AlternativeResult TEXT, AlternativeConfidence FLOAT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS CaptureEvent (ID TEXT PRIMARY KEY  NOT NULL , InstanceID TEXT, EventTime DATETIME, EventType TEXT, Value INTEGER, ImageID TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS PropertyChangeEvent (ID TEXT PRIMARY KEY  NOT NULL , InstanceID TEXT, EventTime DATETIME, PropertyType TEXT, PropertyValue TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS FieldChangeEvent (ID TEXT PRIMARY KEY  NOT NULL , DocumentID TEXT, EventTime DATETIME,  OriginalValue TEXT,  ChangedValue TEXT, FieldName TEXT, IsValid INTEGER, ErrorDescription TEXT, SessionEventID TEXT, Confidence FLOAT, FormattingFailed INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ErrorLog (ID TEXT PRIMARY KEY  NOT NULL , EnvironmentID TEXT, ErrorTime DATETIME, ErrorCode INTEGER, Description TEXT, Recommendation TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS SessionEvent (ID TEXT PRIMARY KEY  NOT NULL , SessionKey TEXT, Category TEXT, Type TEXT, EventTime DATETIME, EnvironmentID TEXT, Response TEXT, DocumentID TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Document (ID TEXT PRIMARY KEY  NOT NULL , SessionKey TEXT, CreationTime DATETIME, EnvironmentID TEXT, DocumentType TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS Image (ID TEXT PRIMARY KEY  NOT NULL, EnvironmentID TEXT, CreationTime DATETIME, FileSize INTEGER, Source TEXT, DocumentID TEXT, StoragePath TEXT, SessionKey TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ImageProcessorEvent (ID TEXT PRIMARY KEY NOT NULL, InstanceID TEXT, StartTime DATETIME, StopTime DATETIME, ResultCode INTEGER, ProcessingProfile TEXT, SourceImageID TEXT, ProcessedImageID TEXT, SessionKey TEXT)");
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Instance");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Environment");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ClassificationEvent");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ClassificationEventAlternative");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS CaptureEvent");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS PropertyChangeEvent");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS FieldChangeEvent");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ErrorLog");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS SessionEvent");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Document");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Image");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ImageProcessorEvent");
            onCreate(sQLiteDatabase);
        }
    }

    public void open(String str) {
        this.dsFilePathAsFileObj = AppContextProvider.getContext().getDatabasePath(str);
        this.dsFilePath = this.dsFilePathAsFileObj.getAbsolutePath();
        this.f3636qa = new C7886b(AppContextProvider.getContext(), this.dsFilePath);
        countrows("ImageProcessorEvent");
    }

    public void remove() {
        if (this.dsFilePathAsFileObj != null) {
            this.dsFilePathAsFileObj.delete();
        }
    }

    public long countrows(String str) {
        SQLiteDatabase writableDatabase = this.f3636qa.getWritableDatabase();
        if (writableDatabase == null) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT count(*) from ");
        sb.append(str);
        return writableDatabase.compileStatement(sb.toString()).simpleQueryForLong();
    }

    public Object getDsHandle() {
        C7886b bVar = this.f3636qa;
        if (bVar == null) {
            return null;
        }
        return bVar.getWritableDatabase();
    }
}
