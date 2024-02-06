package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;

/* renamed from: o.qx */
public final /* synthetic */ class C7411qx implements DialogInterface.OnCancelListener {
    private final /* synthetic */ ManageFastPayQrScanActivity IconCompatParcelizer;

    public /* synthetic */ C7411qx(ManageFastPayQrScanActivity manageFastPayQrScanActivity) {
        this.IconCompatParcelizer = manageFastPayQrScanActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.IconCompatParcelizer.MediaDescriptionCompat.write(1);
    }
}
