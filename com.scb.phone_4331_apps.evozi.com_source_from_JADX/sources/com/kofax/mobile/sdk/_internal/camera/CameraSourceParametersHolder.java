package com.kofax.mobile.sdk._internal.camera;

import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType;

public class CameraSourceParametersHolder {

    /* renamed from: td */
    private static boolean f1030td = false;

    /* renamed from: te */
    private static String f1031te;

    /* renamed from: tf */
    private static IVideoResourceProvider.StorageType f1032tf;

    /* renamed from: tg */
    private static VideoPlayerCameraSourceType f1033tg = VideoPlayerCameraSourceType.DEVICE_CAMERA;

    /* renamed from: th */
    private static boolean f1034th = true;

    /* renamed from: ti */
    private static VideoPlayerCameraPlayer.OnCompleteListener f1035ti;

    public static void useVideoPlayerCameraSourceProvider(boolean z) {
        f1030td = z;
    }

    public static boolean isVideoPlayerCameraSourceProvider() {
        return f1030td;
    }

    public static void setupVideoParameters(String str, IVideoResourceProvider.StorageType storageType, VideoPlayerCameraSourceType videoPlayerCameraSourceType) {
        f1031te = str;
        f1032tf = storageType;
        f1033tg = videoPlayerCameraSourceType;
    }

    public static void drawVideoFrames(boolean z) {
        f1034th = z;
    }

    public static String getFilename() {
        return f1031te;
    }

    public static IVideoResourceProvider.StorageType getStorageType() {
        return f1032tf;
    }

    public static VideoPlayerCameraSourceType getCameraSourceType() {
        return f1033tg;
    }

    public static boolean getDrawVideoFramesFlag() {
        return f1034th;
    }

    public static void setOnCompleteListener(VideoPlayerCameraPlayer.OnCompleteListener onCompleteListener) {
        f1035ti = onCompleteListener;
    }

    public static VideoPlayerCameraPlayer.OnCompleteListener getOnCompleteListener() {
        return f1035ti;
    }
}
