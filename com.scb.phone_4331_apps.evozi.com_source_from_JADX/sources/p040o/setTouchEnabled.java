package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setTouchEnabled */
public final class setTouchEnabled {
    @SerializedName("nameEN")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("profilePhotoPath")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("nameTH")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTouchEnabled)) {
            return false;
        }
        setTouchEnabled settouchenabled = (setTouchEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) settouchenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settouchenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) settouchenabled.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AllowAddDeviceEntity(nameTH=");
        sb.append(this.read);
        sb.append(", nameEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", profilePhotoPath=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}
