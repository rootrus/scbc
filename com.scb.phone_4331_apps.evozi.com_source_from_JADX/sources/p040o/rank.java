package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.rank */
public final class rank {
    @SerializedName("rootCause")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof rank) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((rank) obj).write);
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
        sb.append("RootCauseRequest(rootCause=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public rank(String str) {
        onGetStartedClick.write((Object) str, "rootCause");
        this.write = str;
    }
}
