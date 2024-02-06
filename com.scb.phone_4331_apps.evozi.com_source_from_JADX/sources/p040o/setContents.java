package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setContents */
public final class setContents {
    @SerializedName("text")
    final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setContents) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((setContents) obj).read);
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
        sb.append("ItemEntity(text=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
