package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.push */
public final class push {
    @SerializedName("instPaymentInfo")
    public final isDotDot MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionInfo")
    public final url write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof push)) {
            return false;
        }
        push push = (push) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) push.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) push.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        url url = this.write;
        int i = 0;
        int hashCode = url != null ? url.hashCode() : 0;
        isDotDot isdotdot = this.MediaBrowserCompat$ItemReceiver;
        if (isdotdot != null) {
            i = isdotdot.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionResponseEntity(unbillInfo=");
        sb.append(this.write);
        sb.append(", instPaymentInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
