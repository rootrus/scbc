package p040o;

import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRollThreshold */
public final /* synthetic */ class setRollThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPhoto MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setPosX$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setRollThreshold(setPosX$MediaBrowserCompat$ItemReceiver setposx_mediabrowsercompat_itemreceiver, getPhoto getphoto) {
        this.MediaBrowserCompat$ItemReceiver = setposx_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = getphoto;
    }

    public final void IconCompatParcelizer(Object obj) {
        setPosX$MediaBrowserCompat$ItemReceiver setposx_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        getPhoto getphoto = this.MediaBrowserCompat$CustomActionResultReceiver;
        StandardTable.Column.KeySet.C38211 unused = setposx_mediabrowsercompat_itemreceiver.write.write;
        onGetStartedClick.write((Object) getphoto, "scbsOnboardingProductCatalog");
        ((getMicrAmount$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer(getphoto.read);
    }
}
