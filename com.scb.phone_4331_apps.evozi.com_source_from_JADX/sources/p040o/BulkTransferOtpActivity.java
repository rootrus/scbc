package p040o;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: o.BulkTransferOtpActivity */
public final class BulkTransferOtpActivity implements BulkTransferInputActivity {
    private ArrayList<String> MediaBrowserCompat$ItemReceiver = new ArrayList<>();

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$ItemReceiver.size() > 0) {
            this.MediaBrowserCompat$ItemReceiver.remove(0);
            if (this.MediaBrowserCompat$ItemReceiver.size() > 0) {
                write(this.MediaBrowserCompat$ItemReceiver.get(0));
            }
        }
    }

    private void write(String str) {
        boolean z;
        if (!onReviewButtonClicked.read()) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, "Unable to transfer identity via custom tabs because the app has no custom tabs dependency");
            z = false;
        } else {
            z = true;
        }
        if (z) {
            new BulkTransferInputActivity_ViewBinding((Context) null, str, this).write();
        } else {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
