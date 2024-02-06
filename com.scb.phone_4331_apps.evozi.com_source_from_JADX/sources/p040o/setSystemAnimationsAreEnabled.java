package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setSystemAnimationsAreEnabled */
public class setSystemAnimationsAreEnabled {
    @SerializedName("loanType")
    public List<stop> MediaBrowserCompat$CustomActionResultReceiver;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSystemAnimationsAreEnabled)) {
            return false;
        }
        setSystemAnimationsAreEnabled setsystemanimationsareenabled = (setSystemAnimationsAreEnabled) obj;
        List<stop> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.equals(setsystemanimationsareenabled.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (setsystemanimationsareenabled.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<stop> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
