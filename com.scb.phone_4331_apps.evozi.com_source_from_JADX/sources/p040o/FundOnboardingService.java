package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CustomFundSelect;

/* renamed from: o.FundOnboardingService */
public final /* synthetic */ class FundOnboardingService implements View.OnClickListener {
    private final /* synthetic */ CustomFundSelect read;

    public /* synthetic */ FundOnboardingService(CustomFundSelect customFundSelect) {
        this.read = customFundSelect;
    }

    public final void onClick(View view) {
        CustomFundSelect customFundSelect = this.read;
        FragmentBuilder_BindBulkTransferGroupsFragment fragmentBuilder_BindBulkTransferGroupsFragment = customFundSelect.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBulkTransferGroupsFragment != null) {
            fragmentBuilder_BindBulkTransferGroupsFragment.MediaBrowserCompat$ItemReceiver(customFundSelect);
        }
    }
}
