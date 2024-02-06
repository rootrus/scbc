package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onStreetViewPanoramaReady */
public class onStreetViewPanoramaReady extends zzuk {
    @SerializedName("endDate")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("dayOfMonth")
    public int MediaBrowserCompat$ItemReceiver;
    @SerializedName("startDate")
    public String read;
    @SerializedName("scheduleType")
    public String write;

    public onStreetViewPanoramaReady(String str, int i, String str2, String str3) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onStreetViewPanoramaReady onstreetviewpanoramaready = (onStreetViewPanoramaReady) obj;
        if (this.MediaBrowserCompat$ItemReceiver != onstreetviewpanoramaready.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.write;
        if (str == null ? onstreetviewpanoramaready.write != null : !str.equals(onstreetviewpanoramaready.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? onstreetviewpanoramaready.read != null : !str2.equals(onstreetviewpanoramaready.read)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str4 = onstreetviewpanoramaready.MediaBrowserCompat$CustomActionResultReceiver;
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
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + i2) * 31) + hashCode2) * 31) + i;
    }
}
