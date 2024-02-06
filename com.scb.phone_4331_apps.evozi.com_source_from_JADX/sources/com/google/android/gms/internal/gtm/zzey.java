package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DefaultClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

final class zzey implements zzem {
    /* access modifiers changed from: private */
    public static final String zzaog = String.format("CREATE TABLE IF NOT EXISTS %s ('%s' TEXT UNIQUE);", new Object[]{"gtm_hit_unique_ids", "hit_unique_id"});
    /* access modifiers changed from: private */
    public static final String zzaoh = String.format("CREATE TRIGGER IF NOT EXISTS %s DELETE ON %s FOR EACH ROW WHEN OLD.%s NOTNULL BEGIN     INSERT OR IGNORE INTO %s (%s) VALUES (OLD.%s); END;", new Object[]{"save_unique_on_delete", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    /* access modifiers changed from: private */
    public static final String zzaoi = String.format("CREATE TRIGGER IF NOT EXISTS %s BEFORE INSERT ON %s FOR EACH ROW WHEN NEW.%s NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM %s WHERE %s = NEW.%s); END;", new Object[]{"check_unique_on_insert", "gtm_hits", "hit_unique_id", "gtm_hit_unique_ids", "hit_unique_id", "hit_unique_id"});
    /* access modifiers changed from: private */
    public static final String zzxj = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT UNIQUE, '%s' TEXT, '%s' TEXT);", new Object[]{"gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time", "hit_method", "hit_unique_id", "hit_headers", "hit_body"});
    /* access modifiers changed from: private */
    public final String zzaih;
    private long zzaii;
    private final int zzaij;
    private final zzfa zzaoj;
    private volatile zzed zzaok;
    private final zzen zzaol;
    /* access modifiers changed from: private */
    public final Context zzrm;
    /* access modifiers changed from: private */
    public Clock zzsd;

    zzey(zzen zzen, Context context) {
        this(zzen, context, "gtm_urls.db", CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
    }

    private zzey(zzen zzen, Context context, String str, int i) {
        this.zzrm = context.getApplicationContext();
        this.zzaih = str;
        this.zzaol = zzen;
        this.zzsd = DefaultClock.getInstance();
        this.zzaoj = new zzfa(this, this.zzrm, this.zzaih);
        this.zzaok = new zzfu(this.zzrm, new zzez(this));
        this.zzaii = 0;
        this.zzaij = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
    }

    public final void zza(long j, String str, String str2, String str3, Map<String, String> map, String str4) {
        String str5;
        String str6 = str;
        Map<String, String> map2 = map;
        long currentTimeMillis = this.zzsd.currentTimeMillis();
        if (currentTimeMillis > this.zzaii + 86400000) {
            this.zzaii = currentTimeMillis;
            SQLiteDatabase zzau = zzau("Error opening database for deleteStaleHits.");
            if (zzau != null) {
                int delete = zzau.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzsd.currentTimeMillis() - 2592000000L)});
                StringBuilder sb = new StringBuilder(31);
                sb.append("Removed ");
                sb.append(delete);
                sb.append(" stale hits.");
                zzev.zzab(sb.toString());
                this.zzaol.zze(zzbv("gtm_hits") == 0);
            }
        }
        int zzbv = (zzbv("gtm_hits") - this.zzaij) + 1;
        if (zzbv > 0) {
            List<String> zzz = zzz(zzbv);
            int size = zzz.size();
            StringBuilder sb2 = new StringBuilder(51);
            sb2.append("Store full, deleting ");
            sb2.append(size);
            sb2.append(" hits to make room.");
            zzev.zzab(sb2.toString());
            zza((String[]) zzz.toArray(new String[0]));
        }
        SQLiteDatabase zzau2 = zzau("Error opening database for putHit");
        if (zzau2 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_time", Long.valueOf(j));
            contentValues.put("hit_url", str);
            contentValues.put("hit_first_send_time", 0);
            contentValues.put("hit_method", str2 == null ? "GET" : str2);
            contentValues.put("hit_unique_id", str3);
            if (map2 == null) {
                str5 = null;
            } else {
                str5 = new JSONObject(map2).toString();
            }
            contentValues.put("hit_headers", str5);
            contentValues.put("hit_body", str4);
            try {
                zzau2.insertOrThrow("gtm_hits", (String) null, contentValues);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 19);
                sb3.append("Hit stored (url = ");
                sb3.append(str);
                sb3.append(")");
                zzev.zzab(sb3.toString());
                this.zzaol.zze(false);
            } catch (SQLiteConstraintException unused) {
                String valueOf = String.valueOf(str);
                zzev.zzab(valueOf.length() != 0 ? "Hit has already been sent: ".concat(valueOf) : new String("Hit has already been sent: "));
            } catch (SQLiteException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                zzev.zzac(valueOf2.length() != 0 ? "Error storing hit: ".concat(valueOf2) : new String("Error storing hit: "));
            }
        }
        if (zzfd.zzkr().isPreview()) {
            zzev.zzab("Sending hits immediately under preview.");
            dispatch();
        }
    }

    private final List<String> zzz(int i) {
        ArrayList arrayList = new ArrayList();
        if (i <= 0) {
            zzev.zzac("Invalid maxHits specified. Skipping");
            return arrayList;
        }
        SQLiteDatabase zzau = zzau("Error opening database for peekHitIds.");
        if (zzau == null) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            Cursor query = zzau.query("gtm_hits", new String[]{"hit_id"}, (String) null, (String[]) null, (String) null, (String) null, String.format("%s ASC", new Object[]{"hit_id"}), Integer.toString(i));
            if (query.moveToFirst()) {
                do {
                    arrayList.add(String.valueOf(query.getLong(0)));
                } while (query.moveToNext());
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzev.zzac(valueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf) : new String("Error in peekHits fetching hitIds: "));
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c6, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01cb, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01e7 A[SYNTHETIC, Splitter:B:100:0x01e7] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ec A[Catch:{ all -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017e A[SYNTHETIC, Splitter:B:68:0x017e] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0183 A[Catch:{ all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019a A[Catch:{ all -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c5 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x003a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.google.android.gms.internal.gtm.zzeh> zzaa(int r25) {
        /*
            r24 = this;
            java.lang.String r0 = "%s ASC"
            java.lang.String r1 = "hit_id"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r3 = "Error opening database for peekHits"
            r4 = r24
            android.database.sqlite.SQLiteDatabase r3 = r4.zzau(r3)
            if (r3 != 0) goto L_0x0014
            return r2
        L_0x0014:
            java.lang.String r5 = "hit_time"
            java.lang.String r6 = "hit_first_send_time"
            java.lang.String[] r7 = new java.lang.String[]{r1, r5, r6}     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            r15 = 1
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            r13 = 0
            r5[r13] = r1     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            java.lang.String r12 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            r16 = 40
            java.lang.String r17 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            java.lang.String r6 = "gtm_hits"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r3
            r14 = r13
            r13 = r17
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x01d2, all -> 0x01d0 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x01cb, all -> 0x01c5 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x01cb, all -> 0x01c5 }
            boolean r2 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x01c0, all -> 0x01c5 }
            r11 = 2
            if (r2 == 0) goto L_0x006c
        L_0x0046:
            com.google.android.gms.internal.gtm.zzeh r2 = new com.google.android.gms.internal.gtm.zzeh     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r18 = r13.getLong(r14)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r20 = r13.getLong(r15)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            long r22 = r13.getLong(r11)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            r17 = r2
            r17.<init>(r18, r20, r22)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            r12.add(r2)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            boolean r2 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0063 }
            if (r2 != 0) goto L_0x0046
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            r14 = r13
            goto L_0x01fb
        L_0x0067:
            r0 = move-exception
            r2 = r12
            r14 = r13
            goto L_0x01d7
        L_0x006c:
            if (r13 == 0) goto L_0x0071
            r13.close()
        L_0x0071:
            java.lang.String r2 = "hit_url"
            java.lang.String r5 = "hit_method"
            java.lang.String r6 = "hit_headers"
            java.lang.String r7 = "hit_body"
            java.lang.String[] r7 = new java.lang.String[]{r1, r2, r5, r6, r7}     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            r2[r14] = r1     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.String r1 = java.lang.Integer.toString(r16)     // Catch:{ SQLiteException -> 0x0164, all -> 0x0160 }
            java.lang.String r6 = "gtm_hits"
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = 0
            r5 = r3
            r3 = r11
            r11 = r2
            r2 = r12
            r12 = r0
            r16 = r13
            r13 = r1
            android.database.Cursor r13 = r5.query(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ SQLiteException -> 0x015e, all -> 0x015c }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x015a }
            if (r0 == 0) goto L_0x0154
            r1 = r14
        L_0x00a2:
            r0 = r13
            android.database.sqlite.SQLiteCursor r0 = (android.database.sqlite.SQLiteCursor) r0     // Catch:{ SQLiteException -> 0x015a }
            android.database.CursorWindow r0 = r0.getWindow()     // Catch:{ SQLiteException -> 0x015a }
            int r0 = r0.getNumRows()     // Catch:{ SQLiteException -> 0x015a }
            if (r0 <= 0) goto L_0x0131
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r0 = (com.google.android.gms.internal.gtm.zzeh) r0     // Catch:{ SQLiteException -> 0x015a }
            java.lang.String r5 = r13.getString(r15)     // Catch:{ SQLiteException -> 0x015a }
            r0.zzbc(r5)     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r0 = (com.google.android.gms.internal.gtm.zzeh) r0     // Catch:{ SQLiteException -> 0x015a }
            java.lang.String r5 = r13.getString(r3)     // Catch:{ SQLiteException -> 0x015a }
            r0.zzbt(r5)     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r0 = (com.google.android.gms.internal.gtm.zzeh) r0     // Catch:{ SQLiteException -> 0x015a }
            r5 = 4
            java.lang.String r5 = r13.getString(r5)     // Catch:{ SQLiteException -> 0x015a }
            r0.zzbu(r5)     // Catch:{ SQLiteException -> 0x015a }
            r0 = 3
            java.lang.String r0 = r13.getString(r0)     // Catch:{ JSONException -> 0x010e }
            if (r0 == 0) goto L_0x0103
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x010e }
            r5.<init>(r0)     // Catch:{ JSONException -> 0x010e }
            org.json.JSONArray r0 = r5.names()     // Catch:{ JSONException -> 0x010e }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ JSONException -> 0x010e }
            r6.<init>()     // Catch:{ JSONException -> 0x010e }
            r7 = r14
        L_0x00ed:
            int r8 = r0.length()     // Catch:{ JSONException -> 0x010e }
            if (r7 >= r8) goto L_0x0104
            java.lang.String r8 = r0.getString(r7)     // Catch:{ JSONException -> 0x010e }
            java.lang.Object r9 = r5.opt(r8)     // Catch:{ JSONException -> 0x010e }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ JSONException -> 0x010e }
            r6.put(r8, r9)     // Catch:{ JSONException -> 0x010e }
            int r7 = r7 + 1
            goto L_0x00ed
        L_0x0103:
            r6 = 0
        L_0x0104:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r0 = (com.google.android.gms.internal.gtm.zzeh) r0     // Catch:{ SQLiteException -> 0x015a }
            r0.zzg(r6)     // Catch:{ SQLiteException -> 0x015a }
            goto L_0x014c
        L_0x010e:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Object r6 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r6 = (com.google.android.gms.internal.gtm.zzeh) r6     // Catch:{ SQLiteException -> 0x015a }
            long r6 = r6.zzih()     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ SQLiteException -> 0x015a }
            r5[r14] = r6     // Catch:{ SQLiteException -> 0x015a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SQLiteException -> 0x015a }
            r5[r15] = r0     // Catch:{ SQLiteException -> 0x015a }
            java.lang.String r0 = "Failed to read headers for hitId %d: %s"
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ SQLiteException -> 0x015a }
            goto L_0x014e
        L_0x0131:
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Object r5 = r2.get(r1)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzeh r5 = (com.google.android.gms.internal.gtm.zzeh) r5     // Catch:{ SQLiteException -> 0x015a }
            long r5 = r5.zzih()     // Catch:{ SQLiteException -> 0x015a }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteException -> 0x015a }
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x015a }
            java.lang.String r5 = "HitString for hitId %d too large. Hit will be deleted."
            java.lang.String r0 = java.lang.String.format(r5, r0)     // Catch:{ SQLiteException -> 0x015a }
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ SQLiteException -> 0x015a }
        L_0x014c:
            int r1 = r1 + 1
        L_0x014e:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x015a }
            if (r0 != 0) goto L_0x00a2
        L_0x0154:
            if (r13 == 0) goto L_0x0159
            r13.close()
        L_0x0159:
            return r2
        L_0x015a:
            r0 = move-exception
            goto L_0x016e
        L_0x015c:
            r0 = move-exception
            goto L_0x0169
        L_0x015e:
            r0 = move-exception
            goto L_0x016c
        L_0x0160:
            r0 = move-exception
            r16 = r13
            goto L_0x0169
        L_0x0164:
            r0 = move-exception
            r2 = r12
            r16 = r13
            goto L_0x016c
        L_0x0169:
            r13 = r16
            goto L_0x01ba
        L_0x016c:
            r13 = r16
        L_0x016e:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01b9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b9 }
            int r1 = r0.length()     // Catch:{ all -> 0x01b9 }
            java.lang.String r3 = "Error in peekHits fetching hit url: "
            if (r1 == 0) goto L_0x0183
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x01b9 }
            goto L_0x0188
        L_0x0183:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01b9 }
            r0.<init>(r3)     // Catch:{ all -> 0x01b9 }
        L_0x0188:
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x01b9 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01b9 }
            r0.<init>()     // Catch:{ all -> 0x01b9 }
            r12 = r2
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x01b9 }
            int r1 = r12.size()     // Catch:{ all -> 0x01b9 }
            r2 = r14
        L_0x0198:
            if (r14 >= r1) goto L_0x01b3
            java.lang.Object r3 = r12.get(r14)     // Catch:{ all -> 0x01b9 }
            int r14 = r14 + 1
            com.google.android.gms.internal.gtm.zzeh r3 = (com.google.android.gms.internal.gtm.zzeh) r3     // Catch:{ all -> 0x01b9 }
            java.lang.String r5 = r3.zzij()     // Catch:{ all -> 0x01b9 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x01b9 }
            if (r5 == 0) goto L_0x01af
            if (r2 != 0) goto L_0x01b3
            r2 = r15
        L_0x01af:
            r0.add(r3)     // Catch:{ all -> 0x01b9 }
            goto L_0x0198
        L_0x01b3:
            if (r13 == 0) goto L_0x01b8
            r13.close()
        L_0x01b8:
            return r0
        L_0x01b9:
            r0 = move-exception
        L_0x01ba:
            if (r13 == 0) goto L_0x01bf
            r13.close()
        L_0x01bf:
            throw r0
        L_0x01c0:
            r0 = move-exception
            r2 = r12
        L_0x01c2:
            r16 = r13
            goto L_0x01cd
        L_0x01c5:
            r0 = move-exception
            r16 = r13
            r14 = r16
            goto L_0x01fb
        L_0x01cb:
            r0 = move-exception
            goto L_0x01c2
        L_0x01cd:
            r14 = r16
            goto L_0x01d7
        L_0x01d0:
            r0 = move-exception
            goto L_0x01d4
        L_0x01d2:
            r0 = move-exception
            goto L_0x01d6
        L_0x01d4:
            r14 = 0
            goto L_0x01fb
        L_0x01d6:
            r14 = 0
        L_0x01d7:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01fa }
            int r1 = r0.length()     // Catch:{ all -> 0x01fa }
            java.lang.String r3 = "Error in peekHits fetching hitIds: "
            if (r1 == 0) goto L_0x01ec
            java.lang.String r0 = r3.concat(r0)     // Catch:{ all -> 0x01fa }
            goto L_0x01f1
        L_0x01ec:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01fa }
            r0.<init>(r3)     // Catch:{ all -> 0x01fa }
        L_0x01f1:
            com.google.android.gms.internal.gtm.zzev.zzac(r0)     // Catch:{ all -> 0x01fa }
            if (r14 == 0) goto L_0x01f9
            r14.close()
        L_0x01f9:
            return r2
        L_0x01fa:
            r0 = move-exception
        L_0x01fb:
            if (r14 == 0) goto L_0x0200
            r14.close()
        L_0x0200:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzey.zzaa(int):java.util.List");
    }

    private final void zza(String[] strArr) {
        SQLiteDatabase zzau;
        if (strArr != null && strArr.length != 0 && (zzau = zzau("Error opening database for deleteHits.")) != null) {
            boolean z = true;
            try {
                zzau.delete("gtm_hits", String.format("HIT_ID in (%s)", new Object[]{TextUtils.join(",", Collections.nCopies(strArr.length, "?"))}), strArr);
                zzen zzen = this.zzaol;
                if (zzbv("gtm_hits") != 0) {
                    z = false;
                }
                zzen.zze(z);
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e.getMessage());
                zzev.zzac(valueOf.length() != 0 ? "Error deleting hits: ".concat(valueOf) : new String("Error deleting hits: "));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zze(long j) {
        zza(new String[]{String.valueOf(j)});
    }

    /* access modifiers changed from: private */
    public final void zzb(long j, long j2) {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        if (zzau != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("hit_first_send_time", Long.valueOf(j2));
            try {
                zzau.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j)});
            } catch (SQLiteException e) {
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 70);
                sb.append("Error setting HIT_FIRST_DISPATCH_TIME for hitId ");
                sb.append(j);
                sb.append(": ");
                sb.append(message);
                zzev.zzac(sb.toString());
                zze(j);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String[], android.database.Cursor] */
    private final int zzbv(String str) {
        SQLiteDatabase zzau = zzau("Error opening database for getNumRecords.");
        int i = 0;
        if (zzau == null) {
            return 0;
        }
        ? r2 = 0;
        try {
            String valueOf = String.valueOf(str);
            Cursor rawQuery = zzau.rawQuery(valueOf.length() != 0 ? "SELECT COUNT(*) from ".concat(valueOf) : new String("SELECT COUNT(*) from "), r2);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
        } catch (SQLiteException e) {
            String valueOf2 = String.valueOf(e.getMessage());
            zzev.zzac(valueOf2.length() != 0 ? "Error getting numStoredRecords: ".concat(valueOf2) : new String("Error getting numStoredRecords: "));
            if (r2 != 0) {
                r2.close();
            }
        } catch (Throwable th) {
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        return i;
    }

    private final int zziw() {
        SQLiteDatabase zzau = zzau("Error opening database for getNumStoredHits.");
        int i = 0;
        if (zzau == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            Cursor query = zzau.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", (String[]) null, (String) null, (String) null, (String) null);
            i = query.getCount();
            if (query != null) {
                query.close();
            }
        } catch (SQLiteException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzev.zzac(valueOf.length() != 0 ? "Error getting num untried hits: ".concat(valueOf) : new String("Error getting num untried hits: "));
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return i;
    }

    public final void dispatch() {
        zzev.zzab("GTM Dispatch running...");
        if (this.zzaok.zzhy()) {
            List<zzeh> zzaa = zzaa(40);
            if (zzaa.isEmpty()) {
                zzev.zzab("...nothing to dispatch");
                this.zzaol.zze(true);
                return;
            }
            this.zzaok.zzd(zzaa);
            if (zziw() > 0) {
                zzfo.zzkv().dispatch();
            }
        }
    }

    private final SQLiteDatabase zzau(String str) {
        try {
            return this.zzaoj.getWritableDatabase();
        } catch (SQLiteException e) {
            Context context = this.zzrm;
            zzev.zzb(str, e);
            if (CrashUtils.addDynamiteErrorToDropBox(context, e)) {
                zzev.zzab("Crash reported successfully.");
                return null;
            }
            zzev.zzab("Failed to report crash");
            return null;
        }
    }
}
