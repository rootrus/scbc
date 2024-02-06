package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.translateName$MediaBrowserCompat$CustomActionResultReceiver */
final class translateName$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ translateName write;

    translateName$MediaBrowserCompat$CustomActionResultReceiver(translateName translatename) {
        this.write = translatename;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
        getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver();
        translateName.MediaBrowserCompat$CustomActionResultReceiver(this.write);
        getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver();
        getfirstname_mediabrowsercompat_customactionresultreceiver.write(this.write.IconCompatParcelizer());
    }
}
