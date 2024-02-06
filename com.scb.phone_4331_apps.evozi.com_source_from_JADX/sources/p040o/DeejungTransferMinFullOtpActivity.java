package p040o;

import android.app.Activity;
import com.thunderhead.connectivity.NetworkOperationError;

/* renamed from: o.DeejungTransferMinFullOtpActivity */
public final class DeejungTransferMinFullOtpActivity {
    public static DeejungTransferMinFullOtpActivity read;
    public write IconCompatParcelizer;

    public DeejungTransferMinFullOtpActivity() {
        new DeejungTransferMinFullReviewActivity();
    }

    /* renamed from: o.DeejungTransferMinFullOtpActivity$write */
    public static class write {
        public onAccountSummaryClick$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        public NetworkOperationError MediaBrowserCompat$CustomActionResultReceiver;
        public int write;

        public write(int i, NetworkOperationError networkOperationError, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = networkOperationError;
            this.IconCompatParcelizer = onaccountsummaryclick_mediabrowsercompat_itemreceiver;
        }
    }

    public final onAccountSummaryClick MediaBrowserCompat$CustomActionResultReceiver(Activity activity, int i, NetworkOperationError networkOperationError, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
        if (activity == null) {
            this.IconCompatParcelizer = new write(i, networkOperationError, onaccountsummaryclick_mediabrowsercompat_itemreceiver);
            return null;
        }
        onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick(DeejungTransferMinFullReviewActivity.write(activity, i), DeejungTransferMinFullReviewActivity.read(activity, i), activity.getString(17039370), "");
        onaccountsummaryclick.IconCompatParcelizer = new SaveSlipBaseActivity_ViewBinding(this, i, onaccountsummaryclick_mediabrowsercompat_itemreceiver);
        activity.runOnUiThread(new SelectPurchasesActivity_ViewBinding(onaccountsummaryclick, activity));
        return onaccountsummaryclick;
    }
}
