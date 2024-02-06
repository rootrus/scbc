package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.percentDecode */
public final class percentDecode {
    @SerializedName("bondsSummaryRemark")
    public final String IconCompatParcelizer;
    @SerializedName("transactionToken")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountFromName")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof percentDecode)) {
            return false;
        }
        percentDecode percentdecode = (percentDecode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) percentdecode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) percentdecode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) percentdecode.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BondPurchaseVerificationEntity(transactionToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountFromName=");
        sb.append(this.read);
        sb.append(", bondsSummaryRemark=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
