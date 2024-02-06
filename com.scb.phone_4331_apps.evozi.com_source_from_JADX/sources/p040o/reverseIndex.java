package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.reverseIndex */
public final class reverseIndex {
    @SerializedName("consentStatus")
    private final String IconCompatParcelizer;
    @SerializedName("productType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    public String read;
    @SerializedName("consentType")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reverseIndex)) {
            return false;
        }
        reverseIndex reverseindex = (reverseIndex) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reverseindex.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reverseindex.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) reverseindex.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reverseindex.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdatePrivacyConsentRequest(consentType=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentStatus=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tilesVersion=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    private reverseIndex(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "consentType");
        onGetStartedClick.write((Object) str2, "productType");
        onGetStartedClick.write((Object) str3, "consentStatus");
        onGetStartedClick.write((Object) str4, "tilesVersion");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public /* synthetic */ reverseIndex(String str, String str2, String str3) {
        this(str, str2, str3, "");
    }
}
