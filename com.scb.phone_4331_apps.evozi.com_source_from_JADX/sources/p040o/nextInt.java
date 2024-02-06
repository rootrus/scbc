package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.nextInt */
public final class nextInt {
    @SerializedName("sortSequence")
    public final Integer IconCompatParcelizer;
    @SerializedName("productType")
    public final skipValue MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationId")
    public final String read;
    @SerializedName("accountNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nextInt)) {
            return false;
        }
        nextInt nextint = (nextInt) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) nextint.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) nextint.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) nextint.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) nextint.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.read;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        skipValue skipvalue = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (skipvalue != null) {
            i = skipvalue.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLoanAndDepositListEntity(sortSequence=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
