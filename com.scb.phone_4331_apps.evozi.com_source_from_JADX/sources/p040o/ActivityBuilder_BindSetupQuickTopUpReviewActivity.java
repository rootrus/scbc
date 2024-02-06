package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSetupQuickTopUpReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindSetupQuickTopUpReviewActivity implements View.OnClickListener {
    private final /* synthetic */ OnboardingAddressInformationFragment write;

    public /* synthetic */ ActivityBuilder_BindSetupQuickTopUpReviewActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.write = onboardingAddressInformationFragment;
    }

    public final void onClick(View view) {
        getPosX getposx = this.write.presenter;
        onStabilityDelay onstabilitydelay = new onStabilityDelay(getposx);
        if (getposx.RatingCompat != null) {
            onstabilitydelay.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
