package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImmutableEntry */
public final class ImmutableEntry {
    @SerializedName("e2eeSid")
    private final String IconCompatParcelizer;
    @SerializedName("cardRefNo")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("encryptedPIN")
    private final String MediaBrowserCompat$ItemReceiver;

    public ImmutableEntry(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "encryptedPIN");
        onGetStartedClick.write((Object) str3, "e2eeSid");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = str3;
    }
}
