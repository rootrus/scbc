package com.kofax.mobile.sdk._internal.camera;

import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;

/* renamed from: com.kofax.mobile.sdk._internal.camera.h */
public interface C0502h {

    /* renamed from: tp */
    public static final String f1043tp = "_asset_";

    /* renamed from: tq */
    public static final String f1044tq = "_file_";

    /* renamed from: bn */
    File mo11182bn();

    /* renamed from: bo */
    FileDescriptor mo11183bo();

    /* renamed from: bp */
    long mo11184bp();

    void close();

    boolean exists();

    long getLength();

    String getPath();

    InputStream open(String str);

    void setPath(String str);
}
