package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AccountManagementItemCustomView;
import p040o.updateDevice;

/* renamed from: o.createQr */
public final /* synthetic */ class createQr implements View.OnClickListener {
    private final /* synthetic */ AccountManagementItemCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createQr(AccountManagementItemCustomView accountManagementItemCustomView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountManagementItemCustomView;
    }

    public final void onClick(View view) {
        updateDevice.read read;
        AccountManagementItemCustomView accountManagementItemCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (accountManagementItemCustomView.MediaBrowserCompat$ItemReceiver(accountManagementItemCustomView.editText.getText().toString()) && (read = accountManagementItemCustomView.MediaBrowserCompat$ItemReceiver) != null) {
            read.write(accountManagementItemCustomView.MediaBrowserCompat$CustomActionResultReceiver, accountManagementItemCustomView.editText.getText().toString());
        }
    }
}
