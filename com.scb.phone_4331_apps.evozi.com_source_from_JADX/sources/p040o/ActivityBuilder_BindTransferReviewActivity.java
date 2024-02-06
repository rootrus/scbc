package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingSuccessFragment;

/* renamed from: o.ActivityBuilder_BindTransferReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindTransferReviewActivity implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ OnboardingSuccessFragment read;

    public /* synthetic */ ActivityBuilder_BindTransferReviewActivity(OnboardingSuccessFragment onboardingSuccessFragment) {
        this.read = onboardingSuccessFragment;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTextColor gettextcolor = this.read.presenter;
        addCameraEventListeners addcameraeventlisteners = new addCameraEventListeners(gettextcolor);
        if (gettextcolor.RatingCompat != null) {
            addcameraeventlisteners.IconCompatParcelizer(gettextcolor.RatingCompat);
        }
    }
}
