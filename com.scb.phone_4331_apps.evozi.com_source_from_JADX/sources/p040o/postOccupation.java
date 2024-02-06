package p040o;

import android.hardware.Camera;

/* renamed from: o.postOccupation */
public final /* synthetic */ class postOccupation implements Camera.PictureCallback {
    private final /* synthetic */ requestCreditPowerLoan read;

    public /* synthetic */ postOccupation(requestCreditPowerLoan requestcreditpowerloan) {
        this.read = requestcreditpowerloan;
    }

    public final void onPictureTaken(byte[] bArr, Camera camera) {
        this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(bArr);
    }
}
