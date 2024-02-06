package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentDetectionResult */
public final /* synthetic */ class DocumentDetectionResult implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Image.FriendI write;

    public /* synthetic */ DocumentDetectionResult(Image.FriendI friendI, getLegacySharedPrefs getlegacysharedprefs) {
        this.write = friendI;
        this.MediaBrowserCompat$CustomActionResultReceiver = getlegacysharedprefs;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6395xeeeefe7) obj).MediaBrowserCompat$CustomActionResultReceiver(Image.FriendI.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
