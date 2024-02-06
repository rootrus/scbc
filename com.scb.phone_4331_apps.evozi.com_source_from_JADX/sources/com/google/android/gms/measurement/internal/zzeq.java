package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import okhttp3.internal.cache.DiskLruCache;

public final class zzeq extends zzg {
    private final zzet zza = new zzet(this, zzn(), "google_app_measurement_local.db");
    private boolean zzb;

    zzeq(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return false;
    }

    public final void zzab() {
        zzb();
        zzd();
        try {
            int delete = zzae().delete("messages", (String) null, (String[]) null) + 0;
            if (delete > 0) {
                zzr().zzx().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzr().zzf().zza("Error resetting local analytics data. error", e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ce A[SYNTHETIC, Splitter:B:53:0x00ce] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0122 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0122 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0122 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.zzb()
            r16.zzd()
            boolean r0 = r1.zzb
            r2 = 0
            if (r0 == 0) goto L_0x000e
            return r2
        L_0x000e:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = r2
            r6 = r4
        L_0x0027:
            if (r5 >= r4) goto L_0x0135
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.zzae()     // Catch:{ SQLiteFullException -> 0x0106, SQLiteDatabaseLockedException -> 0x00f4, SQLiteException -> 0x00ca, all -> 0x00c7 }
            if (r9 != 0) goto L_0x0039
            r1.zzb = r7     // Catch:{ SQLiteFullException -> 0x00c5, SQLiteDatabaseLockedException -> 0x00f5, SQLiteException -> 0x00c1 }
            if (r9 == 0) goto L_0x0038
            r9.close()
        L_0x0038:
            return r2
        L_0x0039:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c5, SQLiteDatabaseLockedException -> 0x00f5, SQLiteException -> 0x00c1 }
            r10 = 0
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r12 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00c5, SQLiteDatabaseLockedException -> 0x00f5, SQLiteException -> 0x00c1 }
            if (r12 == 0) goto L_0x0050
            boolean r0 = r12.moveToFirst()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            if (r0 == 0) goto L_0x0050
            long r10 = r12.getLong(r2)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
        L_0x0050:
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            java.lang.String r15 = "messages"
            if (r0 < 0) goto L_0x009e
            com.google.android.gms.measurement.internal.zzeu r0 = r16.zzr()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "Data loss, local db full"
            r0.zza(r4)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            long r13 = r13 - r10
            r10 = 1
            long r13 = r13 + r10
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            r0[r2] = r4     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r0 = r9.delete(r15, r4, r0)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            long r10 = (long) r0     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x009e
            com.google.android.gms.measurement.internal.zzeu r0 = r16.zzr()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.String r4 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            java.lang.Long r7 = java.lang.Long.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            long r13 = r13 - r10
            java.lang.Long r10 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            r0.zza(r4, r2, r7, r10)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            goto L_0x009e
        L_0x0098:
            r0 = move-exception
            goto L_0x00b3
        L_0x009a:
            r0 = move-exception
            goto L_0x00b6
        L_0x009c:
            r0 = move-exception
            goto L_0x00ba
        L_0x009e:
            r9.insertOrThrow(r15, r8, r3)     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x009c, SQLiteDatabaseLockedException -> 0x00b8, SQLiteException -> 0x009a, all -> 0x0098 }
            if (r12 == 0) goto L_0x00ac
            r12.close()
        L_0x00ac:
            if (r9 == 0) goto L_0x00b1
            r9.close()
        L_0x00b1:
            r2 = 1
            return r2
        L_0x00b3:
            r8 = r12
            goto L_0x012a
        L_0x00b6:
            r8 = r12
            goto L_0x00c2
        L_0x00b8:
            r8 = r12
            goto L_0x00f5
        L_0x00ba:
            r8 = r12
            goto L_0x0108
        L_0x00bc:
            r0 = move-exception
            r2 = r8
            r8 = r9
            goto L_0x0128
        L_0x00c1:
            r0 = move-exception
        L_0x00c2:
            r2 = r8
            r8 = r9
            goto L_0x00cc
        L_0x00c5:
            r0 = move-exception
            goto L_0x0108
        L_0x00c7:
            r0 = move-exception
            r9 = r8
            goto L_0x012a
        L_0x00ca:
            r0 = move-exception
            r2 = r8
        L_0x00cc:
            if (r8 == 0) goto L_0x00d7
            boolean r4 = r8.inTransaction()     // Catch:{ all -> 0x00f2 }
            if (r4 == 0) goto L_0x00d7
            r8.endTransaction()     // Catch:{ all -> 0x00f2 }
        L_0x00d7:
            com.google.android.gms.measurement.internal.zzeu r4 = r16.zzr()     // Catch:{ all -> 0x00f2 }
            com.google.android.gms.measurement.internal.zzew r4 = r4.zzf()     // Catch:{ all -> 0x00f2 }
            java.lang.String r7 = "Error writing entry to local database"
            r4.zza(r7, r0)     // Catch:{ all -> 0x00f2 }
            r4 = 1
            r1.zzb = r4     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00ec
            r2.close()
        L_0x00ec:
            if (r8 == 0) goto L_0x0122
            r8.close()
            goto L_0x0122
        L_0x00f2:
            r0 = move-exception
            goto L_0x0128
        L_0x00f4:
            r9 = r8
        L_0x00f5:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00bc }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x0100
            r8.close()
        L_0x0100:
            if (r9 == 0) goto L_0x0122
            r9.close()
            goto L_0x0122
        L_0x0106:
            r0 = move-exception
            r9 = r8
        L_0x0108:
            com.google.android.gms.measurement.internal.zzeu r2 = r16.zzr()     // Catch:{ all -> 0x00bc }
            com.google.android.gms.measurement.internal.zzew r2 = r2.zzf()     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.zza(r4, r0)     // Catch:{ all -> 0x00bc }
            r2 = 1
            r1.zzb = r2     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x011d
            r8.close()
        L_0x011d:
            if (r9 == 0) goto L_0x0122
            r9.close()
        L_0x0122:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0027
        L_0x0128:
            r9 = r8
            r8 = r2
        L_0x012a:
            if (r8 == 0) goto L_0x012f
            r8.close()
        L_0x012f:
            if (r9 == 0) goto L_0x0134
            r9.close()
        L_0x0134:
            throw r0
        L_0x0135:
            com.google.android.gms.measurement.internal.zzeu r0 = r16.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzx()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.zza(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzao zzao) {
        Parcel obtain = Parcel.obtain();
        zzao.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzr().zzg().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zzkq zzkq) {
        Parcel obtain = Parcel.obtain();
        zzkq.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzr().zzg().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zza(zzw zzw) {
        zzp();
        byte[] zza2 = zzkr.zza((Parcelable) zzw);
        if (zza2.length <= 131072) {
            return zza(2, zza2);
        }
        zzr().zzg().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:57|58|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:72|73|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|169) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        zzr().zzf().zza("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        zzr().zzf().zza("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        zzr().zzf().zza("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0191, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00a5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x010b */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01b3 A[SYNTHETIC, Splitter:B:118:0x01b3] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0201 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0201 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0201 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.zzd()
            r21.zzb()
            boolean r0 = r1.zzb
            r3 = 0
            if (r0 == 0) goto L_0x0010
            return r3
        L_0x0010:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.zzaf()
            if (r0 != 0) goto L_0x001c
            return r4
        L_0x001c:
            r5 = 5
            r6 = 0
            r8 = r5
            r7 = r6
        L_0x0020:
            if (r7 >= r5) goto L_0x0215
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.zzae()     // Catch:{ SQLiteFullException -> 0x01e7, SQLiteDatabaseLockedException -> 0x01d4, SQLiteException -> 0x01ae, all -> 0x01ab }
            if (r15 != 0) goto L_0x0031
            r1.zzb = r9     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            if (r15 == 0) goto L_0x0030
            r15.close()
        L_0x0030:
            return r3
        L_0x0031:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            long r10 = zza((android.database.sqlite.SQLiteDatabase) r15)     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            r0[r6] = r10     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            java.lang.String r10 = "rowid<?"
            r14 = r0
            r13 = r10
            goto L_0x0053
        L_0x004b:
            r5 = r15
            goto L_0x019f
        L_0x004e:
            r5 = r15
            goto L_0x01a8
        L_0x0051:
            r13 = r3
            r14 = r13
        L_0x0053:
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r11}     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            r0 = 100
            java.lang.String r18 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01a5, SQLiteDatabaseLockedException -> 0x0191, SQLiteException -> 0x019c, all -> 0x0196 }
            java.lang.String r11 = "messages"
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0188, SQLiteDatabaseLockedException -> 0x01a2, SQLiteException -> 0x0186, all -> 0x0183 }
        L_0x0072:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            if (r0 == 0) goto L_0x0148
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            if (r0 != 0) goto L_0x00ba
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00a5 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00a5 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00a5 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzao> r0 = com.google.android.gms.measurement.internal.zzao.CREATOR     // Catch:{ ParseException -> 0x00a5 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00a5 }
            com.google.android.gms.measurement.internal.zzao r0 = (com.google.android.gms.measurement.internal.zzao) r0     // Catch:{ ParseException -> 0x00a5 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            if (r0 == 0) goto L_0x0072
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x00a3:
            r0 = move-exception
            goto L_0x00b6
        L_0x00a5:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = "Failed to load event from local database"
            r0.zza(r12)     // Catch:{ all -> 0x00a3 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x00b6:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
        L_0x00ba:
            if (r0 != r9) goto L_0x00f0
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00d5 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00d5 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00d5 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzkq> r0 = com.google.android.gms.measurement.internal.zzkq.CREATOR     // Catch:{ ParseException -> 0x00d5 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00d5 }
            com.google.android.gms.measurement.internal.zzkq r0 = (com.google.android.gms.measurement.internal.zzkq) r0     // Catch:{ ParseException -> 0x00d5 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x00e6
        L_0x00d3:
            r0 = move-exception
            goto L_0x00ec
        L_0x00d5:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ all -> 0x00d3 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x00d3 }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.zza(r12)     // Catch:{ all -> 0x00d3 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            r0 = r3
        L_0x00e6:
            if (r0 == 0) goto L_0x0072
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x00ec:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
        L_0x00f0:
            if (r0 != r11) goto L_0x0127
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            int r0 = r12.length     // Catch:{ ParseException -> 0x010b }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x010b }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x010b }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzw> r0 = com.google.android.gms.measurement.internal.zzw.CREATOR     // Catch:{ ParseException -> 0x010b }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x010b }
            com.google.android.gms.measurement.internal.zzw r0 = (com.google.android.gms.measurement.internal.zzw) r0     // Catch:{ ParseException -> 0x010b }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x011c
        L_0x0109:
            r0 = move-exception
            goto L_0x0123
        L_0x010b:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ all -> 0x0109 }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ all -> 0x0109 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.zza(r12)     // Catch:{ all -> 0x0109 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            r0 = r3
        L_0x011c:
            if (r0 == 0) goto L_0x0072
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x0123:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            throw r0     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
        L_0x0127:
            r11 = 3
            if (r0 != r11) goto L_0x0139
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            java.lang.String r11 = "Skipping app launch break"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x0139:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            java.lang.String r11 = "Unknown record type in local database"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            goto L_0x0072
        L_0x0148:
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            java.lang.String r11 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            r0[r6] = r11     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            java.lang.String r11 = "messages"
            java.lang.String r12 = "rowid <= ?"
            int r0 = r5.delete(r11, r12, r0)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            if (r0 >= r11) goto L_0x016b
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzf()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
        L_0x016b:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0181, SQLiteDatabaseLockedException -> 0x01a3, SQLiteException -> 0x017f, all -> 0x017c }
            if (r10 == 0) goto L_0x0176
            r10.close()
        L_0x0176:
            if (r5 == 0) goto L_0x017b
            r5.close()
        L_0x017b:
            return r4
        L_0x017c:
            r0 = move-exception
            goto L_0x0209
        L_0x017f:
            r0 = move-exception
            goto L_0x01a0
        L_0x0181:
            r0 = move-exception
            goto L_0x01a9
        L_0x0183:
            r0 = move-exception
            goto L_0x020a
        L_0x0186:
            r0 = move-exception
            goto L_0x019f
        L_0x0188:
            r0 = move-exception
            goto L_0x01a8
        L_0x018a:
            r0 = move-exception
            r5 = r15
            goto L_0x020a
        L_0x018e:
            r0 = move-exception
            r5 = r15
            goto L_0x019f
        L_0x0191:
            r5 = r15
            goto L_0x01a2
        L_0x0193:
            r0 = move-exception
            r5 = r15
            goto L_0x01a8
        L_0x0196:
            r0 = move-exception
            r5 = r15
            r10 = r3
            r3 = r5
            goto L_0x0208
        L_0x019c:
            r0 = move-exception
            goto L_0x004b
        L_0x019f:
            r10 = r3
        L_0x01a0:
            r15 = r5
            goto L_0x01b1
        L_0x01a2:
            r10 = r3
        L_0x01a3:
            r15 = r5
            goto L_0x01d6
        L_0x01a5:
            r0 = move-exception
            goto L_0x004e
        L_0x01a8:
            r10 = r3
        L_0x01a9:
            r15 = r5
            goto L_0x01ea
        L_0x01ab:
            r0 = move-exception
            r5 = r3
            goto L_0x020a
        L_0x01ae:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01b1:
            if (r15 == 0) goto L_0x01bc
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x0206 }
            if (r5 == 0) goto L_0x01bc
            r15.endTransaction()     // Catch:{ all -> 0x0206 }
        L_0x01bc:
            com.google.android.gms.measurement.internal.zzeu r5 = r21.zzr()     // Catch:{ all -> 0x0206 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzf()     // Catch:{ all -> 0x0206 }
            r5.zza(r2, r0)     // Catch:{ all -> 0x0206 }
            r1.zzb = r9     // Catch:{ all -> 0x0206 }
            if (r10 == 0) goto L_0x01ce
            r10.close()
        L_0x01ce:
            if (r15 == 0) goto L_0x0201
            r15.close()
            goto L_0x0201
        L_0x01d4:
            r10 = r3
            r15 = r10
        L_0x01d6:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0206 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01e1
            r10.close()
        L_0x01e1:
            if (r15 == 0) goto L_0x0201
            r15.close()
            goto L_0x0201
        L_0x01e7:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01ea:
            com.google.android.gms.measurement.internal.zzeu r5 = r21.zzr()     // Catch:{ all -> 0x0206 }
            com.google.android.gms.measurement.internal.zzew r5 = r5.zzf()     // Catch:{ all -> 0x0206 }
            r5.zza(r2, r0)     // Catch:{ all -> 0x0206 }
            r1.zzb = r9     // Catch:{ all -> 0x0206 }
            if (r10 == 0) goto L_0x01fc
            r10.close()
        L_0x01fc:
            if (r15 == 0) goto L_0x0201
            r15.close()
        L_0x0201:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x0020
        L_0x0206:
            r0 = move-exception
            r3 = r15
        L_0x0208:
            r5 = r3
        L_0x0209:
            r3 = r10
        L_0x020a:
            if (r3 == 0) goto L_0x020f
            r3.close()
        L_0x020f:
            if (r5 == 0) goto L_0x0214
            r5.close()
        L_0x0214:
            throw r0
        L_0x0215:
            com.google.android.gms.measurement.internal.zzeu r0 = r21.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.zza(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.zza(int):java.util.List");
    }

    public final boolean zzac() {
        return zza(3, new byte[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008a, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzad() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzd()
            r10.zzb()
            boolean r1 = r10.zzb
            r2 = 0
            if (r1 == 0) goto L_0x000e
            return r2
        L_0x000e:
            boolean r1 = r10.zzaf()
            if (r1 != 0) goto L_0x0015
            return r2
        L_0x0015:
            r1 = 5
            r4 = r1
            r3 = r2
        L_0x0018:
            if (r3 >= r1) goto L_0x0093
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzae()     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            if (r5 != 0) goto L_0x002a
            r10.zzb = r6     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            if (r5 == 0) goto L_0x0029
            r5.close()
        L_0x0029:
            return r2
        L_0x002a:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            r7[r2] = r8     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0077, SQLiteDatabaseLockedException -> 0x006b, SQLiteException -> 0x004c }
            if (r5 == 0) goto L_0x0049
            r5.close()
        L_0x0049:
            return r6
        L_0x004a:
            r0 = move-exception
            goto L_0x008d
        L_0x004c:
            r7 = move-exception
            if (r5 == 0) goto L_0x0058
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x0058
            r5.endTransaction()     // Catch:{ all -> 0x004a }
        L_0x0058:
            com.google.android.gms.measurement.internal.zzeu r8 = r10.zzr()     // Catch:{ all -> 0x004a }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ all -> 0x004a }
            r8.zza(r0, r7)     // Catch:{ all -> 0x004a }
            r10.zzb = r6     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x008a
            r5.close()
            goto L_0x008a
        L_0x006b:
            long r6 = (long) r4
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x004a }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x008a
            r5.close()
            goto L_0x008a
        L_0x0077:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzeu r8 = r10.zzr()     // Catch:{ all -> 0x004a }
            com.google.android.gms.measurement.internal.zzew r8 = r8.zzf()     // Catch:{ all -> 0x004a }
            r8.zza(r0, r7)     // Catch:{ all -> 0x004a }
            r10.zzb = r6     // Catch:{ all -> 0x004a }
            if (r5 == 0) goto L_0x008a
            r5.close()
        L_0x008a:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x008d:
            if (r5 == 0) goto L_0x0092
            r5.close()
        L_0x0092:
            throw r0
        L_0x0093:
            com.google.android.gms.measurement.internal.zzeu r0 = r10.zzr()
            com.google.android.gms.measurement.internal.zzew r0 = r0.zzi()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.zza(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzeq.zzad():boolean");
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, (String) null, (String) null, "rowid desc", DiskLruCache.VERSION_1);
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    private final SQLiteDatabase zzae() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    private final boolean zzaf() {
        return zzn().getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    public final /* bridge */ /* synthetic */ zza zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzhc zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzer zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzir zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzii zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzeq zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzjv zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzai zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzes zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzkr zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzfv zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzeu zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzfg zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzy zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzx zzu() {
        return super.zzu();
    }
}
