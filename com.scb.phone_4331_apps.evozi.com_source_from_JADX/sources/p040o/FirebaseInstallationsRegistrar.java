package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstallationsRegistrar */
public final /* synthetic */ class FirebaseInstallationsRegistrar implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDaemon MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FirebaseInstallationsRegistrar(setDaemon setdaemon) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setdaemon;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.RatingCompat) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
