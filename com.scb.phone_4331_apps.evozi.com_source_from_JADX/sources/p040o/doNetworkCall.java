package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.doNetworkCall */
public final /* synthetic */ class doNetworkCall implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver read;

    public /* synthetic */ doNetworkCall(withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver withregisteredfid_mediabrowsercompat_customactionresultreceiver, setBoundsBias setboundsbias) {
        this.read = withregisteredfid_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver withregisteredfid_mediabrowsercompat_customactionresultreceiver = this.read;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).write(withregisteredfid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
