package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.encodedPassword */
public final class encodedPassword {
    @SerializedName("qrCode")
    public final String IconCompatParcelizer;
    @SerializedName("remainingLimit")
    public final Double MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("validDuration")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("function")
    public final String read;
    @SerializedName("expiryDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof encodedPassword)) {
            return false;
        }
        encodedPassword encodedpassword = (encodedPassword) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) encodedpassword.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) encodedpassword.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) encodedpassword.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) encodedpassword.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) encodedpassword.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        Double d = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (d != null) {
            i = d.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BScanCEntryPointEntity(function=");
        sb.append(this.read);
        sb.append(", expiryDateTime=");
        sb.append(this.write);
        sb.append(", validDuration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", qrCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remainingLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
