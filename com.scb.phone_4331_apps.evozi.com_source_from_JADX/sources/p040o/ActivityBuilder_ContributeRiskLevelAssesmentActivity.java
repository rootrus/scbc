package p040o;

import android.view.View;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;

/* renamed from: o.ActivityBuilder_ContributeRiskLevelAssesmentActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRiskLevelAssesmentActivity implements View.OnClickListener {
    private final /* synthetic */ AccountSourceSelectFragment read;

    public /* synthetic */ ActivityBuilder_ContributeRiskLevelAssesmentActivity(AccountSourceSelectFragment accountSourceSelectFragment) {
        this.read = accountSourceSelectFragment;
    }

    public final void onClick(View view) {
        AccountSourceSelectFragment accountSourceSelectFragment = this.read;
        accountSourceSelectFragment.accountSourcePresenter.read(accountSourceSelectFragment.MediaBrowserCompat$CustomActionResultReceiver, accountSourceSelectFragment.IconCompatParcelizer, accountSourceSelectFragment.MediaBrowserCompat$MediaItem, accountSourceSelectFragment.MediaMetadataCompat);
    }
}
