package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.iterator */
public class iterator {
    @SerializedName("deeplink")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("label")
    public String MediaBrowserCompat$ItemReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iterator iterator = (iterator) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? iterator.MediaBrowserCompat$ItemReceiver != null : !str.equals(iterator.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = iterator.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
