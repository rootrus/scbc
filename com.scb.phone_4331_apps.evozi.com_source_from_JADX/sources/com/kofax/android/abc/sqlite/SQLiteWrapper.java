package com.kofax.android.abc.sqlite;

public class SQLiteWrapper {
    private long m_ptr;

    private native void nativeClose(long j);

    private native long nativeCreate();

    private native void nativeDispose(long j);

    private native void nativeExecute(long j, String str);

    private native boolean nativeOpen(long j, String str);

    public SQLiteWrapper() {
        this.m_ptr = nativeCreate();
    }

    public SQLiteWrapper(long j) {
        this.m_ptr = j;
    }

    public void dispose() {
        nativeDispose(this.m_ptr);
        this.m_ptr = 0;
    }

    public long getPtr() {
        return this.m_ptr;
    }

    public boolean open(String str) {
        return nativeOpen(this.m_ptr, str);
    }

    public void close() {
        nativeClose(this.m_ptr);
    }

    public void execute(String str) {
        nativeExecute(this.m_ptr, str);
    }
}
