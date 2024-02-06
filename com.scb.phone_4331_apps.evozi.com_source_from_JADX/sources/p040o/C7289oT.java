package p040o;

import com.scb.phone.view.activity.deeplink.ScbsOnboardDeepLinkActivity;

/* renamed from: o.oT */
public final class C7289oT implements MileageQuantitySelectionActivity<ScbsOnboardDeepLinkActivity> {
    public static void read(ScbsOnboardDeepLinkActivity scbsOnboardDeepLinkActivity, BoundaryType boundaryType) {
        scbsOnboardDeepLinkActivity.presenter = boundaryType;
    }
}
