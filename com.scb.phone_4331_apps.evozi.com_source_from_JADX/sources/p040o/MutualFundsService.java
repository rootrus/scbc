package p040o;

import android.view.View;
import com.scb.phone.view.custom.profilemanagement.AddedAccountManagementSuccessItemCustomView;
import p040o.getDevices;

/* renamed from: o.MutualFundsService */
public final /* synthetic */ class MutualFundsService implements View.OnClickListener {
    private final /* synthetic */ AddedAccountManagementSuccessItemCustomView read;

    public /* synthetic */ MutualFundsService(AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView) {
        this.read = addedAccountManagementSuccessItemCustomView;
    }

    public final void onClick(View view) {
        AddedAccountManagementSuccessItemCustomView addedAccountManagementSuccessItemCustomView = this.read;
        if (addedAccountManagementSuccessItemCustomView.MediaBrowserCompat$ItemReceiver(addedAccountManagementSuccessItemCustomView.editText.getText().toString())) {
            getDevices.write write = addedAccountManagementSuccessItemCustomView.IconCompatParcelizer;
            if (write != null) {
                write.write(addedAccountManagementSuccessItemCustomView.write, addedAccountManagementSuccessItemCustomView.editText.getText().toString());
            }
            addedAccountManagementSuccessItemCustomView.read(false);
        }
    }
}
