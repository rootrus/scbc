package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSelectPurchasesActivity */
public final /* synthetic */ class ActivityBuilder_BindSelectPurchasesActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment read;

    public /* synthetic */ ActivityBuilder_BindSelectPurchasesActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.read = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.read.presenter;
        getStability getstability = new getStability(getposx);
        if (getposx.RatingCompat != null) {
            getstability.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
