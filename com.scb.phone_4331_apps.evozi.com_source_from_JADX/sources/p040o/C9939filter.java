package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.filter */
public final class C9939filter {
    @SerializedName("deviceId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C9939filter) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((C9939filter) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlValidateOtpRequest(deviceId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public C9939filter(String str) {
        onGetStartedClick.write((Object) str, "deviceId");
        this.read = str;
    }
}
