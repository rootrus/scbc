package p040o;

import android.database.CharArrayBuffer;
import net.sqlcipher.CursorWindow;
import net.sqlcipher.StaleDataException;

/* renamed from: o.TouchPointWifiSettingsActivity */
public abstract class TouchPointWifiSettingsActivity extends onProceedClick {
    public CursorWindow MediaBrowserCompat$SearchResultReceiver;

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            throw new StaleDataException("Access closed cursor");
        }
    }

    public final CursorWindow MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (read(i)) {
                    super.copyStringToBuffer(i, charArrayBuffer);
                }
            }
            this.MediaBrowserCompat$SearchResultReceiver.copyStringToBuffer(this.MediaBrowserCompat$CustomActionResultReceiver, i, charArrayBuffer);
            return;
        }
        throw new StaleDataException("Access closed cursor");
    }

    public byte[] getBlob(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getBlob(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                byte[] bArr = (byte[]) MediaBrowserCompat$CustomActionResultReceiver(i);
                return bArr;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public double getDouble(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getDouble(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                double doubleValue = ((Number) MediaBrowserCompat$CustomActionResultReceiver(i)).doubleValue();
                return doubleValue;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public float getFloat(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getFloat(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                float floatValue = ((Number) MediaBrowserCompat$CustomActionResultReceiver(i)).floatValue();
                return floatValue;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public int getInt(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getInt(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                int intValue = ((Number) MediaBrowserCompat$CustomActionResultReceiver(i)).intValue();
                return intValue;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public long getLong(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getLong(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                long longValue = ((Number) MediaBrowserCompat$CustomActionResultReceiver(i)).longValue();
                return longValue;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public short getShort(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getShort(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                short shortValue = ((Number) MediaBrowserCompat$CustomActionResultReceiver(i)).shortValue();
                return shortValue;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public String getString(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            synchronized (this.MediaBrowserCompat$MediaItem) {
                if (!read(i)) {
                    return this.MediaBrowserCompat$SearchResultReceiver.getString(this.MediaBrowserCompat$CustomActionResultReceiver, i);
                }
                String str = (String) MediaBrowserCompat$CustomActionResultReceiver(i);
                return str;
            }
        }
        throw new StaleDataException("Access closed cursor");
    }

    public int getType(int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        CursorWindow cursorWindow = this.MediaBrowserCompat$SearchResultReceiver;
        if (cursorWindow != null) {
            return cursorWindow.getType(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        }
        throw new StaleDataException("Access closed cursor");
    }

    public /* bridge */ /* synthetic */ android.database.CursorWindow getWindow() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isNull(int r3) {
        /*
            r2 = this;
            super.MediaBrowserCompat$CustomActionResultReceiver()
            net.sqlcipher.CursorWindow r0 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r0 == 0) goto L_0x0028
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.MediaBrowserCompat$MediaItem
            monitor-enter(r0)
            boolean r1 = r2.read(r3)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x001b
            java.lang.Object r3 = r2.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ all -> 0x0025 }
            if (r3 != 0) goto L_0x0018
            r3 = 1
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            monitor-exit(r0)
            return r3
        L_0x001b:
            monitor-exit(r0)
            net.sqlcipher.CursorWindow r0 = r2.MediaBrowserCompat$SearchResultReceiver
            int r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            boolean r3 = r0.isNull(r1, r3)
            return r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0028:
            net.sqlcipher.StaleDataException r3 = new net.sqlcipher.StaleDataException
            java.lang.String r0 = "Access closed cursor"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.TouchPointWifiSettingsActivity.isNull(int):boolean");
    }
}
