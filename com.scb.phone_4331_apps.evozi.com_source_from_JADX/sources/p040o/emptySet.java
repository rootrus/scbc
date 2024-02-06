package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.emptySet */
public final class emptySet {
    @SerializedName("mobileNumber")
    private final String IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof emptySet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((emptySet) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TouchPointValidationRequest(mobileNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public emptySet(String str) {
        onGetStartedClick.write((Object) str, "mobileNumber");
        this.IconCompatParcelizer = str;
    }
}
