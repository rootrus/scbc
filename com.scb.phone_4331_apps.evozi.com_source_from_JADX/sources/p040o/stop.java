package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.stop */
public class stop {
    @SerializedName("sortSequence")
    public int IconCompatParcelizer;
    @SerializedName("loanTypeTH")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("loanTypeEN")
    public String read;

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof stop)) {
            return false;
        }
        stop stop = (stop) obj;
        if (this.IconCompatParcelizer == stop.IconCompatParcelizer && ((str = this.MediaBrowserCompat$CustomActionResultReceiver) == null ? stop.MediaBrowserCompat$CustomActionResultReceiver == null : str.equals(stop.MediaBrowserCompat$CustomActionResultReceiver))) {
            String str2 = this.read;
            if (str2 != null) {
                if (str2.equals(stop.read)) {
                    return true;
                }
            } else if (stop.read == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.read;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return (((i2 * 31) + i) * 31) + i3;
    }
}
