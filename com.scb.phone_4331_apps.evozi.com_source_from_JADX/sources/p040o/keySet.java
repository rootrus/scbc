package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.LinkedHashTreeMap;

/* renamed from: o.keySet */
public final class keySet {
    @SerializedName("contactInfo")
    public final LinkedHashTreeMap.C35681 IconCompatParcelizer;
    @SerializedName("personalInfo")
    public final contains MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("occupation")
    public final next MediaBrowserCompat$ItemReceiver;
    @SerializedName("customerAddedDate")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof keySet)) {
            return false;
        }
        keySet keyset = (keySet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) keyset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) keyset.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keyset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keyset.write);
    }

    public final int hashCode() {
        contains contains = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = contains != null ? contains.hashCode() : 0;
        LinkedHashTreeMap.C35681 r2 = this.IconCompatParcelizer;
        int hashCode2 = r2 != null ? r2.hashCode() : 0;
        next next = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = next != null ? next.hashCode() : 0;
        String str = this.write;
        if (str != null) {
            i = str.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpCustomerDataEntity(personalInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", contactInfo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", occupation=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", customerAddedDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}
