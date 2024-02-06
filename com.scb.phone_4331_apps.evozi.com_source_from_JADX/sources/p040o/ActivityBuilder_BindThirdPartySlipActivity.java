package p040o;

import com.scb.phone.view.adapter.investment.onboarding.FundAccountPagerAdapter;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingSelectAccountFragment;

/* renamed from: o.ActivityBuilder_BindThirdPartySlipActivity */
public final /* synthetic */ class ActivityBuilder_BindThirdPartySlipActivity implements FundAccountPagerAdapter.read {
    private final /* synthetic */ OnboardingSelectAccountFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindThirdPartySlipActivity(OnboardingSelectAccountFragment onboardingSelectAccountFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingSelectAccountFragment;
    }

    public final void write(int i) {
        C4041ao aoVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        removeAllViews removeallviews = new removeAllViews(aoVar, i);
        if (aoVar.RatingCompat != null) {
            removeallviews.IconCompatParcelizer(aoVar.RatingCompat);
        }
    }
}
