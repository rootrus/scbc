package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomDeltaSliderPressed;

/* renamed from: o.LoginService */
public final /* synthetic */ class LoginService implements View.OnClickListener {
    private final /* synthetic */ CustomDeltaSliderPressed MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int write;

    public /* synthetic */ LoginService(CustomDeltaSliderPressed customDeltaSliderPressed, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDeltaSliderPressed;
        this.write = i;
    }

    public final void onClick(View view) {
        CustomDeltaSliderPressed customDeltaSliderPressed = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.write;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = customDeltaSliderPressed.MediaBrowserCompat$ItemReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            customDeltaSliderPressed.MediaBrowserCompat$ItemReceiver.dispose();
        }
        customDeltaSliderPressed.setNewActualValue(customDeltaSliderPressed.IconCompatParcelizer + i);
        customDeltaSliderPressed.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
