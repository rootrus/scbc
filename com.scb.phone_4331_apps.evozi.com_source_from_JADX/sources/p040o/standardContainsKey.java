package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardContainsKey */
public final class standardContainsKey {
    @SerializedName("TH")
    public final ForwardingListIterator MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("EN")
    public final ForwardingListIterator MediaBrowserCompat$ItemReceiver;
    @SerializedName("usage")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardContainsKey)) {
            return false;
        }
        standardContainsKey standardcontainskey = (standardContainsKey) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardcontainskey.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardcontainskey.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardcontainskey.write);
    }

    public final int hashCode() {
        ForwardingListIterator forwardingListIterator = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = forwardingListIterator != null ? forwardingListIterator.hashCode() : 0;
        ForwardingListIterator forwardingListIterator2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = forwardingListIterator2 != null ? forwardingListIterator2.hashCode() : 0;
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressRequest(enAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", thAddress=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", usage=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public standardContainsKey(ForwardingListIterator forwardingListIterator, ForwardingListIterator forwardingListIterator2, String str) {
        this.MediaBrowserCompat$ItemReceiver = forwardingListIterator;
        this.MediaBrowserCompat$CustomActionResultReceiver = forwardingListIterator2;
        this.write = str;
    }
}
