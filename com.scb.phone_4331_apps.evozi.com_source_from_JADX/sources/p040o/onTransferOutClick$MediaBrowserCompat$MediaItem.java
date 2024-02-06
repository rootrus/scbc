package p040o;

import java.util.Locale;
import java.util.TimeZone;

/* renamed from: o.onTransferOutClick$MediaBrowserCompat$MediaItem */
class onTransferOutClick$MediaBrowserCompat$MediaItem {
    private final TimeZone IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final Locale read;

    onTransferOutClick$MediaBrowserCompat$MediaItem(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.IconCompatParcelizer = timeZone;
        if (z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Integer.MIN_VALUE | i;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
        this.read = locale;
    }

    public final int hashCode() {
        return (((this.MediaBrowserCompat$CustomActionResultReceiver * 31) + this.read.hashCode()) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onTransferOutClick$MediaBrowserCompat$MediaItem)) {
            return false;
        }
        onTransferOutClick$MediaBrowserCompat$MediaItem ontransferoutclick_mediabrowsercompat_mediaitem = (onTransferOutClick$MediaBrowserCompat$MediaItem) obj;
        if (!this.IconCompatParcelizer.equals(ontransferoutclick_mediabrowsercompat_mediaitem.IconCompatParcelizer) || this.MediaBrowserCompat$CustomActionResultReceiver != ontransferoutclick_mediabrowsercompat_mediaitem.MediaBrowserCompat$CustomActionResultReceiver || !this.read.equals(ontransferoutclick_mediabrowsercompat_mediaitem.read)) {
            return false;
        }
        return true;
    }
}
