package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setGeneratorType */
public final class setGeneratorType {
    @SerializedName("isAlertRequired")
    public Boolean read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setGeneratorType) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setGeneratorType) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.read;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartnerWebViewLocationRequest(isAlertRequired=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
