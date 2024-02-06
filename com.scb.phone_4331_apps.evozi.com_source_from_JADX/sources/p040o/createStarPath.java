package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createStarPath */
public final class createStarPath {
    @SerializedName("mobileNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("email")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createStarPath)) {
            return false;
        }
        createStarPath createstarpath = (createStarPath) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) createstarpath.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createstarpath.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("CustomerContactInfo(mobileNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", email=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}
