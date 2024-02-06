package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddedAccountManagementSuccessFooterCustomView;
import p040o.getDevices;

/* renamed from: o.MobileNumberService */
public final /* synthetic */ class MobileNumberService implements View.OnClickListener {
    private final /* synthetic */ AddedAccountManagementSuccessFooterCustomView IconCompatParcelizer;

    public /* synthetic */ MobileNumberService(AddedAccountManagementSuccessFooterCustomView addedAccountManagementSuccessFooterCustomView) {
        this.IconCompatParcelizer = addedAccountManagementSuccessFooterCustomView;
    }

    public final void onClick(View view) {
        getDevices.read read = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (read != null) {
            read.write();
        }
    }
}
