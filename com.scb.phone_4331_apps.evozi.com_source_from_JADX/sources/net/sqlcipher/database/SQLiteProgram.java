package net.sqlcipher.database;

import android.util.Log;
import p040o.onCloseClick;

public abstract class SQLiteProgram extends onCloseClick {
    @Deprecated
    protected SQLiteDatabase IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    @Deprecated
    protected int nHandle = 0;
    @Deprecated
    protected int nStatement = 0;
    private SQLiteCompiledSql write;

    private final native void native_clear_bindings();

    /* access modifiers changed from: protected */
    public final native void native_bind_blob(int i, byte[] bArr);

    /* access modifiers changed from: protected */
    public final native void native_bind_double(int i, double d);

    /* access modifiers changed from: protected */
    public final native void native_bind_long(int i, long j);

    /* access modifiers changed from: protected */
    public final native void native_bind_null(int i);

    /* access modifiers changed from: protected */
    public final native void native_bind_string(int i, String str);

    /* access modifiers changed from: protected */
    @Deprecated
    public final native void native_compile(String str);

    /* access modifiers changed from: protected */
    @Deprecated
    public final native void native_finalize();

    /* JADX INFO: finally extract failed */
    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.IconCompatParcelizer = sQLiteDatabase;
        this.MediaBrowserCompat$ItemReceiver = str.trim();
        sQLiteDatabase.MediaBrowserCompat$CustomActionResultReceiver();
        sQLiteDatabase.RatingCompat();
        try {
            sQLiteDatabase.RatingCompat.put(this, (Object) null);
            sQLiteDatabase.MediaSessionCompat$ResultReceiverWrapper();
            this.nHandle = sQLiteDatabase.mNativeHandle;
            String substring = this.MediaBrowserCompat$ItemReceiver.substring(0, 6);
            if (substring.equalsIgnoreCase("INSERT") || substring.equalsIgnoreCase("UPDATE") || substring.equalsIgnoreCase("REPLAC") || substring.equalsIgnoreCase("DELETE") || substring.equalsIgnoreCase("SELECT")) {
                SQLiteCompiledSql MediaBrowserCompat$CustomActionResultReceiver = sQLiteDatabase.MediaBrowserCompat$CustomActionResultReceiver(str);
                this.write = MediaBrowserCompat$CustomActionResultReceiver;
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                    this.write = sQLiteCompiledSql;
                    sQLiteCompiledSql.MediaBrowserCompat$CustomActionResultReceiver();
                    SQLiteCompiledSql sQLiteCompiledSql2 = this.write;
                    if (sQLiteDatabase.MediaBrowserCompat$SearchResultReceiver != 0) {
                        synchronized (sQLiteDatabase.IconCompatParcelizer) {
                            if (sQLiteDatabase.IconCompatParcelizer.get(str) == null) {
                                if (sQLiteDatabase.IconCompatParcelizer.size() == sQLiteDatabase.MediaBrowserCompat$SearchResultReceiver) {
                                    int i = sQLiteDatabase.write + 1;
                                    sQLiteDatabase.write = i;
                                    if (i == 1) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Reached MAX size for compiled-sql statement cache for database ");
                                        sb.append(sQLiteDatabase.MediaMetadataCompat);
                                        sb.append("; i.e., NO space for this sql statement in cache: ");
                                        sb.append(str);
                                        sb.append(". Please change your sql statements to use '?' for ");
                                        sb.append("bindargs, instead of using actual values");
                                        Log.w("Database", sb.toString());
                                    }
                                } else {
                                    sQLiteDatabase.IconCompatParcelizer.put(str, sQLiteCompiledSql2);
                                    if (SQLiteDebug.read) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("|adding_sql_to_cache|");
                                        sb2.append(sQLiteDatabase.MediaMetadataCompat);
                                        sb2.append("|");
                                        sb2.append(sQLiteDatabase.IconCompatParcelizer.size());
                                        sb2.append("|");
                                        sb2.append(str);
                                        Log.v("Database", sb2.toString());
                                    }
                                }
                            }
                        }
                    } else if (SQLiteDebug.read) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("|NOT adding_sql_to_cache|");
                        sb3.append(sQLiteDatabase.MediaMetadataCompat);
                        sb3.append("|");
                        sb3.append(str);
                        Log.v("Database", sb3.toString());
                    }
                    if (SQLiteDebug.IconCompatParcelizer) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Created DbObj (id#");
                        sb4.append(this.write.nStatement);
                        sb4.append(") for sql: ");
                        sb4.append(str);
                        Log.v("SQLiteProgram", sb4.toString());
                    }
                } else if (!MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()) {
                    int i2 = this.write.nStatement;
                    this.write = new SQLiteCompiledSql(sQLiteDatabase, str);
                    if (SQLiteDebug.IconCompatParcelizer) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("** possible bug ** Created NEW DbObj (id#");
                        sb5.append(this.write.nStatement);
                        sb5.append(") because the previously created DbObj (id#");
                        sb5.append(i2);
                        sb5.append(") was not released for sql:");
                        sb5.append(str);
                        Log.v("SQLiteProgram", sb5.toString());
                    }
                }
                this.nStatement = this.write.nStatement;
                return;
            }
            SQLiteCompiledSql sQLiteCompiledSql3 = new SQLiteCompiledSql(sQLiteDatabase, str);
            this.write = sQLiteCompiledSql3;
            this.nStatement = sQLiteCompiledSql3.nStatement;
        } catch (Throwable th) {
            sQLiteDatabase.MediaSessionCompat$ResultReceiverWrapper();
            throw th;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        MediaMetadataCompat();
        this.IconCompatParcelizer.IconCompatParcelizer();
        SQLiteDatabase sQLiteDatabase = this.IconCompatParcelizer;
        sQLiteDatabase.RatingCompat();
        try {
            sQLiteDatabase.RatingCompat.remove(this);
        } finally {
            sQLiteDatabase.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    public final void write() {
        MediaMetadataCompat();
        this.IconCompatParcelizer.IconCompatParcelizer();
    }

    private void MediaMetadataCompat() {
        if (this.write != null) {
            synchronized (this.IconCompatParcelizer.IconCompatParcelizer) {
                if (!this.IconCompatParcelizer.IconCompatParcelizer.containsValue(this.write)) {
                    this.write.write();
                    this.write = null;
                    this.nStatement = 0;
                } else {
                    SQLiteCompiledSql sQLiteCompiledSql = this.write;
                    synchronized (sQLiteCompiledSql) {
                        if (SQLiteDebug.IconCompatParcelizer) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Released DbObj (id#");
                            sb.append(sQLiteCompiledSql.nStatement);
                            sb.append(") back to DB cache");
                            Log.v("SQLiteCompiledSql", sb.toString());
                        }
                        sQLiteCompiledSql.read = false;
                    }
                }
            }
        }
    }

    public void write(int i) {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
            try {
                native_bind_null(i);
            } finally {
                IconCompatParcelizer();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("database ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void read(int i, long j) {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
            try {
                native_bind_long(i, j);
            } finally {
                IconCompatParcelizer();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("database ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void write(int i, double d) {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            MediaBrowserCompat$CustomActionResultReceiver();
            try {
                native_bind_double(i, d);
            } finally {
                IconCompatParcelizer();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("database ");
            sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void MediaBrowserCompat$ItemReceiver(int i, String str) {
        if (str != null) {
            if (this.IconCompatParcelizer.mNativeHandle != 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
                try {
                    native_bind_string(i, str);
                } finally {
                    IconCompatParcelizer();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("database ");
                sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
                sb.append(" already closed");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("the bind value at index ");
            sb2.append(i);
            sb2.append(" is null");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final void write(int i, byte[] bArr) {
        if (bArr != null) {
            if (this.IconCompatParcelizer.mNativeHandle != 0) {
                MediaBrowserCompat$CustomActionResultReceiver();
                try {
                    native_bind_blob(i, bArr);
                } finally {
                    IconCompatParcelizer();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("database ");
                sb.append(this.IconCompatParcelizer.MediaMetadataCompat);
                sb.append(" already closed");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("the bind value at index ");
            sb2.append(i);
            sb2.append(" is null");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public void read() {
        if (this.IconCompatParcelizer.mNativeHandle != 0) {
            this.IconCompatParcelizer.RatingCompat();
            try {
                IconCompatParcelizer();
            } finally {
                this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
            }
        }
    }
}
