package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomFundsActions;

/* renamed from: o.FundDiscoverService */
public final /* synthetic */ class FundDiscoverService implements View.OnClickListener {
    private final /* synthetic */ CustomFundsActions MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FundDiscoverService(CustomFundsActions customFundsActions) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customFundsActions;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBilledTabFragment fragmentBuilder_BindBilledTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        if (fragmentBuilder_BindBilledTabFragment != null) {
            fragmentBuilder_BindBilledTabFragment.write("BUTTON_REDEEM");
        }
    }
}
