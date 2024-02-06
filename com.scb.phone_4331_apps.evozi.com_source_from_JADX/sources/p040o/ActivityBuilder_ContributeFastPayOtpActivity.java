package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressStandAloneFragment;

/* renamed from: o.ActivityBuilder_ContributeFastPayOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeFastPayOtpActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressStandAloneFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeFastPayOtpActivity(MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment) {
        this.IconCompatParcelizer = mwShopAddressStandAloneFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment = this.IconCompatParcelizer;
        getErrDesc geterrdesc = mwShopAddressStandAloneFragment.presenter;
        boolean z2 = true;
        setProcessingProfile setprocessingprofile = new setProcessingProfile(mwShopAddressStandAloneFragment.MediaBrowserCompat$CustomActionResultReceiver && mwShopAddressStandAloneFragment.IconCompatParcelizer);
        if (geterrdesc.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setprocessingprofile.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }
}
