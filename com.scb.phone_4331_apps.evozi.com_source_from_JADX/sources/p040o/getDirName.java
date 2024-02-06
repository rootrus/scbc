package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getDirName */
public class getDirName {
    @SerializedName("firstname")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("lastname")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("title")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getDirName getdirname = (getDirName) obj;
        String str = this.write;
        if (str == null ? getdirname.write != null : !str.equals(getdirname.write)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? getdirname.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(getdirname.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        String str4 = getdirname.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.write;
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
}
