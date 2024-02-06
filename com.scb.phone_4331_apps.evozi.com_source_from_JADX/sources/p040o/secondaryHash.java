package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.secondaryHash */
public final class secondaryHash {
    @SerializedName("walletId")
    public final String IconCompatParcelizer;
    @SerializedName("transactionDateTime")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("GMB")
    public final skipUnquotedValue read;
    @SerializedName("merchantId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof secondaryHash)) {
            return false;
        }
        secondaryHash secondaryhash = (secondaryHash) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) secondaryhash.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) secondaryhash.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) secondaryhash.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) secondaryhash.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        skipUnquotedValue skipunquotedvalue = this.read;
        if (skipunquotedvalue != null) {
            i = skipunquotedvalue.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MwReviewConfirmationSuccessEntity(merchantId=");
        sb.append(this.write);
        sb.append(", walletId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionDateTime=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", gmb=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
