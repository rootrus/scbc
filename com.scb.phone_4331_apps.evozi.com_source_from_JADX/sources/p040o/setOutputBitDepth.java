package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOutputBitDepth */
public final /* synthetic */ class setOutputBitDepth implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setOutputBitDepth(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
