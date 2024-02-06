package com.kofax.android.abc.document;

import android.graphics.Rect;
import java.util.ArrayList;

public class Document {
    private boolean m_owner;
    private long m_ptr;

    private native long nativeAddElement(int i, Rect rect, String str);

    private native long nativeAddField(int i, Rect rect, String str, String str2, float f);

    private native long nativeAddPage(int i, int i2, int i3);

    private native long nativeAddTable(String str);

    private native long nativeCreate();

    private native long nativeCreateCopy(long j);

    private native void nativeDispose();

    private native boolean nativeExistsTable(String str);

    private native int nativeGetElement(int i, int i2, int i3);

    private native long nativeGetElement(int i);

    private native ArrayList<Element> nativeGetElements();

    private native int nativeGetField(int i, int i2, int i3);

    private native long nativeGetField(int i);

    private native ArrayList<Field> nativeGetFields();

    private native ArrayList<Field> nativeGetFields(String str);

    private native String nativeGetName();

    private native int nativeGetNumPages();

    private native long nativeGetPage(int i);

    private native ArrayList<Page> nativeGetPages();

    private native long nativeGetTable(String str);

    private native ArrayList<Table> nativeGetTables();

    private native boolean nativeIsEqualTo(long j, long j2);

    private native boolean nativeIsValid();

    private native void nativeRemoveField(int i);

    private native void nativeSetElements(ArrayList<Element> arrayList);

    private native void nativeSetFields(ArrayList<Field> arrayList);

    private native void nativeSetName(String str);

    private native void nativeSetTables(ArrayList<Table> arrayList);

    private native void nativeSortElements();

    private native void nativeSortFields();

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.Document: Static initializer failed.");
        }
    }

    public Document() {
        this.m_ptr = nativeCreate();
        this.m_owner = true;
    }

    public Document(long j, boolean z, boolean z2) {
        if (j == 0) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Document: ptr value cannot be null.");
        } else if (z && !z2) {
            throw new IllegalArgumentException("com.kofax.android.abc.document.Document: createCopy cannot equal true and transferOwnership equal false");
        } else if (z) {
            this.m_ptr = nativeCreateCopy(j);
            this.m_owner = true;
        } else if (z2) {
            this.m_ptr = j;
            this.m_owner = true;
        } else {
            this.m_ptr = j;
            this.m_owner = false;
        }
    }

    public void dispose() {
        if (this.m_owner) {
            nativeDispose();
            this.m_ptr = 0;
        }
    }

    public long getPtr() {
        return this.m_ptr;
    }

    public boolean isEqualTo(Document document) {
        return nativeIsEqualTo(this.m_ptr, document.m_ptr);
    }

    public Page addPage(int i, int i2, int i3) {
        return new Page(nativeAddPage(i, i2, i3), false);
    }

    public int getNumPages() {
        return nativeGetNumPages();
    }

    public ArrayList<Page> getPages() {
        return nativeGetPages();
    }

    public Page getPage(int i) {
        return new Page(nativeGetPage(i), false);
    }

    public Element addElement(int i, Rect rect, String str) {
        return new Element(nativeAddElement(i, rect, str), false);
    }

    public void setElements(ArrayList<Element> arrayList) {
        throw new RuntimeException("Not implemented (yet)");
    }

    public ArrayList<Element> getElements() {
        return nativeGetElements();
    }

    public Element getElement(int i) {
        return new Element(nativeGetElement(i), false);
    }

    public int getElement(int i, int i2, int i3) {
        return nativeGetElement(i, i2, i3);
    }

    public void sortElements() {
        nativeSortElements();
    }

    public void sortFields() {
        nativeSortFields();
    }

    public Field addField(int i, Rect rect, String str, String str2, float f) {
        return new Field(nativeAddField(i, rect, str, str2, f), false);
    }

    public void removeField(Field field) {
        nativeRemoveField(field.getId());
    }

    public void setFields(ArrayList<Field> arrayList) {
        throw new RuntimeException("Document.setFields(): Not implemented (yet)");
    }

    public ArrayList<Field> getFields() {
        return nativeGetFields();
    }

    public Field getField(int i) {
        return new Field(nativeGetField(i), false);
    }

    public Field getField(int i, int i2, int i3) {
        int nativeGetField = nativeGetField(i, i2, i3);
        if (nativeGetField == -1) {
            return null;
        }
        return getField(nativeGetField);
    }

    public ArrayList<Field> getFields(String str) {
        return nativeGetFields(str);
    }

    public Table addTable(String str) {
        return new Table(nativeAddTable(str), false);
    }

    public void setTables(ArrayList<Table> arrayList) {
        throw new RuntimeException("Document.setTables(): Not implemented (yet)");
    }

    public ArrayList<Table> getTables() {
        return nativeGetTables();
    }

    public boolean existsTable(String str) {
        return nativeExistsTable(str);
    }

    public Table getTable(String str) {
        return new Table(nativeGetTable(str), false);
    }

    public boolean isValid() {
        return nativeIsValid();
    }

    public String getName() {
        return nativeGetName();
    }

    public void setName(String str) {
        nativeSetName(str);
    }
}
