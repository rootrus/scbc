package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getHeight */
public final class getHeight {
    @SerializedName("description")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("type")
    public final String read;
    @SerializedName("sequence")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHeight)) {
            return false;
        }
        getHeight getheight = (getHeight) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getheight.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getheight.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getheight.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollateralEntity(sequence=");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}
