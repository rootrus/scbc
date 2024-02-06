package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

final class zzet extends SQLiteOpenHelper {
    private final /* synthetic */ zzeq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzet(zzeq zzeq, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzeq;
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.zza.zzr().zzf().zza("Opening the local database failed, dropping and recreating it");
            if (!this.zza.zzn().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.zza.zzr().zzf().zza("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.zza.zzr().zzf().zza("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        zzah.zza(this.zza.zzr(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", (String[]) null);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzah.zza(this.zza.zzr(), sQLiteDatabase);
    }
}
