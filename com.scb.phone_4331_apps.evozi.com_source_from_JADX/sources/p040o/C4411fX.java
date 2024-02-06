package p040o;

import p040o.C4429fk;
import p040o.writeUInt64NoTag;

/* renamed from: o.fX */
public final /* synthetic */ class C4411fX implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4429fk.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ zzum read;

    public /* synthetic */ C4411fX(C4429fk.IconCompatParcelizer iconCompatParcelizer, zzum zzum) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.read = zzum;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4429fk.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        zzum zzum = this.read;
        getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver getbelowminrearimagesize_mediabrowsercompat_itemreceiver = (getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver) obj;
        getBuffer unused = C4429fk.this.IconCompatParcelizer;
        String str = iconCompatParcelizer.IconCompatParcelizer;
        boolean MediaBrowserCompat$ItemReceiver2 = C4429fk.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        String read2 = C4429fk.this.write;
        getClsId getclsid = new getClsId();
        boolean z = false;
        getclsid.MediaMetadataCompat = zzum.MediaDescriptionCompat || MediaBrowserCompat$ItemReceiver2;
        getclsid.MediaBrowserCompat$ItemReceiver = zzum.write;
        getclsid.IconCompatParcelizer = read2;
        getclsid.MediaBrowserCompat$CustomActionResultReceiver = zzum.MediaBrowserCompat$CustomActionResultReceiver;
        getclsid.RatingCompat = zzum.MediaBrowserCompat$ItemReceiver;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (!(!z)) {
            str = zzum.read;
        }
        getclsid.MediaDescriptionCompat = str;
        getbelowminrearimagesize_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(getclsid);
    }
}
