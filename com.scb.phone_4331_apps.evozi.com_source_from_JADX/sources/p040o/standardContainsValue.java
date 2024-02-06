package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardContainsValue */
public final class standardContainsValue {
    @SerializedName("newAddress")
    public final standardContainsKey MediaBrowserCompat$ItemReceiver;
    @SerializedName("tokenId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardContainsValue)) {
            return false;
        }
        standardContainsValue standardcontainsvalue = (standardContainsValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardcontainsvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardcontainsvalue.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        standardContainsKey standardcontainskey = this.MediaBrowserCompat$ItemReceiver;
        if (standardcontainskey != null) {
            i = standardcontainskey.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressUpdateRequest(tokenId=");
        sb.append(this.read);
        sb.append(", newAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardContainsValue(String str, standardContainsKey standardcontainskey) {
        onGetStartedClick.write((Object) str, "tokenId");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = standardcontainskey;
    }
}
