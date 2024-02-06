package net.sqlcipher.database;

import android.util.Log;

class SQLiteCompiledSql {
    private SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver;
    private Throwable MediaBrowserCompat$ItemReceiver = null;
    int nHandle = 0;
    int nStatement = 0;
    boolean read = false;
    private String write = null;

    private final native void native_compile(String str);

    private final native void native_finalize();

    SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = false;
        if (sQLiteDatabase.mNativeHandle != 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = sQLiteDatabase;
            this.write = str;
            this.MediaBrowserCompat$ItemReceiver = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.nHandle = sQLiteDatabase.mNativeHandle;
            if (this.MediaBrowserCompat$CustomActionResultReceiver.mNativeHandle != 0 ? true : z) {
                this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
                try {
                    native_compile(str);
                } finally {
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("database ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat);
                sb.append(" already closed");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("database ");
            sb2.append(sQLiteDatabase.MediaMetadataCompat);
            sb2.append(" already closed");
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        if (this.nStatement != 0) {
            if (SQLiteDebug.IconCompatParcelizer) {
                StringBuilder sb = new StringBuilder();
                sb.append("closed and deallocated DbObj (id#");
                sb.append(this.nStatement);
                sb.append(")");
                Log.v("SQLiteCompiledSql", sb.toString());
            }
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat();
                native_finalize();
                this.nStatement = 0;
            } finally {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.read     // Catch:{ all -> 0x002e }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0008:
            r0 = 1
            r3.read = r0     // Catch:{ all -> 0x002e }
            boolean r1 = net.sqlcipher.database.SQLiteDebug.IconCompatParcelizer     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x002c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002e }
            r1.<init>()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "Acquired DbObj (id#"
            r1.append(r2)     // Catch:{ all -> 0x002e }
            int r2 = r3.nStatement     // Catch:{ all -> 0x002e }
            r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = ") from DB cache"
            r1.append(r2)     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "SQLiteCompiledSql"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x002e }
            android.util.Log.v(r2, r1)     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r3)
            return r0
        L_0x002e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteCompiledSql.MediaBrowserCompat$CustomActionResultReceiver():boolean");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.nStatement != 0) {
                if (SQLiteDebug.IconCompatParcelizer) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("** warning ** Finalized DbObj (id#");
                    sb.append(this.nStatement);
                    sb.append(")");
                    Log.v("SQLiteCompiledSql", sb.toString());
                }
                int length = this.write.length();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Releasing statement in a finalizer. Please ensure that you explicitly call close() on your cursor: ");
                String str = this.write;
                if (length > 100) {
                    length = 100;
                }
                sb2.append(str.substring(0, length));
                Log.w("SQLiteCompiledSql", sb2.toString(), this.MediaBrowserCompat$ItemReceiver);
                write();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }
}
