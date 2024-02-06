package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;
import p040o.updateDevice;

/* renamed from: o.getMerchantLanding */
public final /* synthetic */ class getMerchantLanding implements View.OnClickListener {
    private final /* synthetic */ AccountManagementItemCustomView read;

    public /* synthetic */ getMerchantLanding(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.read = accountManagementItemCustomView;
    }

    public final void onClick(View view) {
        AccountManagementItemCustomView accountManagementItemCustomView = this.read;
        updateDevice.read read2 = accountManagementItemCustomView.MediaBrowserCompat$ItemReceiver;
        if (read2 != null) {
            read2.read(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
