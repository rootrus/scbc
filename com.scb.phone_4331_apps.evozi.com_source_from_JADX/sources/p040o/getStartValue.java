package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStartValue */
public final class getStartValue extends setCurrentItemInternal {
    @SerializedName("transactionToken")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("fee")
    public final String read;
    @SerializedName("accountName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartValue)) {
            return false;
        }
        getStartValue getstartvalue = (getStartValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstartvalue.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstartvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartvalue.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCashOutVerificationEntity(transactionToken=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", fee=");
        sb.append(this.read);
        sb.append(", accountName=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
