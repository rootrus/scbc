package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.namesAndValuesToQueryString */
public final class namesAndValuesToQueryString {
    @SerializedName("transactionId")
    public final String IconCompatParcelizer;
    @SerializedName("issueDate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactionDateTime")
    public final String read;
    @SerializedName("remainingBalance")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof namesAndValuesToQueryString)) {
            return false;
        }
        namesAndValuesToQueryString namesandvaluestoquerystring = (namesAndValuesToQueryString) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) namesandvaluestoquerystring.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) namesandvaluestoquerystring.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) namesandvaluestoquerystring.IconCompatParcelizer) && Double.compare(this.write, namesandvaluestoquerystring.write) == 0;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        long doubleToLongBits = Double.doubleToLongBits(this.write);
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BondPurchaseConfirmationEntity(issueDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionDateTime=");
        sb.append(this.read);
        sb.append(", transactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remainingBalance=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
