package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.beginArray */
public final class beginArray {
    @SerializedName("newAddressUsage")
    public final String IconCompatParcelizer;
    @SerializedName("requestProduct")
    public final List<skipName> MediaBrowserCompat$ItemReceiver;
    @SerializedName("newFormattedAddresses")
    public final List<List<String>> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beginArray)) {
            return false;
        }
        beginArray beginarray = (beginArray) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) beginarray.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) beginarray.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) beginarray.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<List<String>> list = this.write;
        int hashCode2 = list != null ? list.hashCode() : 0;
        List<skipName> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressConfirmationDetailsResponseEntity(newAddressUsage=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", formattedAddresses=");
        sb.append(this.write);
        sb.append(", requestProduct=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
