package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getResultKey */
public final /* synthetic */ class getResultKey implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getIExtractionServerKta MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getResultKey(getIExtractionServerKta getiextractionserverkta) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getiextractionserverkta;
    }

    public final void IconCompatParcelizer(Object obj) {
        getIExtractionServerKta getiextractionserverkta = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getTopLeftCornerWidth.setCheckable) obj).MediaBrowserCompat$ItemReceiver(getiextractionserverkta.IconCompatParcelizer, getiextractionserverkta.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
