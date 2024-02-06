package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSmeLoanDetailActivity */
public final /* synthetic */ class ActivityBuilder_BindSmeLoanDetailActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment write;

    public /* synthetic */ ActivityBuilder_BindSmeLoanDetailActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.write = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.write.presenter;
        getLuminance getluminance = new getLuminance(getposx);
        if (getposx.RatingCompat != null) {
            getluminance.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
