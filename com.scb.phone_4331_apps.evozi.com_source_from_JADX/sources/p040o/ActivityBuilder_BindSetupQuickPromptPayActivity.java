package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSetupQuickPromptPayActivity */
public final /* synthetic */ class ActivityBuilder_BindSetupQuickPromptPayActivity implements View.OnClickListener {
    private final /* synthetic */ OnboardingAddressInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindSetupQuickPromptPayActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingAddressInformationFragment;
    }

    public final void onClick(View view) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        onTorchLuminance ontorchluminance = new onTorchLuminance(getposx);
        if (getposx.RatingCompat != null) {
            ontorchluminance.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
