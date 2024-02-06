package p040o;

import android.view.View;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInputAddressFragment;

/* renamed from: o.ActivityBuilder_BindTempLimitReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindTempLimitReviewActivity implements View.OnClickListener {
    private final /* synthetic */ OnboardingInputAddressFragment write;

    public /* synthetic */ ActivityBuilder_BindTempLimitReviewActivity(OnboardingInputAddressFragment onboardingInputAddressFragment) {
        this.write = onboardingInputAddressFragment;
    }

    public final void onClick(View view) {
        CaptureMessage captureMessage = this.write.presenter;
        getDaysRemaining getdaysremaining = getDaysRemaining.IconCompatParcelizer;
        if (captureMessage.RatingCompat != null) {
            getdaysremaining.IconCompatParcelizer(captureMessage.RatingCompat);
        }
    }
}
