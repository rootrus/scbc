package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setFrameColor */
public final /* synthetic */ class setFrameColor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof write;

    public /* synthetic */ setFrameColor(C10829Sizeof sizeof) {
        this.write = sizeof;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof sizeof = this.write;
        ((CheckParameters) obj).read(sizeof.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(sizeof.read.read.AppCompatActivity()));
    }
}
