package p040o;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.KeyPathElement */
public final class KeyPathElement {
    @SerializedName("email")
    public final String IconCompatParcelizer;
    @SerializedName("applicationUuid")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("uuid")
    public final String read;
    @SerializedName("otp")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyPathElement)) {
            return false;
        }
        KeyPathElement keyPathElement = (KeyPathElement) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) keyPathElement.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) keyPathElement.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) keyPathElement.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) keyPathElement.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlVerifyOTPRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", uuid=");
        sb.append(this.read);
        sb.append(", otp=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public KeyPathElement(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, Scopes.EMAIL);
        onGetStartedClick.write((Object) str3, "uuid");
        onGetStartedClick.write((Object) str4, "otp");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.write = str4;
    }
}
