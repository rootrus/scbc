package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.toContent$write$MediaBrowserCompat$ItemReceiver */
public final class toContent$write$MediaBrowserCompat$ItemReceiver {
    @SerializedName("unit")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("perUnit")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toContent$write$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        toContent$write$MediaBrowserCompat$ItemReceiver tocontent_write_mediabrowsercompat_itemreceiver = (toContent$write$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) tocontent_write_mediabrowsercompat_itemreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) tocontent_write_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentFrequency(perUnit=");
        sb.append(this.write);
        sb.append(", unit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
