package p040o;

import android.hardware.Camera;
import com.scb.phone.view.camera.CameraSource;

/* renamed from: o.validateCommercialEligibility */
public final /* synthetic */ class validateCommercialEligibility implements Camera.AutoFocusCallback {
    private final /* synthetic */ CameraSource read;

    public /* synthetic */ validateCommercialEligibility(CameraSource cameraSource) {
        this.read = cameraSource;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        CameraSource cameraSource = this.read;
        if (z) {
            cameraSource.MediaBrowserCompat$CustomActionResultReceiver.cancelAutoFocus();
        }
    }
}
