package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.eM */
public final /* synthetic */ class C4347eM implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4353eU read;

    public /* synthetic */ C4347eM(C4353eU eUVar) {
        this.read = eUVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4353eU eUVar = this.read;
        ((LocalProjectProvider.C69364) obj).read(eUVar.MediaBrowserCompat$MediaItem && eUVar.MediaBrowserCompat$SearchResultReceiver);
    }
}
