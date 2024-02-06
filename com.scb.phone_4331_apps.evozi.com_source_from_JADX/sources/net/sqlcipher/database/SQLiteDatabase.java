package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.os.Debug;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.collect.Maps;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import java.util.zip.ZipInputStream;
import net.sqlcipher.SQLException;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AbstractPartnerLoginActivity;
import p040o.AbstractPartnerLoginActivity_ViewBinding;
import p040o.Keep;
import p040o.TouchPointTermsAndConditionsActivity;
import p040o.TouchPointWebViewActivity_ViewBinding;
import p040o.onCloseClick;

public class SQLiteDatabase extends onCloseClick {

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final String[] f5479x50fd9e4a = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static int MediaSessionCompat$ResultReceiverWrapper = 0;
    private int AlertController$RecycleListView;
    private Throwable AppCompatActivity = null;
    private String AppCompatDelegateImpl$ListMenuDecorView = null;
    Map<String, SQLiteCompiledSql> IconCompatParcelizer = Maps.newHashMap();
    private long Keep = 0;
    public final ReentrantLock MediaBrowserCompat$CustomActionResultReceiver = new ReentrantLock(true);
    public boolean MediaBrowserCompat$ItemReceiver;
    public long MediaBrowserCompat$MediaItem = 0;
    int MediaBrowserCompat$SearchResultReceiver = 250;
    public long MediaDescriptionCompat = 0;
    public String MediaMetadataCompat;
    public Keep.read MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$Token;
    private SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver ParcelableVolumeInfo;
    private String PlaybackStateCompat = null;
    private boolean PlaybackStateCompat$CustomAction = true;
    WeakHashMap<onCloseClick, Object> RatingCompat;
    public int mNativeHandle = 0;
    public int read;
    private String setBackgroundResource = null;
    private final Random setContentView = new Random();
    private int setHasDecor;
    int write;

    private native void dbclose();

    private native void dbopen(String str, int i);

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    private native int native_getDbLookaside();

    private native void native_key(String str) throws SQLException;

    private native void native_key(char[] cArr) throws SQLException;

    private native void native_rawExecSQL(String str);

    private native int native_status(int i, boolean z);

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    /* access modifiers changed from: package-private */
    public native int lastChangeCount();

    /* access modifiers changed from: package-private */
    public native long lastInsertRow();

    /* access modifiers changed from: package-private */
    public native void native_execSQL(String str) throws SQLException;

    /* access modifiers changed from: package-private */
    public native void native_setLocale(String str, int i);

