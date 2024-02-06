package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.hashFor */
public final class hashFor {
    @SerializedName("transactionDateTime")
    public final String IconCompatParcelizer;
    @SerializedName("homeBranch")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hashFor)) {
            return false;
        }
        hashFor hashfor = (hashFor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) hashfor.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hashfor.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hashfor.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hashfor.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlTermsConditionsOTPEntity(accountName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", homeBranch=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
