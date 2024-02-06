package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDrawSliceText */
public final class setDrawSliceText {
    @SerializedName("email")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("phoneNumber")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawSliceText)) {
            return false;
        }
        setDrawSliceText setdrawslicetext = (setDrawSliceText) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setdrawslicetext.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdrawslicetext.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactDetailsEntity(phoneNumber=");
        sb.append(this.write);
        sb.append(", email=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
