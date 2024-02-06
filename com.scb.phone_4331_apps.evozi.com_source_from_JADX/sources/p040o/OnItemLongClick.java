package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.OnItemLongClick */
public class OnItemLongClick {
    @SerializedName("userMode")
    private final String IconCompatParcelizer;
    @SerializedName("deviceId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("configVersion")
    private final String MediaBrowserCompat$ItemReceiver;

    public OnItemLongClick(String str, String str2, String str3) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
    }
}
