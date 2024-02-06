package p040o;

import java.io.Serializable;
import java.security.Principal;

/* renamed from: o.PurchaseInputActivity */
public final class PurchaseInputActivity implements PurchaseReviewActivity, Serializable {
    private final String MediaBrowserCompat$ItemReceiver;
    private final PromptPayOtpActivity read;

    @Deprecated
    public PurchaseInputActivity(String str) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Username:password string");
        int indexOf = str.indexOf(58);
        if (indexOf >= 0) {
            this.read = new PromptPayOtpActivity(str.substring(0, indexOf));
            this.MediaBrowserCompat$ItemReceiver = str.substring(indexOf + 1);
            return;
        }
        this.read = new PromptPayOtpActivity(str);
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final Principal MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final String write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PurchaseInputActivity) {
            PromptPayOtpActivity promptPayOtpActivity = this.read;
            PromptPayOtpActivity promptPayOtpActivity2 = ((PurchaseInputActivity) obj).read;
            if (promptPayOtpActivity == null ? promptPayOtpActivity2 == null : promptPayOtpActivity.equals(promptPayOtpActivity2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.read.toString();
    }
}
