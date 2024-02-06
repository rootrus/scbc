package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.deleteReport */
public final /* synthetic */ class deleteReport implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getExpiresAtFrom MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ deleteReport(getExpiresAtFrom getexpiresatfrom, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getexpiresatfrom;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        CheckCaptureModule$a$MediaBrowserCompat$MediaItem checkCaptureModule$a$MediaBrowserCompat$MediaItem = (CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj;
        checkCaptureModule$a$MediaBrowserCompat$MediaItem.write(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver());
    }
}
