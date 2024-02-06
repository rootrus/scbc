package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSetupQuickBalanceActivity */
public final /* synthetic */ class ActivityBuilder_BindSetupQuickBalanceActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindSetupQuickBalanceActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        isBelowThreshold isbelowthreshold = new isBelowThreshold(getposx);
        if (getposx.RatingCompat != null) {
            isbelowthreshold.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
