package p040o;

import p040o.getImageWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCheckDetectionSettings */
public final /* synthetic */ class setCheckDetectionSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ StringBuilder MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setCheckDetectionSettings(StringBuilder sb) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sb;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getImageWidth.IconCompatParcelizer) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.toString());
    }
}
