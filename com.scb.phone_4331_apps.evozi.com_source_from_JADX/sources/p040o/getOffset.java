package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getOffset */
public final class getOffset {
    @SerializedName("rate")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName(alternate = {"maxAmount"}, value = "amount")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOffset)) {
            return false;
        }
        getOffset getoffset = (getOffset) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getoffset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getoffset.read);
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
        sb.append("DutyStampFee(rate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", amount=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
