package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardEntrySet */
public final class standardEntrySet {
    @SerializedName("address")
    private final standardHashCode MediaBrowserCompat$CustomActionResultReceiver;

    public standardEntrySet() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof standardEntrySet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((standardEntrySet) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        standardHashCode standardhashcode = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (standardhashcode != null) {
            return standardhashcode.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressesValidationRequest(addresses=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardEntrySet(standardHashCode standardhashcode) {
        this.MediaBrowserCompat$CustomActionResultReceiver = standardhashcode;
    }

    private /* synthetic */ standardEntrySet(byte b) {
        this((standardHashCode) null);
    }
}
