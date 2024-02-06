package p040o;

import com.scb.phone.view.activity.debitprepaid.DebitPrepaidMenuActivity;
import com.scb.phone.view.activity.deeplink.BankingAgentTransactionsDeepLinkActivity;

/* renamed from: o.CaptureServer */
public final class CaptureServer implements MileageQuantitySelectionActivity<DebitPrepaidMenuActivity> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(DebitPrepaidMenuActivity debitPrepaidMenuActivity, makeAccessibleWithUnsafe makeaccessiblewithunsafe) {
        debitPrepaidMenuActivity.presenter = makeaccessiblewithunsafe;
    }

    /* renamed from: o.CaptureServer$9 */
    public final class C63709 implements MileageQuantitySelectionActivity<BankingAgentTransactionsDeepLinkActivity> {
        public static void read(BankingAgentTransactionsDeepLinkActivity bankingAgentTransactionsDeepLinkActivity, getJsonObjectFrom getjsonobjectfrom) {
            bankingAgentTransactionsDeepLinkActivity.presenter = getjsonobjectfrom;
        }
    }
}
