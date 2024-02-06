package p040o;

import p040o.getIExtractionServerKta;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getExceptionKey */
public final /* synthetic */ class getExceptionKey implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getIExtractionServerKta.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ newLatLngBoundsWithSize read;

    public /* synthetic */ getExceptionKey(getIExtractionServerKta.read read2, newLatLngBoundsWithSize newlatlngboundswithsize) {
        this.MediaBrowserCompat$ItemReceiver = read2;
        this.read = newlatlngboundswithsize;
    }

    public final void IconCompatParcelizer(Object obj) {
        getIExtractionServerKta.read read2 = this.MediaBrowserCompat$ItemReceiver;
        ((getTopLeftCornerWidth.setCheckable) obj).MediaBrowserCompat$ItemReceiver(getIExtractionServerKta.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.read));
    }
}
