package p040o;

import com.scb.phone.view.activity.debitcard.DebitCardActivationActivity;

/* renamed from: o.onInit */
public final class onInit implements MileageQuantitySelectionActivity<DebitCardActivationActivity> {
    public static void MediaBrowserCompat$ItemReceiver(DebitCardActivationActivity debitCardActivationActivity, nativeGetNumberOfRows nativegetnumberofrows) {
        debitCardActivationActivity.presenter = nativegetnumberofrows;
    }
}
