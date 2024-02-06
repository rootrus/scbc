package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallations$$Lambda$1 */
public final /* synthetic */ class FirebaseInstallations$$Lambda$1 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withFisError read;

    public /* synthetic */ FirebaseInstallations$$Lambda$1(withFisError withfiserror) {
        this.read = withfiserror;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.write) obj).write(!this.read.MediaBrowserCompat$ItemReceiver);
    }
}
