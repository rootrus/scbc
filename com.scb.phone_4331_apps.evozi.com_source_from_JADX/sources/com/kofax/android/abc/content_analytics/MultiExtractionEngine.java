package com.kofax.android.abc.content_analytics;

import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.document.Document;

public class MultiExtractionEngine {
    private long m_ptr;

    private native long nativeCreate();

    private native void nativeDispose();

    private native boolean nativeExtract(long j);

    private native void nativeInitialize(long j, String str);

    private static native boolean nativeStaticInitializer();

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.MultiExtractionEngine: Static initializer failed.");
        }
    }

    public MultiExtractionEngine() {
        this.m_ptr = nativeCreate();
    }

    public MultiExtractionEngine(long j) {
        this.m_ptr = j;
    }

    public void dispose() {
        nativeDispose();
        this.m_ptr = 0;
    }

    public long getPtr() {
        return this.m_ptr;
    }

    public void initialize(Configuration configuration, String str) {
        nativeInitialize(configuration.getPtr(), str);
    }

    public boolean extract(Document document) {
        return nativeExtract(document.getPtr());
    }
}
