package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardListIterator */
public final class standardListIterator {
    @SerializedName("tilesVersion")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof standardListIterator) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((standardListIterator) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLandingRequest(tilesVersion=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public standardListIterator(String str) {
        this.write = str;
    }
}
