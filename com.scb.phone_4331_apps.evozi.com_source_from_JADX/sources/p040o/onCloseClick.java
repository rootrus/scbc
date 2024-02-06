package p040o;

import net.sqlcipher.database.SQLiteDatabase;
import net.sqlcipher.database.SQLiteProgram;
import net.sqlcipher.database.SQLiteQuery;
import net.sqlcipher.database.SQLiteStatement;

/* renamed from: o.onCloseClick */
public abstract class onCloseClick {
    private int MediaBrowserCompat$CustomActionResultReceiver = 1;
    private Object MediaBrowserCompat$ItemReceiver = new Object();

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver();

    public void write() {
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("attempt to re-open an already-closed object: ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getClass().getName());
                sb2.append(" (");
                if (this instanceof SQLiteDatabase) {
                    sb2.append("database = ");
                    sb2.append(((SQLiteDatabase) this).MediaMetadataCompat);
                } else if ((this instanceof SQLiteProgram) || (this instanceof SQLiteStatement) || (this instanceof SQLiteQuery)) {
                    sb2.append("mSql = ");
                    sb2.append(((SQLiteProgram) this).MediaBrowserCompat$ItemReceiver);
                }
                sb2.append(") ");
                sb.append(sb2.toString());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver - 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            if (i == 0) {
                MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}
