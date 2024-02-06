package p040o;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObservable;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import net.sqlcipher.CursorIndexOutOfBoundsException;
import net.sqlcipher.CursorWindow;

/* renamed from: o.onProceedClick */
public abstract class onProceedClick implements CrossProcessCursor, TouchPointTermsAndConditionsActivity {
    public int IconCompatParcelizer = -1;
    public int MediaBrowserCompat$CustomActionResultReceiver = -1;
    final Object MediaBrowserCompat$ItemReceiver = new Object();
    protected HashMap<Long, Map<String, Object>> MediaBrowserCompat$MediaItem = new HashMap<>();
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private ContentResolver MediaDescriptionCompat;
    private Uri MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private ContentObserver MediaSessionCompat$Token;
    private Long RatingCompat = null;
    ContentObservable read = new ContentObservable();
    public DataSetObservable write = new DataSetObservable();

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public CursorWindow getWindow() {
        return null;
    }

    public abstract String[] getColumnNames();

    public abstract int getCount();

    public abstract long getLong(int i);

    public abstract String getString(int i);

    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    public boolean onMove(int i, int i2) {
        return true;
    }

    public byte[] getBlob(int i) {
        throw new UnsupportedOperationException("getBlob is not supported");
    }

    public int getColumnCount() {
        return getColumnNames().length;
    }

    public boolean requery() {
        ContentObserver contentObserver = this.MediaSessionCompat$Token;
        if (contentObserver != null && !this.MediaSessionCompat$QueueItem) {
            this.MediaDescriptionCompat.registerContentObserver(this.MediaMetadataCompat, true, contentObserver);
            this.MediaSessionCompat$QueueItem = true;
        }
        this.write.notifyChanged();
        return true;
    }

