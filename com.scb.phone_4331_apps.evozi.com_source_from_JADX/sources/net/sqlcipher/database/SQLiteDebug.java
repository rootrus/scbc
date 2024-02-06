package net.sqlcipher.database;

import android.util.Log;

public final class SQLiteDebug {
    public static final boolean IconCompatParcelizer = Log.isLoggable("SQLiteCursorClosing", 2);
    public static final boolean MediaBrowserCompat$CustomActionResultReceiver = Log.isLoggable("SQLiteStatements", 2);
    public static final boolean MediaBrowserCompat$ItemReceiver = Log.isLoggable("SQLiteLockStackTrace", 2);
    public static final boolean MediaMetadataCompat = Log.isLoggable("SQLiteTime", 2);
    private static int RatingCompat = 0;
    public static final boolean read = Log.isLoggable("SQLiteCompiledSql", 2);
    public static final boolean write = Log.isLoggable("SQLiteLockTime", 2);

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflo;
    }

    public static native long getHeapAllocatedSize();

    public static native void getHeapDirtyPages(int[] iArr);

    public static native long getHeapFreeSize();

    public static native long getHeapSize();

    public static native void getPagerStats(PagerStats pagerStats);

    public static void read() {
        synchronized (SQLiteDebug.class) {
            RatingCompat++;
        }
    }
}
