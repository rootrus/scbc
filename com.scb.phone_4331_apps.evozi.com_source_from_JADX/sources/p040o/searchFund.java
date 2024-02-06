package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomFundsActions;

/* renamed from: o.searchFund */
public final /* synthetic */ class searchFund implements View.OnClickListener {
    private final /* synthetic */ CustomFundsActions MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ searchFund(CustomFundsActions customFundsActions) {
        this.MediaBrowserCompat$ItemReceiver = customFundsActions;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBilledTabFragment fragmentBuilder_BindBilledTabFragment = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (fragmentBuilder_BindBilledTabFragment != null) {
            fragmentBuilder_BindBilledTabFragment.write("BUTTON_PURCHASE");
        }
    }
}
