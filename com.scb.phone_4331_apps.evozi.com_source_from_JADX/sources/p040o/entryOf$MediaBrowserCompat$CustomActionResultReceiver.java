package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.entryOf$MediaBrowserCompat$CustomActionResultReceiver */
public class entryOf$MediaBrowserCompat$CustomActionResultReceiver {
    @SerializedName("version")
    int IconCompatParcelizer;
    @SerializedName("type")
    String MediaBrowserCompat$ItemReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        entryOf$MediaBrowserCompat$CustomActionResultReceiver entryof_mediabrowsercompat_customactionresultreceiver = (entryOf$MediaBrowserCompat$CustomActionResultReceiver) obj;
        if (this.IconCompatParcelizer == entryof_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) {
            String str = this.MediaBrowserCompat$ItemReceiver;
            String str2 = entryof_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        return ((str != null ? str.hashCode() : 0) * 31) + this.IconCompatParcelizer;
    }
}
