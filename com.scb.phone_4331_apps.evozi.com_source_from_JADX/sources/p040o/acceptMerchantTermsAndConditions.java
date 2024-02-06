package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementFooterCustomView;

/* renamed from: o.acceptMerchantTermsAndConditions */
public final /* synthetic */ class acceptMerchantTermsAndConditions implements View.OnClickListener {
    private final /* synthetic */ AccountManagementFooterCustomView IconCompatParcelizer;

    public /* synthetic */ acceptMerchantTermsAndConditions(AccountManagementFooterCustomView accountManagementFooterCustomView) {
        this.IconCompatParcelizer = accountManagementFooterCustomView;
    }

    public final void onClick(View view) {
        updateDevice$MediaBrowserCompat$CustomActionResultReceiver updatedevice_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer.write;
        if (updatedevice_mediabrowsercompat_customactionresultreceiver != null) {
            updatedevice_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
        }
    }
}
