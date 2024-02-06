package net.sqlcipher.database;

import java.lang.ref.WeakReference;
import java.util.HashSet;

class SQLiteDatabase$MediaBrowserCompat$ItemReceiver {
    private static final SQLiteDatabase$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new SQLiteDatabase$MediaBrowserCompat$ItemReceiver();
    /* access modifiers changed from: private */
    public HashSet<WeakReference<SQLiteDatabase>> MediaBrowserCompat$ItemReceiver = new HashSet<>();

    private SQLiteDatabase$MediaBrowserCompat$ItemReceiver() {
    }

    static SQLiteDatabase$MediaBrowserCompat$ItemReceiver read() {
        return IconCompatParcelizer;
    }
}
