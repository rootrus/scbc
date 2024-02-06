package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isAtLeastVersion */
public final class isAtLeastVersion {
    @SerializedName("transactionDateTime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionId")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isAtLeastVersion)) {
            return false;
        }
        isAtLeastVersion isatleastversion = (isAtLeastVersion) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isatleastversion.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isatleastversion.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowConfirmationEntity(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
