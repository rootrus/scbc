package p040o;

import android.view.View;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsFragment;

/* renamed from: o.getBusinessList */
public final /* synthetic */ class getBusinessList implements View.OnClickListener {
    private final /* synthetic */ OPRRewardsFragment read;

    public /* synthetic */ getBusinessList(OPRRewardsFragment oPRRewardsFragment) {
        this.read = oPRRewardsFragment;
    }

    public final void onClick(View view) {
        OPRRewardsFragment oPRRewardsFragment = this.read;
        oPRRewardsFragment.presenter.MediaBrowserCompat$CustomActionResultReceiver(oPRRewardsFragment.MediaBrowserCompat$CustomActionResultReceiver, oPRRewardsFragment.IconCompatParcelizer);
    }
}
