package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.PlaceReport */
public class PlaceReport {
    @SerializedName("url")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("checksum")
    public String write;

    public /* synthetic */ PlaceReport() {
    }

    public PlaceReport(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? placeReport.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(placeReport.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.write;
        String str3 = placeReport.write;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
