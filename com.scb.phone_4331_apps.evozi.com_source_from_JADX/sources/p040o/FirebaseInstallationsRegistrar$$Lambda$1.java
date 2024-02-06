package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallationsRegistrar$$Lambda$1 */
public final /* synthetic */ class FirebaseInstallationsRegistrar$$Lambda$1 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDaemon read;

    public /* synthetic */ FirebaseInstallationsRegistrar$$Lambda$1(setDaemon setdaemon) {
        this.read = setdaemon;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.RatingCompat) obj).write(this.read);
    }
}
