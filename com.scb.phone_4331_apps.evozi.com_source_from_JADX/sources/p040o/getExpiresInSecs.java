package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.getExpiresInSecs */
public final /* synthetic */ class getExpiresInSecs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ findInterruptibleMethods MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getExpiresInSecs(findInterruptibleMethods findinterruptiblemethods) {
        this.MediaBrowserCompat$ItemReceiver = findinterruptiblemethods;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.MediaDescriptionCompat) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
