package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.hasNext */
public final class hasNext {
    @SerializedName("requestDatetime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("requestId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasNext)) {
            return false;
        }
        hasNext hasnext = (hasNext) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hasnext.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) hasnext.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationResponseEntity(requestDatetime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", requestID=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
