package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setDisplayOrientation */
public final /* synthetic */ class setDisplayOrientation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ISdkDaggerPerContextComponent IconCompatParcelizer;

    public /* synthetic */ setDisplayOrientation(ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent) {
        this.IconCompatParcelizer = iSdkDaggerPerContextComponent;
    }

    public final void IconCompatParcelizer(Object obj) {
        ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent = this.IconCompatParcelizer;
        ((getListener) obj).read(iSdkDaggerPerContextComponent.write && iSdkDaggerPerContextComponent.MediaBrowserCompat$SearchResultReceiver);
    }
}
