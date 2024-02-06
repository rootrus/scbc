package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getAnimatedValue */
public final class getAnimatedValue {
    @SerializedName("tokenUuid")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    public final String read;
    @SerializedName("refId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAnimatedValue)) {
            return false;
        }
        getAnimatedValue getanimatedvalue = (getAnimatedValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getanimatedvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getanimatedvalue.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getanimatedvalue.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoanOriginationOtpEntity(mobileNo=");
        sb.append(this.read);
        sb.append(", tokenUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", refId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
