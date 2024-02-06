package p040o;

import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.scrollGesturesEnabledDuringRotateOrZoom */
public final class scrollGesturesEnabledDuringRotateOrZoom {
    public double IconCompatParcelizer;
    public double MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public double MediaMetadataCompat;
    public String read;
    public String write;

    public scrollGesturesEnabledDuringRotateOrZoom() {
        this((byte) 0);
    }

    public scrollGesturesEnabledDuringRotateOrZoom(String str, double d, double d2, String str2, String str3, double d3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "conversionRate");
        onGetStartedClick.write((Object) str2, "currencyCodeFrom");
        onGetStartedClick.write((Object) str3, "currencyCodeTo");
        onGetStartedClick.write((Object) str4, "feeCurrencyCode");
        onGetStartedClick.write((Object) str5, ErrorBundle.DETAIL_ENTRY);
        this.read = str;
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = d2;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.MediaMetadataCompat = d3;
        this.MediaBrowserCompat$MediaItem = str4;
        this.MediaDescriptionCompat = str5;
    }

    public /* synthetic */ scrollGesturesEnabledDuringRotateOrZoom(byte b) {
        this("", 0.0d, 0.0d, "", "", 0.0d, "", "");
    }
}
