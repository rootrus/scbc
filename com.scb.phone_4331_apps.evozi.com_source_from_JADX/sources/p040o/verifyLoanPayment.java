package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomDeltaSliderPressed;

/* renamed from: o.verifyLoanPayment */
public final /* synthetic */ class verifyLoanPayment implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ CustomDeltaSliderPressed read;

    public /* synthetic */ verifyLoanPayment(CustomDeltaSliderPressed customDeltaSliderPressed, int i) {
        this.read = customDeltaSliderPressed;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        CustomDeltaSliderPressed customDeltaSliderPressed = this.read;
        int i = this.IconCompatParcelizer;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = customDeltaSliderPressed.MediaBrowserCompat$ItemReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            customDeltaSliderPressed.MediaBrowserCompat$ItemReceiver.dispose();
        }
        customDeltaSliderPressed.setNewActualValue(customDeltaSliderPressed.IconCompatParcelizer - i);
        customDeltaSliderPressed.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
