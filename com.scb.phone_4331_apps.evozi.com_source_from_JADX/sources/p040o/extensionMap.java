package p040o;

import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingTcActivity;
import p040o.CaptureMessage;

/* renamed from: o.extensionMap */
public final class extensionMap implements MileageQuantitySelectionActivity<ScbsOnboardingTcActivity> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(ScbsOnboardingTcActivity scbsOnboardingTcActivity, CaptureMessage.KUIMessageOrientation kUIMessageOrientation) {
        scbsOnboardingTcActivity.presenter = kUIMessageOrientation;
    }
}
