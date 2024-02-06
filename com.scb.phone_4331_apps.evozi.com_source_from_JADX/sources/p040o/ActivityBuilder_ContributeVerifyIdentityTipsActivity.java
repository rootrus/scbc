package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.transferandpay.TopUpTabFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpHistoryFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;

/* renamed from: o.ActivityBuilder_ContributeVerifyIdentityTipsActivity */
public final /* synthetic */ class ActivityBuilder_ContributeVerifyIdentityTipsActivity implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ TopUpTabFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeVerifyIdentityTipsActivity(TopUpTabFragment topUpTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = topUpTabFragment;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        TopUpTargetTabFragment topUpTargetTabFragment;
        getMortgageTopupOffers getmortgagetopupoffers;
        TopUpHistoryFragment topUpHistoryFragment;
        TopUpTabFragment topUpTabFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i >= i2 && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250 && (topUpTargetTabFragment = topUpTabFragment.IconCompatParcelizer) != null) {
            FragmentWrapContentViewPager fragmentWrapContentViewPager = topUpTargetTabFragment.mTabPager;
            if (fragmentWrapContentViewPager == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTabPager");
            }
            if (fragmentWrapContentViewPager.getCurrentItem() == 1 && (getmortgagetopupoffers = topUpTargetTabFragment.MediaBrowserCompat$CustomActionResultReceiver) != null && (topUpHistoryFragment = getmortgagetopupoffers.IconCompatParcelizer) != null && topUpHistoryFragment.IconCompatParcelizer && !topUpHistoryFragment.isDetached()) {
                topUpHistoryFragment.IconCompatParcelizer = false;
                topUpHistoryFragment.MediaDescriptionCompat().write();
            }
        }
    }
}
