package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingAddressInformationFragment;

/* renamed from: o.ActivityBuilder_BindSummaryDetailActivity */
public final /* synthetic */ class ActivityBuilder_BindSummaryDetailActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OnboardingAddressInformationFragment read;

    public /* synthetic */ ActivityBuilder_BindSummaryDetailActivity(OnboardingAddressInformationFragment onboardingAddressInformationFragment) {
        this.read = onboardingAddressInformationFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        getPosX getposx = this.read.presenter;
        TorchLuminanceListener torchLuminanceListener = new TorchLuminanceListener(getposx);
        if (getposx.RatingCompat != null) {
            torchLuminanceListener.IconCompatParcelizer(getposx.RatingCompat);
        }
    }
}
