package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.root */
public final class root {
    @SerializedName("requestTimeout")
    public final String IconCompatParcelizer;
    @SerializedName("requestId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("requestMessage")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof root)) {
            return false;
        }
        root root = (root) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) root.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) root.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) root.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdpRequestEntity(requestMessage=");
        sb.append(this.write);
        sb.append(", requestId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", requestTimeout=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
