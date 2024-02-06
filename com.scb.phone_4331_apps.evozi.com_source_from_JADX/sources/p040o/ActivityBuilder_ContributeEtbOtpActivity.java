package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressStandAloneFragment;

/* renamed from: o.ActivityBuilder_ContributeEtbOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEtbOtpActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressStandAloneFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeEtbOtpActivity(MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment) {
        this.IconCompatParcelizer = mwShopAddressStandAloneFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment = this.IconCompatParcelizer;
        mwShopAddressStandAloneFragment.MediaBrowserCompat$CustomActionResultReceiver = z;
        getErrDesc geterrdesc = mwShopAddressStandAloneFragment.presenter;
        boolean z2 = true;
        setProcessingProfile setprocessingprofile = new setProcessingProfile(z && mwShopAddressStandAloneFragment.IconCompatParcelizer);
        if (geterrdesc.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setprocessingprofile.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }
}
