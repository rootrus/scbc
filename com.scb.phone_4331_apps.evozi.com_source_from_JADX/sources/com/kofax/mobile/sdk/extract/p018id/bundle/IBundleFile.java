package com.kofax.mobile.sdk.extract.p018id.bundle;

import java.io.File;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.IBundleFile */
public interface IBundleFile {
    String getAbsolutePath();

    File getFile();

    void getFile(File file);

    String getName();

    boolean isDirectory();
}
