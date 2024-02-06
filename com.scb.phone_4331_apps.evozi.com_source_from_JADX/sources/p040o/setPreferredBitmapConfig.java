package p040o;

import com.scb.phone.view.activity.hml.NTBPinLoginActivity;

/* renamed from: o.setPreferredBitmapConfig */
public final class setPreferredBitmapConfig implements MileageQuantitySelectionActivity<NTBPinLoginActivity> {
    public static void read(NTBPinLoginActivity nTBPinLoginActivity, isUserLoggedIn isuserloggedin) {
        nTBPinLoginActivity.presenter = isuserloggedin;
    }
}
