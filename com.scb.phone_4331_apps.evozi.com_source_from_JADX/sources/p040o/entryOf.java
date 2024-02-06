package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.entryOf */
public class entryOf {
    @SerializedName("tcAccept")
    private entryOf$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.equals(((entryOf) obj).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int hashCode() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }
}
