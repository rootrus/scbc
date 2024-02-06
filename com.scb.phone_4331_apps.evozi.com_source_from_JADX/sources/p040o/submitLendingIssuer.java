package p040o;

import android.media.ImageReader;
import com.scb.phone.view.camera.CameraApi2;

/* renamed from: o.submitLendingIssuer */
public final /* synthetic */ class submitLendingIssuer implements ImageReader.OnImageAvailableListener {
    private final /* synthetic */ CameraApi2 IconCompatParcelizer;

    public /* synthetic */ submitLendingIssuer(CameraApi2 cameraApi2) {
        this.IconCompatParcelizer = cameraApi2;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        CameraApi2 cameraApi2 = this.IconCompatParcelizer;
        verifyCommercialReferral verifycommercialreferral = cameraApi2.read;
        if (verifycommercialreferral != null) {
            verifycommercialreferral.read(cameraApi2.ParcelableVolumeInfo.acquireLatestImage());
        }
    }
}
