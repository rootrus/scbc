package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.postReadCleanup */
public final class postReadCleanup {
    @SerializedName("objectiveId")
    private final String IconCompatParcelizer;
    @SerializedName("accountType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("tilesVersion")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("productCode")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof postReadCleanup)) {
            return false;
        }
        postReadCleanup postreadcleanup = (postReadCleanup) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) postreadcleanup.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) postreadcleanup.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) postreadcleanup.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) postreadcleanup.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EtbEligibilityValidationsRequest(accountType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productCode=");
        sb.append(this.read);
        sb.append(", objectiveId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tilesVersion=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public postReadCleanup(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "accountType");
        onGetStartedClick.write((Object) str2, "productCode");
        onGetStartedClick.write((Object) str3, "objectiveId");
        onGetStartedClick.write((Object) str4, "tilesVersion");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}
