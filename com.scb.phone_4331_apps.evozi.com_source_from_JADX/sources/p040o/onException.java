package p040o;

import p040o.proxyGetICheckDeserializerRtti;
import p040o.writeUInt64NoTag;

/* renamed from: o.onException */
public final /* synthetic */ class onException implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ withClearedAuthToken MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onException(withClearedAuthToken withclearedauthtoken) {
        this.MediaBrowserCompat$ItemReceiver = withclearedauthtoken;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti.RatingCompat) obj).write(this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.setShortcut());
    }
}
