package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.onMarkerDragStart */
public final class onMarkerDragStart {
    @SerializedName("e2eeSid")
    private final String IconCompatParcelizer;
    @SerializedName("cardType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("pubKeyIndex")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("serverRandom")
    private final String MediaDescriptionCompat;
    @SerializedName("encryptedPin")
    private final String read;
    @SerializedName("cardNumber")
    private final String write;

    public onMarkerDragStart(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "cardType");
        onGetStartedClick.write((Object) str2, "cardNumber");
        onGetStartedClick.write((Object) str5, "encryptedPin");
        onGetStartedClick.write((Object) str6, "e2eeSid");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.read = str5;
        this.IconCompatParcelizer = str6;
    }
}
