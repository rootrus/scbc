package p040o;

import p040o.getExpiresAtFrom;
import p040o.writeUInt64NoTag;

/* renamed from: o.WireFormat */
public final /* synthetic */ class WireFormat implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getExpiresAtFrom.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ WireFormat(getExpiresAtFrom.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        getExpiresAtFrom.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckCaptureModule$a$MediaBrowserCompat$MediaItem checkCaptureModule$a$MediaBrowserCompat$MediaItem = (CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj;
        checkCaptureModule$a$MediaBrowserCompat$MediaItem.read(getExpiresAtFrom.this.MediaBrowserCompat$SearchResultReceiver);
        if (getExpiresAtFrom.this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer != null) {
            checkCaptureModule$a$MediaBrowserCompat$MediaItem.read(getExpiresAtFrom.this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
        }
    }
}
