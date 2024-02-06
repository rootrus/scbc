package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSharingMomentsPreviewActivity */
public final /* synthetic */ class ActivityBuilder_BindSharingMomentsPreviewActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment read;

    public /* synthetic */ ActivityBuilder_BindSharingMomentsPreviewActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.read = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.read.presenter;
        TorchLuminanceEvent torchLuminanceEvent = new TorchLuminanceEvent(getposx);
        if (getposx.RatingCompat != null) {
            torchLuminanceEvent.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
