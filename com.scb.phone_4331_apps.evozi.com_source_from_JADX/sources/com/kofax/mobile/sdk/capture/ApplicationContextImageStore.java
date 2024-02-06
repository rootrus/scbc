package com.kofax.mobile.sdk.capture;

public final class ApplicationContextImageStore {

    /* renamed from: Yt */
    private static IImageStorage f4476Yt = new ContextImageStorage();

    public static IImageStorage getImageStorage() {
        return f4476Yt;
    }

    public static void setImageStorage(IImageStorage iImageStorage) {
        f4476Yt = iImageStorage;
    }
}
