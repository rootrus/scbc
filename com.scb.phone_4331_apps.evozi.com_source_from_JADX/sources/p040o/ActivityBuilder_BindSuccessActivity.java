package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSuccessActivity */
public final /* synthetic */ class ActivityBuilder_BindSuccessActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindSuccessActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        imageDataToBitmap imagedatatobitmap = new imageDataToBitmap(getposx);
        if (getposx.RatingCompat != null) {
            imagedatatobitmap.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
