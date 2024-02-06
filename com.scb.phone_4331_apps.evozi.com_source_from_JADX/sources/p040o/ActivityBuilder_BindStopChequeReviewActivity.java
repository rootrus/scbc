package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindStopChequeReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindStopChequeReviewActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment read;

    public /* synthetic */ ActivityBuilder_BindStopChequeReviewActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.read = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.read.presenter;
        StabilityDelayListener stabilityDelayListener = new StabilityDelayListener(getposx);
        if (getposx.RatingCompat != null) {
            stabilityDelayListener.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
