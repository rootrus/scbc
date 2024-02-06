package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.DeepLinkUri */
public final class DeepLinkUri {
    @SerializedName("bankLogo")
    private String IconCompatParcelizer;
    @SerializedName("accountNumber")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("name")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("proxyType")
    private String MediaDescriptionCompat;
    @SerializedName("proxyNumber")
    private String read;
    @SerializedName("accountType")
    private String write;

    /* renamed from: o.DeepLinkUri$Builder */
    public class Builder extends setCurrentItemInternal {
        @SerializedName("cardList")
        public List<IconCompatParcelizer> read;

        /* renamed from: o.DeepLinkUri$Builder$IconCompatParcelizer */
        public static class IconCompatParcelizer {
            @SerializedName("creditcardimageURL")
            public String write;
        }

        /* renamed from: o.DeepLinkUri$Builder$ParseResult */
        public class ParseResult extends setCurrentItemInternal {
            @SerializedName("categories")
            public List<Cancellable> MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final isRotateGesturesEnabled read() {
        UiSettings uiSettings;
        String str = "";
        isMyLocationButtonEnabled ismylocationbuttonenabled = null;
        try {
            String str2 = this.write;
            if (str2 == null) {
                str2 = str;
            }
            uiSettings = UiSettings.valueOf(str2);
        } catch (IllegalArgumentException unused) {
            uiSettings = null;
        }
        try {
            String str3 = this.MediaDescriptionCompat;
            if (str3 != null) {
                str = str3;
            }
            ismylocationbuttonenabled = isMyLocationButtonEnabled.valueOf(str);
        } catch (IllegalArgumentException unused2) {
        }
        return new isRotateGesturesEnabled(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, uiSettings, this.MediaBrowserCompat$CustomActionResultReceiver, ismylocationbuttonenabled, this.read);
    }
}
