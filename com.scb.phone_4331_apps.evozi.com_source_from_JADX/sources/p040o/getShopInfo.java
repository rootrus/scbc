package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;
import p040o.updateDevice;

/* renamed from: o.getShopInfo */
public final /* synthetic */ class getShopInfo implements View.OnClickListener {
    private final /* synthetic */ AccountManagementItemCustomView MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getShopInfo(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.MediaBrowserCompat$ItemReceiver = accountManagementItemCustomView;
    }

    public final void onClick(View view) {
        AccountManagementItemCustomView accountManagementItemCustomView = this.MediaBrowserCompat$ItemReceiver;
        updateDevice.read read = accountManagementItemCustomView.MediaBrowserCompat$ItemReceiver;
        if (read != null) {
            read.read(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
