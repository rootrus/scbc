package com.kofax.android.abc.document;

import com.kofax.android.abc.sqlite.SQLiteWrapper;

public class Serializer {
    private native long deserializeDb(long j, String str, long j2);

    private native long deserializeString(String str);

    private native void serializeDb(String str, long j, long j2, long j3);

    private native String serializeString(long j);

    public String serialize(Document document) {
        return serializeString(document.getPtr());
    }

    public Document deserialize(String str) {
        return new Document(deserializeString(str), false, true);
    }

    public void serialize(Document document, SQLiteWrapper sQLiteWrapper, String str, long j) {
        serializeDb(str, document.getPtr(), sQLiteWrapper.getPtr(), j);
    }

    public Document deserialize(SQLiteWrapper sQLiteWrapper, String str, long j) {
        return new Document(deserializeDb(sQLiteWrapper.getPtr(), str, j), false, true);
    }
}
