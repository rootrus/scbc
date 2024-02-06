package p040o;

import com.google.gson.annotations.SerializedName;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.recordLockedRead */
public class recordLockedRead {
    @SerializedName("fastpayFlag")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("limitAmount")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    public String read;

    private recordLockedRead(String str, String str2, String str3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public static recordLockedRead MediaBrowserCompat$CustomActionResultReceiver() {
        return new recordLockedRead("0", (String) null, (String) null);
    }

    public static recordLockedRead write(String str, String str2) {
        return new recordLockedRead(DiskLruCache.VERSION_1, str, str2);
    }
}
