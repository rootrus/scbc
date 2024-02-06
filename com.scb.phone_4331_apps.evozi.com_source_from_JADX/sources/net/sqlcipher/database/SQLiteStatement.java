package net.sqlcipher.database;

import android.os.SystemClock;

public class SQLiteStatement extends SQLiteProgram {
    private final native long native_1x1_long();

    private final native String native_1x1_string();

    private final native void native_execute();

    SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str) {
        super(sQLiteDatabase, str);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.IconCompatParcelizer.RatingCompat();
            MediaBrowserCompat$CustomActionResultReceiver();
            try {
                native_execute();
                this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, uptimeMillis, (String) null);
            } finally {
                IconCompatParcelizer();
                this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("database ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public final long MediaDescriptionCompat() {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.IconCompatParcelizer.RatingCompat();
            MediaBrowserCompat$CustomActionResultReceiver();
            try {
                long native_1x1_long = native_1x1_long();
                this.IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, uptimeMillis, (String) null);
                return native_1x1_long;
            } finally {
                IconCompatParcelizer();
                this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("database ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }
}
