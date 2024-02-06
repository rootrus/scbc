package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dE$MediaBrowserCompat$CustomActionResultReceiver */
final class dE$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getRegionName$MediaBrowserCompat$CustomActionResultReceiver> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ C4241dE MediaBrowserCompat$ItemReceiver;

    dE$MediaBrowserCompat$CustomActionResultReceiver(C4241dE dEVar, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = dEVar;
        this.IconCompatParcelizer = z;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getRegionName$MediaBrowserCompat$CustomActionResultReceiver getregionname_mediabrowsercompat_customactionresultreceiver = (getRegionName$MediaBrowserCompat$CustomActionResultReceiver) obj;
        boolean z = true;
        getregionname_mediabrowsercompat_customactionresultreceiver.read(!this.IconCompatParcelizer && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver);
        if (this.MediaBrowserCompat$ItemReceiver.read == null) {
            z = false;
        }
        getregionname_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(z);
    }
}
