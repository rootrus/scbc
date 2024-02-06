package p040o;

import p040o.C4959mW;
import p040o.getDocumentFramingError;
import p040o.writeUInt64NoTag;

/* renamed from: o.mV */
public final /* synthetic */ class C10055mV implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4959mW.write MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ onEnterAmbient read;

    public /* synthetic */ C10055mV(C4959mW.write write, onEnterAmbient onenterambient) {
        this.MediaBrowserCompat$ItemReceiver = write;
        this.read = onenterambient;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4959mW.write write = this.MediaBrowserCompat$ItemReceiver;
        ((getDocumentFramingError.IconCompatParcelizer) obj).read(C4959mW.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.read, C4959mW.this.write));
    }
}
