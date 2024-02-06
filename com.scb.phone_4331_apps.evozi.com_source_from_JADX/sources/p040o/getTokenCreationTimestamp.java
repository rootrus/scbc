package p040o;

import java.util.List;
import p040o.Synchronized;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;
import p040o.zzdy;

/* renamed from: o.getTokenCreationTimestamp */
public final /* synthetic */ class getTokenCreationTimestamp implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isRegistered$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTokenCreationTimestamp(isRegistered$MediaBrowserCompat$CustomActionResultReceiver isregistered_mediabrowsercompat_customactionresultreceiver, List list) {
        this.IconCompatParcelizer = isregistered_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        isRegistered$MediaBrowserCompat$CustomActionResultReceiver isregistered_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        Synchronized.SynchronizedSet unused = isregistered_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        ((proxyGetICheckDeserializerRtti.IconCompatParcelizer) obj).read(Synchronized.SynchronizedSet.MediaBrowserCompat$CustomActionResultReceiver((List<zzdy.zze>) list));
    }
}
