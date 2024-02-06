package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.cancelAutoFocus */
public final /* synthetic */ class cancelAutoFocus implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ ISdkDaggerPerContextComponent write;

    public /* synthetic */ cancelAutoFocus(ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent, boolean z) {
        this.write = iSdkDaggerPerContextComponent;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void IconCompatParcelizer(Object obj) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.write;
        ((getListener) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver && iSdkDaggerPerContextComponent.write && iSdkDaggerPerContextComponent.IconCompatParcelizer != null);
    }
}
