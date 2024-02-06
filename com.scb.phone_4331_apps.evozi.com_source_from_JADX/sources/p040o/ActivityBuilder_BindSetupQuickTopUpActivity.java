package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSetupQuickTopUpActivity */
public final /* synthetic */ class ActivityBuilder_BindSetupQuickTopUpActivity implements View.OnClickListener {
    private final /* synthetic */ OnboardingAddressInformationFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindSetupQuickTopUpActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.MediaBrowserCompat$ItemReceiver = onboardingAddressInformationFragment;
    }

    public final void onClick(View view) {
        getPosX getposx = this.MediaBrowserCompat$ItemReceiver.presenter;
        isTorchOn istorchon = new isTorchOn(getposx);
        if (getposx.RatingCompat != null) {
            istorchon.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