    public boolean isClosed() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void close() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        this.read.unregisterAll();
        ContentObserver contentObserver = this.MediaSessionCompat$Token;
        if (contentObserver != null) {
            this.MediaDescriptionCompat.unregisterContentObserver(contentObserver);
            this.MediaSessionCompat$QueueItem = false;
        }
        this.write.notifyInvalidated();
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        String string = getString(i);
        if (string != null) {
            char[] cArr = charArrayBuffer.data;
            if (cArr == null || cArr.length < string.length()) {
                charArrayBuffer.data = string.toCharArray();
            } else {
                string.getChars(0, string.length(), cArr, 0);
            }
            charArrayBuffer.sizeCopied = string.length();
            return;
        }
        charArrayBuffer.sizeCopied = 0;
    }

    public final int getPosition() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean moveToPosition(int i) {
        int count = getCount();
        if (i >= count) {
            this.MediaBrowserCompat$CustomActionResultReceiver = count;
            return false;
        } else if (i < 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            return false;
        } else {
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i == i2) {
                return true;
            }
            boolean onMove = onMove(i2, i);
            if (!onMove) {
                this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                int i3 = this.IconCompatParcelizer;
                if (i3 != -1) {
                    this.RatingCompat = Long.valueOf(getLong(i3));
                }
            }
            return onMove;
        }
    }

    public void fillWindow(int i, android.database.CursorWindow cursorWindow) {
        AbstractPartnerLoginActivity.MediaBrowserCompat$ItemReceiver((TouchPointTermsAndConditionsActivity) this, i, cursorWindow);
    }

    public final boolean move(int i) {
        return moveToPosition(this.MediaBrowserCompat$CustomActionResultReceiver + i);
    }

    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    public final boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    public final boolean moveToNext() {
        return moveToPosition(this.MediaBrowserCompat$CustomActionResultReceiver + 1);
    }

    public final boolean moveToPrevious() {
        return moveToPosition(this.MediaBrowserCompat$CustomActionResultReceiver - 1);
    }

    public final boolean isFirst() {
        return this.MediaBrowserCompat$CustomActionResultReceiver == 0 && getCount() != 0;
    }

    public final boolean isLast() {
        int count = getCount();
        return this.MediaBrowserCompat$CustomActionResultReceiver == count + -1 && count != 0;
    }

    public final boolean isBeforeFirst() {
        if (getCount() == 0 || this.MediaBrowserCompat$CustomActionResultReceiver == -1) {
            return true;
        }
        return false;
    }

    public final boolean isAfterLast() {
        if (getCount() == 0 || this.MediaBrowserCompat$CustomActionResultReceiver == getCount()) {
            return true;
        }
        return false;
    }

    public int getColumnIndex(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            Exception exc = new Exception();
            StringBuilder sb = new StringBuilder();
            sb.append("requesting column name with table name -- ");
            sb.append(str);
            Log.e("Cursor", sb.toString(), exc);
            str = str.substring(lastIndexOf + 1);
        }
        String[] columnNames = getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (columnNames[i].equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    public int getColumnIndexOrThrow(String str) {
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("column '");
        sb.append(str);
        sb.append("' does not exist");
        throw new IllegalArgumentException(sb.toString());
    }

    public String getColumnName(int i) {
        return getColumnNames()[i];
    }

    public void registerContentObserver(ContentObserver contentObserver) {
        this.read.registerObserver(contentObserver);
    }

    public void unregisterContentObserver(ContentObserver contentObserver) {
        if (!this.MediaBrowserCompat$SearchResultReceiver) {
            this.read.unregisterObserver(contentObserver);
        }
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.write.registerObserver(dataSetObserver);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.write.unregisterObserver(dataSetObserver);
    }

    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        synchronized (this.MediaBrowserCompat$ItemReceiver) {
            this.MediaMetadataCompat = uri;
            this.MediaDescriptionCompat = contentResolver;
            if (this.MediaSessionCompat$Token != null) {
                contentResolver.unregisterContentObserver(this.MediaSessionCompat$Token);
            }
            onProceedClick$MediaBrowserCompat$CustomActionResultReceiver onproceedclick_mediabrowsercompat_customactionresultreceiver = new onProceedClick$MediaBrowserCompat$CustomActionResultReceiver(this);
            this.MediaSessionCompat$Token = onproceedclick_mediabrowsercompat_customactionresultreceiver;
            this.MediaDescriptionCompat.registerContentObserver(this.MediaMetadataCompat, true, onproceedclick_mediabrowsercompat_customactionresultreceiver);
            this.MediaSessionCompat$QueueItem = true;
        }
    }

    public Uri getNotificationUri() {
        return this.MediaMetadataCompat;
    }

    public Bundle getExtras() {
        return Bundle.EMPTY;
    }

    public Bundle respond(Bundle bundle) {
        return Bundle.EMPTY;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = r2.MediaBrowserCompat$MediaItem.get(r2.RatingCompat);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(int r3) {
        /*
            r2 = this;
            int r0 = r2.IconCompatParcelizer
            r1 = -1
            if (r0 == r1) goto L_0x0027
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.MediaBrowserCompat$MediaItem
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0027
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.MediaBrowserCompat$MediaItem
            java.lang.Long r1 = r2.RatingCompat
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x0027
            java.lang.String[] r1 = r2.getColumnNames()
            r3 = r1[r3]
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L_0x0027
            r3 = 1
            return r3
        L_0x0027:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onProceedClick.read(int):boolean");
    }

    /* access modifiers changed from: protected */
    public final Object MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaBrowserCompat$MediaItem.get(this.RatingCompat).get(getColumnNames()[i]);
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$CustomActionResultReceiver() {
        if (-1 == this.MediaBrowserCompat$CustomActionResultReceiver || getCount() == this.MediaBrowserCompat$CustomActionResultReceiver) {
            throw new CursorIndexOutOfBoundsException(this.MediaBrowserCompat$CustomActionResultReceiver, getCount());
        }
    }

    public void finalize() {
        ContentObserver contentObserver = this.MediaSessionCompat$Token;
        if (contentObserver != null && this.MediaSessionCompat$QueueItem) {
            this.MediaDescriptionCompat.unregisterContentObserver(contentObserver);
        }
    }

    public void deactivate() {
        ContentObserver contentObserver = this.MediaSessionCompat$Token;
        if (contentObserver != null) {
            this.MediaDescriptionCompat.unregisterContentObserver(contentObserver);
            this.MediaSessionCompat$QueueItem = false;
        }
        this.write.notifyInvalidated();
    }
}
