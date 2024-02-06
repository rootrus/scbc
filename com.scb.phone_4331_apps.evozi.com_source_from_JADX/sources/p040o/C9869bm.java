package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.bm */
public final /* synthetic */ class C9869bm implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ ISdkDaggerPerContextComponent write;

    public /* synthetic */ C9869bm(ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent, boolean z) {
        this.write = iSdkDaggerPerContextComponent;
        this.IconCompatParcelizer = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.write;
        ((getListener) obj).read(this.IconCompatParcelizer && iSdkDaggerPerContextComponent.MediaBrowserCompat$SearchResultReceiver && iSdkDaggerPerContextComponent.IconCompatParcelizer != null);
    }
}
