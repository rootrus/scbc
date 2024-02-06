package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.translateName$MediaBrowserCompat$ItemReceiver */
final class translateName$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ double IconCompatParcelizer;
    private /* synthetic */ translateName MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ int read;
    private /* synthetic */ boolean write;

    translateName$MediaBrowserCompat$ItemReceiver(translateName translatename, double d, boolean z, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = translatename;
        this.IconCompatParcelizer = d;
        this.write = z;
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName$MediaBrowserCompat$CustomActionResultReceiver getfirstname_mediabrowsercompat_customactionresultreceiver = (getFirstName$MediaBrowserCompat$CustomActionResultReceiver) obj;
        getfirstname_mediabrowsercompat_customactionresultreceiver.read(this.IconCompatParcelizer > 0.0d);
        if (this.write) {
            int i = this.read;
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            if (i < i2) {
                getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver((double) i);
            } else {
                getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver((double) i2);
            }
            translateName.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        getfirstname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver((double) this.MediaBrowserCompat$ItemReceiver);
        translateName.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
