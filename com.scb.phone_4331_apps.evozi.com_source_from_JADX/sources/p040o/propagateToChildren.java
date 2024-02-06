package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.propagateToChildren */
public final class propagateToChildren {
    @SerializedName("amount")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("perUnit")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("frequency")
    public final String read;
    @SerializedName("unit")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof propagateToChildren)) {
            return false;
        }
        propagateToChildren propagatetochildren = (propagateToChildren) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) propagatetochildren.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) propagatetochildren.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) propagatetochildren.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) propagatetochildren.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Installment(amount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", frequency=");
        sb.append(this.read);
        sb.append(", perUnit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", unit=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
