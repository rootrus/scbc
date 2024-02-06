package p040o;

import com.scb.phone.view.fragment.hml.HmlVerifyIdentifyFragment;

/* renamed from: o.ActivityBuilder_BindFundRedeemOtpActivity */
public final class ActivityBuilder_BindFundRedeemOtpActivity implements MileageQuantitySelectionActivity<HmlVerifyIdentifyFragment> {
    public static void write(HmlVerifyIdentifyFragment hmlVerifyIdentifyFragment, UserLoginResponse userLoginResponse) {
        hmlVerifyIdentifyFragment.presenter = userLoginResponse;
    }
}
