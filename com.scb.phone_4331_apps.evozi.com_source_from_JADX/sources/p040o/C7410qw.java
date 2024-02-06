package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;

/* renamed from: o.qw */
public final /* synthetic */ class C7410qw implements DialogInterface.OnClickListener {
    private final /* synthetic */ ManageFastPayQrScanActivity read;

    public /* synthetic */ C7410qw(ManageFastPayQrScanActivity manageFastPayQrScanActivity) {
        this.read = manageFastPayQrScanActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.MediaDescriptionCompat.write(1);
    }
}
