package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.ReviewAccountFooterCustomView;

/* renamed from: o.confirmPurchase */
public final /* synthetic */ class confirmPurchase implements View.OnClickListener {
    private final /* synthetic */ ReviewAccountFooterCustomView MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ confirmPurchase(ReviewAccountFooterCustomView reviewAccountFooterCustomView) {
        this.MediaBrowserCompat$ItemReceiver = reviewAccountFooterCustomView;
    }

    public final void onClick(View view) {
        confirmRegistrationDirectDebit$MediaBrowserCompat$ItemReceiver confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver != null) {
            confirmregistrationdirectdebit_mediabrowsercompat_itemreceiver.read();
        }
    }
}
