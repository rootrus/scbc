package com.kofax.android.abc.validation;

import android.graphics.Bitmap;
import com.kofax.android.abc.configuration.Configuration;
import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.vrs.VrsImage;

public class MultiValidationEngine {
    private long m_ptr = nativeCreate();

    private native long nativeCreate();

    private native void nativeDispose();

    private native String[] nativeGetInputNames();

    private native String[] nativeGetOutputNames();

    private native void nativeInitialize(long j, String str);

    private native boolean nativeIsValid();

    private static native boolean nativeStaticInitializer();

    private native boolean nativeValidate(long j);

    private native boolean nativeValidateWithImage(long j, Bitmap bitmap);

    private native boolean nativeValidateWithVrsImage(long j, long j2);

    static {
        if (!nativeStaticInitializer()) {
            throw new RuntimeException("com.kofax.android.abc.document.RegexValidationEngine: Static initializer failed.");
        }
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

    public boolean validate(Document document) {
        return nativeValidate(document.getPtr());
    }

    public boolean validateWithImage(Document document, Bitmap bitmap) {
        return nativeValidateWithImage(document.getPtr(), bitmap);
    }

    public boolean validateWithImage(Document document, VrsImage vrsImage) {
        return nativeValidateWithVrsImage(document.getPtr(), vrsImage.getPtr());
    }

    public String[] getInputNames() {
        return nativeGetInputNames();
    }

    public String[] getOutputNames() {
        return nativeGetOutputNames();
    }

    public boolean isValid() {
        return nativeIsValid();
    }
}
