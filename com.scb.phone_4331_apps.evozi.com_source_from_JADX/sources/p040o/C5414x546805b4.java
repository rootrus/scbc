package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.sm$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver */
final class C5414x546805b4<V> implements writeUInt64NoTag.IconCompatParcelizer<C1290xf5767c6e> {
    private /* synthetic */ sm$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ Throwable read;

    C5414x546805b4(sm$MediaBrowserCompat$CustomActionResultReceiver sm_mediabrowsercompat_customactionresultreceiver, Throwable th) {
        this.MediaBrowserCompat$ItemReceiver = sm_mediabrowsercompat_customactionresultreceiver;
        this.read = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C1290xf5767c6e serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver = (C1290xf5767c6e) obj;
        serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver.aj_();
        if (this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver(this.read, false)) {
            RegularImmutableBiMap unused = this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver;
            String IconCompatParcelizer = RegularImmutableBiMap.IconCompatParcelizer(this.read);
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "errorDisplayMapper.transformError(e)");
            serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver.mo15276r_(IconCompatParcelizer);
            return;
        }
        serverProjectProvider$15$MediaBrowserCompat$CustomActionResultReceiver.write(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
