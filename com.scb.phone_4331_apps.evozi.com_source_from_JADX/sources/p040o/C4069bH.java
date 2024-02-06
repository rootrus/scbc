package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.bH */
public final /* synthetic */ class C4069bH implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4198cm MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4069bH(C4198cm cmVar) {
        this.MediaBrowserCompat$ItemReceiver = cmVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4198cm cmVar = this.MediaBrowserCompat$ItemReceiver;
        ((KtaJsonCheck$MediaBrowserCompat$ItemReceiver) obj).write(cmVar.MediaBrowserCompat$SearchResultReceiver, cmVar.MediaDescriptionCompat);
    }
}