    private static void MediaBrowserCompat$CustomActionResultReceiver(Context context, File file) {
        try {
            File file2 = new File(file, "icu");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(file2, "icudt46l.dat");
            if (!file3.exists()) {
                ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open("icudt46l.zip"));
                zipInputStream.getNextEntry();
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read2 = zipInputStream.read(bArr);
                    if (read2 > 0) {
                        fileOutputStream.write(bArr, 0, read2);
                    } else {
                        zipInputStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    }
                }
            }
        } catch (Exception e) {
            Log.e("Database", "Error copying icu data file", e);
        }
    }

    public static void IconCompatParcelizer(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        System.loadLibrary("stlport_shared");
        System.loadLibrary("sqlcipher_android");
        System.loadLibrary("database_sqlcipher");
        boolean exists = new File("/system/usr/icu/icudt46l.dat").exists();
        if (exists) {
            str = "/system/usr";
        } else {
            str = filesDir.getAbsolutePath();
        }
        setICURoot(str);
        if (!exists) {
            MediaBrowserCompat$CustomActionResultReceiver(context, filesDir);
        }
    }

    static {
        Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    }

    /* access modifiers changed from: package-private */
    public final void MediaDescriptionCompat() {
        StringBuilder sb = new StringBuilder();
        sb.append("Removing corrupt database: ");
        sb.append(this.MediaMetadataCompat);
        Log.e("Database", sb.toString());
        try {
            MediaBrowserCompat$SearchResultReceiver();
        } finally {
            if (!this.MediaMetadataCompat.equalsIgnoreCase(":memory")) {
                new File(this.MediaMetadataCompat).delete();
            }
        }
    }

    public final void RatingCompat() {
        if (this.PlaybackStateCompat$CustomAction) {
            this.MediaBrowserCompat$CustomActionResultReceiver.lock();
            if (SQLiteDebug.write && this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() == 1) {
                this.MediaBrowserCompat$MediaItem = SystemClock.elapsedRealtime();
                this.MediaDescriptionCompat = Debug.threadCpuTimeNanos();
            }
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        if (this.PlaybackStateCompat$CustomAction) {
            if (SQLiteDebug.write && this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() == 1) {
                read();
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.unlock();
        }
    }

    public final void read() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.MediaBrowserCompat$MediaItem;
        int i = (j > 2000 ? 1 : (j == 2000 ? 0 : -1));
        if ((i >= 0 || Log.isLoggable("Database", 2) || elapsedRealtime - this.Keep >= 20000) && j > 300) {
            int threadCpuTimeNanos = (int) ((Debug.threadCpuTimeNanos() - this.MediaDescriptionCompat) / 1000000);
            if (threadCpuTimeNanos > 100 || i > 0) {
                this.Keep = elapsedRealtime;
                StringBuilder sb = new StringBuilder();
                sb.append("lock held on ");
                sb.append(this.MediaMetadataCompat);
                sb.append(" for ");
                sb.append(j);
                sb.append("ms. Thread time was ");
                sb.append(threadCpuTimeNanos);
                sb.append("ms");
                String obj = sb.toString();
                if (SQLiteDebug.MediaBrowserCompat$ItemReceiver) {
                    Log.d("Database", obj, new Exception());
                } else {
                    Log.d("Database", obj);
                }
            }
        }
    }

    private static SQLiteDatabase write(String str, char[] cArr, SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, Keep.read read2) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = new SQLiteDatabase(str, cArr, sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, 268435456);
            if (SQLiteDebug.MediaBrowserCompat$CustomActionResultReceiver) {
                sQLiteDatabase.enableSqlTracing(str);
            }
            if (SQLiteDebug.MediaMetadataCompat) {
                sQLiteDatabase.enableSqlProfiling(str);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Deleting and re-creating corrupt database ");
            sb.append(str);
            Log.e("Database", sb.toString(), e);
            if (!str.equalsIgnoreCase(":memory")) {
                new File(str).delete();
            }
            sQLiteDatabase = new SQLiteDatabase(str, cArr, sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, 268435456);
        }
        SQLiteDatabase$MediaBrowserCompat$ItemReceiver.read().MediaBrowserCompat$ItemReceiver.add(new WeakReference(sQLiteDatabase));
        return sQLiteDatabase;
    }

    public static SQLiteDatabase IconCompatParcelizer(String str, char[] cArr, SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, Keep.read read2) {
        return write(str, cArr, sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, read2);
    }

    public static SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver(String str, char[] cArr, SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver) {
        return write(str, cArr, sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, (Keep.read) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int MediaBrowserCompat$MediaItem() {
        /*
            r3 = this;
            r3.RatingCompat()
            int r0 = r3.mNativeHandle
            if (r0 == 0) goto L_0x0009
            r0 = 1
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            if (r0 == 0) goto L_0x002d
            net.sqlcipher.database.SQLiteStatement r0 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = "PRAGMA user_version;"
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0021 }
            long r1 = r0.MediaDescriptionCompat()     // Catch:{ all -> 0x001f }
            int r1 = (int) r1
            r0.read()
            r3.MediaSessionCompat$ResultReceiverWrapper()
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x0024
        L_0x0021:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.read()
        L_0x0029:
            r3.MediaSessionCompat$ResultReceiverWrapper()
            throw r1
        L_0x002d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "database not open"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.MediaBrowserCompat$MediaItem():int");
    }

    public static String read(String str) {
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(32);
            int indexOf2 = str.indexOf(44);
            if (indexOf > 0 && (indexOf < indexOf2 || indexOf2 < 0)) {
                return str.substring(0, indexOf);
            }
            if (indexOf2 > 0) {
                return (indexOf2 < indexOf || indexOf < 0) ? str.substring(0, indexOf2) : str;
            }
            return str;
        }
        throw new IllegalStateException("Invalid tables");
    }

    private SQLiteStatement write(String str) throws SQLException {
        RatingCompat();
        if (this.mNativeHandle != 0) {
            try {
                return new SQLiteStatement(this, str);
            } finally {
                MediaSessionCompat$ResultReceiverWrapper();
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public final long MediaBrowserCompat$ItemReceiver(String str, ContentValues contentValues) {
        try {
            return MediaBrowserCompat$CustomActionResultReceiver(str, (String) null, contentValues);
        } catch (SQLException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error inserting <redacted values> into ");
            sb.append(str);
            Log.e("Database", sb.toString(), e);
            return -1;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) throws SQLException {
        long uptimeMillis = SystemClock.uptimeMillis();
        RatingCompat();
        if (this.mNativeHandle != 0) {
            IconCompatParcelizer(this.PlaybackStateCompat, uptimeMillis, "GETLOCK:");
            try {
                native_execSQL(str);
                MediaSessionCompat$ResultReceiverWrapper();
                if (str == "COMMIT;") {
                    IconCompatParcelizer(this.PlaybackStateCompat, uptimeMillis, "COMMIT;");
                } else {
                    IconCompatParcelizer(str, uptimeMillis, (String) null);
                }
            } catch (SQLiteDatabaseCorruptException e) {
                MediaDescriptionCompat();
                throw e;
            } catch (Throwable th) {
                MediaSessionCompat$ResultReceiverWrapper();
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    private SQLiteDatabase(String str, char[] cArr, SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        new HashMap();
        if (str != null) {
            this.read = 268435456;
            this.MediaMetadataCompat = str;
            this.AppCompatActivity = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.ParcelableVolumeInfo = sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver;
            this.RatingCompat = new WeakHashMap<>();
            dbopen(this.MediaMetadataCompat, this.read);
            native_key(cArr);
            if (SQLiteDebug.read) {
                this.AppCompatDelegateImpl$ListMenuDecorView = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
            }
            try {
                Locale locale = Locale.getDefault();
                RatingCompat();
                native_setLocale(locale.toString(), this.read);
                MediaSessionCompat$ResultReceiverWrapper();
            } catch (RuntimeException e) {
                Log.e("Database", "Failed to setLocale() when constructing, closing the database", e);
                dbclose();
                if (SQLiteDebug.read) {
                    this.setBackgroundResource = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
                }
                throw e;
            } catch (Throwable th) {
                MediaSessionCompat$ResultReceiverWrapper();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("path should not be null");
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(String str, long j, String str2) {
        this.PlaybackStateCompat = str;
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (uptimeMillis != 0 || str2 != "GETLOCK:") {
            if (MediaSessionCompat$ResultReceiverWrapper == 0) {
                MediaSessionCompat$ResultReceiverWrapper = 500;
            }
            long j2 = (long) MediaSessionCompat$ResultReceiverWrapper;
            if (uptimeMillis >= j2 || this.setContentView.nextInt(100) >= ((int) ((uptimeMillis * 100) / j2)) + 1) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r3 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r4.setHasDecor++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r4.AlertController$RecycleListView++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (net.sqlcipher.database.SQLiteDebug.read == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("|cache_stats|");
        r0.append(r4.MediaMetadataCompat);
        r0.append("|");
        r0.append(r4.IconCompatParcelizer.size());
        r0.append("|");
        r0.append(r4.setHasDecor);
        r0.append("|");
        r0.append(r4.AlertController$RecycleListView);
        r0.append("|");
        r0.append(r3);
        r0.append("|");
        r0.append(r4.AppCompatDelegateImpl$ListMenuDecorView);
        r0.append("|");
        r0.append(r4.setBackgroundResource);
        r0.append("|");
        r0.append(r5);
        android.util.Log.v("Database", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final net.sqlcipher.database.SQLiteCompiledSql MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r4.IconCompatParcelizer
            monitor-enter(r0)
            int r1 = r4.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x0026
            boolean r5 = net.sqlcipher.database.SQLiteDebug.read     // Catch:{ all -> 0x00a5 }
            if (r5 == 0) goto L_0x0023
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "|cache NOT found|"
            r5.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r4.MediaMetadataCompat     // Catch:{ all -> 0x00a5 }
            r5.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "Database"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a5 }
            android.util.Log.v(r1, r5)     // Catch:{ all -> 0x00a5 }
        L_0x0023:
            monitor-exit(r0)
            r5 = 0
            return r5
        L_0x0026:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r4.IconCompatParcelizer     // Catch:{ all -> 0x00a5 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x00a5 }
            net.sqlcipher.database.SQLiteCompiledSql r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1     // Catch:{ all -> 0x00a5 }
            r2 = 1
            if (r1 == 0) goto L_0x0033
            r3 = r2
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            monitor-exit(r0)
            if (r3 == 0) goto L_0x003d
            int r0 = r4.setHasDecor
            int r0 = r0 + r2
            r4.setHasDecor = r0
            goto L_0x0042
        L_0x003d:
            int r0 = r4.AlertController$RecycleListView
            int r0 = r0 + r2
            r4.AlertController$RecycleListView = r0
        L_0x0042:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.read
            if (r0 == 0) goto L_0x00a4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "|cache_stats|"
            r0.append(r2)
            java.lang.String r2 = r4.MediaMetadataCompat
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r2 = r4.IconCompatParcelizer
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            int r2 = r4.setHasDecor
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            int r2 = r4.AlertController$RecycleListView
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "|"
            r0.append(r2)
            java.lang.String r2 = r4.AppCompatDelegateImpl$ListMenuDecorView
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            java.lang.String r2 = r4.setBackgroundResource
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Database"
            android.util.Log.v(r0, r5)
        L_0x00a4:
            return r1
        L_0x00a5:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    private void MediaSessionCompat$QueueItem() {
        synchronized (this.IconCompatParcelizer) {
            for (SQLiteCompiledSql write2 : this.IconCompatParcelizer.values()) {
                write2.write();
            }
            this.IconCompatParcelizer.clear();
        }
        for (Map.Entry<onCloseClick, Object> key : this.RatingCompat.entrySet()) {
            onCloseClick oncloseclick = (onCloseClick) key.getKey();
            if (oncloseclick != null) {
                oncloseclick.write();
            }
        }
    }

    public static SQLiteDatabase write(char[] cArr) {
        return write(":memory:", cArr, (SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver) null, (Keep.read) null);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        boolean z = true;
        if (this.mNativeHandle != 0) {
            RatingCompat();
            try {
                MediaSessionCompat$QueueItem();
                if (this.mNativeHandle == 0) {
                    z = false;
                }
                if (z) {
                    if (SQLiteDebug.read) {
                        this.setBackgroundResource = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
                    }
                    dbclose();
                }
            } finally {
                MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }

    public final void MediaMetadataCompat() {
        if (!(this.mNativeHandle != 0)) {
            throw new IllegalStateException("database not open");
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.isHeldByCurrentThread()) {
            try {
                if (this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver = false;
                } else {
                    this.MediaSessionCompat$Token = false;
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() != 1) {
                    this.MediaSessionCompat$QueueItem = null;
                    if (SQLiteDebug.write && this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() == 1) {
                        read();
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver.unlock();
                    return;
                }
                if (this.MediaSessionCompat$Token) {
                    MediaBrowserCompat$ItemReceiver("COMMIT;");
                } else {
                    MediaBrowserCompat$ItemReceiver("ROLLBACK;");
                }
                this.MediaSessionCompat$QueueItem = null;
                if (SQLiteDebug.write && this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() == 1) {
                    read();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.unlock();
            } catch (SQLException unused) {
                Log.d("Database", "exception during rollback, maybe the DB previously performed an auto-rollback");
            } catch (Throwable th) {
                this.MediaSessionCompat$QueueItem = null;
                if (SQLiteDebug.write && this.MediaBrowserCompat$CustomActionResultReceiver.getHoldCount() == 1) {
                    read();
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.unlock();
                throw th;
            }
        } else {
            throw new IllegalStateException("no transaction pending");
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        boolean z = true;
        if (this.mNativeHandle != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("close() was never explicitly called on database '");
            sb.append(this.MediaMetadataCompat);
            sb.append("' ");
            Log.e("Database", sb.toString(), this.AppCompatActivity);
            MediaSessionCompat$QueueItem();
            if (this.mNativeHandle == 0) {
                z = false;
            }
            if (z) {
                if (SQLiteDebug.read) {
                    this.setBackgroundResource = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
                }
                dbclose();
            }
        }
    }

    private long MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, ContentValues contentValues) {
        Set<Map.Entry<String, Object>> set;
        int i = 0;
        if (this.mNativeHandle != 0) {
            StringBuilder sb = new StringBuilder(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
            sb.append("INSERT");
            sb.append(f5479x50fd9e4a[0]);
            sb.append(" INTO ");
            sb.append(str);
            StringBuilder sb2 = new StringBuilder(40);
            SQLiteStatement sQLiteStatement = null;
            if (contentValues == null || contentValues.size() <= 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("(");
                sb3.append((String) null);
                sb3.append(") ");
                sb.append(sb3.toString());
                sb2.append("NULL");
                set = null;
            } else {
                set = contentValues.valueSet();
                sb.append('(');
                boolean z = false;
                for (Map.Entry<String, Object> key : set) {
                    if (z) {
                        sb.append(", ");
                        sb2.append(", ");
                    }
                    sb.append((String) key.getKey());
                    sb2.append('?');
                    z = true;
                }
                sb.append(')');
            }
            sb.append(" VALUES(");
            sb.append(sb2);
            sb.append(");");
            RatingCompat();
            try {
                sQLiteStatement = write(sb.toString());
                if (set != null) {
                    int size = set.size();
                    Iterator<Map.Entry<String, Object>> it = set.iterator();
                    while (i < size) {
                        i++;
                        AbstractPartnerLoginActivity.MediaBrowserCompat$ItemReceiver((SQLiteProgram) sQLiteStatement, i, it.next().getValue());
                    }
                }
                sQLiteStatement.MediaBrowserCompat$SearchResultReceiver();
                long lastInsertRow = lastInsertRow();
                if (lastInsertRow == -1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Error inserting <redacted values> using <redacted sql> into ");
                    sb4.append(str);
                    Log.e("Database", sb4.toString());
                } else if (Log.isLoggable("Database", 2)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Inserting row ");
                    sb5.append(lastInsertRow);
                    sb5.append(" from <redacted values> using <redacted sql> into ");
                    sb5.append(str);
                    Log.v("Database", sb5.toString());
                }
                sQLiteStatement.read();
                MediaSessionCompat$ResultReceiverWrapper();
                return lastInsertRow;
            } catch (SQLiteDatabaseCorruptException e) {
                MediaDescriptionCompat();
                throw e;
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.read();
                }
                MediaSessionCompat$ResultReceiverWrapper();
                throw th;
            }
        } else {
            throw new IllegalStateException("database not open");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.mNativeHandle != 0) {
            if (SQLiteDebug.read) {
                this.setBackgroundResource = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ").format(Long.valueOf(System.currentTimeMillis()));
            }
            dbclose();
        }
    }

    public final TouchPointTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver(SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, String str, String[] strArr, String str2) {
        if (this.mNativeHandle != 0) {
            return new TouchPointWebViewActivity_ViewBinding(new AbstractPartnerLoginActivity_ViewBinding(this, str, str2).read(this.ParcelableVolumeInfo, (String[]) null));
        }
        throw new IllegalStateException("database not open");
    }
}
