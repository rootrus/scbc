package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.debug */
public class debug extends getWidth {
    @SerializedName("campaignCode")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanDurationPeriod")
    public String read;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        debug debug = (debug) obj;
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? debug.MediaBrowserCompat$ItemReceiver != null : !str.equals(debug.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.read;
        String str3 = debug.read;
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
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
