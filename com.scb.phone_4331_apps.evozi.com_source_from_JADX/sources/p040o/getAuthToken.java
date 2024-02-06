package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAuthToken */
public final /* synthetic */ class getAuthToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ findInterruptibleMethods MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getAuthToken(findInterruptibleMethods findinterruptiblemethods) {
        this.MediaBrowserCompat$ItemReceiver = findinterruptiblemethods;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
