package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.prefix */
public class prefix {
    @SerializedName("name")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNumber")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountType")
    private String read;
    @SerializedName("bankLogo")
    private String write;

    public final isIndoorLevelPickerEnabled write() {
        UiSettings uiSettings;
        try {
            String str = this.read;
            if (str == null) {
                str = "";
            }
            uiSettings = UiSettings.valueOf(str);
        } catch (IllegalArgumentException unused) {
            uiSettings = null;
        }
        return new isIndoorLevelPickerEnabled(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, uiSettings, this.MediaBrowserCompat$ItemReceiver);
    }
}
