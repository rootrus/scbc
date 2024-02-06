package p040o;

import android.content.Context;
import android.util.Log;
import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver;
import net.sqlcipher.database.SQLiteException;
import p040o.Keep;

/* renamed from: o.PartnerBillPaymentInputActivity */
public abstract class PartnerBillPaymentInputActivity {
    private static final String MediaBrowserCompat$ItemReceiver = PartnerBillPaymentInputActivity.class.getSimpleName();
    private final SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final Keep.read MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final String RatingCompat;
    private final Context read;
    public SQLiteDatabase write;

    public abstract void IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, int i, int i2);

    public abstract void read(SQLiteDatabase sQLiteDatabase);

    public PartnerBillPaymentInputActivity(Context context, String str) {
        this(context, str, (SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver) null, 1);
    }

    private PartnerBillPaymentInputActivity(Context context, String str, SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver sQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.read = context;
        this.RatingCompat = str;
        this.IconCompatParcelizer = null;
        this.MediaMetadataCompat = 1;
        this.MediaDescriptionCompat = null;
    }

    public final SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver(String str) {
        SQLiteDatabase write2;
        synchronized (this) {
            write2 = write(str.toCharArray());
        }
        return write2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x0136 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private net.sqlcipher.database.SQLiteDatabase write(char[] r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            int r0 = r0.mNativeHandle     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 == 0) goto L_0x0022
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            int r0 = r0.read     // Catch:{ all -> 0x015e }
            r0 = r0 & r2
            if (r0 == r2) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            if (r0 != 0) goto L_0x0022
            net.sqlcipher.database.SQLiteDatabase r8 = r7.write     // Catch:{ all -> 0x015e }
            monitor-exit(r7)
            return r8
        L_0x0022:
            boolean r0 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x015e }
            if (r0 != 0) goto L_0x0156
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x002f
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            r0.RatingCompat()     // Catch:{ all -> 0x015e }
        L_0x002f:
            r0 = 0
            r7.MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r7.RatingCompat     // Catch:{ all -> 0x0144 }
            if (r3 != 0) goto L_0x003b
            net.sqlcipher.database.SQLiteDatabase r8 = net.sqlcipher.database.SQLiteDatabase.write((char[]) r8)     // Catch:{ all -> 0x0144 }
            goto L_0x005f
        L_0x003b:
            android.content.Context r3 = r7.read     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = r7.RatingCompat     // Catch:{ all -> 0x0144 }
            java.io.File r3 = r3.getDatabasePath(r4)     // Catch:{ all -> 0x0144 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x0144 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0144 }
            r4.<init>(r3)     // Catch:{ all -> 0x0144 }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x0144 }
            if (r5 != 0) goto L_0x0059
            java.io.File r4 = r4.getParentFile()     // Catch:{ all -> 0x0144 }
            r4.mkdirs()     // Catch:{ all -> 0x0144 }
        L_0x0059:
            net.sqlcipher.database.SQLiteDatabase$MediaBrowserCompat$CustomActionResultReceiver r4 = r7.IconCompatParcelizer     // Catch:{ all -> 0x0144 }
            net.sqlcipher.database.SQLiteDatabase r8 = net.sqlcipher.database.SQLiteDatabase.IconCompatParcelizer(r3, r8, r4, r0)     // Catch:{ all -> 0x0144 }
        L_0x005f:
            int r3 = r8.MediaBrowserCompat$MediaItem()     // Catch:{ all -> 0x013f }
            int r4 = r7.MediaMetadataCompat     // Catch:{ all -> 0x013f }
            if (r3 == r4) goto L_0x012b
            java.util.concurrent.locks.ReentrantLock r4 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x013f }
            r4.lock()     // Catch:{ all -> 0x013f }
            boolean r4 = net.sqlcipher.database.SQLiteDebug.write     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x0084
            java.util.concurrent.locks.ReentrantLock r4 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x013f }
            int r4 = r4.getHoldCount()     // Catch:{ all -> 0x013f }
            if (r4 != r2) goto L_0x0084
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x013f }
            r8.MediaBrowserCompat$MediaItem = r4     // Catch:{ all -> 0x013f }
            long r4 = android.os.Debug.threadCpuTimeNanos()     // Catch:{ all -> 0x013f }
            r8.MediaDescriptionCompat = r4     // Catch:{ all -> 0x013f }
        L_0x0084:
            int r4 = r8.mNativeHandle     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x008a
            r4 = r2
            goto L_0x008b
        L_0x008a:
            r4 = r1
        L_0x008b:
            if (r4 == 0) goto L_0x0123
            java.util.concurrent.locks.ReentrantLock r4 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x010d }
            int r4 = r4.getHoldCount()     // Catch:{ all -> 0x010d }
            if (r4 <= r2) goto L_0x00a9
            boolean r0 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x010d }
            if (r0 != 0) goto L_0x009a
            goto L_0x00b4
        L_0x009a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010d }
            java.lang.String r3 = "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction"
            r0.<init>(r3)     // Catch:{ all -> 0x010d }
            java.lang.String r3 = "Database"
            java.lang.String r4 = "beginTransaction() failed"
            android.util.Log.e(r3, r4, r0)     // Catch:{ all -> 0x010d }
            throw r0     // Catch:{ all -> 0x010d }
        L_0x00a9:
            java.lang.String r4 = "BEGIN EXCLUSIVE;"
            r8.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x010d }
            r8.MediaSessionCompat$QueueItem = r0     // Catch:{ all -> 0x010d }
            r8.MediaSessionCompat$Token = r2     // Catch:{ all -> 0x010d }
            r8.MediaBrowserCompat$ItemReceiver = r1     // Catch:{ all -> 0x010d }
        L_0x00b4:
            if (r3 != 0) goto L_0x00ba
            r7.read((net.sqlcipher.database.SQLiteDatabase) r8)     // Catch:{ all -> 0x0108 }
            goto L_0x00bf
        L_0x00ba:
            int r0 = r7.MediaMetadataCompat     // Catch:{ all -> 0x0108 }
            r7.IconCompatParcelizer(r8, r3, r0)     // Catch:{ all -> 0x0108 }
        L_0x00bf:
            int r0 = r7.MediaMetadataCompat     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
            r3.<init>()     // Catch:{ all -> 0x0108 }
            java.lang.String r4 = "PRAGMA user_version = "
            r3.append(r4)     // Catch:{ all -> 0x0108 }
            r3.append(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0108 }
            r8.MediaBrowserCompat$ItemReceiver(r0)     // Catch:{ all -> 0x0108 }
            int r0 = r8.mNativeHandle     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00db
            r0 = r2
            goto L_0x00dc
        L_0x00db:
            r0 = r1
        L_0x00dc:
            if (r0 == 0) goto L_0x0100
            java.util.concurrent.locks.ReentrantLock r0 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0108 }
            boolean r0 = r0.isHeldByCurrentThread()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r8.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0108 }
            if (r0 != 0) goto L_0x00f0
            r8.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ all -> 0x0108 }
            r8.MediaMetadataCompat()     // Catch:{ all -> 0x013f }
            goto L_0x012b
        L_0x00f0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "setTransactionSuccessful may only be called once per call to beginTransaction"
            r0.<init>(r2)     // Catch:{ all -> 0x0108 }
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x00f8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "no transaction pending"
            r0.<init>(r2)     // Catch:{ all -> 0x0108 }
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0100:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0108 }
            java.lang.String r2 = "database not open"
            r0.<init>(r2)     // Catch:{ all -> 0x0108 }
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r0 = move-exception
            r8.MediaMetadataCompat()     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x010d:
            r0 = move-exception
            boolean r3 = net.sqlcipher.database.SQLiteDebug.write     // Catch:{ all -> 0x013f }
            if (r3 == 0) goto L_0x011d
            java.util.concurrent.locks.ReentrantLock r3 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x013f }
            int r3 = r3.getHoldCount()     // Catch:{ all -> 0x013f }
            if (r3 != r2) goto L_0x011d
            r8.read()     // Catch:{ all -> 0x013f }
        L_0x011d:
            java.util.concurrent.locks.ReentrantLock r2 = r8.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x013f }
            r2.unlock()     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x0123:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            java.lang.String r2 = "database not open"
            r0.<init>(r2)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x012b:
            r7.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x015e }
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x013b
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ Exception -> 0x0136 }
            r0.MediaBrowserCompat$SearchResultReceiver()     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            net.sqlcipher.database.SQLiteDatabase r0 = r7.write     // Catch:{ all -> 0x015e }
            r0.MediaSessionCompat$ResultReceiverWrapper()     // Catch:{ all -> 0x015e }
        L_0x013b:
            r7.write = r8     // Catch:{ all -> 0x015e }
            monitor-exit(r7)
            return r8
        L_0x013f:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
            goto L_0x0145
        L_0x0144:
            r8 = move-exception
        L_0x0145:
            r7.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x015e }
            net.sqlcipher.database.SQLiteDatabase r1 = r7.write     // Catch:{ all -> 0x015e }
            if (r1 == 0) goto L_0x0150
            net.sqlcipher.database.SQLiteDatabase r1 = r7.write     // Catch:{ all -> 0x015e }
            r1.MediaSessionCompat$ResultReceiverWrapper()     // Catch:{ all -> 0x015e }
        L_0x0150:
            if (r0 == 0) goto L_0x0155
            r0.MediaBrowserCompat$SearchResultReceiver()     // Catch:{ all -> 0x015e }
        L_0x0155:
            throw r8     // Catch:{ all -> 0x015e }
        L_0x0156:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x015e }
            java.lang.String r0 = "getWritableDatabase called recursively"
            r8.<init>(r0)     // Catch:{ all -> 0x015e }
            throw r8     // Catch:{ all -> 0x015e }
        L_0x015e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PartnerBillPaymentInputActivity.write(char[]):net.sqlcipher.database.SQLiteDatabase");
    }

    public final SQLiteDatabase write(String str) {
        SQLiteDatabase read2;
        synchronized (this) {
            read2 = read(str.toCharArray());
        }
        return read2;
    }

    private SQLiteDatabase read(char[] cArr) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this) {
            if (this.write != null) {
                if (this.write.mNativeHandle != 0) {
                    SQLiteDatabase sQLiteDatabase2 = this.write;
                    return sQLiteDatabase2;
                }
            }
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    SQLiteDatabase write2 = write(cArr);
                    return write2;
                } catch (SQLiteException e) {
                    if (this.RatingCompat != null) {
                        String str = MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Couldn't open ");
                        sb.append(this.RatingCompat);
                        sb.append(" for writing (will try read-only):");
                        Log.e(str, sb.toString(), e);
                        sQLiteDatabase = null;
                        this.MediaBrowserCompat$CustomActionResultReceiver = true;
                        String path = this.read.getDatabasePath(this.RatingCompat).getPath();
                        File file = new File(path);
                        File file2 = new File(this.read.getDatabasePath(this.RatingCompat).getParent());
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (!file.exists()) {
                            this.MediaBrowserCompat$CustomActionResultReceiver = false;
                            SQLiteDatabase write3 = write(cArr);
                            this.MediaBrowserCompat$CustomActionResultReceiver = true;
                            write3.MediaBrowserCompat$SearchResultReceiver();
                        }
                        sQLiteDatabase = SQLiteDatabase.MediaBrowserCompat$CustomActionResultReceiver(path, cArr, this.IconCompatParcelizer);
                        if (sQLiteDatabase.MediaBrowserCompat$MediaItem() == this.MediaMetadataCompat) {
                            String str2 = MediaBrowserCompat$ItemReceiver;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Opened ");
                            sb2.append(this.RatingCompat);
                            sb2.append(" in read-only mode");
                            Log.w(str2, sb2.toString());
                            this.write = sQLiteDatabase;
                            this.MediaBrowserCompat$CustomActionResultReceiver = false;
                            return sQLiteDatabase;
                        }
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Can't upgrade read-only database from version ");
                        sb3.append(sQLiteDatabase.MediaBrowserCompat$MediaItem());
                        sb3.append(" to ");
                        sb3.append(this.MediaMetadataCompat);
                        sb3.append(": ");
                        sb3.append(path);
                        throw new SQLiteException(sb3.toString());
                    }
                    throw e;
                } catch (Throwable th) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = false;
                    if (!(sQLiteDatabase == null || sQLiteDatabase == this.write)) {
                        sQLiteDatabase.MediaBrowserCompat$SearchResultReceiver();
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("getReadableDatabase called recursively");
            }
        }
    }
}
