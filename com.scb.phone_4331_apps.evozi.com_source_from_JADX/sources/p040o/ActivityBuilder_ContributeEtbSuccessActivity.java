package p040o;

import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.mwpartner.MwShopAddressStandAloneFragment;

/* renamed from: o.ActivityBuilder_ContributeEtbSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEtbSuccessActivity implements CustomAddressInput.read {
    private final /* synthetic */ MwShopAddressStandAloneFragment read;

    public /* synthetic */ ActivityBuilder_ContributeEtbSuccessActivity(MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment) {
        this.read = mwShopAddressStandAloneFragment;
    }

    public final void IconCompatParcelizer(boolean z) {
        MwShopAddressStandAloneFragment mwShopAddressStandAloneFragment = this.read;
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
