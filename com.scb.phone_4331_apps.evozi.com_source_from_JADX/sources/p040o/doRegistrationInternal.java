package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.doRegistrationInternal */
public final /* synthetic */ class doRegistrationInternal implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver write;

    public /* synthetic */ doRegistrationInternal(withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver withregisteredfid_mediabrowsercompat_customactionresultreceiver, setBoundsBias setboundsbias) {
        this.write = withregisteredfid_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        withRegisteredFid$MediaBrowserCompat$CustomActionResultReceiver withregisteredfid_mediabrowsercompat_customactionresultreceiver = this.write;
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(withregisteredfid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
