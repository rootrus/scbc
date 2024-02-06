package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.translateName$MediaBrowserCompat$SearchResultReceiver */
public final class translateName$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ translateName IconCompatParcelizer;

    public translateName$MediaBrowserCompat$SearchResultReceiver(translateName translatename) {
        this.IconCompatParcelizer = translatename;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
        getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
        getfirstname_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(translateName.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
        getfirstname_mediabrowsercompat_customactionresultreceiver.write();
        getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver();
        getfirstname_mediabrowsercompat_customactionresultreceiver.write(this.IconCompatParcelizer.IconCompatParcelizer());
    }
}
