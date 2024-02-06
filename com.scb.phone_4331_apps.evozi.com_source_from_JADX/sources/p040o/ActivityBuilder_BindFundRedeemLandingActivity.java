package p040o;

import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOccupationInfoFragment;

/* renamed from: o.ActivityBuilder_BindFundRedeemLandingActivity */
public final class ActivityBuilder_BindFundRedeemLandingActivity implements MileageQuantitySelectionActivity<HmlBusinessOccupationInfoFragment> {
    public static void read(HmlBusinessOccupationInfoFragment hmlBusinessOccupationInfoFragment, setUserLoggedIn<ExtractionCredentials> setuserloggedin) {
        hmlBusinessOccupationInfoFragment.presenter = setuserloggedin;
    }
}
