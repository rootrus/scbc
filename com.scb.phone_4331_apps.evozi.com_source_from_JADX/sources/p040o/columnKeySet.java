package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.columnKeySet */
public final class columnKeySet {
    @SerializedName("consentType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("consentStatus")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof columnKeySet)) {
            return false;
        }
        columnKeySet columnkeyset = (columnKeySet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) columnkeyset.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) columnkeyset.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) columnkeyset.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EkycConsentRequest(productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentStatus=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public columnKeySet(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "consentType");
        onGetStartedClick.write((Object) str3, "consentStatus");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }
}
