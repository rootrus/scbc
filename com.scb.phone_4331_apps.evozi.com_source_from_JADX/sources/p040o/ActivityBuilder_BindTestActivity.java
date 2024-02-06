package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInvestmentInformationFragment;

/* renamed from: o.ActivityBuilder_BindTestActivity */
public final /* synthetic */ class ActivityBuilder_BindTestActivity implements View.OnClickListener {
    private final /* synthetic */ OnboardingInvestmentInformationFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindTestActivity(OnboardingInvestmentInformationFragment onboardingInvestmentInformationFragment) {
        this.IconCompatParcelizer = onboardingInvestmentInformationFragment;
    }

    public final void onClick(View view) {
        getPosY getposy = this.IconCompatParcelizer.presenter;
        licenseFound licensefound = licenseFound.IconCompatParcelizer;
        if (getposy.RatingCompat != null) {
            licensefound.IconCompatParcelizer(getposy.RatingCompat);
        }
    }
}
