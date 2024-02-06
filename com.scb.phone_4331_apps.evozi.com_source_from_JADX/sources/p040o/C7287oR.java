package p040o;

import com.scb.phone.view.activity.deeplink.PurchasesPaymentDeepLinkActivity;
import p040o.CaptureGuidance;

/* renamed from: o.oR */
public final class C7287oR implements MileageQuantitySelectionActivity<PurchasesPaymentDeepLinkActivity> {
    public static void read(PurchasesPaymentDeepLinkActivity purchasesPaymentDeepLinkActivity, CaptureGuidance.GuidanceSource guidanceSource) {
        purchasesPaymentDeepLinkActivity.presenter = guidanceSource;
    }
}
