package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.endsWithGlobstar */
public final class endsWithGlobstar {
    @SerializedName("citizenId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof endsWithGlobstar) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((endsWithGlobstar) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlValidateOtaRequest(citizenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public endsWithGlobstar(String str) {
        onGetStartedClick.write((Object) str, "citizenId");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }
}
