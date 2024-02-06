package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.equal */
public final class equal {
    @SerializedName("description")
    public final String read;
    @SerializedName("header")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof equal)) {
            return false;
        }
        equal equal = (equal) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) equal.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) equal.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GMBMoreInfoEntity(header=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
