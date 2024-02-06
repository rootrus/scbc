package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createFromParcel */
public final class createFromParcel {
    @SerializedName("id_token")
    public final String IconCompatParcelizer;
    @SerializedName("access_token")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("refresh_token")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createFromParcel)) {
            return false;
        }
        createFromParcel createfromparcel = (createFromParcel) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) createfromparcel.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) createfromparcel.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createfromparcel.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GoogleSigninTokenResponseEntity(accessToken=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", idToken=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", refreshToken=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
