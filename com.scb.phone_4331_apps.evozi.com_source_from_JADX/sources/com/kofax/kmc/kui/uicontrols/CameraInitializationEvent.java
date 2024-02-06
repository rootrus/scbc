package com.kofax.kmc.kui.uicontrols;

import android.hardware.Camera;
import com.kofax.kmc.kut.utilities.Size;
import java.util.EventObject;

public class CameraInitializationEvent extends EventObject {
    private static final long serialVersionUID = 1;

    /* renamed from: kh */
    private Camera.Size f553kh;

    /* renamed from: ki */
    private CameraInitStatus f554ki = CameraInitStatus.CAMERA_STATUS_UNKNOWN;

    public enum CameraInitStatus {
        CAMERA_STATUS_UNKNOWN,
        CAMERA_VIEW_CREATED,
        CAMERA_IMAGE_RESOLUTION_CHANGED,
        CAMERA_USE_VIDEO_FRAME_CHANGED
    }

    public CameraInitializationEvent(Object obj, Camera.Size size, CameraInitStatus cameraInitStatus) {
        super(obj);
        this.f553kh = size;
        this.f554ki = cameraInitStatus;
    }

    public final Size getDefaultImageCaptureResolution() {
        return new Size(this.f553kh);
    }

    public final CameraInitStatus getCameraInitStatus() {
        return this.f554ki;
    }
}
