package p040o;

import p040o.FieldNamingPolicy;
import p040o.writeUInt64NoTag;

/* renamed from: o.hasModifier$MediaBrowserCompat$CustomActionResultReceiver */
public final class hasModifier$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName$MediaBrowserCompat$ItemReceiver> {
    private /* synthetic */ FieldNamingPolicy.C33496 read;

    public hasModifier$MediaBrowserCompat$CustomActionResultReceiver(FieldNamingPolicy.C33496 r1) {
        this.read = r1;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName$MediaBrowserCompat$ItemReceiver getfirstname_mediabrowsercompat_itemreceiver = (getFirstName$MediaBrowserCompat$ItemReceiver) obj;
        int i = FieldNamingPolicy.MediaBrowserCompat$ItemReceiver[this.read.ordinal()];
        if (i == 1) {
            getfirstname_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver();
            getfirstname_mediabrowsercompat_itemreceiver.read();
        } else if (i == 2) {
            getfirstname_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver();
            getfirstname_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
