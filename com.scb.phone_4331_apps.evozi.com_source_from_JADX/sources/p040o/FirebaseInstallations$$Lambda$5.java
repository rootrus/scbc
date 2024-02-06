package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallations$$Lambda$5 */
public final /* synthetic */ class FirebaseInstallations$$Lambda$5 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzxl MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ withFisError MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ FirebaseInstallations$$Lambda$5(withFisError withfiserror, zzxl zzxl) {
        this.MediaBrowserCompat$ItemReceiver = withfiserror;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzxl;
    }

    public final void IconCompatParcelizer(Object obj) {
        withFisError withfiserror = this.MediaBrowserCompat$ItemReceiver;
        ((proxyGetICheckDeserializerRtti.write) obj).IconCompatParcelizer(withfiserror.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
