package com.kofax.android.abc.quickextractor;

import com.kofax.android.abc.document.Document;
import com.kofax.android.abc.vrs.VrsImage;

public class MrzExtractor {
    private long ptr = construct();

    private static native long construct();

    private static native long destroy(long j);

    private static native long extract(long j, long j2);

    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("sol_isg_mobile");
    }

    public void dispose() {
        this.ptr = destroy(this.ptr);
    }

    public Document extract(VrsImage vrsImage) {
        return new Document(extract(this.ptr, vrsImage.getPtr()), false, true);
    }
}
