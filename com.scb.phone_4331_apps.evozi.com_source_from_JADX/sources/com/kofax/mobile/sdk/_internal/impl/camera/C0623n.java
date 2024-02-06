package com.kofax.mobile.sdk._internal.impl.camera;

import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.n */
public class C0623n implements C0502h {
    private static final String TAG = C0623n.class.getSimpleName();

    /* renamed from: Bh */
    FileInputStream f1499Bh;
    File file;

    /* renamed from: bp */
    public long mo11184bp() {
        return 0;
    }

    public void setPath(String str) {
        this.file = new File(str);
    }

    public String getPath() {
        return this.file.getAbsolutePath();
    }

    public boolean exists() {
        return this.file.exists();
    }

    /* renamed from: bn */
    public File mo11182bn() {
        return this.file;
    }

    /* renamed from: bo */
    public FileDescriptor mo11183bo() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            this.f1499Bh = fileInputStream;
            return fileInputStream.getFD();
        } catch (IOException e) {
            C0767k.m1821e(TAG, "Exception while file opening", (Throwable) e);
            return null;
        }
    }

    public InputStream open(String str) {
        try {
            return new FileInputStream(new File(str));
        } catch (FileNotFoundException e) {
            C0767k.m1821e(TAG, "Exception while file opening", (Throwable) e);
            return null;
        }
    }

    public long getLength() {
        return this.file.length();
    }

    public void close() {
        try {
            this.f1499Bh.close();
        } catch (IOException e) {
            C0767k.m1821e(TAG, "Exception while file input stream closing", (Throwable) e);
        } catch (Throwable th) {
            this.f1499Bh = null;
            throw th;
        }
        this.f1499Bh = null;
    }
}
