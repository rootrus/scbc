package com.kofax.android.abc.document;

import java.util.ArrayList;

public class Table {
    private boolean m_owner;
    private long m_ptr;

    private native long nativeCreate();

    private native long nativeCreate(String str);

    private native long nativeCreateCopy(long j);

    private native void nativeDispose();

    private native String nativeGetName();

    private native int nativeGetNumberOfColumns();

    private native int nativeGetNumberOfRows();

    private native ArrayList<Integer> nativeGetRow(int i);

    private native ArrayList<ArrayList<Integer>> nativeGetRows();

    private static native boolean nativeStaticInitializer();

    private native int nativeaddRow(long j, ArrayList<Integer> arrayList);

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Table: Static initializer failed.");
        }
    }

    public Table() {
        this.m_ptr = nativeCreate();
        this.m_owner = true;
    }

    public Table(long j, boolean z) {
        if (j == 0) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Table: ptr value cannot be null.");
        } else if (z) {
            this.m_ptr = nativeCreateCopy(j);
            this.m_owner = z;
        } else {
            this.m_ptr = j;
            this.m_owner = z;
        }
    }

    public void dispose() {
        if (this.m_owner) {
            nativeDispose();
            this.m_ptr = 0;
        }
    }

    public Table(String str) {
        this.m_ptr = nativeCreate(str);
    }

    public String getName() {
        return nativeGetName();
    }

    public int addRow(Document document, ArrayList<Integer> arrayList) {
        return nativeaddRow(document.getPtr(), arrayList);
    }

    public int getNumberOfRows() {
        return nativeGetNumberOfRows();
    }

    public int getNumberOfColumns() {
        return nativeGetNumberOfColumns();
    }

    public ArrayList<Integer> getRow(int i) {
        return nativeGetRow(i);
    }

    public ArrayList<ArrayList<Integer>> getRows() {
        return nativeGetRows();
    }

    public long getPtr() {
        return this.m_ptr;
    }
}
