package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onMyLocationChange */
public final class onMyLocationChange {
    @SerializedName("dateOfBirth")
    private final String IconCompatParcelizer;
    @SerializedName("cardType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onMyLocationChange)) {
            return false;
        }
        onMyLocationChange onmylocationchange = (onMyLocationChange) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onmylocationchange.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onmylocationchange.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onmylocationchange.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyUserRequest(cardId=");
        sb.append(this.write);
        sb.append(", cardType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", dateOfBirth=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public onMyLocationChange(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "cardId");
        onGetStartedClick.write((Object) str2, "cardType");
        onGetStartedClick.write((Object) str3, "dateOfBirth");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
    }
}
