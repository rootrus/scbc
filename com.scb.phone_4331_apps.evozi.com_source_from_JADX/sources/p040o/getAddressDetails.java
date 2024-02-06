package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ccrredemption.product.OPRRewardTiersAdapter;

/* renamed from: o.getAddressDetails */
public final /* synthetic */ class getAddressDetails implements View.OnClickListener {
    private final /* synthetic */ OPRRewardTiersAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ getAddressDetails(OPRRewardTiersAdapter oPRRewardTiersAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = oPRRewardTiersAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        OPRRewardTiersAdapter oPRRewardTiersAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.read;
        oPRRewardTiersAdapter.write = i;
        getNationality getnationality = oPRRewardTiersAdapter.read;
        if (getnationality != null) {
            getnationality.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        oPRRewardTiersAdapter.IconCompatParcelizer.write();
    }
}
