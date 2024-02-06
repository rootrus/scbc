package p040o;

import com.scb.phone.view.activity.mwpartner.MwPinnedSuccessActivity;

/* renamed from: o.setDecorators */
public final class setDecorators implements MileageQuantitySelectionActivity<MwPinnedSuccessActivity> {
    public static void write(MwPinnedSuccessActivity mwPinnedSuccessActivity, ErrorEventDelegate errorEventDelegate) {
        mwPinnedSuccessActivity.presenter = errorEventDelegate;
    }
}
