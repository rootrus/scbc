package com.kofax.mobile.sdk._internal.camera;

import java.util.List;

public interface IVideoResourceProvider {

    public enum StorageType {
        FILE,
        ASSET
    }

    String getDefaultNewRecordingFilePath();

    C0502h getFileProvider();

    List<String> getVideoFiles();

    void setFileParameters(String str, StorageType storageType);
}
