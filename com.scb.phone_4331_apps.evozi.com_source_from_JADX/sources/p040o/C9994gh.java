package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.gh */
public final /* synthetic */ class C9994gh implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4746he MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getCustomAttributes read;

    public /* synthetic */ C9994gh(C4746he heVar, getCustomAttributes getcustomattributes) {
        this.MediaBrowserCompat$ItemReceiver = heVar;
        this.read = getcustomattributes;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4746he heVar = this.MediaBrowserCompat$ItemReceiver;
        ((tX$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer(heVar.MediaBrowserCompat$ItemReceiver, this.read);
    }
}
