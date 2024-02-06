package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.a */
public class C0542a implements C0502h {
    private static final String TAG = C0542a.class.getSimpleName();
    String path;

    /* renamed from: zQ */
    AssetFileDescriptor f1227zQ;
    @HmlPinActivity

    /* renamed from: zR */
    AssetManager f1228zR;

    /* renamed from: bn */
    public File mo11182bn() {
        return null;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getPath() {
        return this.path;
    }

    public boolean exists() {
        try {
            String substring = this.path.substring(0, this.path.lastIndexOf(47));
            String substring2 = this.path.substring(this.path.lastIndexOf(47) + 1);
            String[] list = this.f1228zR.list(substring);
            if (list != null && list.length > 0) {
                for (String equals : list) {
                    if (substring2.equals(equals)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            C0767k.m1821e(TAG, "Exception while listing assets", (Throwable) e);
        }
        return false;
    }

    /* renamed from: bo */
    public FileDescriptor mo11183bo() {
        try {
            AssetFileDescriptor openFd = this.f1228zR.openFd(this.path);
            this.f1227zQ = openFd;
            return openFd.getFileDescriptor();
        } catch (IOException e) {
            C0767k.m1821e(TAG, "Exception while file opening", (Throwable) e);
            return null;
        }
    }

    public InputStream open(String str) {
        try {
            return this.f1228zR.open(str);
        } catch (IOException e) {
            C0767k.m1821e(TAG, "Exception while Input Stream opening", (Throwable) e);
            return null;
        }
    }

    /* renamed from: bp */
    public long mo11184bp() {
        return this.f1227zQ.getStartOffset();
    }

    public long getLength() {
        return this.f1227zQ.getLength();
    }

    public void close() {
        AssetFileDescriptor assetFileDescriptor = this.f1227zQ;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e) {
                C0767k.m1821e(TAG, "Exception while assetFileDescriptor.close()", (Throwable) e);
            }
        }
    }
}
