package net.sqlcipher.database;

import android.os.SystemClock;
import android.util.Log;
import net.sqlcipher.CursorWindow;

public class SQLiteQuery extends SQLiteProgram {
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private int read = 0;
    private String[] write;

    private final native int native_column_count();

    private final native String native_column_name(int i);

    private final native int native_fill_window(CursorWindow cursorWindow, int i, int i2, int i3, int i4);

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        super(sQLiteDatabase, str);
        this.write = strArr;
    }

    public final int IconCompatParcelizer(CursorWindow cursorWindow, int i, int i2) {
        int i3;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.IconCompatParcelizer.RatingCompat();
        this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, uptimeMillis, "GETLOCK:");
        try {
            MediaBrowserCompat$CustomActionResultReceiver();
            cursorWindow.acquireReference();
            i3 = native_fill_window(cursorWindow, cursorWindow.getStartPosition(), 0, i, i2);
            if (SQLiteDebug.MediaBrowserCompat$CustomActionResultReceiver) {
                StringBuilder sb = new StringBuilder();
                sb.append("fillWindow(): ");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                Log.d("Cursor", sb.toString());
            }
            this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, uptimeMillis, (String) null);
        } catch (IllegalStateException unused) {
            i3 = 0;
        } catch (SQLiteDatabaseCorruptException e) {
            this.IconCompatParcelizer.MediaDescriptionCompat();
            throw e;
        } catch (Throwable th) {
            IconCompatParcelizer();
            this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
            throw th;
        }
        cursorWindow.releaseReference();
        IconCompatParcelizer();
        this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
        return i3;
    }

    public final int MediaDescriptionCompat() {
        MediaBrowserCompat$CustomActionResultReceiver();
        try {
            return native_column_count();
        } finally {
            IconCompatParcelizer();
        }
    }

    public final String read(int i) {
        MediaBrowserCompat$CustomActionResultReceiver();
        try {
            return native_column_name(i);
        } finally {
            IconCompatParcelizer();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SQLiteQuery: ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    public final void read() {
        super.read();
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        String[] strArr = this.write;
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                try {
                    super.MediaBrowserCompat$ItemReceiver(i2, this.write[i]);
                    i = i2;
                } catch (SQLiteMisuseException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mSql ");
                    sb.append(this.MediaBrowserCompat$ItemReceiver);
                    StringBuilder sb2 = new StringBuilder(sb.toString());
                    for (int i3 = 0; i3 < length; i3++) {
                        sb2.append(" ");
                        sb2.append(this.write[i3]);
                    }
                    sb2.append(" ");
                    throw new IllegalStateException(sb2.toString(), e);
                }
            }
        }
    }

    public final void write(int i) {
        this.write[i - 1] = null;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            super.write(i);
        }
    }

    public final void read(int i, long j) {
        this.write[i - 1] = Long.toString(j);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            super.read(i, j);
        }
    }

    public final void write(int i, double d) {
        this.write[i - 1] = Double.toString(d);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            super.write(i, d);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, String str) {
        this.write[i - 1] = str;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            super.MediaBrowserCompat$ItemReceiver(i, str);
        }
    }
}
