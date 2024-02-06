package p040o;

import p040o.getIExtractionServerKta;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getParametersInstance */
public final /* synthetic */ class getParametersInstance implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getIExtractionServerKta.read IconCompatParcelizer;
    private final /* synthetic */ newLatLngBoundsWithSize write;

    public /* synthetic */ getParametersInstance(getIExtractionServerKta.read read, newLatLngBoundsWithSize newlatlngboundswithsize) {
        this.IconCompatParcelizer = read;
        this.write = newlatlngboundswithsize;
    }

    public final void IconCompatParcelizer(Object obj) {
        getIExtractionServerKta.read read = this.IconCompatParcelizer;
        ((getTopLeftCornerWidth.setCheckable) obj).write(getIExtractionServerKta.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(this.write));
    }
}
