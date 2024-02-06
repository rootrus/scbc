package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setHoleColor */
public final class setHoleColor {
    @SerializedName("identification")
    public final String read;
    @SerializedName("nationality")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setHoleColor)) {
            return false;
        }
        setHoleColor setholecolor = (setHoleColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setholecolor.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setholecolor.read);
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
        sb.append("IdentificationDetailsEntity(nationality=");
        sb.append(this.write);
        sb.append(", identification=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
