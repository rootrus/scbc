package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getFrameColor */
public final /* synthetic */ class getFrameColor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getFrameColor(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
