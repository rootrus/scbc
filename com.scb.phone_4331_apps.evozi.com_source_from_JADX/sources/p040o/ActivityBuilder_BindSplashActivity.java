package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSplashActivity */
public final /* synthetic */ class ActivityBuilder_BindSplashActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment write;

    public /* synthetic */ ActivityBuilder_BindSplashActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.write = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.write.presenter;
        StabilityDelayEvent stabilityDelayEvent = new StabilityDelayEvent(getposx);
        if (getposx.RatingCompat != null) {
            stabilityDelayEvent.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
