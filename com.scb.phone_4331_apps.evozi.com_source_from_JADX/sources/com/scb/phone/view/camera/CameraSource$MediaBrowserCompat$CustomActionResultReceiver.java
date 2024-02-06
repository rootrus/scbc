package com.scb.phone.view.camera;

import android.content.Context;

public class CameraSource$MediaBrowserCompat$CustomActionResultReceiver {
    public CameraSource$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    public CameraSource write;

    public CameraSource$MediaBrowserCompat$CustomActionResultReceiver(Context context, CameraSource$MediaBrowserCompat$ItemReceiver cameraSource$MediaBrowserCompat$ItemReceiver) {
        CameraSource cameraSource = new CameraSource((byte) 0);
        this.write = cameraSource;
        if (context != null) {
            cameraSource.IconCompatParcelizer = context;
            this.MediaBrowserCompat$CustomActionResultReceiver = cameraSource$MediaBrowserCompat$ItemReceiver;
            return;
        }
        throw new IllegalArgumentException("No context supplied.");
    }
}
