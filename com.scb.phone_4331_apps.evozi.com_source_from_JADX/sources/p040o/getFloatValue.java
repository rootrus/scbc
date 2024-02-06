package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getFloatValue */
public final class getFloatValue {
    @SerializedName("contentSource")
    private final String IconCompatParcelizer;
    @SerializedName("content")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    private final String read;
    @SerializedName("applicationUuid")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFloatValue)) {
            return false;
        }
        getFloatValue getfloatvalue = (getFloatValue) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfloatvalue.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfloatvalue.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getfloatvalue.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getfloatvalue.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlBusinessOwnerConsentEntity(applicationUuid=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.read);
        sb.append(", contentSource=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", content=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
