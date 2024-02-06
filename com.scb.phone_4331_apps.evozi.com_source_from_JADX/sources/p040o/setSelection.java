package p040o;

import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.camera.CameraSource$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setSelection */
public final /* synthetic */ class setSelection implements CameraSource$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ ScanPaymentActivity write;

    public /* synthetic */ setSelection(ScanPaymentActivity scanPaymentActivity) {
        this.write = scanPaymentActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, byte[] bArr) {
        C7432sG sGVar = this.write.presenter;
        if (sGVar.IconCompatParcelizer) {
            C7523tk tkVar = new C7523tk(i, i2, bArr);
            if (sGVar.RatingCompat != null) {
                tkVar.IconCompatParcelizer(sGVar.RatingCompat);
            }
        }
    }
}
