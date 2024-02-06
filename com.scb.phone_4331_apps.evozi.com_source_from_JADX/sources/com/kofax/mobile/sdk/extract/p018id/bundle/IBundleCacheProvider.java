package com.kofax.mobile.sdk.extract.p018id.bundle;

import java.io.File;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider */
public interface IBundleCacheProvider {
    File cacheProject(String str, IBundle iBundle, String str2);

    File cacheVariant(String str, String str2, IBundle iBundle, String str3);

    String getLatestModelDataBuildInfo(String str);

    String getLatestVersionForProject(String str);

    File getProject(String str, String str2);

    File getVariant(String str, String str2, String str3);
}
