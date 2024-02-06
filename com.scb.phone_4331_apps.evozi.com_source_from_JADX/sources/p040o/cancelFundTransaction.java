package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddedAccountManagementSuccessItemCustomView;

/* renamed from: o.cancelFundTransaction */
public final /* synthetic */ class cancelFundTransaction implements View.OnClickListener {
    private final /* synthetic */ AddedAccountManagementSuccessItemCustomView MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ cancelFundTransaction(AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView) {
        this.MediaBrowserCompat$ItemReceiver = addedAccountManagementSuccessItemCustomView;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$ItemReceiver.editText.setText("");
    }
}
