package p040o;

import com.scb.phone.view.fragment.investment.onboarding.FundPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindOnBoardingTutorialActivity */
public final /* synthetic */ class ActivityBuilder_BindOnBoardingTutorialActivity implements ZHPR2$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ FundPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_BindOnBoardingTutorialActivity(FundPersonalInfoFragment fundPersonalInfoFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundPersonalInfoFragment;
    }

    public final void read() {
        FundPersonalInfoFragment fundPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!fundPersonalInfoFragment.MediaBrowserCompat$CustomActionResultReceiver) {
            unmuteAutoTorch unmuteautotorch = fundPersonalInfoFragment.personalInformationPresenter;
            removeLevelnessListener removelevelnesslistener = removeLevelnessListener.MediaBrowserCompat$CustomActionResultReceiver;
            if (unmuteautotorch.RatingCompat != null) {
                removelevelnesslistener.IconCompatParcelizer(unmuteautotorch.RatingCompat);
            }
            fundPersonalInfoFragment.MediaBrowserCompat$CustomActionResultReceiver = true;
        }
    }
}
