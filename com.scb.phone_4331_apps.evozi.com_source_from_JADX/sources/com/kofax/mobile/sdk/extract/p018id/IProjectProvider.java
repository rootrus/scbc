package com.kofax.mobile.sdk.extract.p018id;

import java.io.File;

/* renamed from: com.kofax.mobile.sdk.extract.id.IProjectProvider */
public interface IProjectProvider {
    void getHighestVersion(String str, String str2, ICompletionListener<String> iCompletionListener);

    String getLatestCachedModelDataBuildInfo(String str);

    void getProject(String str, String str2, ICompletionListener<File> iCompletionListener);

    void getVariant(String str, String str2, String str3, ICompletionListener<File> iCompletionListener);
}
