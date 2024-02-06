package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.emptyMap */
public final class emptyMap {
    @SerializedName("code")
    private final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof emptyMap) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((emptyMap) obj).read);
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
        sb.append("Code(code=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public emptyMap(String str) {
        this.read = str;
    }
}
